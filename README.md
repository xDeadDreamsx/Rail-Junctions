# Rail Mod

[![Build](https://github.com/xDeadDreamsx/Rail-Mod/actions/workflows/build.yml/badge.svg)](https://github.com/xDeadDreamsx/Rail-Mod/actions/workflows/build.yml)

**Rail Mod** is a small standalone Fabric mod for **Minecraft Java Edition 26.2** that adds four functional rail blocks without requiring Little Logistics, Useful Railroads, or U-Team-Core at runtime.

## Features

- **Rail Cross** — a four-way crossing. Minecarts continue straight across according to their incoming axis.
- **Dead End** — a directional buffer stop that stops minecarts at the end of a line. The inventory/redstone minecart-destruction functionality from Useful Railroads is intentionally not included.
- **Rail Switch** — a three-way switch. Redstone selects straight vs. branch; sneak-right-click toggles the branch side.
- **Tee Junction Rail** — a T junction whose active route is selected by redstone.
- Minecarts stop on the preceding rail when approaching a Rail Switch or Tee Junction from a side that is not connected by the currently selected route.
- Vanilla-style fallback models and item icons are included.
- Optional compatibility with **RAY's 3D Rails** for 3D block and item models.
- Standard vanilla crafting recipes with recipe-book unlocks; recipe viewers such as JEI can discover them as normal crafting recipes.

## Requirements

- Minecraft Java Edition **26.2**
- Fabric Loader **0.19.5+**
- Fabric API
- Java **25**

Little Logistics, Useful Railroads, U-Team-Core, JEI, and RAY's 3D Rails are **not required dependencies**.

## Installation

1. Install Fabric Loader for Minecraft 26.2.
2. Install Fabric API.
3. Put the Rail Mod `.jar` into the Minecraft `mods` folder.
4. Optional: enable RAY's 3D Rails as a resource pack for the supported 3D models.

## Crafting recipes

All four recipes use only vanilla items.

### Rail Cross — 5 output

`R` = Rail

```text
 R 
RRR
 R 
```

### Dead End — 4 output

`I` = Iron Ingot  
`S` = Stick

```text
III
S S
ISI
```

### Rail Switch — 4 output

`R` = Rail

```text
R 
RR
R 
```

### Tee Junction Rail — 4 output

`R` = Rail

```text
RRR
 R 
```

The recipes are registered as standard Minecraft crafting recipes, are unlockable in the vanilla recipe book, and are visible to recipe-viewer mods that display vanilla crafting recipes.

## RAY's 3D Rails compatibility

Rail Mod intentionally provides compatibility model identifiers matching the Little Logistics and Useful Railroads models that **RAY's 3D Rails** already overrides. Rail Mod ships lightweight fallback JSON models using vanilla texture references; when RAY's 3D Rails is enabled, its separately installed 3D models replace those fallbacks.

RAY's 3D Rails is **not bundled** with Rail Mod and remains a separate project:

- https://modrinth.com/resourcepack/rays-3d-rails
- https://github.com/xR4YM0ND/RAYs-3D-Rails

## Building from source

The repository contains the complete source required to build the mod. GitHub Actions builds and runtime-smoke-tests the project against Minecraft 26.2.

Local requirements:

- Java 25
- Gradle 9.5.1 (or a compatible Gradle installation)

Build with:

```text
gradle build
```

The mod JAR is produced under `build/libs/`.

## License and attribution

Rail Mod is distributed under **LGPL-3.0-only**. See:

- [`LICENSE`](LICENSE) — GNU Lesser General Public License v3.0
- [`COPYING`](COPYING) — GNU General Public License v3.0 incorporated by LGPLv3
- [`NOTICE`](NOTICE) — attribution summary
- [`THIRD_PARTY.md`](THIRD_PARTY.md) — detailed upstream references and modification notes
- [`THIRD_PARTY_LICENSES/Useful-Railroads-Apache-2.0.txt`](THIRD_PARTY_LICENSES/Useful-Railroads-Apache-2.0.txt) — Useful Railroads' Apache-2.0 license

The Switch and Tee Junction implementations are adapted/reimplemented from Java behavior in **Little Logistics** (LGPL-3.0). The Rail Cross and Dead End are adapted/reimplemented from behavior in **Useful Railroads** (Apache-2.0). No original art assets from either mod are bundled.

Rail Mod is an independent third-party project. It is not an official port and is not affiliated with or endorsed by Little Logistics, Useful Railroads/U-Team, RAY's 3D Rails, Mojang, or Microsoft.

## Issues

Bug reports and compatibility issues can be opened on the GitHub issue tracker:

https://github.com/xDeadDreamsx/Rail-Mod/issues
