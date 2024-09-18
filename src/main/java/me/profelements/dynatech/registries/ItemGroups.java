package me.profelements.dynatech.registries;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;

public class ItemGroups {

    public static final void init(Registry<ItemGroup> registry) {
        registry.register(Keys.GENERAL, GENERAL);
        registry.register(Keys.RESOURCES, RESOURCES);
        registry.register(Keys.TOOLS, TOOLS);
        registry.register(Keys.MACHINES, MACHINES);
        registry.register(Keys.GENERATORS, GENERATORS);
        registry.register(Keys.EXPERIMENTAL, EXPERIMENTAL);
        registry.register(Keys.APIARIES, HIVES);
    }

    public static final NestedItemGroup GENERAL = new NestedItemGroup(
            Keys.GENERAL.key(),
            new CustomItemStack(Material.CONDUIT, "&b动力科技"));

    public static final SubItemGroup RESOURCES = new SubItemGroup(
            Keys.RESOURCES.key(), GENERAL,
            new CustomItemStack(Material.PUFFERFISH, "&b动力科技 - 资源"));

    public static final SubItemGroup TOOLS = new SubItemGroup(Keys.TOOLS.key(),
            GENERAL, new CustomItemStack(Material.DIAMOND_AXE, "&b动力科技 - 工具"));

    public static final SubItemGroup MACHINES = new SubItemGroup(Keys.MACHINES.key(), GENERAL,
            new CustomItemStack(Material.SEA_LANTERN, "&b动力科技 - 机器"));

    public static final SubItemGroup GENERATORS = new SubItemGroup(Keys.GENERATORS.key(), GENERAL,
            new CustomItemStack(Material.PRISMARINE_BRICKS, "&b动力科技 - 发电机"));

    public static final SubItemGroup EXPERIMENTAL = new SubItemGroup(Keys.EXPERIMENTAL.key(), GENERAL,
            new CustomItemStack(Material.REDSTONE_LAMP, "&f动力科技 - 实验性物品"));

    public static final SubItemGroup HIVES = new SubItemGroup(Keys.APIARIES.key(),
            GENERAL, new CustomItemStack(Material.BEEHIVE, "&b动力科技 - 蜂巢"));

    public static final class Keys {
        public static final TypedKey<ItemGroup> GENERAL = TypedKey.create("dynatech", "general");
        public static final TypedKey<ItemGroup> RESOURCES = TypedKey.create("dynatech", "resources");
        public static final TypedKey<ItemGroup> TOOLS = TypedKey.create("dynatech", "tools");
        public static final TypedKey<ItemGroup> MACHINES = TypedKey.create("dynatech", "machines");
        public static final TypedKey<ItemGroup> GENERATORS = TypedKey.create("dynatech", "generators");
        public static final TypedKey<ItemGroup> EXPERIMENTAL = TypedKey.create("dynatech", "experimental");
        public static final TypedKey<ItemGroup> APIARIES = TypedKey.create("dynatech", "apiaries");
    }
}
