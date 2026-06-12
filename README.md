# BoneToBoneBlock 🦴🧱

Compress bones. Uncompress bone blocks. Zero config. Minimal footprint.

BoneToBoneBlock is a tiny PaperMC/Bukkit plugin that adds two intuitive crafting recipes so you can tidy up bone piles into bone blocks — and get the bones back when you need them. Perfect for survival servers, storage optimization, and QoL workflows.

---

## Features
- ✅ 9 × `BONE` → 1 × `BONE_BLOCK` (Shaped 3×3)
- ✅ 1 × `BONE_BLOCK` → 9 × `BONE` (Shapeless)
- 🔑 Stable NamespacedKeys: `bones_to_block`, `block_to_bones`
- ♻️ Recipes register on plugin enable and are removed on disable (clean uninstall)
- 🧩 Zero-config — works out of the box for all players
- 🛡️ Lightweight and server-side only

---

## Why install this?
- Keep storage neat by compressing bones into blocks.
- Decompress quickly when using bones for crafting or trading.
- No permissions, no commands — instant QoL for your players.
- Small, safe, and easy to maintain.

---

## Installation (please read)
Primary — Modrinth (recommended)
- Please download from the Modrinth project page to support the author — Modrinth is the preferred distribution. Look for the Modrinth link on this repository's description or search Modrinth for "BoneToBoneBlock".
- Installing from Modrinth helps the project's visibility and supports future updates and maintenance. 🙏

Steps:
1. Download the latest JAR from the Modrinth page.
2. Copy the JAR to your server's `plugins/` folder.
3. Start or restart your Paper/Spigot server. Recipes will be registered on plugin enable.

Alternative — GitHub Releases
- If Modrinth is unavailable for any reason, you can also download the plugin JAR from the Releases tab on this GitHub repository.
- Releases contain the same builds and a changelog.

---

## Usage
- Compression: Place 9 `BONE` in a 3×3 crafting grid → receive 1 `BONE_BLOCK`.
- Decompression: Place 1 `BONE_BLOCK` in any crafting grid (shapeless) → receive 9 `BONE`.

No commands, no permissions — just craft.

---

## Configuration
- v1.0 is intentionally zero-config for simplicity.
- If you want recipe toggles, per-world control, or other options, open an issue or request a feature — a `config.yml` can be added in a future release.

---

## Compatibility
- Works on Paper and Spigot builds that support the Bukkit API. If you run into compatibility issues, open an issue with your server build/version and I'll help.

---

## Contributing
- Bugs, suggestions, and pull requests are welcome!
- To report a bug or request a feature, open an issue on GitHub and include your server version and build (Paper/Spigot version).
- For code contributions: fork, branch, implement, and open a PR. Keep changes small and document behavior changes.

---

## Support & Contact
- Preferably: Leave feedback or report issues on the Modrinth project page (comments) or here on GitHub Issues.
- Include server (Paper/Spigot) version and plugin version when reporting problems.

---

## Credits
Author: vihaanvp — thanks for using and supporting the project! ✨
Created using: GitHub Copilot

Enjoy cleaner inventories and faster crafting. If this plugin helped you, please give this repository a star — it helps a lot! 🚀