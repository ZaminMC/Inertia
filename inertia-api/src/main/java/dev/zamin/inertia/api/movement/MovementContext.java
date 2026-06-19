package dev.zamin.inertia.api.movement;

import dev.zamin.inertia.api.evidence.FalsePositiveContext;
import dev.zamin.inertia.api.session.EngineSession;

public record MovementContext(
        MovementFrame frame,
        MovementState previousState,
        EngineSession session,
        FalsePositiveContext falsePositiveContext
) {
}

