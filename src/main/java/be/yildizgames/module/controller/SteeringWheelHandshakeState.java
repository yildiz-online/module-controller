
package be.yildizgames.module.controller;

/**
 * Interface defining the protocol negotiation lifecycle for steering wheel handshake states.
 * This interface provides a type-safe way to represent the different states of a steering wheel
 * handshake process with clear state transitions.
 */
public interface SteeringWheelHandshakeState {
    
    /**
     * Represents the initial state of the steering wheel handshake.
     * This is the first state when the handshake process begins.
     */
    record Initiated() implements SteeringWheelHandshakeState {
        @Override
        public String toString() {
            return "INITIATED";
        }
    }
    
    /**
     * Represents the negotiation state of the steering wheel handshake.
     * During this phase, protocol parameters are being negotiated between devices.
     */
    record Negotiating() implements SteeringWheelHandshakeState {
        @Override
        public String toString() {
            return "NEGOTIATING";
        }
    }
    
    /**
     * Represents the verification state of the steering wheel handshake.
     * In this state, the negotiated parameters are being verified for correctness.
     */
    record Verified() implements SteeringWheelHandshakeState {
        @Override
        public String toString() {
            return "VERIFIED";
        }
    }
    
    /**
     * Represents the failed state of the steering wheel handshake.
     * This state indicates that the handshake process has encountered an error
     * and cannot proceed to the active state.
     */
    record Failed() implements SteeringWheelHandshakeState {
        @Override
        public String toString() {
            return "FAILED";
        }
    }
    
    /**
     * Represents the active state of the steering wheel handshake.
     * This is the final state where the handshake is complete and the connection is established.
     */
    record Active() implements SteeringWheelHandshakeState {
        @Override
        public String toString() {
            return "ACTIVE";
        }
    }
}
