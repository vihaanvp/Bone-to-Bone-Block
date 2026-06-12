package me.vihaanvp.boneToBoneBlock.recipe;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class BoneBlockRecipeRegistrar {

    private final NamespacedKey toBlockKey;
    private final NamespacedKey toBonesKey;
    private final JavaPlugin plugin;

    public BoneBlockRecipeRegistrar(JavaPlugin plugin) {
        this.plugin = plugin;
        this.toBlockKey = new NamespacedKey(plugin, "bones_to_block");
        this.toBonesKey = new NamespacedKey(plugin, "block_to_bones");
    }

    public void registerRecipes() {
        // Remove any existing recipes with the same keys (prevents duplicates on reload)
        Bukkit.removeRecipe(toBlockKey);
        Bukkit.removeRecipe(toBonesKey);

        // 9 bones -> 1 bone block (shaped 3x3)
        ItemStack boneBlock = new ItemStack(Material.BONE_BLOCK, 1);
        ShapedRecipe shaped = new ShapedRecipe(toBlockKey, boneBlock);
        shaped.shape("BBB", "BBB", "BBB");
        shaped.setIngredient('B', Material.BONE);
        Bukkit.addRecipe(shaped);

        // 1 bone block -> 9 bones (shapeless)
        ItemStack bones = new ItemStack(Material.BONE, 9);
        ShapelessRecipe shapeless = new ShapelessRecipe(toBonesKey, bones);
        shapeless.addIngredient(Material.BONE_BLOCK);
        Bukkit.addRecipe(shapeless);
    }

    public void unregisterRecipes() {
        Bukkit.removeRecipe(toBlockKey);
        Bukkit.removeRecipe(toBonesKey);
    }
}