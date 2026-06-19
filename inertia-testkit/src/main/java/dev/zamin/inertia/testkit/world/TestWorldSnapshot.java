package dev.zamin.inertia.testkit.world;

import dev.zamin.inertia.api.world.BlockStateView;
import dev.zamin.inertia.api.world.BoxCollisionShape;
import dev.zamin.inertia.api.world.CollisionShape;
import dev.zamin.inertia.api.world.WorldSnapshot;

public final class TestWorldSnapshot implements WorldSnapshot {

    @Override
    public BlockStateView blockAt(int x, int y, int z) {
        return new TestBlockState("minecraft:stone");
    }

    @Override
    public CollisionShape collisionShapeAt(int x, int y, int z) {
        return BoxCollisionShape.FULL_BLOCK;
    }
}

