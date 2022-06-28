/*
 *
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 * Copyright (c) 2019-2022 Grégory Van den Borre
 *
 * More infos available: https://engine.yildiz-games.be
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without
 * limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 *
 *
 */

package be.yildizgames.module.controller;

/**
 * Controller.
 *
 * @author Grégory Van den Borre
 */
public interface Controller {

    /**
     * Provide the controller current state.
     * The state can be kept once retrieved, it will always be up to date.
     *
     * @return The state.
     */
    ControllerCurrentState getState();

    /**
     * register a listener to receive event from the controller.
     *
     * @param l Controller listener.
     */
    void addListener(ControllerListener l);

    /**
     * Use this controller.
     */
    void use();

    void stop();

    void use(ThreadRunner runner);

    /**
     * Map the buttons if a change is required.
     *
     * @param mapper Button mapper.
     */
    void map(ControllerMapper mapper);

    /**
     * Check if the controller is in use.
     *
     * @return True if the controller is used, false otherwise.
     */
    boolean isUsed();

    /**
     * Check if the controller is currently plugged in.
     *
     * @return True if the controoler is connected, false otherwise.
     */
    boolean isConnected();

    String getModel();

}
