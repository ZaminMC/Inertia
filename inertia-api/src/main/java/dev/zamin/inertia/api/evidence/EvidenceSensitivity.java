package dev.zamin.inertia.api.evidence;

public record EvidenceSensitivity(
        boolean latencySensitive,
        boolean serverSensitive,
        boolean exemptDuringTeleportCorrection,
        boolean exemptDuringVelocityGrace
) {

    public static final EvidenceSensitivity NONE = new EvidenceSensitivity(false, false, false, false);
    public static final EvidenceSensitivity MOVEMENT = new EvidenceSensitivity(false, false, true, false);
    public static final EvidenceSensitivity VELOCITY = new EvidenceSensitivity(false, false, false, true);
    public static final EvidenceSensitivity LATENCY = new EvidenceSensitivity(true, false, false, false);
    public static final EvidenceSensitivity SERVER = new EvidenceSensitivity(false, true, false, false);
}

