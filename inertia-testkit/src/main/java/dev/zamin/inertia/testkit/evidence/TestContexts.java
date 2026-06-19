package dev.zamin.inertia.testkit.evidence;

import dev.zamin.inertia.api.evidence.FalsePositiveContext;
import dev.zamin.inertia.api.evidence.LatencyContext;
import dev.zamin.inertia.api.evidence.ServerHealthContext;

public final class TestContexts {

    private TestContexts() {
    }

    public static FalsePositiveContext clean() {
        return FalsePositiveContext.none();
    }

    public static FalsePositiveContext teleportCorrection() {
        return new FalsePositiveContext(true, false, LatencyContext.normal(), ServerHealthContext.healthy());
    }

    public static FalsePositiveContext latencySpike() {
        return new FalsePositiveContext(false, false, LatencyContext.spike(350, 0.25D), ServerHealthContext.healthy());
    }

    public static FalsePositiveContext tpsDrop() {
        return new FalsePositiveContext(false, false, LatencyContext.normal(), ServerHealthContext.degraded(14.5D, 0.4D));
    }
}

