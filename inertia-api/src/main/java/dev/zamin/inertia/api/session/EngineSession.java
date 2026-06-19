package dev.zamin.inertia.api.session;

import dev.zamin.inertia.api.version.VersionProfile;
import dev.zamin.inertia.api.world.WorldSnapshot;

public interface EngineSession {

    VersionProfile versionProfile();

    WorldSnapshot worldSnapshot();
}

