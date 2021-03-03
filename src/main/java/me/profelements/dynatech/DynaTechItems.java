package me.profelements.dynatech;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class DynaTechItems {

    private DynaTechItems() {}

    public static final Category DynaTechGeneral = new Category(new NamespacedKey(DynaTech.getInstance(),
            "dynatech"),
            new CustomItem(Material.CONDUIT, "&b动力科技")
    );

    public static final RecipeType DynaTechScoop = new RecipeType(new NamespacedKey(DynaTech.getInstance(), "dt_scoop"),
            new CustomItem(Material.IRON_SHOVEL, "&bScoop the Bee using a Scoop")
    );

    public static final RecipeType DynaTechStarDustMeteor = new RecipeType(new NamespacedKey(DynaTech.getInstance(), "dt_stardust_meteor"),
            new CustomItem(Material.FIRE_CHARGE, "&bDrops from a Stardust Meteor that has fallen.")
    );

    //Materials
    public static final SlimefunItemStack STAINLESS_STEEL = new SlimefunItemStack("STAINLESS_STEEL", Material.IRON_INGOT, "&6Stainless Steel Ingot");
    public static final SlimefunItemStack STAINLESS_STEEL_ROTOR = new SlimefunItemStack("STAINLESS_STEEL_ROTOR", Material.IRON_BLOCK, "&6Stainless Steel Rotor");
    public static final SlimefunItemStack ANCIENT_MACHINE_CORE = new SlimefunItemStack("ANCIENT_MACHINE_CORE", Material.LAPIS_BLOCK, "&6Ancient Machine Core");
    public static final SlimefunItemStack VEX_GEM = new SlimefunItemStack("VEX_GEM", SkullItem.fromHash("b91aeca7c17e66d867231b36d96e83c1ede75eaf67ccf3a88dca15d4114ae167"), "&6Vex Gem");
    public static final SlimefunItemStack MACHINE_SCRAP = new SlimefunItemStack("MACHINE_SCRAP", SkullItem.fromHash("13ea401c7e02d13cea1de6835ee9f5c47757d399dae5c2b9c3efde6ae63ea4a2"), "&6Machine Scrap");
    public static final SlimefunItemStack ADVANCED_MACHINE_SCRAP = new SlimefunItemStack("ADVANCED_MACHINE_SCRAP",SkullItem.fromHash("4b57a4c68d1d2c5de978ea6de4db91ef387ca6c37966bb8e7c8826f937e6c3"), "&6Advanced Machine Scrap");
    public static final SlimefunItemStack STAR_DUST = new SlimefunItemStack("STAR_DUST", Material.NETHER_STAR, "&6星尘");
   
    //Bees
    public static final SlimefunItemStack BEE = new SlimefunItemStack("BEE", SkullItem.fromHash("12724a9a4cdd68ba49415560e5be40b4a1c47cb5be1d66aedb52a30e62ef2d47"), "&6蜜蜂");
    public static final SlimefunItemStack ROBOTIC_BEE = new SlimefunItemStack("ROBOTIC_BEE", SkullItem.fromHash("16f728c89904b2cb57f853d31d0e2061f52917981fedccb1e949528e08eb4140"), "&6蜜蜂机器人");
    public static final SlimefunItemStack ADVANCED_ROBOTIC_BEE = new SlimefunItemStack("ADVANCED_ROBOTIC_BEE", SkullItem.fromHash("c1c96e8cf83cbade55ffa667197ea6990290e5c7dc679104332caead97eef09"), "&6高级蜜蜂机器人");

    //Backpacks
    public static final SlimefunItemStack PICNIC_BASKET = new SlimefunItemStack("PICNIC_BASKET",
            new CustomItem(SkullItem.fromHash("7a6bf916e28ccb80b4ebfacf98686ad6af7c4fb257e57a8cb78c71d19dccb2")),
            "&6野餐篮",
            "",
            "&f可以储存食物",
            "&f饥饿时自动消耗它们",
            "&f必须在背包里",
            "",
            "&f大小: &e27",
            "",
            "&7ID: <ID>",
            "",
            "&e右键单击&7打开"
            );

    //Tools
    public static final SlimefunItemStack INVENTORY_FILTER = new SlimefunItemStack("INVENTORY_FILTER",
            Material.IRON_BARS,
            "&6库存过滤器",
            "",
            "&f过滤掉地上的物品",
            "",
            "&7ID: <ID>",
            "",
            "&e右键单击&7打开"
            );

    public static final SlimefunItemStack ELECTRICAL_STIMULATOR = new SlimefunItemStack("ELECTRICAL_STIMULATOR",
            new CustomItem(SkullItem.fromHash("82a319cf66a4de12e3330e8bc4c82c985ccc3cb2230868c336a88fc4a22082a")),
            "&6电刺激器",
            "",
            "&f自动为您提供能量",
            "",
            "&f&o激发您的感官",
            "",
            LoreBuilder.powerCharged(0, 1024)
            );

    public static final SlimefunItemStack ANGEL_GEM = new SlimefunItemStack("ANGEL_GEM",
            Material.NETHERITE_BLOCK, 
            "&6Flight Gem",
            "",
            "&fPermanent Creative Flight.",
            "&fHas some speed adjustment settings.",
            "",
            "&f&oFly just like a bird~",
            "",
            "&7Flight: <enabled>",
            "&7Flight Speed: <speed>"
            );

    public static final SlimefunItemStack SCOOP = new SlimefunItemStack("SCOOP", 
            Material.IRON_SHOVEL,
            "&6Scoop",
            "",
            "&fUsed to capture bees.",
            "",
            "&f&oMake sure not to get stung",
            "",
            LoreBuilder.powerCharged(0, 512)
            );

    public static final SlimefunItemStack DIMENSIONAL_HOME = new SlimefunItemStack("DIMENSIONAL_HOME",
            new CustomItem(SkullItem.fromHash("eb18cf9e1bf7ec57304ae92f2b00d91643cf0b65067dead34fb48baf18e3c385")),
            "&6Dimensional Home",
            "",
            "&fTeleports you to a seperate dimensional home and back",
            "",
            "&f&oHome Sweet Home",
            "",
            "&7CHUNK ID: <id>"
            );

    public static final SlimefunItemStack ITEM_BAND_HEALTH = new SlimefunItemStack("ITEM_BAND_HEALTH",
            new CustomItem(SkullItem.fromHash("f1e2428cb359988f4c4ff0e61de21385c62269de19a69762d773223b75dd1666")),
            "&6Healthy Item Band",
            "",
            "&fWhen applied to armor or tools, gives you 1 level of Health Boost",
            "",
            "&f&oPowerup!"
            );
    
    //Machines
    public static final SlimefunItemStack AUTO_KITCHEN = new SlimefunItemStack("AUTO_KITCHEN",
            Material.SMOKER,
            "&6自动厨具",
            "",
            "&f自动制作厨房食谱",
            "",
            "&f&o闻起来像饼干",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(16)
            );

    public static final SlimefunItemStack GROWTH_CHAMBER = new SlimefunItemStack("GROWTH_CHAMBER",
            Material.GREEN_STAINED_GLASS,
            "&6生长室",
            "",
            "&f自动种植一些植物.",
            "",
            "&f&o就像一个小温室!",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(32)
            );

    public static final SlimefunItemStack ANTIGRAVITY_BUBBLE = new SlimefunItemStack("ANTIGRAVITY_BUBBLE",
            Material.OBSIDIAN,
            "&6反重力气泡",
            "",
            "&f在45个方块内进行飞行",
            "",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(128)
            );

    public static final SlimefunItemStack WEATHER_CONTROLLER = new SlimefunItemStack("WEATHER_CONTROLLER",
            Material.BLUE_STAINED_GLASS,
            "&6天气控制器",
            "",
            "&f控制天气",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(32)
            );

    public static final SlimefunItemStack POTION_SPRINKLER = new SlimefunItemStack("POTION_SPRINKLER",
            new CustomItem(SkullItem.fromHash("8d302104180cb79d5f4cf423649ddfa8ffb31a1875fa02a983cd248c72dfb0ea")),
            "&6药水喷洒器",
            "",
            "&f使范围内玩家获得药水效果",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(32)
            );
    
    public static final SlimefunItemStack BARBED_WIRE = new SlimefunItemStack("BARBED_WIRE",
            new CustomItem(SkullItem.fromHash("b2ac6c219004d82dfa627ffab664f29c53ecc112d91c9d7a9c915c426832412")),
            "&6铁丝网",
            "",
            "&f使怪物远离这里",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(16)
            );        
    
    public static final SlimefunItemStack MATERIAL_HIVE = new SlimefunItemStack("MATERIAL_HIVE",
            Material.BEEHIVE,
            "&6蜂巢",
            "",
            "&f使用蜜蜂和电力缓慢生产材料.",
            "",
            LoreBuilder.radioactive(Radioactivity.HIGH),
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(1024)
            );

    public static final SlimefunItemStack WIRELESS_CHARGER = new SlimefunItemStack("WIRELESS_CHARGER",
            Material.CLAY,
            "&6无线充电台",
            "",
            "&f给你背包的充电物品无线充电",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(16)
            );

    public static final SlimefunItemStack SEED_PLUCKER = new SlimefunItemStack("SEED_PLUCKER",
            Material.ORANGE_STAINED_GLASS,
            "&6种子采摘器",
            "",
            "&f从植株中获取种子.",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(32)
            );

    public static final SlimefunItemStack BANDAID_MANAGER = new SlimefunItemStack("BANDAID_MANAGER",
            Material.LAPIS_BLOCK,
            "&6物品纽带管理器",
            "",
            "&f管理是否应用物品纽带",
            "",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerPerSecond(48)
            );

    //Generators
    public static final SlimefunItemStack WATER_MILL = new SlimefunItemStack("WATER_MILL",
            Material.COBBLESTONE_WALL,
            "&6水力发电机",
            "",
            "&f通过流动的水创造能量",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(128),
            LoreBuilder.powerPerSecond(16)
            );

    public static final SlimefunItemStack DRAGON_GENERATOR = new SlimefunItemStack("DRAGON_GENERATOR",
            Material.GRAY_CONCRETE
            ,"&6龙蛋发电机",
            "",
            "&f从龙蛋的温暖中创造能量",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(32)
            );

    public static final SlimefunItemStack CHIPPING_GENERATOR = new SlimefunItemStack("CHIPPING_GENERATOR",
            Material.SPRUCE_WOOD,
            "&6切片发电机",
            "",
            "&f用耐久度不满的物品发电",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.power(8, " 每耐久点数")
            );

    public static final SlimefunItemStack CULINARY_GENERATOR = new SlimefunItemStack("CULINARY_GENERATOR",
            Material.BLAST_FURNACE,
            "&6食物发电机",
            "",
            "&f用食物发电",
            "",
            LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(256),
            LoreBuilder.powerPerSecond(8)
            );

    public static final SlimefunItemStack STARDUST_REACTOR = new SlimefunItemStack("STARDUST_REACTOR",
            Material.IRON_BLOCK,
            "&6星尘反应堆",
            "",
            "&6使用星尘发电",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
            LoreBuilder.powerBuffer(32768),
            LoreBuilder.powerPerSecond(1024)
            );
}
