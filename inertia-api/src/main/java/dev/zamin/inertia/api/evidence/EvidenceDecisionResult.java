package dev.zamin.inertia.api.evidence;

public record EvidenceDecisionResult(
        EvidenceDecision decision,
        double appliedWeight,
        String reason,
        ConfidenceSnapshot snapshot
) {
}

