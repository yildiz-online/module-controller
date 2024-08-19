/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *  Copyright (c) 2019-2024 Grégory Van den Borre
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
 * Notify when the controller is updated.
 *
 * @author Grégory Van den Borre
 */
public interface ControllerListener {

    /**
     * Triggered when the controller gets connected.
     */
    default void controllerConnected(Controller controller) {
    }

    /**
     * Triggered when the controller gets disconnected.
     */
    default void controllerDisconnected(Controller controller) {
    }

    /**
     * Triggered when the controller button 1 is pressed.
     */
    default void controllerPress1(Controller controller) {
    }

    /**
     * Triggered when the controller button 1 is released.
     */
    default void controllerRelease1(Controller controller) {
    }

    /**
     * Triggered when the controller button 2 is pressed.
     */
    default void controllerPress2(Controller controller) {
    }

    /**
     * Triggered when the controller button 2 is released.
     */
    default void controllerRelease2(Controller controller) {
    }

    /**
     * Triggered when the controller button 3 is pressed.
     */
    default void controllerPress3(Controller controller) {
    }

    /**
     * Triggered when the controller button 3 is released.
     */
    default void controllerRelease3(Controller controller) {
    }

    /**
     * Triggered when the controller button 4 is pressed.
     */
    default void controllerPress4(Controller controller) {
    }

    /**
     * Triggered when the controller button 4 is released.
     */
    default void controllerRelease4(Controller controller) {
    }

    /**
     * Triggered when the controller button L1 is pressed.
     */
    default void controllerPressL1(Controller controller) {
    }

    /**
     * Triggered when the controller button L1 is released.
     */
    default void controllerReleaseL1(Controller controller) {
    }

    /**
     * Triggered when the controller button R1 is pressed.
     */
    default void controllerPressR1(Controller controller) {
    }

    /**
     * Triggered when the controller button R1 is released.
     */
    default void controllerReleaseR1(Controller controller) {
    }

    /**
     * Triggered when the controller button L2 is pressed.
     */
    default void controllerPressL2(Controller controller) {
    }

    /**
     * Triggered when the controller button L2 is released.
     */
    default void controllerReleaseL2(Controller controller) {
    }

    /**
     * Triggered when the controller button R2 is pressed.
     */
    default void controllerPressR2(Controller controller) {
    }

    /**
     * Triggered when the controller button R2 is released.
     */
    default void controllerReleaseR2(Controller controller) {
    }

    /**
     * Triggered when the controller button start is pressed.
     */
    default void controllerPressStart(Controller controller) {
    }

    /**
     * Triggered when the controller button start is released.
     */
    default void controllerReleaseStart(Controller controller) {
    }

    /**
     * Triggered when the controller button select is pressed.
     */
    default void controllerPressSelect(Controller controller) {
    }

    /**
     * Triggered when the controller button select is released.
     */
    default void controllerReleaseSelect(Controller controller) {
    }

    /**
     * Triggered when the controller dpad left is pressed.
     */
    default void controllerPressLeft(Controller controller) {
    }

    /**
     * Triggered when the controller dpad left is released.
     */
    default void controllerReleaseLeft(Controller controller) {
    }

    /**
     * Triggered when the controller dpad up left is pressed.
     */
    default void controllerPressUpLeft(Controller controller) {
    }

    /**
     * Triggered when the controller dpad up left is released.
     */
    default void controllerReleaseUpLeft(Controller controller) {
    }

    /**
     * Triggered when the controller dpad down left is pressed.
     */
    default void controllerPressDownLeft(Controller controller) {
    }

    /**
     * Triggered when the controller dpad down left is released.
     */
    default void controllerReleaseDownLeft(Controller controller) {
    }

    /**
     * Triggered when the controller dpad up is pressed.
     */
    default void controllerPressUp(Controller controller) {
    }

    /**
     * Triggered when the controller dpad up is released.
     */
    default void controllerReleaseUp(Controller controller) {
    }

    /**
     * Triggered when the controller dpad right is pressed.
     */
    default void controllerPressRight(Controller controller) {
    }

    /**
     * Triggered when the controller dpad right is released.
     */
    default void controllerReleaseRight(Controller controller) {
    }

    /**
     * Triggered when the controller dpad up right is pressed.
     */
    default void controllerPressUpRight(Controller controller) {
    }

    /**
     * Triggered when the controller dpad up right is released.
     */
    default void controllerReleaseUpRight(Controller controller) {
    }

    /**
     * Triggered when the controller dpad down right is pressed.
     */
    default void controllerPressDownRight(Controller controller) {
    }

    /**
     * Triggered when the controller dpad down right is released.
     */
    default void controllerReleaseDownRight(Controller controller) {
    }

    /**
     * Triggered when the controller dpad down is pressed.
     */
    default void controllerPressDown(Controller controller) {
    }

    /**
     * Triggered when the controller dpad down is released.
     */
    default void controllerReleaseDown(Controller controller) {
    }

    default void controllerPressLeftStickLeft(Controller controller) {
    }

    default void controllerReleaseLeftStickLeft(Controller controller) {
    }

    default void controllerPressLeftStickRight(Controller controller) {
    }

    default void controllerReleaseLeftStickRight(Controller controller) {
    }

    default void controllerPressLeftStickUp(Controller controller) {
    }

    default void controllerReleaseLeftStickUp(Controller controller) {
    }

    default void controllerPressLeftStickDown(Controller controller) {
    }

    default void controllerReleaseLeftStickDown(Controller controller) {
    }
}
