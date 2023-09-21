/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *  Copyright (c) 2019-2023 Grégory Van den Borre
 *  More infos available: https://engine.yildiz-games.be
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 *  documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 *  the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 *  permit persons to whom the Software is furnished to do so, subject to the following conditions: The above copyright
 *  notice and this permission notice shall be included in all copies or substantial portions of the  Software.
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 *  OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 *  OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package be.yildizgames.module.controller.internal;

import be.yildizgames.module.controller.Controller;
import be.yildizgames.module.controller.ControllerCurrentState;
import be.yildizgames.module.controller.ControllerListener;
import be.yildizgames.module.controller.ControllerMapper;
import be.yildizgames.module.controller.ThreadRunner;

import java.util.List;

/**
 * @author Gregory Van den Borre
 */
public abstract class ControllerRunner implements Runnable, Controller {

    private final System.Logger logger = System.getLogger(ControllerRunner.class.getName());

    private ControllerMapper mapper = new DefaultControllerMapper();

    /**
     * Flag to use or not the controller.
     */
    private boolean use;

    private final ControllerCurrentStateContainer stateContainer = new ControllerCurrentStateContainer();

    private ThreadRunner runner;

    protected ControllerRunner() {
        super();
    }

    @Override
    public final ControllerCurrentState getState() {
        return this.stateContainer;
    }

    @Override
    public final void addListener(ControllerListener l) {
        this.stateContainer.addListener(l);
    }

    public final void stop() {
        this.use = false;
    }

    @Override
    public final void use() {
        this.use = true;
        if (this.runner != null) {
            this.runner.start(this);
        } else {
            new Thread(this).start();
        }

    }

    @Override
    public final void use(ThreadRunner runner) {
        this.use = true;
        this.runner = runner;
        this.runner.start(this);
    }

    @Override
    public final void map(ControllerMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public boolean isUsed() {
        return this.use;
    }

    @Override
    public final void run() {
        while (use) {
            var timeToWait = updateIfConnected() ? 16 : 1000;
            try {
                Thread.sleep(timeToWait);
            } catch (InterruptedException e) {
                this.logger.log(System.Logger.Level.WARNING, "Interruption", e);
                Thread.currentThread().interrupt();
            }
        }
    }

    /**
     * Get the status of the dpad down button.
     *
     * @return true if the dpad down is pressed, false otherwise.
     */
    protected abstract boolean down();

    /**
     * Get the status of the dpad up button.
     *
     * @return true if the dpad up is pressed, false otherwise.
     */
    protected abstract boolean up();

    /**
     * Get the status of the dpad right button.
     *
     * @return true if the dpad right is pressed, false otherwise.
     */
    protected abstract boolean right();

    /**
     * Get the status of the dpad left button.
     *
     * @return true if the dpad left is pressed, false otherwise.
     */
    protected abstract boolean left();

    protected abstract float leftStickHorizontal();

    protected abstract float leftStickVertical();

    /**
     * Get the status of the button 1.
     *
     * @return true if the button 1 is pressed, false otherwise.
     */
    protected abstract boolean button1();

    /**
     * Get the status of the button 2.
     *
     * @return true if the button 2 is pressed, false otherwise.
     */
    protected abstract boolean button2();

    /**
     * Get the status of the button 3.
     *
     * @return true if the button 3 is pressed, false otherwise.
     */
    protected abstract boolean button3();

    /**
     * Get the status of the button 4.
     *
     * @return true if the button 4 is pressed, false otherwise.
     */
    protected abstract boolean button4();

    protected abstract boolean buttonL1();

    protected abstract boolean buttonL2();

    protected abstract boolean buttonR1();

    protected abstract boolean buttonR2();

    /**
     * Get the status of the button start.
     *
     * @return true if the button start is pressed, false otherwise.
     */
    protected abstract boolean buttonStart();

    /**
     * Get the status of the button select.
     *
     * @return true if the button select is pressed, false otherwise.
     */
    protected abstract boolean buttonSelect();

    private boolean updateIfConnected() {
        boolean connected = this.isConnected();
        this.stateContainer.connected(connected);
        if (connected) {
            this.stateContainer.button(this.mapper.button1(), button1());
            this.stateContainer.button(this.mapper.button2(), button2());
            this.stateContainer.button(this.mapper.button3(), button3());
            this.stateContainer.button(this.mapper.button4(), button4());

            this.stateContainer.button(this.mapper.buttonL1(), buttonL1());
            this.stateContainer.button(this.mapper.buttonR1(), buttonR1());
            this.stateContainer.button(this.mapper.buttonL2(), buttonL2());
            this.stateContainer.button(this.mapper.buttonR2(), buttonR2());

            this.stateContainer.button(this.mapper.buttonStart(), buttonStart());
            this.stateContainer.button(this.mapper.buttonSelect(), buttonSelect());

            this.stateContainer.padLeft(left());
            this.stateContainer.padRight(right());
            this.stateContainer.padUp(up());
            this.stateContainer.padDown(down());
            this.stateContainer.leftStickHorizontal(leftStickHorizontal());
            this.stateContainer.leftStickVertical(leftStickVertical());
        }
        return connected;
    }

    public final List<ControllerListener> getListeners() {
        return this.stateContainer.getListeners();
    }
}