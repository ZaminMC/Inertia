package dev.zamin.inertia.api.movement;

import dev.zamin.inertia.api.evidence.EvidenceAccumulator;

public interface MovementProcessor {

    MovementDecision process(MovementContext context, EvidenceAccumulator accumulator);
}
