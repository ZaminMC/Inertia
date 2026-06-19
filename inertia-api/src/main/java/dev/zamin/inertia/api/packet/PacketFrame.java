package dev.zamin.inertia.api.packet;

import dev.zamin.inertia.api.math.Vec3;

public record PacketFrame(
        long tick,
        PacketFrameType type,
        Vec3 position,
        boolean onGround
) {
}

