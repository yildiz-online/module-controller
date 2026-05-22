
package be.yildizgames.module.controller;

/**
 * Interface for steering wheel controller functionality.
 * Extends the base Controller interface to provide steering-specific capabilities.
 */
public interface SteeringWheelController extends Controller {
    
    /**
     * Retrieves the maximum steering angle supported by this steering wheel controller.
     * 
     * @return the maximum steering angle in degrees
     */
    float getMaxSteeringAngle();
    
    /**
     * Checks if the steering wheel controller supports force feedback functionality.
     * 
     * @return true if force feedback is supported, false otherwise
     */
    boolean supportsForceFeedback();
    
    /**
     * Gets the protocol version supported by this steering wheel controller.
     * 
     * @return the protocol version as a string
     */
    String getProtocolVersion();
}
