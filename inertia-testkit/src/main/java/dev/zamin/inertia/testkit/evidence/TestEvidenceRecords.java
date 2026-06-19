package dev.zamin.inertia.testkit.evidence;

import dev.zamin.inertia.api.evidence.EvidenceDomain;
import dev.zamin.inertia.api.evidence.EvidenceRecord;
import dev.zamin.inertia.api.evidence.EvidenceSensitivity;
import dev.zamin.inertia.api.evidence.EvidenceType;

public final class TestEvidenceRecords {

    private TestEvidenceRecords() {
    }

    public static EvidenceRecord movement(long tick, double weight) {
        return new EvidenceRecord(EvidenceType.MOVEMENT_MISMATCH, EvidenceDomain.MOVEMENT, "movement-check", weight, tick, EvidenceSensitivity.MOVEMENT, "movement mismatch");
    }

    public static EvidenceRecord latencySensitive(long tick, double weight) {
        return new EvidenceRecord(EvidenceType.BAD_PACKET, EvidenceDomain.PACKET, "packet-check", weight, tick, EvidenceSensitivity.LATENCY, "packet burst");
    }

    public static EvidenceRecord serverSensitive(long tick, double weight) {
        return new EvidenceRecord(EvidenceType.GENERIC, EvidenceDomain.GENERAL, "server-check", weight, tick, EvidenceSensitivity.SERVER, "server-sensitive sample");
    }
}

