package dev.zamin.inertia.testkit.version;

import dev.zamin.inertia.api.version.VersionProfile;
import dev.zamin.inertia.api.version.VersionProfiles;

public final class TestVersionProfiles {

    private TestVersionProfiles() {
    }

    public static VersionProfile legacy() {
        return VersionProfiles.LEGACY_1_8;
    }

    public static VersionProfile modern() {
        return VersionProfiles.MODERN;
    }
}

