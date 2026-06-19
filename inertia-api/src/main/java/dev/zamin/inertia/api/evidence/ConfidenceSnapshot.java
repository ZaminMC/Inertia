package dev.zamin.inertia.api.evidence;

import dev.zamin.inertia.api.debug.DebugTrace;

public record ConfidenceSnapshot(
        long tick,
        double confidence,
        int retainedEvidenceCount,
        DebugTrace trace
) {
}

