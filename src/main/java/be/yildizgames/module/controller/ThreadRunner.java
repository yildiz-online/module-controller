package be.yildizgames.module.controller;

/**
 * Run the engine in a dedicated thread.
 *
 * @author Grégory Van den Borre
 */
public interface ThreadRunner {

    void start(Runnable runnable);

}
