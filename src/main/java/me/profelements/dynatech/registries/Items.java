package me.profelements.dynatech.registries;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import me.profelements.dynatech.utils.ItemWrapper;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import dev.j3fftw.extrautils.utils.LoreBuilderDynamic;

public class Items {

    private static final String ID_LORE = "&7ID: <ID>";
    private static final String RIGHT_CLICK_LORE = "&e右键点击&7以打开";
    private static final String THREE_X_PROD_LORE = "&c3 倍产量";

    // START Mechanical Components
    public static final ItemWrapper WOOD_MACHINE_CORE = ItemWrapper.create(Keys.WOOD_MACHINE_CORE,
            new SlimefunItemStack(
                    Items.Keys.WOOD_MACHINE_CORE.asSlimefunId(),
                    Material.MANGROVE_WOOD, "&f木质机器核心"));

    public static final ItemWrapper STONE_MACHINE_CORE = ItemWrapper.create(Keys.STONE_MACHINE_CORE,
            new SlimefunItemStack(
                    Items.Keys.STONE_MACHINE_CORE.asSlimefunId(),
                    Material.SMOOTH_STONE, "&f石制机器核心"));

    public static final ItemWrapper IRON_MACHINE_CORE = ItemWrapper.create(Keys.IRON_MACHINE_CORE,
            new SlimefunItemStack(
                    Items.Keys.IRON_MACHINE_CORE.asSlimefunId(),
                    Material.GRAY_CONCRETE, "&f铁制机器核心"));

    public static final ItemWrapper DIAMOND_MACHINE_CORE = ItemWrapper.create(Keys.DIAMOND_MACHINE_CORE,
            new SlimefunItemStack(
                    Items.Keys.DIAMOND_MACHINE_CORE.asSlimefunId(),
                    Material.LIGHT_BLUE_CONCRETE, "&f钻石机器核心"));

    public static final ItemWrapper ENCHANTED_MACHINE_CORE = ItemWrapper.create(Keys.ENCHANTED_MACHINE_CORE,
            new SlimefunItemStack(
                    Items.Keys.ENCHANTED_MACHINE_CORE.asSlimefunId(),
                    Material.RESPAWN_ANCHOR, "&b附魔机器核心"));

    public static final ItemWrapper ANCIENT_MACHINE_CORE = ItemWrapper.create(Keys.ANCIENT_MACHINE_CORE,
            new SlimefunItemStack(Keys.ANCIENT_MACHINE_CORE.asSlimefunId(), Material.LAPIS_BLOCK,
                    "&f远古机器核心"));

    public static final ItemWrapper ENERGY_STORAGE_COMPONENT = ItemWrapper.create(Keys.ENERGY_STORAGE_COMPONENT,
            new SlimefunItemStack(
                    Items.Keys.ENERGY_STORAGE_COMPONENT.asSlimefunId(), Material.REDSTONE_LAMP,
                    "&c电力储存组件"));

    public static final ItemWrapper ENERGY_INPUT_COMPONENT = ItemWrapper.create(Keys.ENERGY_INPUT_COMPONENT,
            new SlimefunItemStack(
                    Items.Keys.ENERGY_INPUT_COMPONENT.asSlimefunId(),
                    Material.COMPARATOR, "&c电力输入组件"));

    public static final ItemWrapper ENERGY_OUTPUT_COMPONENT = ItemWrapper.create(Keys.ENERGY_OUTPUT_COMPONENT,
            new SlimefunItemStack(
                    Items.Keys.ENERGY_OUTPUT_COMPONENT.asSlimefunId(),
                    Material.REPEATER, "&c电力输出组件"));

    public static final ItemWrapper DEGRADED_WATER_MILL = ItemWrapper.create(Keys.DEGRADED_WATER_MILL,
            new SlimefunItemStack(
                    Items.Keys.DEGRADED_WATER_MILL.asSlimefunId(),
                    Material.COBBLESTONE_WALL, "&c破损的水力发电机"));

    public static final ItemWrapper DEGRADED_WATER_MILL_2 = ItemWrapper.create(Keys.DEGRADED_WATER_MILL_2,
            new SlimefunItemStack(
                    Items.Keys.DEGRADED_WATER_MILL_2.asSlimefunId(),
                    Material.PRISMARINE_WALL, "&c破损的水力涡轮发电机"));

    public static final ItemWrapper DEGRADED_WIND_MILL = ItemWrapper.create(Keys.DEGRADED_WIND_MILL,
            new SlimefunItemStack(
                    Items.Keys.DEGRADED_WIND_MILL.asSlimefunId(),
                    Material.LIGHT_GRAY_GLAZED_TERRACOTTA, "&c破损的风力发电机"));

    public static final ItemWrapper DEGRADED_WIND_MILL_2 = ItemWrapper.create(Keys.DEGRADED_WIND_MILL_2,
            new SlimefunItemStack(
                    Items.Keys.DEGRADED_WIND_MILL_2.asSlimefunId(),
                    Material.GRAY_GLAZED_TERRACOTTA, "&c破损的风力涡轮发电机"));

    public static final ItemWrapper DEGRADED_EGG_MILL = ItemWrapper.create(Keys.DEGRADED_WIND_MILL,
            new SlimefunItemStack(
                    Items.Keys.DEGRADED_EGG_MILL.asSlimefunId(),
                    Material.CRYING_OBSIDIAN, "&c破损的龙蛋发电机"));

    public static final ItemWrapper DEGRADED_EGG_MILL_2 = ItemWrapper.create(Keys.DEGRADED_WIND_MILL_2,
            new SlimefunItemStack(
                    Items.Keys.DEGRADED_EGG_MILL_2.asSlimefunId(),
                    Material.RESPAWN_ANCHOR, "&c破损的龙蛋涡轮发电机"));
    // END Mechanical Components

    // START Energy Generators
    public static final ItemWrapper WATER_MILL = ItemWrapper.create(Keys.WATER_MILL,
            new SlimefunItemStack(Items.Keys.WATER_MILL.asSlimefunId(),
                    Material.COBBLESTONE_WALL,
                    "&b水力发电机",
                    "",
                    "&7会在运行一段时间后破损。",
                    "",

                    LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
                    LoreBuilderDynamic.powerPerTick(16),
                    LoreBuilder.powerBuffer(64)));

