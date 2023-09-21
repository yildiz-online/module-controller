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
 * Map the keys to an action.
 *
 * @author Gregory Van den Borre
 */
public interface ControllerMapper {

    default ControllerInput button1() {
        return ControllerInput.BUTTON1;
    }

    default ControllerInput button2() {
        return ControllerInput.BUTTON2;
    }

    default ControllerInput button3() {
        return ControllerInput.BUTTON3;
    }

    default ControllerInput button4() {
        return ControllerInput.BUTTON4;
    }

    default ControllerInput buttonL1() {
        return ControllerInput.BUTTON_L1;
    }

    default ControllerInput buttonR1() {
        return ControllerInput.BUTTON_R1;
    }

    default ControllerInput buttonL2() {
        return ControllerInput.BUTTON_L2;
    }

    default ControllerInput buttonR2() {
        return ControllerInput.BUTTON_R2;
    }

    default ControllerInput buttonStart() {
        return ControllerInput.START;
    }

    default ControllerInput buttonSelect() {
        return ControllerInput.SELECT;
    }
}
