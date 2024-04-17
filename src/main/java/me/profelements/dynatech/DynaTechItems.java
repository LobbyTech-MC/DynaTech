package me.profelements.dynatech;

import dev.j3fftw.extrautils.utils.LoreBuilderDynamic;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.profelements.dynatech.items.electric.MaterialHive;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class DynaTechItems {

    private static final String ID_LORE = "&7ID: <ID>";
    private static final String RIGHT_CLICK_LORE = "&e右键点击&7打开";
    private static final String THREE_X_PROD_LORE = "&c3倍生产速度";

    private DynaTechItems() {
    }

    // Categories
    public static final NestedItemGroup DT_GENERAL = new NestedItemGroup(
            new NamespacedKey(DynaTech.getInstance(), "DT_GENERAL"),
            new CustomItemStack(Material.CONDUIT, "&b动力科技"));
    public static final SubItemGroup DT_RESOURCES = new SubItemGroup(
            new NamespacedKey(DynaTech.getInstance(), "DT_RESOURCES"), DT_GENERAL,
            new CustomItemStack(Material.PUFFERFISH, "&b动力科技 - 资源"));
    public static final SubItemGroup DT_TOOLS = new SubItemGroup(new NamespacedKey(DynaTech.getInstance(), "DT_TOOLS"),
            DT_GENERAL, new CustomItemStack(Material.DIAMOND_AXE, "&b动力科技 - 工具"));
    public static final SubItemGroup DT_MACHINES = new SubItemGroup(
            new NamespacedKey(DynaTech.getInstance(), "DT_MACHINES"), DT_GENERAL,
            new CustomItemStack(Material.SEA_LANTERN, "&b动力科技 - 机器"));
    public static final SubItemGroup DT_GENERATORS = new SubItemGroup(
            new NamespacedKey(DynaTech.getInstance(), "DT_GENERATORS"), DT_GENERAL,
            new CustomItemStack(Material.PRISMARINE_BRICKS, "&b动力科技 - 发电机"));

    public static final SubItemGroup DT_EXPERIMENTAL = new SubItemGroup(
            new NamespacedKey(DynaTech.getInstance(), "DT_EXPERIMENTAL"), DT_GENERAL,
            new CustomItemStack(Material.REDSTONE_LAMP, "&f动力科技 - 实验性物品"));

    public static final SubItemGroup DT_HIVES = new SubItemGroup(new NamespacedKey(DynaTech.getInstance(), "DT_HIVES"),
            DT_GENERAL, new CustomItemStack(Material.BEEHIVE, "&b动力科技 - 蜂巢"));

    public static final RecipeType DynaTechScoop = new RecipeType(new NamespacedKey(DynaTech.getInstance(), "dt_scoop"),
            new CustomItemStack(Material.IRON_SHOVEL, "&b使用勺子铲蜜蜂"));

    public static final RecipeType DT_SCOOP = new RecipeType(new NamespacedKey(DynaTech.getInstance(), "DT_SCOOP"),
            new CustomItemStack(Material.IRON_SHOVEL, "&b使用勺子铲蜜蜂"));

    // START Mechanical Components

    public static final SlimefunItemStack WOOD_MACHINE_CORE = new SlimefunItemStack("DT_WOOD_MACHINE_CORE",
            Material.MANGROVE_WOOD, "&f木质机器核心");

    public static final SlimefunItemStack STONE_MACHINE_CORE = new SlimefunItemStack("DT_STONE_MACHINE_CORE",
            Material.SMOOTH_STONE, "&f石质机器核心");

    public static final SlimefunItemStack IRON_MACHINE_CORE = new SlimefunItemStack("DT_IRON_MACHINE_CORE",
            Material.GRAY_CONCRETE, "&f铁质机器核心");

    public static final SlimefunItemStack DIAMOND_MACHINE_CORE = new SlimefunItemStack("DT_DIAMOND_MACHINE_CORE",
            Material.LIGHT_BLUE_CONCRETE, "&f钻石机器核心");

    public static final SlimefunItemStack ENCHANTED_MACHINE_CORE = new SlimefunItemStack("DT_ENCHANTED_MACHINE_CORE",
            Material.RESPAWN_ANCHOR, "&b附魔机器核心");

    public static final SlimefunItemStack ENERGY_STORAGE_COMPONENT = new SlimefunItemStack(
            "DT_ENERGY_STORAGE_COMPONENT", Material.REDSTONE_LAMP, "&c电力存储组件");

    public static final SlimefunItemStack ENERGY_INPUT_COMPONENT = new SlimefunItemStack("DT_ENERGY_INPUT_COMPONENT",
            Material.COMPARATOR, "&c电力输入组件");

    public static final SlimefunItemStack ENERGY_OUTPUT_COMPONENT = new SlimefunItemStack("DT_ENERGY_OUTPUT_COMPONENT",
            Material.REPEATER, "&c电力输出组件");

    public static final SlimefunItemStack DEGRADED_WATER_MILL = new SlimefunItemStack("DT_WATER_MILL_DEGRADED",
            Material.COBBLESTONE_WALL, "&c破损的水轮发电机");

    public static final SlimefunItemStack DEGRADED_WATER_MILL_2 = new SlimefunItemStack("DT_WATER_MILL_2_DEGRADED",
            Material.PRISMARINE_WALL, "&c破损的水力涡轮发电机");

    // END Mechanical Components

    // START Energy Generators

    public static final SlimefunItemStack WATER_MILL_1 = new SlimefunItemStack("DT_WATER_MILL",
            Material.COBBLESTONE_WALL,
            "&b水轮发电机",
            "",
            "&7将在使用一段时间后破损。",
            LoreBuilder.powerBuffer(64),
            LoreBuilderDynamic.powerPerSecond(16));

    public static final SlimefunItemStack WATER_MILL_2 = new SlimefunItemStack("DT_WATER_MILL_2",
            Material.PRISMARINE_WALL,
            "&b水力涡轮发电机",
            "",
            "&7将在使用一段时间后破损。",
            LoreBuilder.powerBuffer(256),
            LoreBuilderDynamic.powerPerSecond(64));

    // END Energy Generators

    // START Materials
    public static final SlimefunItemStack STAINLESS_STEEL_INGOT = new SlimefunItemStack("DT_STAINLESS_STEEL_INGOT",
            Material.IRON_INGOT, "&f不锈钢锭");

    public static final SlimefunItemStack STAINLESS_STEEL_ROTOR_1 = new SlimefunItemStack("DT_STAINLESS_STEEL_ROTOR",
            Material.IRON_BLOCK, "&f不锈钢转子");
    // END Materials

    // General

    // Resources
    public static final SlimefunItemStack STAINLESS_STEEL = new SlimefunItemStack("STAINLESS_STEEL",
            Material.IRON_INGOT, "&6不锈钢锭");
    public static final SlimefunItemStack STAINLESS_STEEL_ROTOR = new SlimefunItemStack("STAINLESS_STEEL_ROTOR",
            Material.IRON_BLOCK, "&6不锈钢转子");
    public static final SlimefunItemStack ANCIENT_MACHINE_CORE = new SlimefunItemStack("ANCIENT_MACHINE_CORE",
            Material.LAPIS_BLOCK, "&6古代机器核心");
    public static final SlimefunItemStack VEX_GEM = new SlimefunItemStack("VEX_GEM",
            PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("b91aeca7c17e66d867231b36d96e83c1ede75eaf67ccf3a88dca15d4114ae167")),
            "&6恼鬼宝石");
    public static final SlimefunItemStack MACHINE_SCRAP = new SlimefunItemStack("MACHINE_SCRAP",
            PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("13ea401c7e02d13cea1de6835ee9f5c47757d399dae5c2b9c3efde6ae63ea4a2")),
            "&6机器废料");
    public static final SlimefunItemStack ADVANCED_MACHINE_SCRAP = new SlimefunItemStack("ADVANCED_MACHINE_SCRAP",
            PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("4b57a4c68d1d2c5de978ea6de4db91ef387ca6c37966bb8e7c8826f937e6c3")),
            "&6高级机器废料");
    public static final SlimefunItemStack STAR_DUST = new SlimefunItemStack("STAR_DUST", Material.NETHER_STAR,
            "&6星尘");
    public static final SlimefunItemStack GHOSTLY_ESSENCE = new SlimefunItemStack("GHOSTLY_ESSENCE", Material.WHITE_DYE,
            "&6幽灵精华");
    public static final SlimefunItemStack TESSERACTING_OBJ = new SlimefunItemStack("TESSERACTING_OBJ",
            Material.MUSHROOM_STEM, "&6光学物品", "&f&o在你的手中闪耀并移动");
    public static final SlimefunItemStack BEE = new SlimefunItemStack("BEE",
            PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("12724a9a4cdd68ba49415560e5be40b4a1c47cb5be1d66aedb52a30e62ef2d47")),
            "&6蜜蜂");
    public static final SlimefunItemStack ROBOTIC_BEE = new SlimefunItemStack("ROBOTIC_BEE",
            PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("16f728c89904b2cb57f853d31d0e2061f52917981fedccb1e949528e08eb4140")),
            "&6机械蜜蜂");
    public static final SlimefunItemStack ADVANCED_ROBOTIC_BEE = new SlimefunItemStack("ADVANCED_ROBOTIC_BEE",
            PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("c1c96e8cf83cbade55ffa667197ea6990290e5c7dc679104332caead97eef09")),
            "&6高级机械蜜蜂");

    // Tools
    public static final SlimefunItemStack PICNIC_BASKET = new SlimefunItemStack("PICNIC_BASKET",
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("7a6bf916e28ccb80b4ebfacf98686ad6af7c4fb257e57a8cb78c71d19dccb2"))),
            "&6野餐篮",
            "",
            "&f允许你储存食物",
            "&f在你的饥饿度降低时自动喂食",
            "&f必须储放在物品栏中",
            "",
            "&f大小: &e27",
            "",
            ID_LORE,
            "",
            RIGHT_CLICK_LORE);

    public static final SlimefunItemStack SOULBOUND_PICNIC_BASKET = new SlimefunItemStack("SOULBOUND_PICNIC_BASKET",
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("7a6bf916e28ccb80b4ebfacf98686ad6af7c4fb257e57a8cb78c71d19dccb2"))),
            "&6灵魂绑定野餐篮",
            "",
            "&f允许你储存食物",
            "&f在你的饥饿度降低时自动喂食",
            "&f必须储放在物品栏中",
            "",
            "&f大小: &e27",
            "",
            ID_LORE,
            "",
            RIGHT_CLICK_LORE,
            "",
            "&d灵魂绑定");

    public static final SlimefunItemStack INVENTORY_FILTER = new SlimefunItemStack("INVENTORY_FILTER",
            Material.IRON_BARS,
            "&6物品栏过滤器",
            "",
            "&f如果捡起的物品已存在于过滤器中",
            "&f那么该物品就会被丢入虚空",
            "",
            ID_LORE,
            "",
            RIGHT_CLICK_LORE);

    public static final SlimefunItemStack ELECTRICAL_STIMULATOR = new SlimefunItemStack("ELECTRICAL_STIMULATOR",
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("82a319cf66a4de12e3330e8bc4c82c985ccc3cb2230868c336a88fc4a22082a"))),
            "&6电力刺激器",
            "",
            "&f使用电力自动喂食",
            "",
            "&f&o刺激你的感官",
            "",
            LoreBuilder.powerCharged(0, 1024));

    public static final SlimefunItemStack ANGEL_GEM = new SlimefunItemStack("ANGEL_GEM",
            Material.NETHERITE_BLOCK,
            "&6飞行宝石",
            "",
            "&f永久性的创造模式的飞行",
            "&f有一些速度调整的设定",
            "",
            "&f&o像鸟一样飞翔~",
            "",
            "&7飞行: <enabled>",
            "&7飞行速度: <speed>");

    public static final SlimefunItemStack SCOOP = new SlimefunItemStack("SCOOP",
        Material.IRON_SHOVEL,
        "&6勺子",
            "",
            "&f用于捕捉蜜蜂",
            "",
            "&f&o别被蜜蜂蛰到哟~",
        "",
        LoreBuilder.powerCharged(0, 512)
    );

    public static final SlimefunItemStack DIMENSIONAL_HOME = new SlimefunItemStack("DIMENSIONAL_HOME",
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("eb18cf9e1bf7ec57304ae92f2b00d91643cf0b65067dead34fb48baf18e3c385"))),
            "&6异次元之家",
            "",
            "&f将你传送到异次元之家",
            "&f或返回",
            "",
            "&f&o家,甜蜜的家",
            "",
            "&7区块ID: <id>");

    public static final SlimefunItemStack ITEM_BAND_HEALTH = new SlimefunItemStack("ITEM_BAND_HEALTH",
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("f1e2428cb359988f4c4ff0e61de21385c62269de19a69762d773223b75dd1666"))),
            "&6物品模组: 生命提升",
            "",
            "&9使用物品模组管理器安装",
        "&f当安装到防具或工具上时",
        "&f提供生命提升 II 的效果",
            "",
            "&f&o力量提升!"
    );

    public static final SlimefunItemStack ITEM_BAND_HASTE = new SlimefunItemStack("ITEM_BAND_HASTE",
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("4f01ec6331a3bc30a8204ec56398d08ca38788556bca9b81d776f6238d567367"))),
            "&6物品模组: 急迫",
            "",
            "&9使用物品模组管理器安装",
            "&f当安装到防具或工具上时",
        "&f提供急迫 II 的效果",
            "",
            "&f&o力量提升!");

    public static final SlimefunItemStack TESSERACT_BINDER = new SlimefunItemStack("TESSERACT_BINDER",
            Material.NETHERITE_HOE,
            "&6光学绑定仪",
        "",
        "&f用于绑定2个光学传输器.",
            "",
            "&e右键点击&f获取光学传输器的位置",
            "&eShift + 右键点击&f将获取的位置绑定至光学传输器",
        ""
    );

    public static final SlimefunItemStack LIQUID_TANK = new SlimefunItemStack("LIQUID_TANK",
            Material.BUCKET,
            "&6便携式液体储存罐",
            "",
            "&f简单的液体掠夺者",
            "",
            "&e右键点击&7装载液体",
            "&eShift + 右键点击&7倾倒液体",
            "",
            "&f存储液体: 没有液体",
            "&f容量: 0mb / 16000",
            "");

    public static final SlimefunItemStack WITHER_GOLEM = new SlimefunItemStack("WITHER_GOLEM",
            Material.WITHER_SKELETON_SKULL,
            "&6多方块结构: 凋灵傀儡",
            "",
            "生成一只凋灵骷髅",
            "");

    // Machines
    public static final SlimefunItemStack AUTO_KITCHEN = new SlimefunItemStack("AUTO_KITCHEN",
            Material.SMOKER,
            "&6自动厨房",
            "",
            "&f自动合成&e厨房&f配方",
            "",
            "&f&o闻起来像饼干一样",
        "",
        "&4&l已弃用，请使用&6厨房自动合成机",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilderDynamic.powerPerSecond(16));

    // Machines
    public static final SlimefunItemStack KITCHEN_AUTO_CRAFTER = new SlimefunItemStack("KITCHEN_AUTO_CRAFTER",
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("c5c5b24cd5efa07d31beea655d7ff972e6f47cdb898be4404363deeba43ba5d"))),
            "&6厨房自动合成机",
            "",
            "&f自动合成&e厨房&f配方",
            "",
            "&f&o闻起来像饼干一样",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilderDynamic.powerPerSecond(16));

    public static final SlimefunItemStack GROWTH_CHAMBER = new SlimefunItemStack("GROWTH_CHAMBER",
            Material.GREEN_STAINED_GLASS,
            "&6培育仓",
            "",
            "&f让&e作物&f自动生长",
            "",
            "&f&o就像一个小型温室",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilderDynamic.powerPerSecond(32));

    public static final SlimefunItemStack GROWTH_CHAMBER_MK2 = new SlimefunItemStack("GROWTH_CHAMBER_MK2",
            Material.LIME_STAINED_GLASS,
            "&6培育仓 MK2",
            "",
            "&f让&e作物&f自动生长",
            "",
            "&f&o就像一个小型温室",
            "",
            THREE_X_PROD_LORE,
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilderDynamic.powerPerSecond(128));

    public static final SlimefunItemStack GROWTH_CHAMBER_END = new SlimefunItemStack("GROWTH_CHAMBER_END",
            Material.MAGENTA_STAINED_GLASS,
            "&d末影培育仓",
            "",
            "&f让&d紫颂花&f自动生长",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilderDynamic.powerPerSecond(32));

    public static final SlimefunItemStack GROWTH_CHAMBER_END_MK2 = new SlimefunItemStack("GROWTH_CHAMBER_END_MK2",
            Material.PURPLE_STAINED_GLASS,
            "&d末影培育仓 MK2",
            "",
            "&f让&d紫颂花&f自动生长",
        "",
        THREE_X_PROD_LORE,
        LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
        LoreBuilder.speed(3),
        LoreBuilderDynamic.powerPerSecond(128)
    );

    public static final SlimefunItemStack GROWTH_CHAMBER_NETHER = new SlimefunItemStack("GROWTH_CHAMBER_NETHER",
            Material.RED_STAINED_GLASS,
            "&c下界培育仓",
            "",
            "&f让&c下界作物&f自动生长",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilderDynamic.powerPerSecond(32));

    public static final SlimefunItemStack GROWTH_CHAMBER_NETHER_MK2 = new SlimefunItemStack("GROWTH_CHAMBER_NETHER_MK2",
            Material.RED_STAINED_GLASS,
            "&c下界培育仓 MK2",
            "",
            "&f让&c下界作物&f自动生长",
            "",
            THREE_X_PROD_LORE,
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilderDynamic.powerPerSecond(128));

    public static final SlimefunItemStack GROWTH_CHAMBER_OCEAN = new SlimefunItemStack("GROWTH_CHAMBER_OCEAN",
            Material.CYAN_STAINED_GLASS,
            "&b海洋培育仓",
            "",
            "&f让&9海洋植物&f自动生长",
            "&f&o可以复活失活的珊瑚!",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilderDynamic.powerPerSecond(32));

    public static final SlimefunItemStack GROWTH_CHAMBER_OCEAN_MK2 = new SlimefunItemStack("GROWTH_CHAMBER_OCEAN_MK2",
            Material.LIGHT_BLUE_STAINED_GLASS,
            "&b海洋培育仓 MK2",
            "",
            "&f让&9海洋植物&f自动生长",
            "&f&o可以复活失活的珊瑚!",
            "",
            THREE_X_PROD_LORE,
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(3),
            LoreBuilderDynamic.powerPerSecond(128));

    public static final SlimefunItemStack ANTIGRAVITY_BUBBLE = new SlimefunItemStack("ANTIGRAVITY_BUBBLE",
            Material.OBSIDIAN,
            "&6反重力泡泡",
            "",
            "&f可以在周围45格范围内提供创造模式一样的飞行能力",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilderDynamic.powerPerSecond(128));

    public static final SlimefunItemStack WEATHER_CONTROLLER = new SlimefunItemStack("WEATHER_CONTROLLER",
            Material.BLUE_STAINED_GLASS,
            "&6天气控制仪",
            "",
            "&f使用特定的物品来控制天气",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilderDynamic.powerPerSecond(32));

    public static final SlimefunItemStack POTION_SPRINKLER = new SlimefunItemStack("POTION_SPRINKLER",
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("8d302104180cb79d5f4cf423649ddfa8ffb31a1875fa02a983cd248c72dfb0ea"))),
            "&6药水喷洒器",
            "",
            "&f向附近的所有玩家提供药水效果",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilderDynamic.powerPerSecond(32));

    public static final SlimefunItemStack BARBED_WIRE = new SlimefunItemStack("BARBED_WIRE",
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("b2ac6c219004d82dfa627ffab664f29c53ecc112d91c9d7a9c915c426832412"))),
            "&6铁丝网",
            "",
            "&f推开范围内的怪物",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilderDynamic.powerPerSecond(16));

    public static final SlimefunItemStack MATERIAL_HIVE = new SlimefunItemStack("MATERIAL_HIVE",
            Material.BEEHIVE,
            "&6材料蜂巢",
            "",
            "&f使用电力与蜜蜂，缓慢生产材料",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilderDynamic.powerPerSecond(1024));

    public static final SlimefunItemStack WIRELESS_CHARGER = new SlimefunItemStack("WIRELESS_CHARGER",
            Material.CLAY,
            "&6无线充电站",
            "",
            "&f给附近玩家的物品栏中的所有物品充电",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilderDynamic.powerPerSecond(16));

    public static final SlimefunItemStack SEED_PLUCKER = new SlimefunItemStack("SEED_PLUCKER",
            Material.ORANGE_STAINED_GLASS,
            "&6种子提取器",
            "",
            "&f从作物中提取相应的种子",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilderDynamic.powerPerSecond(32));

    public static final SlimefunItemStack BANDAID_MANAGER = new SlimefunItemStack("BANDAID_MANAGER",
            Material.LAPIS_BLOCK,
            "&6物品模组管理器",
            "",
            "&f管理物品模组",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilderDynamic.powerPerSecond(48));

    public static final SlimefunItemStack ORECHID = new SlimefunItemStack("ORECHID",
            Material.END_ROD,
            "&6矿物花",
            "",
            "&f使用电力,让附近的石头/下界岩变成对应的矿石",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilderDynamic.power(1024, " 每个方块转换"));

    public static final SlimefunItemStack WIRELESS_ENERGY_POINT = new SlimefunItemStack("WIRELESS_ENERGY_POINT",
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("335a21d95e8597759fb259c951ea68e1ad3374ca41e56ef126ffabfe03c1e0"))),
            "&6无线能源节点",
            "",
            "&f从无线能源库",
            "&f无线传输能源",
            "",
        "&e右键点击&6无线能源库&7与其绑定",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerBuffer(5120),
            LoreBuilderDynamic.powerPerSecond(1024),
            "");
    public static final SlimefunItemStack WIRELESS_ENERGY_BANK = new SlimefunItemStack("WIRELESS_ENERGY_BANK",
            Material.SNOW_BLOCK,
            "&6无线能源库",
            "",
            "&f存储能源",
            "&f以供无线能源节点使用",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.CAPACITOR),
            LoreBuilder.powerBuffer(10240),
            LoreBuilderDynamic.powerPerSecond(1024),
            "");

    public static final SlimefunItemStack WIRELESS_ITEM_INPUT = new SlimefunItemStack("WIRELESS_ITEM_INPUT",
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("abb55560c695d976b346e188d3df2bcd8c5aa32b933141a9715c42f64cb6cee"))),
            "&6无线物品输入节点",
            "",
            "&f无线传输物品",
            "&f到一个&7无线物品输出节点",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilderDynamic.power(8, " 每组物品"),
            "");

    public static final SlimefunItemStack WIRELESS_ITEM_OUTPUT = new SlimefunItemStack("WIRELESS_ITEM_OUTPUT",
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("c510d9b61ca333d2946c61a26cb17e374d4adb573b46afdebaf89f65ba5d4ae2"))),
            "&6无线物品输出节点",
            "",
            "&f从&6无线物品输入节点",
            "&f无线传输物品",
            "",
        "&e右键点击&6无线物品输入节点&7与其绑定",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilderDynamic.power(8, " 每组物品"),
            "");

    public static final SlimefunItemStack TESSERACT = new SlimefunItemStack("TESSERACT",
        Material.PURPUR_BLOCK,
        "&6光学传输器",
        "",
            "&f无线传输物品与能源",
            "&f可以双向传输",
            "",
            "&7使用&6光学绑定仪&7来绑定&6光学传输器",
        "",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
        LoreBuilder.powerBuffer(65535),
        LoreBuilderDynamic.powerPerSecond(1024),
        "");

    public static final SlimefunItemStack EXTERNAL_HEATER = new SlimefunItemStack("DT_EXTERNAL_HEATER",
            Material.BRICKS,
            "&6外部加热器",
            "",
            "&f从外部加热熔炉,高炉,烟熏炉",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerBuffer(2048),
            LoreBuilderDynamic.power(128, " 每次加热"));

    // Generators
    public static final SlimefunItemStack WATER_MILL = new SlimefunItemStack("WATER_MILL",
            Material.COBBLESTONE_WALL,
            "&6水轮发电机",
            "",
            "&f使用水力发电",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilderDynamic.powerPerSecond(16));

    public static final SlimefunItemStack WATER_TURBINE = new SlimefunItemStack("WATER_TURBINE",
            Material.PRISMARINE_WALL,
            "&6水力涡轮发电机",
            "",
            "&f使用水力发电",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilderDynamic.powerPerSecond(64));

    public static final SlimefunItemStack DRAGON_GENERATOR = new SlimefunItemStack("DRAGON_GENERATOR",
            Material.GRAY_CONCRETE,
            "&6龙蛋发电机",
            "",
            "&f从龙蛋的温暖中产生能源",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(512),
            LoreBuilderDynamic.powerPerSecond(32));

    public static final SlimefunItemStack CHIPPING_GENERATOR = new SlimefunItemStack("CHIPPING_GENERATOR",
            Material.SPRUCE_WOOD,
            "&6粉碎发电机",
            "",
            "&f使用磨损的物品来发电",
            "&f(有耐久度的物品)",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilderDynamic.power(8, " 每点耐久度"));

    public static final SlimefunItemStack CULINARY_GENERATOR = new SlimefunItemStack("CULINARY_GENERATOR",
            Material.BLAST_FURNACE,
            "&6烹饪发电机",
            "",
            "&f使用食物来发电",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilderDynamic.powerPerSecond(8));

    public static final SlimefunItemStack STARDUST_REACTOR = new SlimefunItemStack("STARDUST_REACTOR",
            Material.IRON_BLOCK,
            "&6星尘反应堆",
            "",
            "&6使用星尘产生大量的能源",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(32768),
            LoreBuilderDynamic.powerPerSecond(1024));

    public static final RecipeType DT_MATERIAL_HIVE = new RecipeType(
            new NamespacedKey(DynaTech.getInstance(), "DT_MATERIAL_HIVE"), DynaTechItems.MATERIAL_HIVE,
            (recipe, output) -> {
                MaterialHive materialHive = ((MaterialHive) DynaTechItems.MATERIAL_HIVE.getItem());
                materialHive.getMachineRecipes().add(new MachineRecipe(1800, recipe, new ItemStack[] { output }));

            });

}
