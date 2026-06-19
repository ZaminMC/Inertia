package dev.zamin.inertia.testkit.movement;

import dev.zamin.inertia.api.evidence.FalsePositiveContext;
import dev.zamin.inertia.api.movement.MovementFrame;

public record MovementScenarioStep(
        MovementFrame frame,
        FalsePositiveContext context
) {
}

