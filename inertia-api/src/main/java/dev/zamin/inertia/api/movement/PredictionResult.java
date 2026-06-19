package dev.zamin.inertia.api.movement;

public record PredictionResult(
        PredictionStatus status,
        MovementPrediction prediction,
        MovementState state,
        MovementEvidenceType evidenceType,
        String reason
) {
}

