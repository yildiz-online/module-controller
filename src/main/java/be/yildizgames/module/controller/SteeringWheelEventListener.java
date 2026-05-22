
package be.yildizgames.module.controller;

/**
 * Event listener interface for steering wheel controller events.
 * This interface provides callback methods for various events that occur
 * during the lifecycle of a steering wheel controller connection.
 */
public interface SteeringWheelEventListener {
    
    /**
     * Called when a connection attempt is made to the steering wheel controller.
     *
     * @param controller the steering wheel controller that initiated the connection attempt
     */
    void onConnectionAttempt(SteeringWheelController controller);
    
    /**
     * Called when there is progress in the handshake process with the steering wheel controller.
     *
     * @param controller the steering wheel controller involved in the handshake
     * @param state the current handshake state
     */
    void onHandshakeProgress(SteeringWheelController controller, SteeringWheelHandshakeState state);
    
    /**
     * Called when a connection to the steering wheel controller is successfully established.
     *
     * @param controller the steering wheel controller that was successfully connected
     */
    void onConnectionSuccess(SteeringWheelController controller);
    
    /**
     * Called when a connection attempt to the steering wheel controller fails.
     *
     * @param controller the steering wheel controller for which the connection failed
     * @param throwable the exception that caused the connection failure
     */
    void onConnectionFailure(SteeringWheelController controller, Throwable throwable);
    
    /**
     * Called when the availability of the steering wheel controller changes.
     *
     * @param event the availability change event
     */
    void onAvailabilityChange(SteeringWheelAvailabilityEvent event);
}
