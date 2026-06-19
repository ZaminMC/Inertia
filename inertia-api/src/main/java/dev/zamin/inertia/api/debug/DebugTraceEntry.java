package dev.zamin.inertia.api.debug;

import dev.zamin.inertia.api.evidence.EvidenceDecision;

public record DebugTraceEntry(
        long tick,
        String source,
        EvidenceDecision decision,
        double appliedWeight,
        String message
) {
}

