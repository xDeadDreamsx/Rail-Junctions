# Rail Mod

A small standalone **Fabric mod for Minecraft 26.2** that adds four functional rail blocks:

- **Rail Cross** — a four-way crossing. Minecarts continue straight across it.
- **Dead End** — a directional buffer stop that stops a minecart after it rolls onto the block.
- **Rail Switch** — a three-way switch. Redstone selects straight vs. branch; sneak-right-click changes the branch side.
- **Tee Junction Rail** — a T junction whose active branch is selected by redstone.

## Dependencies

- Minecraft 26.2
- Fabric Loader 0.19.5+
- Fabric API

Little Logistics, Useful Railroads and U-Team-Core are **not** runtime dependencies.

## RAYs 3D Rails compatibility

The mod's blockstates intentionally reference the same model IDs that RAYs 3D Rails overrides for
Little Logistics and Useful Railroads. Rail Mod also ships lightweight fallback models under those model
IDs, using only vanilla textures. With RAYs enabled, the resource pack's 3D models replace the fallbacks.

## Recipes

The recipe layouts and output counts mirror the referenced original blocks while using vanilla ingredients.

## Building

The repository includes a GitHub Actions workflow for Java 25 / Fabric 26.2. It builds with Gradle 9.5.1.

See [THIRD_PARTY.md](THIRD_PARTY.md) for source acknowledgements.
