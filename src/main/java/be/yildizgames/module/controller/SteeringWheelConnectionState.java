
package be.yildizgames.module.controller;

/**
 * Represents the possible states of a controller.
 */
public enum ControllerState {
    /**
     * The controller is disconnected.
     */
    DISCONNECTED,
    
    /**
     * The controller is initializing.
     */
    INITIALIZING,
    
    /**
     * The controller is active.
     */
    ACTIVE,
    
    /**
     * The controller is in an error state.
     */
    ERROR
}

/**
 * Manages the valid transitions between controller states.
 */
public class ControllerStateTransitionValidator {
    
    /**
     * Checks if a transition from one state to another is valid.
     *
     * @param from the current state
     * @param to the target state
     * @return true if the transition is valid, false otherwise
     */
    public boolean isValidTransition(ControllerState from, ControllerState to) {
        var valid = false;
        
        switch (from) {
            case DISCONNECTED:
                valid = (to == ControllerState.INITIALIZING);
                break;
            case INITIALIZING:
                valid = (to == ControllerState.ACTIVE || to == ControllerState.ERROR);
                break;
            case ACTIVE:
                valid = (to == ControllerState.DISCONNECTED || to == ControllerState.ERROR);
                break;
            case ERROR:
                valid = (to == ControllerState.DISCONNECTED);
                break;
        }
        
        return valid;
    }
}
