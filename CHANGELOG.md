# Changelog

All notable changes to this project will be documented in this file.

The format is based on "Keep a Changelog" and this project follows [Semantic Versioning](https://semver.org/).

Sections
- Unreleased: upcoming changes that haven't been released yet.
- Version entries: listed in reverse chronological order (newest first).
- Categories: Added, Changed, Deprecated, Removed, Fixed, Security.

Usage
1. Add new changes under the "Unreleased" heading while developing.
2. When making a release:
    - Move the relevant items from "Unreleased" into a new version section.
    - Replace the date placeholder with the release date (YYYY-MM-DD).
    - Tag the release in your VCS and publish the build/asset(s).

Format example
- Use the categories provided above.
- Keep entries short and actionable.
- Reference issues/PRs where appropriate (e.g., `#12`).

---

## [1.0.0] - 2026-06-12
### Added
- Initial release of BoneToBoneBlock.
- Main plugin class `me.vihaanvp.BoneToBoneBlock`.
- `me.vihaanvp.BoneRecipeRegistrar` to register and unregister recipes.
- Crafting recipes:
    - Shaped 3×3: 9 × `BONE` → 1 × `BONE_BLOCK` (NamespacedKey: `bones_to_block`)
    - Shapeless: 1 × `BONE_BLOCK` → 9 × `BONE` (NamespacedKey: `block_to_bones`)
- Recipes are registered on plugin enable and removed on plugin disable to avoid leaving stale recipes after uninstall.

---

## Unreleased / Future ideas
- Add `config.yml` to allow toggling recipes per-world or per-server.
- Add commands or permission nodes (optional) for admin control.
- Add compatibility checks to avoid re-registering vanilla recipes when equivalent ones exist.

---

### References
- Follow "Keep a Changelog" for formatting guidance: https://keepachangelog.com/
- Semantic Versioning: https://semver.org/

---