    public static final ItemWrapper WATER_MILL_2 = ItemWrapper.create(Keys.WATER_MILL_2,
            new SlimefunItemStack(Items.Keys.WATER_MILL_2.asSlimefunId(),
                    Material.PRISMARINE_WALL,
                    "&b水力涡轮发电机",
                    "",
                    "&7会在运行一段时间后破损。",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
                    LoreBuilderDynamic.powerPerTick(64),
                    LoreBuilder.powerBuffer(256)));

    public static final ItemWrapper WIND_MILL = ItemWrapper.create(Keys.WIND_MILL,
            new SlimefunItemStack(Items.Keys.WIND_MILL.asSlimefunId(),
                    Material.LIGHT_GRAY_GLAZED_TERRACOTTA,
                    "&b风力发电机",
                    "",
                    "&7会在运行一段时间后破损。",
                    "",
                    LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
                    "&fMinimum Energy Generation Rate: &b16j/tick",
                    "&fMaximum Energy Generation Rate: &b64j/tick",
                    LoreBuilder.powerBuffer(256)));

    public static final ItemWrapper WIND_MILL_2 = ItemWrapper.create(Keys.WIND_MILL_2,
            new SlimefunItemStack(Items.Keys.WIND_MILL_2.asSlimefunId(),
                    Material.GRAY_GLAZED_TERRACOTTA,
                    "&b风力涡轮发电机",
                    "",
                    "&7会在运行一段时间后破损。",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
                    "&fMinimum Energy Generation Rate: &b64j/tick",
                    "&fMaximum Energy Generation Rate: &b256j/tick",
                    LoreBuilder.powerBuffer(1024)));

    public static final ItemWrapper EGG_MILL = ItemWrapper.create(Keys.EGG_MILL,
            new SlimefunItemStack(Items.Keys.EGG_MILL.asSlimefunId(),
                    Material.CRYING_OBSIDIAN,
                    "&b龙蛋发电机",
                    "",
                    "&7会在运行一段时间后破损。",
                    "",
                    LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
                    LoreBuilderDynamic.powerPerTick(16),
                    LoreBuilder.powerBuffer(64)));

    public static final ItemWrapper EGG_MILL_2 = ItemWrapper.create(Keys.EGG_MILL_2,
            new SlimefunItemStack(Items.Keys.EGG_MILL_2.asSlimefunId(),
                    Material.RESPAWN_ANCHOR,
                    "&b龙蛋涡轮发电机",
                    "",
                    "&7会在运行一段时间后破损。",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
                    LoreBuilderDynamic.powerPerTick(64),
                    LoreBuilder.powerBuffer(256)));

    public static final ItemWrapper DURABILITY_GENERATOR = ItemWrapper.create(Keys.DURABILITY_GENERATOR,
            new SlimefunItemStack(
                    Items.Keys.DURABILITY_GENERATOR.asSlimefunId(),
                    Material.SPRUCE_WOOD,
                    "&b破碎发电机",
                    "",
                    "&7消耗物品耐久度来发电。",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
                    LoreBuilder.powerBuffer(256),
                    LoreBuilderDynamic.power(8, " 每点耐久")));

    public static final ItemWrapper FOOD_GENERATOR = ItemWrapper.create(Keys.FOOD_GENERATOR,
            new SlimefunItemStack(
                    Items.Keys.FOOD_GENERATOR.asSlimefunId(),
                    Material.BLAST_FURNACE,
                    "&b烹饪发电机",
                    "",
                    "&7消耗食物来发电。",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
                    LoreBuilder.powerBuffer(256),
                    LoreBuilderDynamic.powerPerSecond(8)));

    public static final ItemWrapper STARDUST_GENERATOR = ItemWrapper.create(Keys.STARDUST_GENERATOR,
            new SlimefunItemStack(
                    Items.Keys.STARDUST_GENERATOR.asSlimefunId(),
                    Material.IRON_BLOCK,
                    "&b星尘反应堆",
                    "",
                    "&7使用星尘产生大量的电力。",
                    "",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
                    LoreBuilder.powerBuffer(32768),
                    LoreBuilderDynamic.powerPerSecond(1024)));

    // END Energy Generators

    // START Materials
    public static final ItemWrapper STAINLESS_STEEL_INGOT = ItemWrapper.create(Keys.STAINLESS_STEEL_INGOT,
            new SlimefunItemStack(Keys.STAINLESS_STEEL_INGOT.asSlimefunId(), Material.IRON_INGOT,
                    "&f不锈钢锭"));

    public static final ItemWrapper STAINLESS_STEEL_ROTOR = ItemWrapper.create(Keys.STAINLESS_STEEL_ROTOR,
            new SlimefunItemStack(Keys.STAINLESS_STEEL_ROTOR.asSlimefunId(), Material.IRON_BLOCK,
                    "&f不锈钢转子"));

    public static final ItemWrapper COAL_COKE = ItemWrapper.create(Keys.COAL_COKE,
            new SlimefunItemStack(Keys.COAL_COKE.asSlimefunId(), Material.COAL, "&f焦炭"));

