package me.vihaanvp.boneToBoneBlock;

import me.vihaanvp.boneToBoneBlock.recipe.*;
import org.bukkit.plugin.java.JavaPlugin;

public class BoneToBoneBlock extends JavaPlugin {

    private BoneBlockRecipeRegistrar registrar;

    @Override
    public void onEnable() {
        registrar = new BoneBlockRecipeRegistrar(this);
        registrar.registerRecipes();
        getLogger().info("BoneToBoneBlock enabled: registered bone/block recipes.");
    }

    @Override
    public void onDisable() {
        if (registrar != null) {
            registrar.unregisterRecipes();
        }
        getLogger().info("BoneToBoneBlock disabled: removed recipes.");
    }
}