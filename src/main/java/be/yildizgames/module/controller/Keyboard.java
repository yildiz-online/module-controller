package be.yildizgames.module.controller;

/**
 * To use the keyboard as controller.
 *
 * @author Grégory Van den Borre
 */
public class Keyboard implements Controller {

    private static final ControllerCurrentState STATE = new ControllerCurrentState() {
        @Override
        public boolean isButton1Pressed() {
            return false;
        }

        @Override
        public boolean isButton2Pressed() {
            return false;
        }

        @Override
        public boolean isButton3Pressed() {
            return false;
        }

        @Override
        public boolean isButton4Pressed() {
            return false;
        }

        @Override
        public boolean isButtonL1Pressed() {
            return false;
        }

        @Override
        public boolean isButtonL2Pressed() {
            return false;
        }

        @Override
        public boolean isButtonR1Pressed() {
            return false;
        }

        @Override
        public boolean isButtonR2Pressed() {
            return false;
        }

        @Override
        public boolean isButtonStartPressed() {
            return false;
        }

        @Override
        public boolean isButtonSelectPressed() {
            return false;
        }

        @Override
        public boolean isPadUpPressed() {
            return false;
        }

        @Override
        public boolean isPadDownPressed() {
            return false;
        }

        @Override
        public boolean isPadLeftPressed() {
            return false;
        }

        @Override
        public boolean isPadRightPressed() {
            return false;
        }
    };

    @Override
    public final String modelName() {
        return "Keyboard";
    }

    @Override
    public final String modelGuid() {
        return "000000000000000000000000000000000";
    }

    @Override
    public final int playerId() {
        return 99999;
    }

    @Override
    public final ControllerCurrentState currentState() {
        return STATE;
    }
}
