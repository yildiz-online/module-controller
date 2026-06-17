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
 * Provide the steering wheel current state, this object is internally mutable, so there is no need of a new instance to have the latest state.
 *
 * @author Grégory Van den Borre
 */
public interface SteeringWheelCurrentState extends ControllerCurrentState {

    /**
     * Check direction.
     *
     * @return The direction angle, negative for turn left, 0 for center, positive for turn right.
     */
    double directionAngle();

    /**
     * Check brake pedal.
     *
     * @return 0 for no pedal press, positive value for braking force.
     */
    double brakeForce();

    /**
     * Check accelerator pedal.
     *
     * @return 0 for no pedal press, positive value for acceleration force.
     */
    double acceleratorForce();
}
