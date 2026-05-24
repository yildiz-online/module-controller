package be.yildizgames.module.controller;

/**
 * Represent an input controller.
 *
 * @author Grégory Van den Borre
 */
public interface Controller {

    /**
     * Controller model name.
     *
     * @return The name.
     */
    String modelName();

    /**
     * Controller GUID.
     *
     * @return The GUID.
     */
    String modelGuid();

    /**
     * Identification of the controller during this session.
     *
     * @return The controller id.
     */
    int playerId();

    /**
     * Current state.
     *
     * @return The state.
     */
    ControllerCurrentState currentState();

}
