package dev.zamin.inertia.api.version;

import dev.zamin.inertia.api.world.BlockStateView;
import dev.zamin.inertia.api.world.BoxCollisionShape;
import dev.zamin.inertia.api.world.CollisionShape;

public record SimpleCollisionRules(boolean usesLegacyEdgeClipping) implements CollisionRules {

    @Override
    public CollisionShape shapeFor(BlockStateView blockState) {
        return BoxCollisionShape.FULL_BLOCK;
    }
}