    public static final ItemWrapper BEE = ItemWrapper.create(Keys.BEE, new SlimefunItemStack(Keys.BEE.asSlimefunId(),
            PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("12724a9a4cdd68ba49415560e5be40b4a1c47cb5be1d66aedb52a30e62ef2d47")),
            "&6蜜蜂"));

    public static final ItemWrapper ROBOTIC_BEE = ItemWrapper.create(Keys.ROBOTIC_BEE, new SlimefunItemStack(
            Keys.ROBOTIC_BEE.asSlimefunId(),
            PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("16f728c89904b2cb57f853d31d0e2061f52917981fedccb1e949528e08eb4140")),
            "&6机械蜜蜂"));

    public static final ItemWrapper ADVANCED_ROBOTIC_BEE = ItemWrapper.create(Keys.ADVANCED_ROBOTIC_BEE,
            new SlimefunItemStack(Keys.ADVANCED_ROBOTIC_BEE.asSlimefunId(),
                    PlayerHead.getItemStack(
                            PlayerSkin.fromHashCode("c1c96e8cf83cbade55ffa667197ea6990290e5c7dc679104332caead97eef09")),
                    "&6高级机械蜜蜂"));

    public static final ItemWrapper VEX_GEM = ItemWrapper.create(Keys.VEX_GEM, new SlimefunItemStack(
            Keys.VEX_GEM.asSlimefunId(),
            PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("b91aeca7c17e66d867231b36d96e83c1ede75eaf67ccf3a88dca15d4114ae167")),
            "&6恼鬼宝石"));

    public static final ItemWrapper MACHINE_SCRAP = ItemWrapper.create(Keys.MACHINE_SCRAP, new SlimefunItemStack(
            Keys.MACHINE_SCRAP.asSlimefunId(),
            PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("13ea401c7e02d13cea1de6835ee9f5c47757d399dae5c2b9c3efde6ae63ea4a2")),
            "&6机器碎片"));

    public static final ItemWrapper ADVANCED_MACHINE_SCRAP = ItemWrapper.create(Keys.ADVANCED_MACHINE_SCRAP,
            new SlimefunItemStack(Keys.ADVANCED_MACHINE_SCRAP.asSlimefunId(),
                    PlayerHead.getItemStack(
                            PlayerSkin.fromHashCode("4b57a4c68d1d2c5de978ea6de4db91ef387ca6c37966bb8e7c8826f937e6c3")),
                    "&6高级机器碎片"));

    public static final ItemWrapper STAR_DUST = ItemWrapper.create(Keys.STAR_DUST,
            new SlimefunItemStack(Keys.STAR_DUST.asSlimefunId(), Material.NETHER_STAR,
                    "&6星尘"));

    public static final ItemWrapper GHOSTLY_ESSENCE = ItemWrapper.create(Keys.GHOSTLY_ESSENCE,
            new SlimefunItemStack(Keys.GHOSTLY_ESSENCE.asSlimefunId(), Material.WHITE_DYE,
                    "&6幽灵精华"));

    public static final ItemWrapper TESSERACTING_OBJ = ItemWrapper.create(Keys.TESSERACTING_OBJ,
            new SlimefunItemStack(Keys.TESSERACTING_OBJ.asSlimefunId(),
                    Material.MUSHROOM_STEM, "&6光学物品", "&f&o在你手中闪闪发光，不断变化"));

    public static final ItemWrapper LIVINGROCK = ItemWrapper.create(Keys.LIVINGROCK,
            new SlimefunItemStack(Keys.LIVINGROCK.asSlimefunId(), Material.DEEPSLATE_TILES, "&6Livingrock"));

    public static final ItemWrapper LIVINGWOOD = ItemWrapper.create(Keys.LIVINGWOOD,
            new SlimefunItemStack(Keys.LIVINGWOOD.asSlimefunId(), Material.OAK_WOOD, "&6Livingwood"));
    // END Materials
    // START Tools
    public static final ItemWrapper ELECTRICAL_STIMULATOR = ItemWrapper.create(Keys.ELECTRICAL_STIMULATOR,
            new SlimefunItemStack(Keys.ELECTRICAL_STIMULATOR.asSlimefunId(),
                    new CustomItemStack(PlayerHead.getItemStack(
                            PlayerSkin
                                    .fromHashCode("82a319cf66a4de12e3330e8bc4c82c985ccc3cb2230868c336a88fc4a22082a"))),
                    "&6电力刺激器",
                    "",
                    "&f消耗电力自动喂食。",
                    "",
                    "&f&o刺激你的感官。",
                    "",
                    LoreBuilder.powerCharged(0, 1024)));

    public static final ItemWrapper INVENTORY_FILTER = ItemWrapper.create(Keys.INVENTORY_FILTER,
            new SlimefunItemStack(Keys.INVENTORY_FILTER.asSlimefunId(),
                    Material.IRON_BARS,
                    "&6背包过滤器",
                    "",
                    "&f存在于过滤器中的物品",
                    "&f将不会被拾起。",
                    "",
                    ID_LORE,
                    "",
                    RIGHT_CLICK_LORE));

    public static final ItemWrapper ANGEL_GEM = ItemWrapper.create(Keys.ANGEL_GEM,
            new SlimefunItemStack(Keys.ANGEL_GEM.asSlimefunId(),
                    Material.NETHERITE_BLOCK,
                    "&6飞行宝石",
                    "",
                    "&f永久的创造模式飞行。",
                    "&f可更改飞行速度。",
                    "",
                    "&f&o像小鸟一样飞行~",
                    "",
                    "&7飞行：<状态>",
                    "&7飞行速度：<速度>"));

    public static final ItemWrapper RECIPE_BOOK = ItemWrapper.create(Keys.RECIPE_BOOK,
            new SlimefunItemStack(Keys.RECIPE_BOOK.asSlimefunId(), Material.BOOK,
                    "&6动力科技配方书"));

    public static final ItemWrapper AUTO_INPUT_UPGRADE = ItemWrapper.create(Keys.AUTO_INPUT_UPGRADE,
            new SlimefunItemStack(Keys.AUTO_INPUT_UPGRADE.asSlimefunId(),
                    Material.BLUE_STAINED_GLASS_PANE, "&6自动输入升级模块"));

    public static final ItemWrapper AUTO_OUTPUT_UPGRADE = ItemWrapper.create(Keys.AUTO_OUTPUT_UPGRADE,
            new SlimefunItemStack(Keys.AUTO_OUTPUT_UPGRADE.asSlimefunId(),
                    Material.RED_STAINED_GLASS_PANE, "&6自动输出升级模块"));

    public static final ItemWrapper FLUID_TANK = ItemWrapper.create(Keys.FLUID_TANK,
            new SlimefunItemStack(Keys.FLUID_TANK.asSlimefunId(), Material.BUCKET, "&f液体罐"));

    public static final ItemWrapper LIQUID_TANK = ItemWrapper.create(Keys.LIQUID_TANK,
            new SlimefunItemStack(Keys.LIQUID_TANK.asSlimefunId(),
                    Material.BUCKET,
                    "&6便携式液体罐",
                    "",
                    "&f简单的液体掠夺者。",
                    "",
                    "&e右键点击&7装载液体",
                    "&eShift + 右键点击&7倾倒液体",
                    "",
                    "&f当前液体：&7无",
                    "&f存量：0mb / 16000",
                    ""));

    public static final ItemWrapper PICNIC_BASKET = ItemWrapper.create(Keys.PICNIC_BASKET,
            new SlimefunItemStack(Keys.PICNIC_BASKET.asSlimefunId(),
                    new CustomItemStack(PlayerHead.getItemStack(
                            PlayerSkin.fromHashCode("7a6bf916e28ccb80b4ebfacf98686ad6af7c4fb257e57a8cb78c71d19dccb2"))),
                    "&6野餐篮",
                    "",
                    "&f允许你储存食物",
                    "&f在你的饥饿度降低时自动喂食",
                    "&f必须在物品栏中才会生效",
                    "",
                    "&f大小：&e27",
                    "",
                    ID_LORE,
                    "",
                    RIGHT_CLICK_LORE));

    public static final ItemWrapper SOUL_BOUND_PICNIC_BASKET = ItemWrapper.create(Keys.SOUL_BOUND_PICNIC_BASKET,
            new SlimefunItemStack(Keys.SOUL_BOUND_PICNIC_BASKET.asSlimefunId(),
                    new CustomItemStack(PlayerHead.getItemStack(
                            PlayerSkin.fromHashCode("7a6bf916e28ccb80b4ebfacf98686ad6af7c4fb257e57a8cb78c71d19dccb2"))),
                    "&6灵魂绑定野餐篮",
                    "",
                    "&f允许你储存食物",
                    "&f在你的饥饿度降低时自动喂食",
                    "&f必须在物品栏中才会生效",
                    "",
                    "&f大小：&e27",
                    "",
                    ID_LORE,
                    "",
                    RIGHT_CLICK_LORE,
                    "",
                    "&d灵魂绑定"));

    public static final ItemWrapper SCOOP = ItemWrapper.create(Keys.SCOOP,
            new SlimefunItemStack(Keys.SCOOP.asSlimefunId(),
                    Material.IRON_SHOVEL,
                    "&6勺子",
                    "",
                    "&f用于捕捉蜜蜂",
                    "",
                    "&f&o别被蛰了！",
                    "",
                    LoreBuilder.powerCharged(0, 512)));

    public static final ItemWrapper DIMENSIONAL_HOME = ItemWrapper.create(Keys.DIMENSIONAL_HOME, new SlimefunItemStack(
            Keys.DIMENSIONAL_HOME.asSlimefunId(),
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("eb18cf9e1bf7ec57304ae92f2b00d91643cf0b65067dead34fb48baf18e3c385"))),
            "&6异次元之家",
            "",
            "&f可以将你传送到异次元的家",
            "&f或返回原来的位置",
            "",
            "&f&o家，甜蜜的家",
            "",
            "&7区块 ID：<id>"));

    public static final ItemWrapper ITEM_BAND_HASTE = ItemWrapper.create(Keys.ITEM_BAND_HASTE, new SlimefunItemStack(
            Keys.ITEM_BAND_HASTE.asSlimefunId(),
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("4f01ec6331a3bc30a8204ec56398d08ca38788556bca9b81d776f6238d567367"))),
            "&6物品模组：急速",
            "",
            "&9使用物品模组管理器安装",
            "&f当安装到防具或工具上时",
            "&f提供急迫 II 的效果",
            "",
            "&f&o原始人，起洞！"));

    public static final ItemWrapper ITEM_BAND_HEALTH = ItemWrapper.create(Keys.ITEM_BAND_HEALTH, new SlimefunItemStack(
            Keys.ITEM_BAND_HEALTH.asSlimefunId(),
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("f1e2428cb359988f4c4ff0e61de21385c62269de19a69762d773223b75dd1666"))),
            "&6物品模组：生命提升",
            "",
            "&9使用物品模组管理器安装",
            "&f当安装到防具或工具上时",
            "&f提供生命提升 II 的效果",
            "",
            "&f&o原始人，起洞！"));

    public static final ItemWrapper TESSERACT_BINDER = ItemWrapper.create(Keys.TESSERACT_BINDER,
            new SlimefunItemStack(Keys.TESSERACT_BINDER.asSlimefunId(),
                    Material.NETHERITE_HOE,
                    "&6光学绑定仪",
                    "",
                    "&f用于绑定光学传输器。",
                    "",
                    "&e右键点击&f获取光学传输器的位置",
                    "&eShift + 右键点击&f将获取的位置绑定至光学传输器",
                    ""));

    public static final ItemWrapper WITHER_SKELETON_GOLEM = ItemWrapper.create(Keys.WITHER_SKELETON_GOLEM,
            new SlimefunItemStack(Keys.WITHER_SKELETON_GOLEM.asSlimefunId(),
                    Material.WITHER_SKELETON_SKULL,
                    "&6多方块结构：凋灵傀儡",
                    "",
                    "&7生成一只凋灵骷髅",
                    ""));

    // END Tools
    // START Machines
    public static final ItemWrapper COAL_COKE_OVEN = ItemWrapper.create(Keys.COAL_COKE_OVEN,
            new SlimefunItemStack(Keys.COAL_COKE_OVEN.asSlimefunId(),
                    Material.SMOKER, "&f焦炭控制器"));

    public static final ItemWrapper AUTO_KITCHEN = ItemWrapper.create(Keys.AUTO_KITCHEN,
            new SlimefunItemStack(Keys.AUTO_KITCHEN.asSlimefunId(),
                    Material.SMOKER,
                    "&6自动厨房",
                    "",
                    "&f自动制作厨房配方",
                    "",
                    "&f&o闻起来像曲奇",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilder.speed(1),
                    LoreBuilderDynamic.powerPerSecond(16)));

    public static final ItemWrapper KITCHEN_AUTO_CRAFTER = ItemWrapper.create(Keys.KITCHEN_AUTO_CRAFTER,
            new SlimefunItemStack(Keys.KITCHEN_AUTO_CRAFTER.asSlimefunId(),
                    new CustomItemStack(PlayerHead.getItemStack(
                            PlayerSkin
                                    .fromHashCode("c5c5b24cd5efa07d31beea655d7ff972e6f47cdb898be4404363deeba43ba5d"))),
                    "&6厨房自动合成机",
                    "",
                    "&f自动制作厨房配方",
                    "",
                    "&f&o闻起来像曲奇",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilder.speed(1),
                    LoreBuilderDynamic.powerPerSecond(16)));

    public static final ItemWrapper ANTIGRAVITY_BUBBLE = ItemWrapper.create(Keys.ANTIGRAVITY_BUBBLE,
            new SlimefunItemStack(Keys.ANTIGRAVITY_BUBBLE.asSlimefunId(),
                    Material.OBSIDIAN,
                    "&6反重力泡泡",
                    "",
                    "&f在 45 格范围内提供创造模式飞行",
                    "",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilderDynamic.powerPerSecond(128)));

    public static final ItemWrapper WEATHER_CONTROLLER = ItemWrapper.create(Keys.WEATHER_CONTROLLER,
            new SlimefunItemStack(Keys.WEATHER_CONTROLLER.asSlimefunId(),
                    Material.BLUE_STAINED_GLASS,
                    "&6天气控制器",
                    "",
                    "&f通过物品来更改天气。",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilderDynamic.powerPerSecond(32)));

    public static final ItemWrapper POTION_SPRINKLER = ItemWrapper.create(Keys.POTION_SPRINKLER, new SlimefunItemStack(
            Keys.POTION_SPRINKLER.asSlimefunId(),
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("8d302104180cb79d5f4cf423649ddfa8ffb31a1875fa02a983cd248c72dfb0ea"))),
            "&6药水喷洒器",
            "",
            "&f可将药水效果应用到范围内的所有玩家。",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilderDynamic.powerPerSecond(32)));

    public static final ItemWrapper BARBED_WIRE = ItemWrapper.create(Keys.BARBED_WIRE, new SlimefunItemStack(
            Keys.BARBED_WIRE.asSlimefunId(),
            new CustomItemStack(PlayerHead.getItemStack(
                    PlayerSkin.fromHashCode("b2ac6c219004d82dfa627ffab664f29c53ecc112d91c9d7a9c915c426832412"))),
            "&6铁丝网",
            "",
            "&f将范围内的怪物推开。",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilderDynamic.powerPerSecond(16)));

    public static final ItemWrapper MATERIAL_HIVE = ItemWrapper.create(Keys.MATERIAL_HIVE,
            new SlimefunItemStack(Keys.MATERIAL_HIVE.asSlimefunId(),
                    Material.BEEHIVE,
                    "&6材料蜂巢",
                    "",
                    "&f使用电力与蜜蜂缓慢生产材料。",
                    "",
                    LoreBuilder.radioactive(Radioactivity.HIGH),
                    "",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilderDynamic.powerPerSecond(1024)));

    public static final ItemWrapper WIRELESS_CHARGER = ItemWrapper.create(Keys.WIRELESS_CHARGER,
            new SlimefunItemStack(Keys.WIRELESS_CHARGER.asSlimefunId(),
                    Material.CLAY,
                    "&6无线充电器",
                    "",
                    "&f为你物品栏内的物品无线充电。",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilderDynamic.powerPerSecond(16)));
    public static final ItemWrapper SEED_PLUCKER = ItemWrapper.create(Keys.SEED_PLUCKER,
            new SlimefunItemStack(Keys.SEED_PLUCKER.asSlimefunId(),
                    Material.ORANGE_STAINED_GLASS,
                    "&6种子提取器",
                    "",
                    "&f可从植物中提取种子。",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilderDynamic.powerPerSecond(32)));

    public static final ItemWrapper BANDAID_MANAGER = ItemWrapper.create(Keys.BANDAID_MANAGER,
            new SlimefunItemStack(Keys.BANDAID_MANAGER.asSlimefunId(),
                    Material.LAPIS_BLOCK,
                    "&6物品模组管理器",
                    "",
                    "&f安装/卸载物品模组",
                    "",
                    LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
                    LoreBuilderDynamic.powerPerSecond(48)));

    public static final ItemWrapper ORECHID = ItemWrapper.create(Keys.ORECHID,
            new SlimefunItemStack(Keys.ORECHID.asSlimefunId(),
                    Material.WITHER_ROSE,
                    "&6凝矿兰",
                    "",
                    "&f消耗电力，将周围的石头或下界岩",
                    "&f转化为矿石。",
                    "",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilderDynamic.power(1024, " 每个方块")));

    public static final ItemWrapper WIRELESS_ENERGY_POINT = ItemWrapper.create(Keys.WIRELESS_ENERGY_POINT,
            new SlimefunItemStack(Keys.WIRELESS_ENERGY_POINT.asSlimefunId(), new CustomItemStack(
                    PlayerHead.getItemStack(
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
                    LoreBuilderDynamic.powerPerSecond(1024), ""));

    public static final ItemWrapper WIRELESS_ENERGY_BANK = ItemWrapper.create(Keys.WIRELESS_ENERGY_BANK,
            new SlimefunItemStack(Keys.WIRELESS_ENERGY_BANK.asSlimefunId(),
                    Material.SNOW_BLOCK,
                    "&6无线能源库",
                    "",
                    "&f存储电力以",
                    "&f供无线能源节点使用。",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.CAPACITOR),
                    LoreBuilder.powerBuffer(10240),
                    LoreBuilderDynamic.powerPerSecond(1024),
                    ""));

    public static final ItemWrapper TESSERACT = ItemWrapper.create(Keys.TESSERACT,
            new SlimefunItemStack(Keys.TESSERACT.asSlimefunId(),
                    Material.PURPUR_BLOCK,
                    "&6光学传输仪",
                    "",
                    "&f可双向无线传输电力与物品",
                    "",
                    "&9使用光学绑定仪进行绑定",
                    "",
                    LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
                    LoreBuilder.powerBuffer(65535),
                    LoreBuilderDynamic.powerPerSecond(1024),
                    ""));

    public static final ItemWrapper WIRELESS_ITEM_INPUT = ItemWrapper.create(Keys.WIRELESS_ITEM_INPUT,
            new SlimefunItemStack(Keys.WIRELESS_ITEM_INPUT.asSlimefunId(),
                    new CustomItemStack(PlayerHead.getItemStack(
                            PlayerSkin
                                    .fromHashCode("abb55560c695d976b346e188d3df2bcd8c5aa32b933141a9715c42f64cb6cee"))),
                    "&6无线物品输入节点",
                    "",
                    "&f无线传输物品到",
                    "&f对应的输出节点",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilder.powerBuffer(1024),
                    LoreBuilderDynamic.power(8, " 每格物品"),
                    ""));

    public static final ItemWrapper WIRELESS_ITEM_OUTPUT = ItemWrapper.create(Keys.WIRELESS_ITEM_OUTPUT,
            new SlimefunItemStack(Keys.WIRELESS_ITEM_OUTPUT.asSlimefunId(),
                    new CustomItemStack(PlayerHead.getItemStack(
                            PlayerSkin
                                    .fromHashCode("c510d9b61ca333d2946c61a26cb17e374d4adb573b46afdebaf89f65ba5d4ae2"))),
                    "&6无线物品输出节点",
                    "",
                    "&f从对应的输入节点",
                    "&f无线接收物品",
                    "",
                    "&e右键点击输入节点以绑定",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilder.powerBuffer(1024),
                    LoreBuilderDynamic.power(8, " 每格物品"),
                    ""));

    public static final ItemWrapper EXTERNAL_HEATER = ItemWrapper.create(Keys.EXTERNAL_HEATER,
            new SlimefunItemStack(Keys.EXTERNAL_HEATER.asSlimefunId(),
                    Material.BRICKS,
                    "&6外部加热器",
                    "",
                    "&f从外部加热熔炉、高炉、烟熏炉。",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilder.powerBuffer(2048),
                    LoreBuilderDynamic.power(128, " 每个方块")));

    public static final ItemWrapper GROWTH_CHAMBER = ItemWrapper.create(Keys.GROWTH_CHAMBER,
            new SlimefunItemStack(Keys.GROWTH_CHAMBER.asSlimefunId(),
                    Material.GREEN_STAINED_GLASS,
                    "&6培育仓",
                    "",
                    "&f可让&e植物&f自动生长。",
                    "",
                    "&f&o就像小型温室。",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilder.speed(1),
                    LoreBuilderDynamic.powerPerSecond(32)));

    public static final ItemWrapper GROWTH_CHAMBER_OCEAN = ItemWrapper.create(Keys.GROWTH_CHAMBER_OCEAN,
            new SlimefunItemStack(Keys.GROWTH_CHAMBER_OCEAN.asSlimefunId(),
                    Material.CYAN_STAINED_GLASS,
                    "&b海洋培育仓",
                    "",
                    "&f可让&e水生植物&f自动生长。",
                    "&f可以复活失活的珊瑚！",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilder.speed(1),
                    LoreBuilderDynamic.powerPerSecond(32)));

    public static final ItemWrapper GROWTH_CHAMBER_NETHER = ItemWrapper.create(Keys.GROWTH_CHAMBER_NETHER,
            new SlimefunItemStack(Keys.GROWTH_CHAMBER_NETHER.asSlimefunId(),
                    Material.RED_STAINED_GLASS,
                    "&c下界培育仓",
                    "",
                    "&f可让&e下界植物&f自动生长。",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilder.speed(1),
                    LoreBuilderDynamic.powerPerSecond(32)));

    public static final ItemWrapper GROWTH_CHAMBER_END = ItemWrapper.create(Keys.GROWTH_CHAMBER_END,
            new SlimefunItemStack(Keys.GROWTH_CHAMBER_END.asSlimefunId(),
                    Material.MAGENTA_STAINED_GLASS,
                    "&d末地培育仓",
                    "",
                    "&f可让&e紫颂花&f自动生长。",
                    "",
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilder.speed(1),
                    LoreBuilderDynamic.powerPerSecond(32)));

    public static final ItemWrapper GROWTH_CHAMBER_MK2 = ItemWrapper.create(Keys.GROWTH_CHAMBER_MK2,
            new SlimefunItemStack(Keys.GROWTH_CHAMBER_MK2.asSlimefunId(),
                    Material.LIME_STAINED_GLASS,
                    "&6培育仓 MK2",
                    "",
                    "&f可让&e植物&f自动生长。",
                    "",
                    "&f&o就像小型温室。",
                    "",
                    THREE_X_PROD_LORE,
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilder.speed(3),
                    LoreBuilderDynamic.powerPerSecond(128)));

    public static final ItemWrapper GROWTH_CHAMBER_MK2_OCEAN = ItemWrapper.create(Keys.GROWTH_CHAMBER_MK2_OCEAN,
            new SlimefunItemStack(Keys.GROWTH_CHAMBER_MK2_OCEAN.asSlimefunId(),
                    Material.LIGHT_BLUE_STAINED_GLASS,
                    "&b海洋培育仓 MK2",
                    "",
                    "&f可让&e水生植物&f自动生长。",
                    "&f可以复活失活的珊瑚！",
                    "",
                    THREE_X_PROD_LORE,
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilder.speed(3),
                    LoreBuilderDynamic.powerPerSecond(128)));

    public static final ItemWrapper GROWTH_CHAMBER_MK2_NETHER = ItemWrapper.create(Keys.GROWTH_CHAMBER_MK2_NETHER,
            new SlimefunItemStack(Keys.GROWTH_CHAMBER_MK2_NETHER.asSlimefunId(),
                    Material.RED_STAINED_GLASS,
                    "&c下界培育仓 MK2",
                    "",
                    "&f可让&e下界植物&f自动生长。",
                    "",
                    THREE_X_PROD_LORE,
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilder.speed(3),
                    LoreBuilderDynamic.powerPerSecond(128))); // END Machines

    public static final ItemWrapper GROWTH_CHAMBER_MK2_END = ItemWrapper.create(Keys.GROWTH_CHAMBER_MK2_END,
            new SlimefunItemStack(Keys.GROWTH_CHAMBER_MK2_END.asSlimefunId(),
                    Material.PURPLE_STAINED_GLASS,
                    "&d末地培育仓 MK2",
                    "",
                    "&f可让&e紫颂花&f自动生长。",
                    "",
                    THREE_X_PROD_LORE,
                    LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
                    LoreBuilder.speed(3),
                    LoreBuilderDynamic.powerPerSecond(128)));
    // END Growth Chambers

    public static final ItemWrapper PETAL_APOTHECARY = ItemWrapper.create(Keys.PETAL_APOTHECARY,
            new SlimefunItemStack(Keys.PETAL_APOTHECARY.asSlimefunId(),
                    Material.CAULDRON,
                    "&d花药台",
                    "",
                    "&f添加自然元素以制作令人惊叹的魔法植物。",
                    "",
                    LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE)));

    // END Machines
    // START Fluid Containers
    public static final ItemWrapper LAVA_BOTTLE = ItemWrapper.create(Keys.LAVA_BOTTLE, new SlimefunItemStack(
            Keys.LAVA_BOTTLE.asSlimefunId(), Color.ORANGE, new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1, 1),
            "&f岩浆瓶"));

    public static final ItemWrapper MILK_BOTTLE = ItemWrapper.create(Keys.MILK_BOTTLE, new SlimefunItemStack(
            Keys.MILK_BOTTLE.asSlimefunId(), Color.WHITE, new PotionEffect(PotionEffectType.SATURATION, 1, 1),
            "&f牛奶瓶"));

    public static final ItemWrapper HONEY_BUCKET = ItemWrapper.create(Keys.HONEY_BUCKET,
            new SlimefunItemStack(Keys.HONEY_BUCKET.asSlimefunId(), Material.LAVA_BUCKET, "&f蜂蜜桶"));

    public static final ItemWrapper POTION_BUCKET = ItemWrapper.create(Keys.POTION_BUCKET,
            new SlimefunItemStack(Keys.POTION_BUCKET.asSlimefunId(), Material.WATER_BUCKET, "&f药水桶"));

    public static final class Keys {
        // START Mechanical Components
        public static final TypedKey<ItemWrapper> WOOD_MACHINE_CORE = TypedKey.create("dynatech", "wood_machine_core");

        public static final TypedKey<ItemWrapper> STONE_MACHINE_CORE = TypedKey.create("dynatech",
                "stone_machine_core");

        public static final TypedKey<ItemWrapper> IRON_MACHINE_CORE = TypedKey.create("dynatech", "iron_machine_core");

        public static final TypedKey<ItemWrapper> DIAMOND_MACHINE_CORE = TypedKey.create("dynatech",
                "diamond_machine_core");

        public static final TypedKey<ItemWrapper> ENCHANTED_MACHINE_CORE = TypedKey.create("dynatech",
                "enchanted_machine_core");

        public static final TypedKey<ItemWrapper> ANCIENT_MACHINE_CORE = TypedKey.create("dynatech",
                "ancient_machine_core");

        public static final TypedKey<ItemWrapper> ENERGY_STORAGE_COMPONENT = TypedKey.create("dynatech",
                "energy_storage_component");

        public static final TypedKey<ItemWrapper> ENERGY_INPUT_COMPONENT = TypedKey.create("dynatech",
                "energy_input_component");

        public static final TypedKey<ItemWrapper> ENERGY_OUTPUT_COMPONENT = TypedKey.create("dynatech",
                "energy_output_component");

        public static final TypedKey<ItemWrapper> DEGRADED_WATER_MILL = TypedKey.create("dynatech",
                "degraded_water_mill");

        public static final TypedKey<ItemWrapper> DEGRADED_WATER_MILL_2 = TypedKey.create("dynatech",
                "degraded_water_mill_2");

        public static final TypedKey<ItemWrapper> DEGRADED_WIND_MILL = TypedKey.create("dynatech",
                "degraded_wind_mill");

        public static final TypedKey<ItemWrapper> DEGRADED_WIND_MILL_2 = TypedKey.create("dynatech",
                "degraded_wind_mill_2");

        public static final TypedKey<ItemWrapper> DEGRADED_EGG_MILL = TypedKey.create("dynatech",
                "degraded_egg_mill");

        public static final TypedKey<ItemWrapper> DEGRADED_EGG_MILL_2 = TypedKey.create("dynatech",
                "degraded_egg_mill_2");

        // END Mechanical Components
        // START Energy Generators
        public static final TypedKey<ItemWrapper> WATER_MILL = TypedKey.create("dynatech",
                "water_mill");

        public static final TypedKey<ItemWrapper> WATER_MILL_2 = TypedKey.create("dynatech",
                "water_mill_2");

        public static final TypedKey<ItemWrapper> WIND_MILL = TypedKey.create("dynatech",
                "wind_mill");

        public static final TypedKey<ItemWrapper> WIND_MILL_2 = TypedKey.create("dynatech",
                "wind_mill_2");

        public static final TypedKey<ItemWrapper> EGG_MILL = TypedKey.create("dynatech",
                "egg_mill");

        public static final TypedKey<ItemWrapper> EGG_MILL_2 = TypedKey.create("dynatech",
                "egg_mill_2");

        public static final TypedKey<ItemWrapper> DURABILITY_GENERATOR = TypedKey.create("dynatech",
                "durability_generator");

        public static final TypedKey<ItemWrapper> FOOD_GENERATOR = TypedKey.create("dynatech", "food_generator");

        public static final TypedKey<ItemWrapper> STARDUST_GENERATOR = TypedKey.create("dynatech",
                "stardust_generator");
        // END Energy Generators
        // START Materials
        public static final TypedKey<ItemWrapper> STAINLESS_STEEL_INGOT = TypedKey
                .create("dynatech", "stainless_steel_ingot");

        public static final TypedKey<ItemWrapper> STAINLESS_STEEL_ROTOR = TypedKey
                .create("dynatech", "stainless_steel_rotor");

        public static final TypedKey<ItemWrapper> COAL_COKE = TypedKey
                .create("dynatech", "coal_coke");

        public static final TypedKey<ItemWrapper> BEE = TypedKey.create("dynatech", "bee");
        public static final TypedKey<ItemWrapper> ROBOTIC_BEE = TypedKey.create("dynatech", "robotic_bee");
        public static final TypedKey<ItemWrapper> ADVANCED_ROBOTIC_BEE = TypedKey.create("dynatech",
                "advanced_robotic_bee");

        public static final TypedKey<ItemWrapper> VEX_GEM = TypedKey.create("dynatech", "vex_gem");

        public static final TypedKey<ItemWrapper> MACHINE_SCRAP = TypedKey.create("dynatech", "machine_scrap");

        public static final TypedKey<ItemWrapper> ADVANCED_MACHINE_SCRAP = TypedKey.create("dynatech",
                "advanced_machine_scrap");

        public static final TypedKey<ItemWrapper> STAR_DUST = TypedKey.create("dynatech", "star_dust");

        public static final TypedKey<ItemWrapper> GHOSTLY_ESSENCE = TypedKey.create("dynatech", "ghostly_essence");

        public static final TypedKey<ItemWrapper> TESSERACTING_OBJ = TypedKey.create("dynatech", "tesseracting_object");

        public static final TypedKey<ItemWrapper> LIVINGROCK = TypedKey.create("dynatech", "livingrock");

        public static final TypedKey<ItemWrapper> LIVINGWOOD = TypedKey.create("dynatech", "livingwood");
        // END Materials
        // START Tools
        public static final TypedKey<ItemWrapper> ELECTRICAL_STIMULATOR = TypedKey.create("dynatech",
                "electrical_stimulator");

        public static final TypedKey<ItemWrapper> ANGEL_GEM = TypedKey.create("dynatech", "angel_gem");

        public static final TypedKey<ItemWrapper> INVENTORY_FILTER = TypedKey.create("dynatech", "inventory_filter");

        public static final TypedKey<ItemWrapper> RECIPE_BOOK = TypedKey.create("dynatech", "recipe_book");

        public static final TypedKey<ItemWrapper> AUTO_INPUT_UPGRADE = TypedKey.create("dynatech",
                "auto_input_upgrade");

        public static final TypedKey<ItemWrapper> AUTO_OUTPUT_UPGRADE = TypedKey.create("dynatech",
                "auto_output_upgrade");

        public static final TypedKey<ItemWrapper> FLUID_TANK = TypedKey.create("dynatech", "fluid_tank");

        public static final TypedKey<ItemWrapper> PICNIC_BASKET = TypedKey.create("dynatech", "picnic_basket");

        public static final TypedKey<ItemWrapper> SOUL_BOUND_PICNIC_BASKET = TypedKey.create("dynatech",
                "soul_bound_picnic_basket");

        public static final TypedKey<ItemWrapper> SCOOP = TypedKey.create("dynatech", "scoop");

        public static final TypedKey<ItemWrapper> DIMENSIONAL_HOME = TypedKey.create("dynatech", "dimensional_home");

        public static final TypedKey<ItemWrapper> ITEM_BAND_HASTE = TypedKey.create("dynatech", "haste_item_band");

        public static final TypedKey<ItemWrapper> ITEM_BAND_HEALTH = TypedKey.create("dynatech", "health_item_band");

        public static final TypedKey<ItemWrapper> ITEM_BAND_SPEED = TypedKey.create("dynatech", "speed_item_band");

        public static final TypedKey<ItemWrapper> TESSERACT_BINDER = TypedKey.create("dynatech", "tesseract_binder");

        public static final TypedKey<ItemWrapper> LIQUID_TANK = TypedKey.create("dynatech", "liquid_tank");

        public static final TypedKey<ItemWrapper> WITHER_SKELETON_GOLEM = TypedKey.create("dynatech",
                "wither_skeleton_golem");

        // END Tools
        // START Machines
        public static final TypedKey<ItemWrapper> COAL_COKE_OVEN = TypedKey.create("dynatech", "coal_coke_oven");

        public static final TypedKey<ItemWrapper> AUTO_KITCHEN = TypedKey.create("dynatech", "auto_kitchen");
        public static final TypedKey<ItemWrapper> KITCHEN_AUTO_CRAFTER = TypedKey.create("dynatech",
                "kitchen_auto_crafter");

        public static final TypedKey<ItemWrapper> ANTIGRAVITY_BUBBLE = TypedKey.create("dynatech",
                "antigravity_bubble");

        public static final TypedKey<ItemWrapper> WEATHER_CONTROLLER = TypedKey.create("dynatech",
                "weather_controller");

        public static final TypedKey<ItemWrapper> POTION_SPRINKLER = TypedKey.create("dynatech", "potion_sprinkler");

        public static final TypedKey<ItemWrapper> BARBED_WIRE = TypedKey.create("dynatech", "barbed_wire");

        public static final TypedKey<ItemWrapper> MATERIAL_HIVE = TypedKey.create("dynatech", "material_hive");

        public static final TypedKey<ItemWrapper> WIRELESS_CHARGER = TypedKey.create("dynatech", "wireless_charger");

        public static final TypedKey<ItemWrapper> SEED_PLUCKER = TypedKey.create("dynatech", "seed_plucker");

        public static final TypedKey<ItemWrapper> BANDAID_MANAGER = TypedKey.create("dynatech", "bandaid_manager");

        public static final TypedKey<ItemWrapper> ORECHID = TypedKey.create("dynatech", "orechid");

        public static final TypedKey<ItemWrapper> WIRELESS_ENERGY_POINT = TypedKey.create("dynatech",
                "wireless_energy_point");
        public static final TypedKey<ItemWrapper> WIRELESS_ENERGY_BANK = TypedKey.create("dynatech",
                "wireless_energy_bank");

        public static final TypedKey<ItemWrapper> TESSERACT = TypedKey.create("dynatech", "tesseract");

        public static final TypedKey<ItemWrapper> WIRELESS_ITEM_INPUT = TypedKey.create("dynatech",
                "wireless_item_input");

        public static final TypedKey<ItemWrapper> WIRELESS_ITEM_OUTPUT = TypedKey.create("dynatech",
                "wireless_item_output");

        public static final TypedKey<ItemWrapper> EXTERNAL_HEATER = TypedKey.create("dynatech", "external_heater");
        // START Growth Chambers
        public static final TypedKey<ItemWrapper> GROWTH_CHAMBER = TypedKey.create("dynatech", "growth_chamber");
        public static final TypedKey<ItemWrapper> GROWTH_CHAMBER_OCEAN = TypedKey.create("dynatech",
                "ocean_growth_chamber");
        public static final TypedKey<ItemWrapper> GROWTH_CHAMBER_NETHER = TypedKey.create("dynatech",
                "nether_growth_chamber");
        public static final TypedKey<ItemWrapper> GROWTH_CHAMBER_END = TypedKey.create("dynatech",
                "end_growth_chamber");

        public static final TypedKey<ItemWrapper> GROWTH_CHAMBER_MK2 = TypedKey.create("dynatech",
                "growth_chamber_mark_2");
        public static final TypedKey<ItemWrapper> GROWTH_CHAMBER_MK2_OCEAN = TypedKey.create("dynatech",
                "ocean_growth_chamber_mark_2");
        public static final TypedKey<ItemWrapper> GROWTH_CHAMBER_MK2_NETHER = TypedKey.create("dynatech",
                "nether_growth_chamber_mark_2");
        public static final TypedKey<ItemWrapper> GROWTH_CHAMBER_MK2_END = TypedKey.create("dynatech",
                "end_growth_chamber_mark_2");
        // END Growth Chambers

        public static final TypedKey<ItemWrapper> PETAL_APOTHECARY = TypedKey.create("dynatech", "petal_apothecary");

        // END Machines
        // START Fluid Containers
        public static final TypedKey<ItemWrapper> LAVA_BOTTLE = TypedKey.create("dynatech", "lava_bottle");
        public static final TypedKey<ItemWrapper> MILK_BOTTLE = TypedKey.create("dynatech", "milk_bottle");
        public static final TypedKey<ItemWrapper> HONEY_BUCKET = TypedKey.create("dynatech", "honey_bucket");
        public static final TypedKey<ItemWrapper> POTION_BUCKET = TypedKey.create("dynatech", "potion_bucket");
        // END Fluid Containers
    }
}
