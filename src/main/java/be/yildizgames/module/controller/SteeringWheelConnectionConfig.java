
package be.yildizgames.module.controller;

/**
 * Configuration record for steering wheel connection parameters including timeouts and negotiation settings.
 * This immutable data class encapsulates all necessary configuration values for managing steering wheel connections.
 */
public record SteeringWheelConnectionConfig(
    long connectionTimeoutMillis,
    long handshakeTimeoutMillis,
    int maxRetryAttempts,
    String protocolVersion
) {
    
    /**
     * Compact constructor to validate all timeout values.
     * 
     * @param connectionTimeoutMillis the timeout in milliseconds for establishing a connection
     * @param handshakeTimeoutMillis the timeout in milliseconds for completing the handshake process
     * @param maxRetryAttempts the maximum number of retry attempts for connection establishment
     * @param protocolVersion the version of the protocol to be used for communication
     * @throws IllegalArgumentException when any timeout value is not positive or when protocolVersion is null/empty
     */
    public SteeringWheelConnectionConfig {
        if (connectionTimeoutMillis <= 0) {
            throw new IllegalArgumentException("Connection timeout must be positive");
        }
        if (handshakeTimeoutMillis <= 0) {
            throw new IllegalArgumentException("Handshake timeout must be positive");
        }
        if (maxRetryAttempts < 0) {
            throw new IllegalArgumentException("Max retry attempts cannot be negative");
        }
        if (protocolVersion == null || protocolVersion.isEmpty()) {
            throw new IllegalArgumentException("Protocol version cannot be null or empty");
        }
    }
}
