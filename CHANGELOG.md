# Changelog

All notable changes to Rail Mod are documented here.

## 1.0.4

- Prepared the project for public distribution.
- Added LGPL-3.0-only project licensing and the incorporated GPLv3 text.
- Added detailed Little Logistics, Useful Railroads, and RAY's 3D Rails attribution/compatibility notices.
- Added the Useful Railroads Apache-2.0 license to the distribution.
- Added modification/source notices to the four upstream-derived/reimplemented rail block classes.
- Embedded license and third-party notice files in published JARs under `META-INF/`.
- Expanded Fabric metadata, README documentation, contribution guidance, and the GitHub bug-report template.
- No gameplay, recipe, or rendering behavior changed from 1.0.3.

## 1.0.3

- Moved the four crafting recipes out of the Redstone recipe-book category so they appear with the vanilla rail/equipment recipes while keeping the blocks in the Redstone creative tab.
- Changed the Dead End recipe to use iron ingots and sticks and return 4 Dead Ends.
- Changed the Rail Cross recipe to use 5 vanilla Rails in a cross pattern and return 5 Rail Crosses.
- Kept Rail Switch and Tee Junction Rail recipes at 4 output.

## 1.0.2

- Updated all crafting recipe ingredient JSON to the Minecraft 26.2 format.
- Fixed recipes being silently skipped by Minecraft's recipe manager.
- Added CI detection for Rail Mod recipe/data parsing failures.

## 1.0.1

- Added vanilla recipe-book unlock advancements.
- Added recipe-viewer compatibility through standard vanilla crafting recipes (including JEI-compatible discovery).

## 1.0.0

- First stable feature release for Fabric / Minecraft 26.2.
- Added Rail Cross, Dead End, Rail Switch, and Tee Junction Rail.
- Added minecart routing/stop logic for custom rails.
- Added stopping before incorrectly aligned Rail Switch and Tee Junction routes.
- Added directional Dead End stopping.
- Added vanilla-style fallback block/item models.
- Added compatibility with the separately installed RAY's 3D Rails resource pack.
- Removed runtime dependencies on Little Logistics, Useful Railroads, and U-Team-Core.
