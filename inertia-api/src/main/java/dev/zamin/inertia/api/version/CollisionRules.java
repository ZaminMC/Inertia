package dev.zamin.inertia.api.version;

import dev.zamin.inertia.api.world.BlockStateView;
import dev.zamin.inertia.api.world.CollisionShape;

public interface CollisionRules {

    CollisionShape shapeFor(BlockStateView blockState);

    boolean usesLegacyEdgeClipping();
}

