package dev.zamin.inertia.api.movement;

import dev.zamin.inertia.api.debug.DebugTrace;
import dev.zamin.inertia.api.evidence.EvidenceDecisionResult;
import dev.zamin.inertia.api.evidence.EvidenceRecord;

public record MovementDecision(
        PredictionResult predictionResult,
        EvidenceRecord evidence,
        EvidenceDecisionResult evidenceDecision,
        DebugTrace trace
) {
}

