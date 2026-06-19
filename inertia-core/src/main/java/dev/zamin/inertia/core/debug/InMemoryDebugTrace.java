package dev.zamin.inertia.core.debug;

import dev.zamin.inertia.api.debug.DebugTrace;
import dev.zamin.inertia.api.debug.DebugTraceEntry;

import java.util.ArrayList;
import java.util.List;

public final class InMemoryDebugTrace implements DebugTrace {

    private final List<DebugTraceEntry> entries = new ArrayList<>();

    public void append(DebugTraceEntry entry) {
        entries.add(entry);
    }

    @Override
    public List<DebugTraceEntry> entries() {
        return List.copyOf(entries);
    }

    public void appendAll(DebugTrace trace) {
        entries.addAll(trace.entries());
    }
}
