package dev.zamin.inertia.api.version;

public record SimpleMovementRules(
        double stepHeight,
        double groundFriction,
        double sprintAcceleration
) implements MovementRules {
}

