package dev.zamin.inertia.api.version;

public record SimplePacketRules(
        boolean combinesPositionAndLook,
        boolean allowsGroundOnlyFrames
) implements PacketRules {
}

