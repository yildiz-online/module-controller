package be.yildizgames.module.controller;

import java.util.Collection;
import java.util.ServiceLoader;

/**
 * Manage the controllers.
 *
 * @author Grégory Van den Borre
 */
public interface ControllerEngine extends Runnable {

    static ControllerEngine getEngine() {
        ServiceLoader<ControllerEngine> services = ServiceLoader.load(ControllerEngine.class);
        return services.findFirst().orElseThrow();
    }

    ControllerEngine addEngineStatusListener(ControllerEngineStatusListener l);

    /**
     * register a listener to receive event from the controller.
     *
     * @param l Controller listener.
     */
    void addControllerListener(ControllerListener l);

    /**
     * Provide the connected controllers.
     *
     * @return The list of connected controllers.
     */
    Collection<? extends Controller> getControllers();

    void reopen();

    void close();

}
