package dev.zamin.inertia.testkit.movement;

import dev.zamin.inertia.api.session.EngineSession;
import dev.zamin.inertia.api.version.VersionProfile;
import dev.zamin.inertia.api.world.WorldSnapshot;

public record TestEngineSession(VersionProfile versionProfile, WorldSnapshot worldSnapshot) implements EngineSession {
}

