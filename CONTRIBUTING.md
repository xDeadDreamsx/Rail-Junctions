# Contributing to Rail Mod

Thanks for considering a contribution.

## Before opening a pull request

- Target the Minecraft/Fabric versions currently declared in `gradle.properties` unless the change is explicitly a version port.
- Run `gradle build` and make sure the project compiles.
- Test rail behavior in game when changing blocks, minecart logic, blockstates, models, recipes, or mixins.
- Preserve compatibility with the fallback models and, where applicable, the optional RAY's 3D Rails model overrides.

## Licensing

By submitting code to this repository, you agree that your contribution may be distributed as part of Rail Mod under **LGPL-3.0-only**.

Do not submit third-party code, textures, models, sounds, logos, or other assets unless their license permits redistribution in Rail Mod and the required attribution/license information is included. When adapting an upstream implementation, add a clear source/modification note to the relevant file and update `THIRD_PARTY.md` when necessary.

The existing Little Logistics and Useful Railroads attribution/licensing information must not be removed.

## Bug reports

Please include:

- Rail Mod version
- Minecraft version
- Fabric Loader and Fabric API versions
- Other relevant mods/resource packs (especially RAY's 3D Rails or minecart-changing mods)
- Whether the issue also occurs without resource packs
- Steps to reproduce
- Crash report or `latest.log` when relevant

## Pull requests

Keep changes focused. If a change alters user-facing behavior, recipes, requirements, or compatibility, update `README.md` and `CHANGELOG.md` as appropriate.
