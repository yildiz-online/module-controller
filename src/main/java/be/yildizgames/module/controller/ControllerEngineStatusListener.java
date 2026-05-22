package be.yildizgames.module.controller;

/**
 * Notify upon engine starting or closing.
 * @author Grégory Van den Borre
 */
public interface ControllerEngineStatusListener {
    default void closed() {};

    default void started() {};
}
