package dev.zamin.inertia.api.evidence;

public interface EvidenceAccumulator {

    EvidenceDecisionResult record(EvidenceRecord evidence, FalsePositiveContext context);

    ConfidenceSnapshot snapshot(long tick);
}

