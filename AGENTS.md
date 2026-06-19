# Inertia Agent Rules

## Project shape

Keep the repo lean in this stage:

* `inertia-api`
* `inertia-core`
* `inertia-testkit`
* `docs/`

Do not add platform, protocol, plugin, or per-version adapter modules yet.

## Core boundaries

`inertia-api` and `inertia-core` stay version-neutral.

Do not add:

* Bukkit, Paper, Spigot, or CraftBukkit types
* NMS or Mojang-mapped server classes
* ProtocolLib or Netty public API
* checks based on revision strings such as `v1_8_R3`

Inertia models behavior through normalized frames, world snapshots, collision shapes, and version profiles.

## Reference material

Reference projects under `reffrences_codes/` or `references_codes/` are local research material only.

Rules:

* do not commit them
* do not copy source
* do not paste snippets
* do not preserve private class names, check IDs, config keys, comments, or branding
* write only small high-level notes about categories, data needs, false-positive risks, and engine implications

## Maintainability

Prefer direct code over framework-looking code.

Rules:

* use boring names
* keep types small
* avoid empty abstraction layers
* keep tests close to behavior
* do not add docs that claim support the code does not have

## Testing

Engine behavior changes need tests.

The foundation should be testable without a live server.

