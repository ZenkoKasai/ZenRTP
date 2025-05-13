# ZenRTP

A work-in-progress Random Teleportation (RTP) plugin for Minecraft servers, originally based on a MyCommand setup.
It's intended to be quick and easy to set up with very minimal configuration needed.

## Overview
ZenRTP is designed to provide players with a rich random teleport experience including:
- Basic random teleport
- Fancy teleport effects with particles and sounds
- Near teleport, cave teleport, and custom world teleports
- Cooldown system per player
- Full permission support

## Features (Planned and In Progress)
- [x] Basic /rtp command with cooldown
- [ ] Fancy teleport effects (particles, sounds)
- [ ] Configurable distances and teleport settings
- [ ] Tab completion for world selection
- [ ] Comprehensive multi-world support
- [ ] Full config.yml for easy server customization
- [ ] Fully customizable language files with support for multiple languages
- [ ] Support for plugins such as Towny, GriefPrevention, WorldGuard, Lands, etc.
- [ ] Plug and Play for most servers, no config needed
- [ ] Command trigger on teleport
- [ ] Async teleport preloading
- [ ] Biome specific teleporting
- [ ] Altitude targeting
- [ ] Economy integration
- [ ] Cache safe locations
- [ ] Smart spread, Dynamic spread based on area/region population
- [ ] Teleport metrics
- [ ] PlaceholderAPI support
- [ ] Group Rtp, teleport a group of player together
- [ ] Teleport history

## Commands (Planned)
- `/rtp` — Random teleport
- `/rtp fancy <on/off>` — Teleport with particles and sounds, toggleable
- `/rtp near` — Small distance teleport
- `/rtp cave` — Teleport into a random cave
- `/rtp world <world>` — Teleport to a random location in a selected world - Configure in config or permissions
- `/rtp resource <world>` — Resource world teleportation - Configure in your config
- `/rtp void` — Teleport into the void
- `/rtp help` — Displays help menu

## Requirements
- Minecraft 1.20.4+
- Java 17+
- Spigot, Paper, or a compatible server implementation

## Status
This plugin is actively being converted from a MyCommand system to a full standalone Bukkit plugin. As this is a hobby I will be working on this in my spare time.

## Credits
- **Original Design and Concept:** ZenkoKasai
- **Inspiration for this System:** JoshTiger

---

Feel free to star ⭐ the repository if you want to keep up with updates!

---

## License
This project will adopt a license when it is closer to release. For now, private use only is permitted.

