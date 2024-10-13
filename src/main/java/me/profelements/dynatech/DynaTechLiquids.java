package me.profelements.dynatech;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import me.profelements.dynatech.utils.Liquid;
import me.profelements.dynatech.utils.LiquidRegistry;

public class DynaTechLiquids {

    public static void registerLiquids(LiquidRegistry registry) {

        // START Vanilla

        // Water
        Liquid.init()
                .setKey(new NamespacedKey(NamespacedKey.MINECRAFT, "water"))
                .setName("水")
                .setColor(Color.BLUE)
                .setLiquidMaterial(Material.WATER)
                .setStorageMaterial(Material.LIGHT_BLUE_STAINED_GLASS_PANE)
                .register(registry);

        // Lava
        Liquid.init()
                .setKey(new NamespacedKey(NamespacedKey.MINECRAFT, "lava"))
                .setName("岩浆")
                .setColor(Color.ORANGE)
                .setLiquidMaterial(Material.LAVA)
                .setStorageMaterial(Material.ORANGE_STAINED_GLASS_PANE)
                .register(registry);

        // Honey
        Liquid.init()
                .setKey(new NamespacedKey(NamespacedKey.MINECRAFT, "honey"))
                .setName("蜂蜜")
                .setColor(Color.YELLOW)
                .setLiquidMaterial(Material.LAVA)
                .setStorageMaterial(Material.YELLOW_STAINED_GLASS_PANE)
                .register(registry);

        // Potion
        Liquid.init()
                .setKey(new NamespacedKey(NamespacedKey.MINECRAFT, "potion"))
                .setName("药水")
                .setColor(Color.WHITE)
                .setLiquidMaterial(Material.WATER)
                .setStorageMaterial(Material.WHITE_STAINED_GLASS_PANE)
                .register(registry);

        // Milk
        Liquid.init()
                .setKey(new NamespacedKey(NamespacedKey.MINECRAFT, "milk"))
                .setName("牛奶")
                .setColor(Color.WHITE)
                .setLiquidMaterial(Material.WATER)
                .setStorageMaterial(Material.WHITE_STAINED_GLASS_PANE)
                .register(registry);
        // END Vanilla
    }
}
