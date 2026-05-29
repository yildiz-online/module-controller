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
