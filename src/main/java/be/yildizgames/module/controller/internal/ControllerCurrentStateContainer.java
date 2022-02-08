/*
 *
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 * Copyright (c) 2019 Grégory Van den Borre
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

package be.yildizgames.module.controller.internal;

import be.yildizgames.module.controller.ControllerCurrentState;
import be.yildizgames.module.controller.ControllerInput;
import be.yildizgames.module.controller.ControllerListener;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gregory Van den Borre
 */
class ControllerCurrentStateContainer implements ControllerCurrentState {

    private final List<ControllerListener> listeners = new ArrayList<>();

    private final String id = "1";

    private String name = "";

    private boolean connected;

    private double leftStickX;

    private double leftStickY;

    /**
     * The angle of the left stick (for reference, 0 is right, 90 is up, 180 is left, 270 is down)
     */
    private float leftStickAngle;

    /**
     * The amount the left stick is pushed in the current direction. This probably between 0 and 1,
     * but this can't be guaranteed due to weird gamepads (like the square holes on a Logitech Dual Action)
     */
    private float leftStickMagnitude;

    /**
     * The angle of the right stick (for reference, 0 is right, 90 is up, 180 is left, 270 is down)
     */
    private float rightStickAngle;

    /**
     * The amount the right stick is pushed in the current direction. This probably between 0 and 1,
     * but this can't be guaranteed due to weird gamepads (like the square holes on a Logitech Dual Action)
     */
    private float rightStickMagnitude;

    /**
     * Whether or not the left stick is clicked in
     */
    private boolean leftStickClick;

    /**
     * Whether or not the right stick is clicked in
     */
    private boolean rightStickClick;

    /**
     * The position of the left trigger between 0 and 1
     */
    private float leftTrigger;

    /**
     * The position of the right trigger between 0 and 1
     */
    private float rightTrigger;

    /**
     * Whether or not the left bumper is pressed
     */
    private boolean lb;

    /**
     * Whether or not the right bumper is pressed
     */
    private boolean rb;

    /**
     * Whether or not the start button is pressed
     */
    private boolean start;

    /**
     * Whether or not the back button is pressed
     */
    private boolean back;

    /**
     * Whether or not the guide button is pressed. For some controller/platform combinations this
     * doesn't work. You probably shouldn't use this.
     */
    private boolean guide;

    private boolean padUp;

    private boolean padDown;

    private boolean padLeft;

    private boolean padRight;

    private boolean button1;

    private boolean button2;

    private boolean button3;

    private boolean button4;

    private boolean leftStickLeft = false;
    private boolean leftStickRight = false;
    private boolean leftStickUp = false;
    private boolean leftStickDown = false;
    private boolean buttonL1 = false;
    private boolean buttonR1 = false;
    private boolean buttonL2 = false;
    private boolean buttonR2 = false;

    ControllerCurrentStateContainer() {
        super();
    }

    @Override
    public final boolean isButton1Pressed() {
        return this.button1;
    }

    @Override
    public final boolean isButton2Pressed() {
        return this.button2;
    }

    @Override
    public final boolean isButton3Pressed() {
        return this.button3;
    }

    @Override
    public final boolean isButton4Pressed() {
        return this.button4;
    }

    @Override
    public final boolean isButtonStartPressed() {
        return this.start;
    }

    @Override
    public final boolean isButtonSelectPressed() {
        return this.back;
    }

    @Override
    public final boolean isPadUpPressed() {
        return this.padUp;
    }

    @Override
    public final boolean isPadDownPressed() {
        return this.padDown;
    }

    @Override
    public final boolean isPadLeftPressed() {
        return this.padLeft;
    }

    @Override
    public final boolean isPadRightPressed() {
        return this.padRight;
    }

    final void connected(boolean connected) {
        if (this.connected != connected) {
            this.connected = connected;
            this.listeners.forEach(connected ? ControllerListener::controllerConnected : ControllerListener::controllerDisconnected);
        }
    }

    final void button(ControllerInput button, boolean active) {
        switch (button) {
            case START:
                this.buttonStart(active);
                break;
            case SELECT:
                this.buttonSelect(active);
                break;
            case BUTTON1:
                this.button1(active);
                break;
            case BUTTON2:
                this.button2(active);
                break;
            case BUTTON3:
                this.button3(active);
                break;
            case BUTTON4:
                this.button4(active);
                break;
            case BUTTON_L1:
                this.buttonL1(active);
                break;
            case BUTTON_L2:
                this.buttonL2(active);
                break;
            case BUTTON_R1:
                this.buttonR1(active);
                break;
            case BUTTON_R2:
                this.buttonR2(active);
                break;
            default:
                break;
        }
    }

