package dev.zamin.inertia.api.movement;

import dev.zamin.inertia.api.math.Vec3;

public record MovementState(
        long tick,
        Vec3 previousPosition,
        Vec3 currentPosition,
        MovementDelta delta,
        boolean previousOnGround,
        boolean currentOnGround
) {
}

