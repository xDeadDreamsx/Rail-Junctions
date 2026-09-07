# Changelog

All notable changes to Rail Mod are documented here.

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
