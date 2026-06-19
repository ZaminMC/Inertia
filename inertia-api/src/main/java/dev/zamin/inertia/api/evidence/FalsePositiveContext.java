package dev.zamin.inertia.api.evidence;

public record FalsePositiveContext(
        boolean teleportCorrectionActive,
        boolean velocityGraceActive,
        LatencyContext latency,
        ServerHealthContext serverHealth
) {

    public static FalsePositiveContext none() {
        return new FalsePositiveContext(false, false, LatencyContext.normal(), ServerHealthContext.healthy());
    }
}