    final void padLeft(boolean active) {
        if (this.padLeft != active) {
            this.padLeft = active;
            this.listeners.forEach(active ? ControllerListener::controllerPressLeft : ControllerListener::controllerReleaseLeft);
        }
    }

    final void padRight(boolean active) {
        if (this.padRight != active) {
            this.padRight = active;
            this.listeners.forEach(active ? ControllerListener::controllerPressRight : ControllerListener::controllerReleaseRight);
        }
    }

    final void padUp(boolean active) {
        if (this.padUp != active) {
            this.padUp = active;
            this.listeners.forEach(active ? ControllerListener::controllerPressUp : ControllerListener::controllerReleaseUp);
        }
    }

    final void padDown(boolean active) {
        if (this.padDown != active) {
            this.padDown = active;
            this.listeners.forEach(active ? ControllerListener::controllerPressDown : ControllerListener::controllerReleaseDown);
        }
    }

    final void leftStickHorizontal(float x) {
        if (!leftStickRight && x > 0.5f) {
            this.listeners.forEach(ControllerListener::controllerPressLeftStickRight);
            leftStickRight = true;
            leftStickLeft = false;
        }
        if (!leftStickLeft && x < -0.5f) {
            this.listeners.forEach(ControllerListener::controllerPressLeftStickLeft);
            leftStickRight = false;
            leftStickLeft = true;
        }
        if (x < 0.5f && x > -0.5f) {
            leftStickRight = false;
            leftStickLeft = false;
        }
    }

    final void leftStickVertical(float y) {
        if (!leftStickUp && y > 0.5f) {
            this.listeners.forEach(ControllerListener::controllerPressLeftStickUp);
            leftStickUp = true;
            leftStickDown = false;
        }
        if (!leftStickDown && y < -0.5f) {
            this.listeners.forEach(ControllerListener::controllerPressLeftStickDown);
            leftStickUp = false;
            leftStickDown = true;
        }
        if (y < 0.5f && y > -0.5f) {
            leftStickUp = false;
            leftStickDown = false;
        }
    }

    final void addListener(ControllerListener l) {
        this.listeners.add(l);
    }

    private void buttonStart(boolean active) {
        if (this.start != active) {
            this.start = active;
            this.listeners.forEach(active ? ControllerListener::controllerPressStart : ControllerListener::controllerReleaseStart);
        }
    }

    private void buttonSelect(boolean active) {
        if (this.back != active) {
            this.back = active;
            this.listeners.forEach(active ? ControllerListener::controllerPressSelect : ControllerListener::controllerReleaseSelect);
        }
    }

    private void button1(boolean active) {
        if (this.button1 != active) {
            this.button1 = active;
            this.listeners.forEach(active ? ControllerListener::controllerPress1 : ControllerListener::controllerRelease1);
        }
    }

    private void button2(boolean active) {
        if (this.button2 != active) {
            this.button2 = active;
            this.listeners.forEach(active ? ControllerListener::controllerPress2 : ControllerListener::controllerRelease2);
        }
    }

    private void button3(boolean active) {
        if (this.button3 != active) {
            this.button3 = active;
            this.listeners.forEach(active ? ControllerListener::controllerPress3 : ControllerListener::controllerRelease3);
        }
    }

    private void button4(boolean active) {
        if (this.button4 != active) {
            this.button4 = active;
            this.listeners.forEach(active ? ControllerListener::controllerPress4 : ControllerListener::controllerRelease4);
        }
    }

    private void buttonL1(boolean active) {
        if (this.buttonL1 != active) {
            this.buttonL1 = active;
            this.listeners.forEach(active ? ControllerListener::controllerPressL1 : ControllerListener::controllerReleaseL1);
        }
    }

    private void buttonL2(boolean active) {
        if (this.buttonL2 != active) {
            this.buttonL2 = active;
            this.listeners.forEach(active ? ControllerListener::controllerPressL2 : ControllerListener::controllerReleaseL2);
        }
    }

    private void buttonR1(boolean active) {
        if (this.buttonR1 != active) {
            this.buttonR1 = active;
            this.listeners.forEach(active ? ControllerListener::controllerPressR1 : ControllerListener::controllerReleaseR1);
        }
    }

    private void buttonR2(boolean active) {
        if (this.buttonR2 != active) {
            this.buttonR2 = active;
            this.listeners.forEach(active ? ControllerListener::controllerPressR2 : ControllerListener::controllerReleaseR2);
        }
    }

    public List<ControllerListener> getListeners() {
        return this.listeners;
    }
}
