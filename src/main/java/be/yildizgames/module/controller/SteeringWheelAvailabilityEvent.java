package be.yildizgames.module.controller;

import java.time.Instant;
import java.util.Objects;

/**
 * Represents an event indicating the availability status of a steering wheel controller.
 * This event is immutable and provides standardized information about controller 
 * availability without coupling to driver-level hardware detection logic.
 */
public final class SteeringWheelAvailabilityEvent {
    
    /**
     * The unique identifier of the controller.
     */
    private final String controllerId;
    
    /**
     * The current status of the controller.
     */
    private final Status status;
    
    /**
     * The detected model name of the controller, or null if not available.
     */
    private final String detectedModelName;
    
    /**
     * The timestamp when the event occurred.
     */
    private final Instant timestamp;
    
    /**
     * Creates a new steering wheel availability event.
     *
     * @param controllerId the unique identifier of the controller
     * @param status the current status of the controller
     * @param detectedModelName the detected model name, or null if not available
     * @param timestamp the timestamp when the event occurred
     * @throws NullPointerException if controllerId or status is null
     */
    public SteeringWheelAvailabilityEvent(String controllerId, Status status, String detectedModelName, Instant timestamp) {
        this.controllerId = Objects.requireNonNull(controllerId);
        this.status = Objects.requireNonNull(status);
        this.detectedModelName = detectedModelName;
        this.timestamp = Objects.requireNonNull(timestamp);
    }
    
    /**
     * Returns the unique identifier of the controller.
     *
     * @return the controller identifier
     */
    public String getControllerId() {
        return controllerId;
    }
    
    /**
     * Returns the current status of the controller.
     *
     * @return the controller status
     */
    public Status getStatus() {
        return status;
    }
    
    /**
     * Returns the detected model name of the controller, or null if not available.
     *
     * @return the detected model name or null
     */
    public String getDetectedModelName() {
        return detectedModelName;
    }
    
    /**
     * Returns the timestamp when the event occurred.
     *
     * @return the event timestamp
     */
    public Instant getTimestamp() {
        return timestamp;
    }
    
    /**
     * Status of a steering wheel controller.
     */
    public enum Status {
        /**
         * The controller is connected and available.
         */
        CONNECTED,
        
        /**
         * The controller is disconnected or not available.
         */
        DISCONNECTED,
        
        /**
         * The controller is in an unknown state.
         */
        UNKNOWN
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SteeringWheelAvailabilityEvent that = (SteeringWheelAvailabilityEvent) o;
        return Objects.equals(controllerId, that.controllerId) &&
               status == that.status &&
               Objects.equals(detectedModelName, that.detectedModelName) &&
               Objects.equals(timestamp, that.timestamp);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(controllerId, status, detectedModelName, timestamp);
    }
    
    @Override
    public String toString() {
        return "SteeringWheelAvailabilityEvent{" +
               "controllerId='" + controllerId + '\'' +
               ", status=" + status +
               ", detectedModelName='" + detectedModelName + '\'' +
               ", timestamp=" + timestamp +
               '}';
    }
}
