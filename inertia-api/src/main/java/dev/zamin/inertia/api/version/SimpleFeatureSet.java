package dev.zamin.inertia.api.version;

public record SimpleFeatureSet(
        boolean supportsElytra,
        boolean supportsSwimming,
        boolean usesFlattenedMaterials
) implements FeatureSet {
}

