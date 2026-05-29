package be.yildizgames.module.controller;

/**
 * Map the button to another button.
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
