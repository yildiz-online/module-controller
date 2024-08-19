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

package be.yildizgames.module.controller;

/**
 * Provide the controller current state, this object is internally mutable, so there is no need of a new instance to have the latest state.
 *
 * @author Grégory Van den Borre
 */
public interface ControllerCurrentState {

    /**
     * Check button 1.
     *
     * @return True if the button 1 is currently pressed.
     */
    boolean isButton1Pressed();

    /**
     * Check button 2.
     *
     * @return True if the button 2 is currently pressed.
     */
    boolean isButton2Pressed();

    /**
     * Check button 3.
     *
     * @return True if the button 3 is currently pressed.
     */
    boolean isButton3Pressed();

    /**
     * Check button 4.
     *
     * @return True if the button 4 is currently pressed.
     */
    boolean isButton4Pressed();

    /**
     * Check button L1.
     *
     * @return True if the button L1 is currently pressed.
     */
    boolean isButtonL1Pressed();

    /**
     * Check button L2.
     *
     * @return True if the button L2 is currently pressed.
     */
    boolean isButtonL2Pressed();

    /**
     * Check button R1.
     *
     * @return True if the button R1 is currently pressed.
     */
    boolean isButtonR1Pressed();

    /**
     * Check button R2.
     *
     * @return True if the button R2 is currently pressed.
     */
    boolean isButtonR2Pressed();

    /**
     * Check button start.
     *
     * @return True if the button start is currently pressed.
     */
    boolean isButtonStartPressed();

    /**
     * Check button select.
     *
     * @return True if the button select is currently pressed.
     */
    boolean isButtonSelectPressed();

    /**
     * Check pad up.
     *
     * @return True if the pas up is currently pressed.
     */
    boolean isPadUpPressed();

    /**
     * Check pad down.
     *
     * @return True if the pas down is currently pressed.
     */
    boolean isPadDownPressed();

    /**
     * Check pad left.
     *
     * @return True if the pas left is currently pressed.
     */
    boolean isPadLeftPressed();

    /**
     * Check pad right.
     *
     * @return True if the pas right is currently pressed.
     */
    boolean isPadRightPressed();
}
