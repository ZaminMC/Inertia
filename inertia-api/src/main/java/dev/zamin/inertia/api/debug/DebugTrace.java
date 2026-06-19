package dev.zamin.inertia.api.debug;

import java.util.List;

public interface DebugTrace {

    List<DebugTraceEntry> entries();

    default boolean isEmpty() {
        return entries().isEmpty();
    }
}

