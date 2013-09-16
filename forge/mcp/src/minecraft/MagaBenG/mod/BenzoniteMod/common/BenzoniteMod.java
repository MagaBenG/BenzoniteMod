package MagaBenG.mod.BenzoniteMod.common;

import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Configuration;
import MagaBenG.mod.BenzoniteMod.Biome.BenzoniteTree;
import MagaBenG.mod.BenzoniteMod.Entity.BenzoniteSpawnCreeper;
import MagaBenG.mod.BenzoniteMod.Entity.TileEntityTutBox;
import MagaBenG.mod.BenzoniteMod.Entity.TutBlockObj;
import MagaBenG.mod.BenzoniteMod.Foods.ChocloateMilk;
import MagaBenG.mod.BenzoniteMod.Foods.PotionFly;
import MagaBenG.mod.BenzoniteMod.Trees.BlueSapling;
import MagaBenG.mod.BenzoniteMod.Trees.Blue_L;
import MagaBenG.mod.BenzoniteMod.armor.BenzoniteBoots;
import MagaBenG.mod.BenzoniteMod.armor.BenzoniteChest;
import MagaBenG.mod.BenzoniteMod.armor.BenzoniteHelm;
import MagaBenG.mod.BenzoniteMod.armor.BlueArmor;
import MagaBenG.mod.BenzoniteMod.armor.DiamondChainArmor;
import MagaBenG.mod.BenzoniteMod.armor.DiamondGoldArmor;
import MagaBenG.mod.BenzoniteMod.armor.FireArmor;
import MagaBenG.mod.BenzoniteMod.armor.FlyArmor;
import MagaBenG.mod.BenzoniteMod.armor.GreenArmor;
import MagaBenG.mod.BenzoniteMod.armor.GreenBenzoniteHelm;
import MagaBenG.mod.BenzoniteMod.armor.OrangeArmor;
import MagaBenG.mod.BenzoniteMod.armor.RedArmor;
import MagaBenG.mod.BenzoniteMod.armor.RedBenzoniteHelm;
import MagaBenG.mod.BenzoniteMod.item.BenzoniteChestBlock;
import MagaBenG.mod.BenzoniteMod.item.BenzoniteCrop;
import MagaBenG.mod.BenzoniteMod.item.BenzoniteEnchant;
import MagaBenG.mod.BenzoniteMod.item.BenzoniteGlass;
import MagaBenG.mod.BenzoniteMod.item.BenzoniteSapling;
import MagaBenG.mod.BenzoniteMod.item.BenzoniteTNT;
import MagaBenG.mod.BenzoniteMod.item.BenzoniteTable;
import MagaBenG.mod.BenzoniteMod.item.BlueBenzonitePresurePlate;
import MagaBenG.mod.BenzoniteMod.item.BlueTable_Main;
import MagaBenG.mod.BenzoniteMod.item.CrocusCrop;
import MagaBenG.mod.BenzoniteMod.item.GreenBenzonitePresurePlate;
import MagaBenG.mod.BenzoniteMod.item.HandCrafting;
import MagaBenG.mod.BenzoniteMod.item.LightTable;
import MagaBenG.mod.BenzoniteMod.item.OrangeBenzonitePresurePlate;
import MagaBenG.mod.BenzoniteMod.item.RedBenzonitePresurePlate;
import MagaBenG.mod.BenzoniteMod.item.BenzoniteStaff;
import MagaBenG.mod.BenzoniteMod.item.BlockTutorialBlock;
import MagaBenG.mod.BenzoniteMod.item.FireBlock;
import MagaBenG.mod.BenzoniteMod.item.FireStaff;
import MagaBenG.mod.BenzoniteMod.item.GodBow;
import MagaBenG.mod.BenzoniteMod.item.Gun;
import MagaBenG.mod.BenzoniteMod.item.ItemAxeL;
import MagaBenG.mod.BenzoniteMod.item.ItemBenzoniteBow;
import MagaBenG.mod.BenzoniteMod.item.ItemHammer;
import MagaBenG.mod.BenzoniteMod.item.ItemHoeL;
import MagaBenG.mod.BenzoniteMod.item.ItemRedBenzoniteAxe;
import MagaBenG.mod.BenzoniteMod.item.ItemRedBenzoniteHoe;
import MagaBenG.mod.BenzoniteMod.item.ItemRedBenzoniteIngot;
import MagaBenG.mod.BenzoniteMod.item.ItemRedBenzonitePickaxe;
import MagaBenG.mod.BenzoniteMod.item.ItemRedBenzoniteSpade;
import MagaBenG.mod.BenzoniteMod.item.ItemRedBenzoniteSword;
import MagaBenG.mod.BenzoniteMod.item.ItemSpadeL;
import MagaBenG.mod.BenzoniteMod.item.MyFurnaceOFF;
import MagaBenG.mod.BenzoniteMod.item.Portal;
import MagaBenG.mod.BenzoniteMod.item.Ring;
import MagaBenG.mod.BenzoniteMod.item.Roller;
import MagaBenG.mod.BenzoniteMod.item.Snow;
import MagaBenG.mod.BenzoniteMod.item.Striker;
import MagaBenG.mod.BenzoniteMod.item.TNTBIG;
import MagaBenG.mod.BenzoniteMod.item.TallDoor;
import MagaBenG.mod.BenzoniteMod.item.Telaport;
import MagaBenG.mod.BenzoniteMod.liquid.BenzoniteLiquidFlowing;
import MagaBenG.mod.BenzoniteMod.liquid.BenzoniteLiquidStill;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.src.BaseMod;
import net.minecraft.src.ModLoader;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.stats.AchievementMap;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.structure.EnumDoor;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;



@Mod(modid = "BenzoniteMod", name = "BenzoniteModAlpha", version = "2.3.5")



public class BenzoniteMod
{
	@Mod.Instance("BenzoniteMod")
	public static BenzoniteMod instance;
	
    @SidedProxy(clientSide = "MagaBenG.mod.BenzoniteMod.common.ClientProxy", serverSide = "MagaBenG.mod.BenzoniteMod.common.CommonProxy")

 
    
  
    
    
    public static CommonProxy proxy;
    public static boolean creatureCompatibility;
    public static Block BenzoniteGlass;

    public static Block RedOre;
    public static Block BlueOre;
    public static Block GreenOre;
    public static Block OrangeOre;
    public static Block RedBlock;
    public static Block BlueBlock;
    public static Block GreenBlock;
    public static Block OrangeBlock;
    public static Block MBlock;
    public static Block RedGlow;
    public static Block BlueGlow;
    public static Block GreenGlow;
    public static Block OrangeGlow;
    public static Block BenzoniteLog;

    public static Item BenzoniteStaff;
    public static Item RedBenzonitePickaxe;
    public static Item RedBenzoniteAxe;
    public static Item RedBenzoniteHoe;
    public static Item RedBenzoniteSpade;
    public static Item RedBenzoniteSword;
    public static Item BlueBenzonitePickaxe;
    public static Item BlueBenzoniteAxe;
    public static Item BlueBenzoniteHoe;
    public static Item BlueBenzoniteSpade;
    public static Item BlueBenzoniteSword;
    public static Item GreenBenzonitePickaxe;
    public static Item GreenBenzoniteAxe;
    public static Item GreenBenzoniteHoe;
    public static Item GreenBenzoniteSpade;
    public static Item GreenBenzoniteSword;
    public static Item OrangeBenzonitePickaxe;
    public static Item OrangeBenzoniteAxe;
    public static Item OrangeBenzoniteHoe;
    public static Item OrangeBenzoniteSpade;
    public static Item OrangeBenzoniteSword;
    public static Item RedIngot;
    public static Item GreenIngot;
    public static Item BlueIngot;
    public static Item OrangeIngot;
    public static Item RedCrystal;
    public static Item BlueCrystal;
    public static Item GreenCrystal;
    public static Item OrangeCrystal;

    public static Item LifeSword;
    public static Item ChocolateMilk;
    public static Item Hammer;
    public static Item Spade;
    public static Item Axe;
    public static Item Hoe;

    public static Item Gun;

    public static Item RedBenzoniteHelm;
    public static Item RedBenzoniteChest;
    public static Item RedBenzoniteLeg;
    public static Item RedBenzoniteBoot;

    public static Item BlueBenzoniteHelm;
    public static Item BlueBenzoniteChest;
    public static Item BlueBenzoniteLeg;
    public static Item BlueBenzoniteBoot;

    public static Item GreenBenzoniteHelm;
    public static Item GreenBenzoniteChest;
    public static Item GreenBenzoniteLeg;
    public static Item GreenBenzoniteBoot;

    public static Item OrangeBenzoniteHelm;
    public static Item OrangeBenzoniteChest;
    public static Item OrangeBenzoniteLeg;
    public static Item OrangeBenzoniteBoot;

    public static Item Barrel;
    public static Item Stock;
    public static Item Trigger;
    public static Item Spring;
    public static Item Receiver;
    public static Item Houseing;
    public static Item Bullet;
    public static Item EnderBow;

    public static Item Fuel;

    public static Item TntStaff;

    public static Item RedFragment;
    public static Item BlueFragment;
    public static Item GreenFragment;
    public static Item OrangeFragment;
    public static Item RedShard;
    public static Item BlueShard;
    public static Item GreenShard;
    public static Item OrangeShard;
    public static Block RedStone;
    public static Block BlueStone;
    public static Block GreenStone;
    public static Block OrangeStone;

    public static Item RedBow;
    public static Item BlueBow;
    public static Item GreenBow;
    public static Item OrangeBow;
    public static Item BowOfTheAir;

    public static Item BenzoniteStriker;
    public static Item BenzoniteDropper;
    public static Item BenzoniteTelaporter;

    public static Item FlyArmorHelm;
    public static Item FlyArmorChest;
    public static Item FlyArmorLegs;
    public static Item FlyArmorBoot;

    public static Item FireArmorHelm;
    public static Item FireArmorChest;
    public static Item FireArmorLegs;
    public static Item FireArmorBoot;

    public static Item BenzoniteWatch;

    public static Block portal;

    public static Block BenzoniteTNT;

    public static Item PotionFly;

    public static Block LightTable;

    public static Block BenzoniteTable;



    public static Item BenzoniteSapling;

    public static Item BenzoniteMultiTool;

    public static Block Blue_L;
    public static Block Blue_Sapling;

    public static BenzoniteModWorldGenerator worldGen = new BenzoniteModWorldGenerator(); // This is your world generation file.

    public static Block BlockMultiCore;
    
    public static Item LambChops;
    
    public static Block RedBenzoniteBoat;
    
    public static Block TallDoor;
    
    public static Block TUTBlock;
       
public static Block BenzoniteCraftingTable;
    
    public static AchievementPage page1 = new AchievementPage("Benzonite"), Benzonite;

    public static CreativeTabs tabBenzonite = new CreativeTabs("tabBenzonite")
    {
        public ItemStack getIconItemStack()
        {
            return new ItemStack(BenzoniteMod.RedIngot, 1, 0);
        }
    };

    
    
    public static EnumToolMaterial toolRedBenzonite = EnumHelper.addToolMaterial("REDTOOL", 3, 2000, 15.0F, 15, 30);
    public static EnumToolMaterial toolGreenBenzonite = EnumHelper.addToolMaterial("GREENTOOL", 3, 50, 50.0F, 15, 40);
    public static EnumToolMaterial toolBlueBenzonite = EnumHelper.addToolMaterial("BLUETOOL", 3, 1500, 15.0F, 15, 30);
    public static EnumToolMaterial toolOrangeBenzonite = EnumHelper.addToolMaterial("ORANGETOOL", 3, 3000, 7.0F, 15, 30);
    public static EnumToolMaterial toolLifeSword = EnumHelper.addToolMaterial("LIFESWORD", 3, 15000, 7.0F, 15, 50);
    public static EnumToolMaterial toolHammer = EnumHelper.addToolMaterial("HAMMER", 3, 15000, 70.0F, 15, 50);
    public static EnumArmorMaterial armorRed = EnumHelper.addArmorMaterial("RED", 33, new int[] {3, 8, 6, 3}, 15);
    public static EnumArmorMaterial armorBlue = EnumHelper.addArmorMaterial("GREEN", 33, new int[] {3, 8, 6, 3}, 15);
    public static EnumArmorMaterial armorGreen = EnumHelper.addArmorMaterial("BLUE", 33, new int[] {3, 8, 6, 3}, 15);
    public static EnumArmorMaterial armorOrange = EnumHelper.addArmorMaterial("ORANGE", 33, new int[] {3, 8, 6, 3}, 15);
    public static EnumToolMaterial toolStaffs = EnumHelper.addToolMaterial("STAFFS", 3, 1500, 70.0F, 15, 50);
    public static EnumToolMaterial toolMag = EnumHelper.addToolMaterial("MAG", 0, 8, 0, 1, 0);
    public static EnumArmorMaterial armorFly = EnumHelper.addArmorMaterial("FLY", 33, new int[] {3, 8, 6, 3}, 15);
    public static EnumArmorMaterial armorFire = EnumHelper.addArmorMaterial("FIRE", 33, new int[] {3, 8, 6, 3}, 15);
    public static EnumArmorMaterial armorNecklace = EnumHelper.addArmorMaterial("NECK", 33, new int[] {0, 0, 0, 0}, 0);
    public static EnumToolMaterial toolRoller = EnumHelper.addToolMaterial("ROLL", 3, 150, 70.0F, 15, 50);
    public static EnumToolMaterial toolMulti = EnumHelper.addToolMaterial("Multi", 5, -1, 200.0F, 150, 150);


    
    @Init
    public void load(FMLInitializationEvent evt)
    {
       
    }


    
  
    public BenzoniteMod()
    {
        RedBenzonitePickaxe = new ItemRedBenzonitePickaxe(15000, toolRedBenzonite).func_111206_d("benzonitemod:RedBenzonitePickaxe").setMaxStackSize(1).setUnlocalizedName("RedBenzonitePickaxe");
        RedBenzoniteAxe = new ItemRedBenzoniteAxe(15001, toolRedBenzonite).func_111206_d("benzonitemod:RedBenzoniteAxe").setMaxStackSize(1).setUnlocalizedName("RedBenzoniteAxe");
        RedBenzoniteSpade = new ItemRedBenzoniteSpade(15002, toolRedBenzonite).func_111206_d("benzonitemod:RedBenzoniteSpade").setMaxStackSize(1).setUnlocalizedName("RedBenzoniteSpade");
        RedBenzoniteSword = new ItemRedBenzoniteSword(15003, toolRedBenzonite).func_111206_d("benzonitemod:SwordRedBenzonite").setMaxStackSize(1).setUnlocalizedName("RedBenzoniteSword");
        RedBenzoniteHoe = new ItemRedBenzoniteHoe(15004, toolRedBenzonite).func_111206_d("benzonitemod:RedBenzoniteHoe").setMaxStackSize(1).setUnlocalizedName("RedBenzoniteHoe");
        BlueBenzonitePickaxe = new ItemRedBenzonitePickaxe(15005, toolRedBenzonite).func_111206_d("benzonitemod:BlueBenzonitePickaxe").setMaxStackSize(1).setUnlocalizedName("BlueBenzonitePickaxe");
        BlueBenzoniteAxe = new ItemRedBenzoniteAxe(15006, toolBlueBenzonite).func_111206_d("benzonitemod:BlueBenzoniteAxe").setMaxStackSize(1).setUnlocalizedName("BlueBenzoniteAxe");
        BlueBenzoniteSpade = new ItemRedBenzoniteSpade(15007, toolBlueBenzonite).func_111206_d("benzonitemod:BlueBenzoniteSpade").setMaxStackSize(1).setUnlocalizedName("BlueBenzoniteSpade");
        BlueBenzoniteSword = new ItemRedBenzoniteSword(15008, toolBlueBenzonite).func_111206_d("benzonitemod:BlueBenzoniteSword").setMaxStackSize(1).setUnlocalizedName("BlueBenzoniteSword");
        BlueBenzoniteHoe = new ItemRedBenzoniteHoe(15009, toolBlueBenzonite).func_111206_d("benzonitemod:BlueBenzoniteHoe").setMaxStackSize(1).setUnlocalizedName("BlueBenzoniteHoe");
        GreenBenzonitePickaxe = new ItemRedBenzonitePickaxe(15015, toolGreenBenzonite).func_111206_d("benzonitemod:GreenBenzonitePickaxe").setMaxStackSize(1).setUnlocalizedName("GreenBenzonitePickaxe");
        GreenBenzoniteAxe = new ItemRedBenzoniteAxe(15011, toolGreenBenzonite).func_111206_d("benzonitemod:GreenBenzoniteAxe").setMaxStackSize(1).setUnlocalizedName("GreenBenzoniteAxe");
        GreenBenzoniteSpade = new ItemRedBenzoniteSpade(15012, toolGreenBenzonite).func_111206_d("benzonitemod:GreenBenzoniteSpade").setMaxStackSize(1).setUnlocalizedName("GreenBenzoniteSpade");
        GreenBenzoniteSword = new ItemRedBenzoniteSword(15013, toolGreenBenzonite).func_111206_d("benzonitemod:GreenBenzoniteSword").setMaxStackSize(1).setUnlocalizedName("GreenBenzoniteSword");
        GreenBenzoniteHoe = new ItemRedBenzoniteHoe(15014, toolGreenBenzonite).func_111206_d("benzonitemod:GreenBenzoniteHoe").setMaxStackSize(1).setUnlocalizedName("GreenBenzoniteHoe");
        OrangeBenzonitePickaxe = new ItemRedBenzonitePickaxe(15015, toolOrangeBenzonite).func_111206_d("benzonitemod:OrangeBenzonitePickaxe").setMaxStackSize(1).setUnlocalizedName("OrangeBenzonitePickaxe");
        OrangeBenzoniteAxe = new ItemRedBenzoniteAxe(15016, toolOrangeBenzonite).func_111206_d("benzonitemod:OrangeBenzoniteAxe").setMaxStackSize(1).setUnlocalizedName("OrangeBenzoniteAxe");
        OrangeBenzoniteSpade = new ItemRedBenzoniteSpade(15017, toolOrangeBenzonite).func_111206_d("benzonitemod:OrangeBenzoniteSpade").setMaxStackSize(1).setUnlocalizedName("OrangeBenzoniteSpade");
        OrangeBenzoniteSword = new ItemRedBenzoniteSword(15018, toolOrangeBenzonite).func_111206_d("benzonitemod:OrangeBenzoniteSword").setMaxStackSize(1).setUnlocalizedName("OrangeBenzoniteSword");
        OrangeBenzoniteHoe = new ItemRedBenzoniteHoe(15019, toolOrangeBenzonite).func_111206_d("benzonitemod:OrangeBenzoniteHoe").setMaxStackSize(1).setUnlocalizedName("OrangeBenzoniteHoe");
        LifeSword = new MagaBenG.mod.BenzoniteMod.item.LifeSword(15030, toolBlueBenzonite).func_111206_d("benzonitemod:LifeSword").setMaxStackSize(1).setNoRepair().setUnlocalizedName("LifeSword");
        
        
        RedIngot = new ItemRedBenzoniteIngot(15020, null).func_111206_d("benzonitemod:RedIngot1").setMaxStackSize(64).setUnlocalizedName("RedIngot1");
        BlueIngot = new ItemRedBenzoniteIngot(15021, null).func_111206_d("benzonitemod:BlueIngot").setMaxStackSize(64).setUnlocalizedName("BlueIngot");
        GreenIngot = new ItemRedBenzoniteIngot(15022, null).func_111206_d("benzonitemod:GreenIngot").setMaxStackSize(64).setUnlocalizedName("GreenIngot");
        OrangeIngot = new ItemRedBenzoniteIngot(15023, null).func_111206_d("benzonitemod:OrangeIngot").setMaxStackSize(64).setUnlocalizedName("OrangeIngot");
        RedCrystal = new ItemRedBenzoniteIngot(15024, null).func_111206_d("benzonitemod:RedCrystal").setMaxStackSize(64).setUnlocalizedName("RedCrystal");
        BlueCrystal = new ItemRedBenzoniteIngot(15025, null).func_111206_d("benzonitemod:BlueCrystal").setMaxStackSize(64).setUnlocalizedName("BlueCrystal");
        GreenCrystal = new ItemRedBenzoniteIngot(15026, null).func_111206_d("benzonitemod:GreenCrystal").setMaxStackSize(64).setUnlocalizedName("GreenCrystal");
        OrangeCrystal = new ItemRedBenzoniteIngot(15027, null).func_111206_d("benzonitemod:OrangeCrystal").setMaxStackSize(64).setUnlocalizedName("OrangeCrystal");
        
        
        ChocolateMilk = new ChocloateMilk(15028, 0, 1, false).func_111206_d("benzonitemod:ChocolateMilk").setMaxStackSize(1).setUnlocalizedName("ChocolateMilk");
        
        
        Hammer = new ItemHammer(15031, toolHammer).func_111206_d("benzonitemod:Hammer").setMaxStackSize(1).setUnlocalizedName("Hammer");
        Spade = new ItemSpadeL(15032, toolHammer).func_111206_d("benzonitemod:Spade").setMaxStackSize(1).setUnlocalizedName("Spade");
        Axe = new ItemAxeL(15033, toolHammer).func_111206_d("benzonitemod:Axe").setMaxStackSize(1).setUnlocalizedName("Axe");
        Hoe = new ItemHoeL(15034, toolHammer).func_111206_d("benzonitemod:Hoe").setMaxStackSize(1).setUnlocalizedName("Hoe");
        
        
        RedOre = new BlockTutorialBlock(3000, 0, null).func_111022_d("benzonitemod:RedOre").setHardness(20F).setUnlocalizedName("RedOre");
        BlueOre = new BlockTutorialBlock(3001, 0, null).func_111022_d("benzonitemod:BlueOre").setHardness(20F).setUnlocalizedName("BlueOre");
        GreenOre = new BlockTutorialBlock(3002, 0, null).func_111022_d("benzonitemod:GreenOre").setHardness(20F).setUnlocalizedName("GreenOre");
        OrangeOre = new BlockTutorialBlock(3003, 0, null).func_111022_d("benzonitemod:OrangeOre").setHardness(20F).setUnlocalizedName("OrangeOre");
        RedBlock = new BlockTutorialBlock(3004, 0, null).func_111022_d("benzonitemod:RedBlock").setHardness(20F).setUnlocalizedName("RedBlock");
        BlueBlock = new BlockTutorialBlock(3005, 0, null).func_111022_d("benzonitemod:BlueBlock").setHardness(20F).setUnlocalizedName("BlueBlock");
        GreenBlock = new BlockTutorialBlock(3006, 0, null).func_111022_d("benzonitemod:GreenBlock").setHardness(20F).setUnlocalizedName("GreenBlock");
        OrangeBlock = new BlockTutorialBlock(3007, 0, null).func_111022_d("benzonitemod:OrangeBlock").setHardness(20F).setUnlocalizedName("OrangeBlock");
        
        
        MBlock = new BlockTutorialBlock(3008, 0, null).func_111022_d("benzonitemod:SlowLamp").setHardness(20F).setUnlocalizedName("MBLOCK");
        RedGlow =  new BlockTutorialBlock(3009, 0, null).func_111022_d("benzonitemod:RedLight").setHardness(20F).setLightValue(20.0F).setUnlocalizedName("RedLight");
        BlueGlow =  new BlockTutorialBlock(3010, 0, null).func_111022_d("benzonitemod:BlueLight").setHardness(20F).setLightValue(20.0F).setUnlocalizedName("BlueLight");
        GreenGlow =  new BlockTutorialBlock(3011, 0, null).func_111022_d("benzonitemod:GreenLight").setHardness(20F).setLightValue(20.0F).setUnlocalizedName("GreenLight");
        OrangeGlow =  new BlockTutorialBlock(3012, 0, null).func_111022_d("benzonitemod:OrangeLight").setHardness(20F).setLightValue(20.0F).setUnlocalizedName("OrangeLight");
        BenzoniteStaff = new BenzoniteStaff(15063).func_111206_d("benzonitemod:BenzoniteStaff").setMaxStackSize(1).setUnlocalizedName("BenzoniteStaff");
        
        
        Gun = new Gun(15038, null).func_111206_d("benzonitemod:Gun").setMaxStackSize(1).setUnlocalizedName("Gun");
        
        
        
        BenzoniteGlass = new BenzoniteGlass(3013, Material.glass, false).func_111022_d("benzonitemod:BenzoniteGlass").setHardness(5F).setUnlocalizedName("BenzoniteGlass");
        RedBenzoniteHelm = new RedArmor(15039, armorRed, 4, 0).func_111206_d("benzonitemod:RedHelm").setUnlocalizedName("RedHelm");
        RedBenzoniteChest = new RedArmor(15040, armorRed, 4, 1).func_111206_d("benzonitemod:RedChest").setUnlocalizedName("RedChest");
        RedBenzoniteLeg = new RedArmor(15041, armorRed, 4, 2).func_111206_d("benzonitemod:RedLeg").setUnlocalizedName("RedLeg");
        RedBenzoniteBoot = new RedArmor(15042, armorRed, 4, 3).func_111206_d("benzonitemod:RedBoot").setUnlocalizedName("RedBoot");
        BlueBenzoniteHelm = new BlueArmor(15043, armorBlue, 4, 0).func_111206_d("benzonitemod:BlueHelm").setUnlocalizedName("BlueHelm");
        BlueBenzoniteChest = new BlueArmor(15044, armorBlue, 4, 1).func_111206_d("benzonitemod:BlueChest").setUnlocalizedName("BlueChest");
        BlueBenzoniteLeg = new BlueArmor(15045, armorBlue, 4, 2).func_111206_d("benzonitemod:BlueLeg").setUnlocalizedName("BlueLeg");
        BlueBenzoniteBoot = new BlueArmor(15046, armorBlue, 4, 3).func_111206_d("benzonitemod:BlueBoot").setUnlocalizedName("BlueBoot");
        GreenBenzoniteHelm = new GreenArmor(15047, armorGreen, 4, 0).func_111206_d("benzonitemod:GreenHelm").setUnlocalizedName("GreenHelm");
        GreenBenzoniteChest = new GreenArmor(15048, armorGreen, 4, 1).func_111206_d("benzonitemod:GreenChest").setUnlocalizedName("GreenChest");
        GreenBenzoniteLeg = new GreenArmor(15049, armorGreen, 4, 2).func_111206_d("benzonitemod:GreenLeg").setUnlocalizedName("GreenLeg");
        GreenBenzoniteBoot = new GreenArmor(15050, armorGreen, 4, 3).func_111206_d("benzonitemod:GreenBoot").setUnlocalizedName("GreenBoot");
        OrangeBenzoniteHelm = new OrangeArmor(15051, armorOrange, 4, 0).func_111206_d("benzonitemod:OrangeHelm").setUnlocalizedName("OrangeHelm");
        OrangeBenzoniteChest = new OrangeArmor(15052, armorOrange, 4, 1).func_111206_d("benzonitemod:OrangeChest").setUnlocalizedName("OrangeChest");
        OrangeBenzoniteLeg = new OrangeArmor(15053, armorOrange, 4, 2).func_111206_d("benzonitemod:OrangeLeg").setUnlocalizedName("OrangeLeg");
        OrangeBenzoniteBoot = new OrangeArmor(15054, armorOrange, 4, 3).func_111206_d("benzonitemod:OrangeBoot").setUnlocalizedName("OrnageBoot");
        
        
        Barrel = new ItemRedBenzoniteIngot(15055, null).func_111206_d("benzonitemod:Barrel").setMaxStackSize(1).setUnlocalizedName("Barrel");
        Stock = new ItemRedBenzoniteIngot(15056, null).func_111206_d("benzonitemod:Stock").setMaxStackSize(1).setUnlocalizedName("Stock");
        Trigger = new ItemRedBenzoniteIngot(15057, null).func_111206_d("benzonitemod:Trigger").setMaxStackSize(1).setUnlocalizedName("Trigger");
        Spring = new ItemRedBenzoniteIngot(15058, null).func_111206_d("benzonitemod:Spring").setMaxStackSize(1).setUnlocalizedName("Spring");
        Receiver = new ItemRedBenzoniteIngot(15059, null).func_111206_d("benzonitemod:Receiver").setMaxStackSize(1).setUnlocalizedName("Receiver");
        Houseing = new ItemRedBenzoniteIngot(15060, null).func_111206_d("benzonitemod:Houseing").setMaxStackSize(1).setUnlocalizedName("Hpuseing");
        Bullet = new ItemRedBenzoniteIngot(15061, null).func_111206_d("benzonitemod:Bullet").setMaxStackSize(64).setUnlocalizedName("Bullet");
        
        
        EnderBow = new MagaBenG.mod.BenzoniteMod.item.EnderStaff(15062, toolStaffs).func_111206_d("benzonitemod:EnderStaff1").setMaxStackSize(1).setUnlocalizedName("EnderStaff");
        Fuel = new ItemRedBenzoniteIngot(15037, null).func_111206_d("benzonitemod:Fuel").setUnlocalizedName("Fuel");
        TntStaff = new MagaBenG.mod.BenzoniteMod.item.FireStaff(15064, toolStaffs).func_111206_d("benzonitemod:TNTstaff").setMaxStackSize(1).setUnlocalizedName("TNTstaff");
        
        
        RedShard = new ItemRedBenzoniteIngot(15065, null).func_111206_d("benzonitemod:RedShard").setMaxStackSize(64).setUnlocalizedName("RedShard");
        BlueShard = new ItemRedBenzoniteIngot(15066, null).func_111206_d("benzonitemod:BlueShard").setMaxStackSize(64).setUnlocalizedName("BlueShard");
        GreenShard = new ItemRedBenzoniteIngot(15067, null).func_111206_d("benzonitemod:GreenShard").setMaxStackSize(64).setUnlocalizedName("GreenShard");
        OrangeShard = new ItemRedBenzoniteIngot(15068, null).func_111206_d("benzonitemod:OrangeShard").setMaxStackSize(64).setUnlocalizedName("OrangeShard");
        RedFragment = new ItemRedBenzoniteIngot(15069, null).func_111206_d("benzonitemod:RedFragment").setMaxStackSize(64).setUnlocalizedName("RedFragment");
        BlueFragment = new ItemRedBenzoniteIngot(15070, null).func_111206_d("benzonitemod:BlueFragment").setMaxStackSize(64).setUnlocalizedName("BlueFragment");
        GreenFragment = new ItemRedBenzoniteIngot(15071, null).func_111206_d("benzonitemod:GreenFragment").setMaxStackSize(64).setUnlocalizedName("GreenFragment");
        OrangeFragment = new ItemRedBenzoniteIngot(15072, null).func_111206_d("benzonitemod:OrangeFragment").setMaxStackSize(64).setUnlocalizedName("OrangeFragment");
        RedStone =  new BlockTutorialBlock(3014, 0, null).func_111022_d("benzonitemod:RedStone").setHardness(20F).setLightValue(2.0F).setUnlocalizedName("RedStone");
        BlueStone =  new BlockTutorialBlock(3015, 0, null).func_111022_d("benzonitemod:BlueStone").setHardness(20F).setLightValue(2.0F).setUnlocalizedName("BlueStone");
        GreenStone =  new BlockTutorialBlock(3016, 0, null).func_111022_d("benzonitemod:GreenStone").setHardness(20F).setLightValue(2.0F).setUnlocalizedName("GreenStone");
        OrangeStone =  new BlockTutorialBlock(3017, 0, null).func_111022_d("benzonitemod:OrangeStone").setHardness(20F).setLightValue(2.0F).setUnlocalizedName("OrangeStone");
        
        
        RedBow = new ItemBenzoniteBow(15073).func_111206_d("benzonitemod:RedBow").setMaxStackSize(1).setUnlocalizedName("RedBow");
        BlueBow = new ItemBenzoniteBow(15074).func_111206_d("benzonitemod:BlueBow").setMaxStackSize(1).setUnlocalizedName("BlueBow");
        GreenBow = new ItemBenzoniteBow(15075).func_111206_d("benzonitemod:GreenBow").setMaxStackSize(1).setUnlocalizedName("GreenBow");
        OrangeBow = new ItemBenzoniteBow(15076).func_111206_d("benzonitemod:OrangeBow").setMaxStackSize(1).setUnlocalizedName("OrangeBow");
        
        
        BowOfTheAir = new GodBow(15077).func_111206_d("benzonitemod:BowOfAir").setMaxStackSize(1).setUnlocalizedName("BowOfAir");
        BenzoniteLog = new MagaBenG.mod.BenzoniteMod.item.BenzoniteLog(3018).setHardness(20F).func_111022_d("benzonitemod:Log_Top").setUnlocalizedName("Log_Top");
        BenzoniteStriker = new Striker(15078, toolHammer).func_111206_d("benzonitemod:Striker").setMaxStackSize(1).setUnlocalizedName("Striker");
        BenzoniteTelaporter = new Telaport(15079, toolHammer).func_111206_d("benzonitemod:Telaporter").setMaxStackSize(1).setUnlocalizedName("Telaporter");
        BenzoniteDropper = new Snow(15080, toolHammer).func_111206_d("benzonitemod:Dropper").setMaxStackSize(1).setUnlocalizedName("Dropper");
        
        
        FlyArmorHelm = new FlyArmor(15081, armorFly, 4, 0).func_111206_d("benzonitemod:FlyHelm").setUnlocalizedName("FlyHelm");
        FlyArmorChest = new FlyArmor(15082, armorFly, 4, 1).func_111206_d("benzonitemod:FlyChest").setUnlocalizedName("FlyChest");
        FlyArmorLegs = new FlyArmor(15083, armorFly, 4, 2).func_111206_d("benzonitemod:FlyLegs").setUnlocalizedName("FlyLegs");
        FlyArmorBoot = new FlyArmor(15084, armorFly, 4, 3).func_111206_d("benzonitemod:FlyBoot").setUnlocalizedName("FlyBoots");
        FireArmorHelm = new FireArmor(15085, armorFly, 4, 0).func_111206_d("benzonitemod:FireHelm").setUnlocalizedName("FireHelm");
        FireArmorChest = new FireArmor(15086, armorFly, 4, 1).func_111206_d("benzonitemod:FireChest").setUnlocalizedName("FireChest");
        FireArmorLegs = new FireArmor(15087, armorFly, 4, 2).func_111206_d("benzonitemod:FireLegs").setUnlocalizedName("FireLegs");
        FireArmorBoot = new FireArmor(15088, armorFly, 4, 3).func_111206_d("benzonitemod:FireBoot").setUnlocalizedName("FireBoots");
        
        
        BenzoniteTable = new BenzoniteTable(3025).func_111022_d("benzonitemod:BenzoniteTable").setUnlocalizedName("BenzoniteTable");
        
      
        /**
        BenzoniteBucket = new BenzoniteBucket(15089, 0).func_111206_d("benzonitemod:BenzoniteBucket_1").setUnlocalizedName("BenzoniteBucket");
        BenzoniteBucket_1 = new BenzoniteBucket_1(15090, 0).func_111206_d("benzonitemod:BenzoniteBucket_1").setUnlocalizedName("BenzoniteBucket_1");
        BenzoniteBucket_2 = new MagaBenG.mod.BenzoniteMod.Bucket.BenzoniteBucket_2(15091, 0).func_111206_d("benzonitemod:BenzoniteBucket_2").setUnlocalizedName("BenzoniteBucket_2");
        BenzoniteBucket_3 = new MagaBenG.mod.BenzoniteMod.Bucket.BenzoniteBucket_3(15092, 0).func_111206_d("benzonitemod:BenzoniteBucket_3").setUnlocalizedName("BenzoniteBucket_3");
        BenzoniteBucket_4 = new MagaBenG.mod.BenzoniteMod.Bucket.BenzoniteBucket_4(15093, 0).func_111206_d("benzonitemod:BenzoniteBucket_4").setUnlocalizedName("BenzoniteBucket_4");
        BenzoniteBucket_5 = new MagaBenG.mod.BenzoniteMod.Bucket.BenzoniteBucket_5(15094, 0).func_111206_d("benzonitemod:BenzoniteBucket_5").setUnlocalizedName("BenzoniteBucket_5");
        BenzoniteBucket_6 = new MagaBenG.mod.BenzoniteMod.Bucket.BenzoniteBucket_6(15095, 0).func_111206_d("benzonitemod:BenzoniteBucket_6").setUnlocalizedName("BenzoniteBucket_6");
        BenzoniteBucket_7 = new MagaBenG.mod.BenzoniteMod.Bucket.BenzoniteBucket_7(15096, 0).func_111206_d("benzonitemod:BenzoniteBucket_7").setUnlocalizedName("BenzoniteBucket_7");
        BenzoniteBucket_8 = new MagaBenG.mod.BenzoniteMod.Bucket.BenzoniteBucket_8(15097, 0).func_111206_d("benzonitemod:BenzoniteBucket_8").setUnlocalizedName("BenzoniteBucket_8");
        
        */
        
        //Items//
        
        
        
        
        LanguageRegistry.addName(RedBenzonitePickaxe, "Red Benzonite Pickaxe");
        LanguageRegistry.addName(RedBenzoniteAxe, "Red Benzonite Axe");
        LanguageRegistry.addName(RedBenzoniteSpade, "Red Benzonite Spade");
        LanguageRegistry.addName(RedBenzoniteSword, "Red Benzonite Sword");
        LanguageRegistry.addName(RedBenzoniteHoe, "Red Benzonite Hoe");
        LanguageRegistry.addName(BlueBenzonitePickaxe, "Blue Benzonite Pickaxe");
        LanguageRegistry.addName(BlueBenzoniteAxe, "Blue Benzonite Axe");
        LanguageRegistry.addName(BlueBenzoniteSpade, "Blue Benzonite Spade");
        LanguageRegistry.addName(BlueBenzoniteSword, "Blue Benzonite Sword");
        LanguageRegistry.addName(BlueBenzoniteHoe, "Blue Benzonite Hoe");
        LanguageRegistry.addName(GreenBenzonitePickaxe, "Green Benzonite Pickaxe");
        LanguageRegistry.addName(GreenBenzoniteAxe, "Green Benzonite Axe");
        LanguageRegistry.addName(GreenBenzoniteSpade, "Green Benzonite Spade");
        LanguageRegistry.addName(GreenBenzoniteSword, "Green Benzonite Sword");
        LanguageRegistry.addName(GreenBenzoniteHoe, "Green Benzonite Hoe");
        LanguageRegistry.addName(OrangeBenzonitePickaxe, "Orange Benzonite Pickaxe");
        LanguageRegistry.addName(OrangeBenzoniteAxe, "Orange Benzonite Axe");
        LanguageRegistry.addName(OrangeBenzoniteSpade, "Orange Benzonite Spade");
        LanguageRegistry.addName(OrangeBenzoniteSword, "Orange Benzonite Sword");
        LanguageRegistry.addName(OrangeBenzoniteHoe, "Orange Benzonite Hoe");
        
        
        LanguageRegistry.addName(RedIngot, "Red Benzonite Ingot");
        LanguageRegistry.addName(BlueIngot, "Blue Benzonite Ingot");
        LanguageRegistry.addName(GreenIngot, "Green Benzonite Ingot");
        LanguageRegistry.addName(OrangeIngot, "Orange Benzonite Ingot");
        LanguageRegistry.addName(RedCrystal, "Red Inrichment Crystal");
        LanguageRegistry.addName(BlueCrystal, "Blue Inrichment Crystal");
        LanguageRegistry.addName(GreenCrystal, "Green Inrichment Crystal");
        LanguageRegistry.addName(OrangeCrystal, "Orange Inrichment Crystal");
        LanguageRegistry.addName(LifeSword, "The Sword Of Life");
        
        
        LanguageRegistry.addName(ChocolateMilk, "Chocolate Milk");
        LanguageRegistry.addName(Hammer, "Hammer Of Notch");
        LanguageRegistry.addName(Spade, "Spade Of The Wise");
        LanguageRegistry.addName(Axe, "Axe Of The Sky");
        LanguageRegistry.addName(Hoe, "Hoe Of The Feilds");
        
        LanguageRegistry.addName(Gun, "Gun Of the Hunter");
        
        LanguageRegistry.addName(RedBenzoniteHelm, "Red Benzonite Helmet");
        LanguageRegistry.addName(RedBenzoniteChest, "Red Benzonite Chestplate");
        LanguageRegistry.addName(RedBenzoniteLeg, "Red Benzonite Leggings");
        LanguageRegistry.addName(RedBenzoniteBoot, "Red Benzonite Boots");
        LanguageRegistry.addName(BlueBenzoniteHelm, "Blue Benzonite Helmet");
        LanguageRegistry.addName(BlueBenzoniteChest, "Blue Benzonite Chestplate");
        LanguageRegistry.addName(BlueBenzoniteLeg, "Blue Benzonite Leggings");
        LanguageRegistry.addName(BlueBenzoniteBoot, "Blue Benzonite Boots");
        LanguageRegistry.addName(GreenBenzoniteHelm, "Green Benzonite Helmet");
        LanguageRegistry.addName(GreenBenzoniteChest, "Green Benzonite Chestplate");
        LanguageRegistry.addName(GreenBenzoniteLeg, "Green Benzonite Leggings");
        LanguageRegistry.addName(GreenBenzoniteBoot, "Green Benzonite Boots");
        LanguageRegistry.addName(OrangeBenzoniteHelm, "Orange Benzonite Helmet");
        LanguageRegistry.addName(OrangeBenzoniteChest, "Orange Benzonite Chestplate");
        LanguageRegistry.addName(OrangeBenzoniteLeg, "Orange Benzonite Leggings");
        LanguageRegistry.addName(OrangeBenzoniteBoot, "Orange Benzonite Boots");
        
        
        LanguageRegistry.addName(Barrel, "Gun Barrel");
        LanguageRegistry.addName(Stock, "Gun Stock");
        LanguageRegistry.addName(Trigger, "Gun Trigger");
        LanguageRegistry.addName(Spring, "Gun Spring");
        LanguageRegistry.addName(Receiver, "Gun Receiver");
        LanguageRegistry.addName(Houseing, "Gun Houseing");
        LanguageRegistry.addName(Bullet, "Bullet");
        
        
        LanguageRegistry.addName(EnderBow, "EnderStaff");
        LanguageRegistry.addName(Fuel, "Benzonite Fuel");
        LanguageRegistry.addName(TntStaff, "*WIP* Staff");
        LanguageRegistry.addName(RedShard, "Red Shard");
        LanguageRegistry.addName(BlueShard, "Blue Shard");
        LanguageRegistry.addName(GreenShard, "Green Shard");
        LanguageRegistry.addName(OrangeShard, "Orange Shard");
        LanguageRegistry.addName(RedFragment, "Red Fragment");
        LanguageRegistry.addName(BlueFragment, "Blue Fragment");
        LanguageRegistry.addName(GreenFragment, "Green Fragment");
        LanguageRegistry.addName(OrangeFragment, "Orange Fragment");
        
        LanguageRegistry.addName(RedBow, "Red Benzonite Bow");
        LanguageRegistry.addName(BlueBow, "Blue Benzonite Bow");
        LanguageRegistry.addName(GreenBow, "Green Benzonite Bow");
        LanguageRegistry.addName(OrangeBow, "Orange Benzonite Bow");
        LanguageRegistry.addName(BowOfTheAir, "The Bow Of The Air");
        LanguageRegistry.addName(BenzoniteLog, "*WIP* Log");
        LanguageRegistry.addName(BenzoniteStriker, "Benzonite Striker");
        LanguageRegistry.addName(BenzoniteTelaporter, "Benzonite Telaporter");
        LanguageRegistry.addName(BenzoniteDropper, "Benzonite Dropper");
        
       
        
        
        
        LanguageRegistry.addName(FlyArmorHelm, "Fly Helmet");
        LanguageRegistry.addName(FlyArmorChest, "Fly Chestplate");
        LanguageRegistry.addName(FlyArmorLegs, "Fly Leggings");
        LanguageRegistry.addName(FlyArmorBoot, "Fly Boots");
        LanguageRegistry.addName(FireArmorHelm, "Fire Helmet");
        LanguageRegistry.addName(FireArmorChest, "Fire Chestplate");
        LanguageRegistry.addName(FireArmorLegs, "Fire Leggings");
        LanguageRegistry.addName(FireArmorBoot, "Fire Boots");
        
        
        //Blocks//
        
        LanguageRegistry.addName(BenzoniteTable, "Storage Crate");
        LanguageRegistry.addName(RedOre, "Red Benzonite Ore");
        LanguageRegistry.addName(BlueOre, "Blue Benzonite Ore");
        LanguageRegistry.addName(GreenOre, "Green Benzonite Ore");
        LanguageRegistry.addName(OrangeOre, "Orange Benzonite Ore");
        LanguageRegistry.addName(RedBlock, "Red Benzonite Block");
        LanguageRegistry.addName(BlueBlock, "Blue Benzonite Block");
        LanguageRegistry.addName(GreenBlock, "Green Benzonite Block");
        LanguageRegistry.addName(OrangeBlock, "Orange Benzonite Block");
        LanguageRegistry.addName(MBlock, "Benzonite Multi-Lamp");
        LanguageRegistry.addName(RedGlow, "Red Benzonite Glow *WIP*");
        LanguageRegistry.addName(BlueGlow, "Blue Benzonite Glow *WIP*");
        LanguageRegistry.addName(GreenGlow, "Green Benzonite Glow *WIP*");
        LanguageRegistry.addName(OrangeGlow, "Orange Benzonite Glow *WIP*");
        LanguageRegistry.addName(BenzoniteStaff, "Benzonite Staff");
        
        LanguageRegistry.addName(BenzoniteGlass, "Benzonite Galss *WIP*");
       
        LanguageRegistry.addName(RedStone, "Red Benzonite Stone");
        LanguageRegistry.addName(BlueStone, "Blue Benzonite Stone");
        LanguageRegistry.addName(GreenStone, "Green Benzonite Stone");
        LanguageRegistry.addName(OrangeStone, "Orange Benzonite Stone");
       
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabBenzonite", "en_US", "Benzonite Items");

     
        
        ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(RedIngot), 0, 5, 5));
        ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(GreenIngot), 0, 1, 2));
        ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(OrangeIngot), 0, 5, 4));
        ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlueIngot), 0, 5, 3));
        ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(LifeSword), 0, 1, 1));
      
        ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Hammer), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Spade), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Axe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.BONUS_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Hoe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(RedIngot), 0, 5, 5));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(GreenIngot), 0, 1, 2));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(OrangeIngot), 0, 5, 4));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlueIngot), 0, 5, 3));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(LifeSword), 0, 1, 1));
 
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Hammer), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Spade), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Axe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Hoe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(RedIngot), 0, 5, 5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(GreenIngot), 0, 1, 2));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(OrangeIngot), 0, 5, 4));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlueIngot), 0, 5, 3));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(LifeSword), 0, 1, 1));

        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Hammer), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Spade), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Axe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Hoe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(RedIngot), 0, 5, 5));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(GreenIngot), 0, 1, 2));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(OrangeIngot), 0, 5, 4));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(BlueIngot), 0, 5, 3));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(LifeSword), 0, 1, 1));

        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Hammer), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Spade), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Axe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(Hoe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(RedIngot), 0, 5, 3));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(GreenIngot), 0, 1, 2));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(OrangeIngot), 0, 5, 4));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(BlueIngot), 0, 5, 3));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(LifeSword), 0, 1, 1));

        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(Hammer), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(Spade), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(Axe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(Hoe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(RedIngot), 0, 5, 5));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(GreenIngot), 0, 1, 2));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(OrangeIngot), 0, 5, 4));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlueIngot), 0, 5, 3));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(LifeSword), 0, 1, 1));

        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Hammer), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Spade), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Axe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Hoe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(RedIngot), 0, 5, 5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(GreenIngot), 0, 1, 2));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(OrangeIngot), 0, 5, 4));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(BlueIngot), 0, 5, 3));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(LifeSword), 0, 1, 1));

        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Hammer), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Spade), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Axe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Hoe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(RedIngot), 0, 5, 5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(GreenIngot), 0, 1, 2));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(OrangeIngot), 0, 5, 4));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(BlueIngot), 0, 5, 3));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(LifeSword), 0, 1, 1));

        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Hammer), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Spade), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Axe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(Hoe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(RedIngot), 0, 5, 5));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(GreenIngot), 0, 1, 2));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(OrangeIngot), 0, 5, 4));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(BlueIngot), 0, 5, 3));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(LifeSword), 0, 1, 1));
        
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Hammer), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Spade), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Axe), 0, 1, 1));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(Hoe), 0, 1, 1));
        
        
        RedIngot.setCreativeTab(this.tabBenzonite);
        BlueIngot.setCreativeTab(this.tabBenzonite);
        GreenIngot.setCreativeTab(this.tabBenzonite);
        OrangeIngot.setCreativeTab(this.tabBenzonite);
        RedBenzonitePickaxe.setCreativeTab(this.tabBenzonite);
        RedBenzoniteAxe.setCreativeTab(this.tabBenzonite);
        RedBenzoniteSpade.setCreativeTab(this.tabBenzonite);
        RedBenzoniteSword.setCreativeTab(this.tabBenzonite);
        RedBenzoniteHoe.setCreativeTab(this.tabBenzonite);
        OrangeBenzonitePickaxe.setCreativeTab(this.tabBenzonite);
        OrangeBenzoniteAxe.setCreativeTab(this.tabBenzonite);
        OrangeBenzoniteSword.setCreativeTab(this.tabBenzonite);
        OrangeBenzoniteSpade.setCreativeTab(this.tabBenzonite);
        OrangeBenzoniteHoe.setCreativeTab(this.tabBenzonite);
        GreenBenzonitePickaxe.setCreativeTab(this.tabBenzonite);
        GreenBenzoniteAxe.setCreativeTab(this.tabBenzonite);
        GreenBenzoniteSword.setCreativeTab(this.tabBenzonite);
        GreenBenzoniteSpade.setCreativeTab(this.tabBenzonite);
        GreenBenzoniteHoe.setCreativeTab(this.tabBenzonite);
        BlueBenzonitePickaxe.setCreativeTab(this.tabBenzonite);
        BlueBenzoniteAxe.setCreativeTab(this.tabBenzonite);
        BlueBenzoniteSword.setCreativeTab(this.tabBenzonite);
        BlueBenzoniteSpade.setCreativeTab(this.tabBenzonite);
        BlueBenzoniteHoe.setCreativeTab(this.tabBenzonite);
        RedCrystal.setCreativeTab(this.tabBenzonite);
        BlueCrystal.setCreativeTab(this.tabBenzonite);
        GreenCrystal.setCreativeTab(this.tabBenzonite);
        OrangeCrystal.setCreativeTab(this.tabBenzonite);
        LifeSword.setCreativeTab(this.tabBenzonite);
        ChocolateMilk.setCreativeTab(this.tabBenzonite);
        Hammer.setCreativeTab(this.tabBenzonite);
        Spade.setCreativeTab(this.tabBenzonite);
        Axe.setCreativeTab(this.tabBenzonite);
        Hoe.setCreativeTab(this.tabBenzonite);
        BenzoniteStaff.setCreativeTab(this.tabBenzonite);
        Gun.setCreativeTab(this.tabBenzonite);
        BenzoniteGlass.setCreativeTab(this.tabBenzonite);
        RedOre.setCreativeTab(this.tabBenzonite);
        BlueOre.setCreativeTab(this.tabBenzonite);
        GreenOre.setCreativeTab(this.tabBenzonite);
        OrangeOre.setCreativeTab(this.tabBenzonite);
        RedBlock.setCreativeTab(this.tabBenzonite);
        BlueBlock.setCreativeTab(this.tabBenzonite);
        GreenBlock.setCreativeTab(this.tabBenzonite);
        OrangeBlock.setCreativeTab(this.tabBenzonite);
        MBlock.setCreativeTab(this.tabBenzonite);
        RedGlow.setCreativeTab(this.tabBenzonite);
        BlueGlow.setCreativeTab(this.tabBenzonite);
        GreenGlow.setCreativeTab(this.tabBenzonite);
        OrangeGlow.setCreativeTab(this.tabBenzonite);
        RedBenzoniteHelm.setCreativeTab(this.tabBenzonite);
        RedBenzoniteChest.setCreativeTab(this.tabBenzonite);
        RedBenzoniteLeg.setCreativeTab(this.tabBenzonite);
        RedBenzoniteBoot.setCreativeTab(this.tabBenzonite);
        BlueBenzoniteHelm.setCreativeTab(this.tabBenzonite);
        BlueBenzoniteChest.setCreativeTab(this.tabBenzonite);
        BlueBenzoniteLeg.setCreativeTab(this.tabBenzonite);
        BlueBenzoniteBoot.setCreativeTab(this.tabBenzonite);
        GreenBenzoniteHelm.setCreativeTab(this.tabBenzonite);
        GreenBenzoniteChest.setCreativeTab(this.tabBenzonite);
        GreenBenzoniteLeg.setCreativeTab(this.tabBenzonite);
        GreenBenzoniteBoot.setCreativeTab(this.tabBenzonite);
        OrangeBenzoniteHelm.setCreativeTab(this.tabBenzonite);
        OrangeBenzoniteChest.setCreativeTab(this.tabBenzonite);
        OrangeBenzoniteLeg.setCreativeTab(this.tabBenzonite);
        OrangeBenzoniteBoot.setCreativeTab(this.tabBenzonite);
        Barrel.setCreativeTab(this.tabBenzonite);
        Stock.setCreativeTab(this.tabBenzonite);
        Trigger.setCreativeTab(this.tabBenzonite);
        Receiver.setCreativeTab(this.tabBenzonite);
        Houseing.setCreativeTab(this.tabBenzonite);
        Spring.setCreativeTab(this.tabBenzonite);
        Bullet.setCreativeTab(this.tabBenzonite);
        EnderBow.setCreativeTab(this.tabBenzonite);
        Fuel.setCreativeTab(this.tabBenzonite);
        TntStaff.setCreativeTab(this.tabBenzonite);
        RedShard.setCreativeTab(this.tabBenzonite);
        BlueShard.setCreativeTab(this.tabBenzonite);
        GreenShard.setCreativeTab(this.tabBenzonite);
        OrangeShard.setCreativeTab(this.tabBenzonite);
        RedFragment.setCreativeTab(this.tabBenzonite);
        BlueFragment.setCreativeTab(this.tabBenzonite);
        GreenFragment.setCreativeTab(this.tabBenzonite);
        OrangeFragment.setCreativeTab(this.tabBenzonite);
        RedStone.setCreativeTab(this.tabBenzonite);
        BlueStone.setCreativeTab(this.tabBenzonite);
        GreenStone.setCreativeTab(this.tabBenzonite);
        OrangeStone.setCreativeTab(this.tabBenzonite);
        BenzoniteLog.setCreativeTab(this.tabBenzonite);
        RedBow.setCreativeTab(this.tabBenzonite);
        BlueBow.setCreativeTab(this.tabBenzonite);
        GreenBow.setCreativeTab(this.tabBenzonite);
        OrangeBow.setCreativeTab(this.tabBenzonite);
        BowOfTheAir.setCreativeTab(this.tabBenzonite);
        BenzoniteStriker.setCreativeTab(this.tabBenzonite);
        BenzoniteTelaporter.setCreativeTab(this.tabBenzonite);
        BenzoniteDropper.setCreativeTab(this.tabBenzonite);
        FlyArmorHelm.setCreativeTab(this.tabBenzonite);
        FlyArmorChest.setCreativeTab(this.tabBenzonite);
        FlyArmorLegs.setCreativeTab(this.tabBenzonite);
        FlyArmorBoot.setCreativeTab(this.tabBenzonite);
        FireArmorHelm.setCreativeTab(this.tabBenzonite);
        FireArmorChest.setCreativeTab(this.tabBenzonite);
        FireArmorLegs.setCreativeTab(this.tabBenzonite);
        FireArmorBoot.setCreativeTab(this.tabBenzonite);
        BenzoniteTable.setCreativeTab(this.tabBenzonite);


        
       /** BenzoniteBucket.setCreativeTab(this.tabBenzonite);
        BenzoniteBucket_1.setCreativeTab(this.tabBenzonite);
        BenzoniteBucket_2.setCreativeTab(this.tabBenzonite);
        BenzoniteBucket_3.setCreativeTab(this.tabBenzonite);
        BenzoniteBucket_4.setCreativeTab(this.tabBenzonite);
        BenzoniteBucket_5.setCreativeTab(this.tabBenzonite);
        BenzoniteBucket_6.setCreativeTab(this.tabBenzonite);
        BenzoniteBucket_7.setCreativeTab(this.tabBenzonite);
        BenzoniteBucket_8.setCreativeTab(this.tabBenzonite);
        */
        AchievementPage.registerAchievementPage(page1);
        
  
        GameRegistry.registerFuelHandler(new MagaBenG.mod.BenzoniteMod.item.Fuel());
        GameRegistry.registerBlock(RedOre, "RedOre");
        GameRegistry.registerBlock(BlueOre, "BlueOre");
        GameRegistry.registerBlock(GreenOre, "GreenOre");
        GameRegistry.registerBlock(OrangeOre, "OrangeOre");
        GameRegistry.registerBlock(RedBlock, "RedBlock");
        GameRegistry.registerBlock(BlueBlock, "BlueBlock");
        GameRegistry.registerBlock(GreenBlock, "GreenBlock");
        GameRegistry.registerBlock(OrangeBlock, "OrangeBlock");
        GameRegistry.registerBlock(MBlock, "MBlock");
        GameRegistry.registerBlock(RedGlow, "RedGlow");
        GameRegistry.registerBlock(BlueGlow, "BlueGlow");
        GameRegistry.registerBlock(GreenGlow, "GreenGlow");
        GameRegistry.registerBlock(OrangeGlow, "OrangeGlow");
        GameRegistry.registerBlock(BenzoniteGlass, "BenzoniteGlass");
        GameRegistry.registerBlock(BenzoniteLog, "BenzoniteLog");
        GameRegistry.registerBlock(RedStone, "RedStone");
        GameRegistry.registerBlock(BlueStone, "BlueStone");
        GameRegistry.registerBlock(GreenStone, "GreenStone");
        GameRegistry.registerBlock(OrangeStone, "OrangeStone");
        GameRegistry.registerBlock(BenzoniteTable, "BenzoniteTable");
       
     
        
        
        
   
        
        GameRegistry.registerWorldGenerator(new BenzoniteModWorldGenerator());
        
        
        //Red//
        GameRegistry.addRecipe(new ItemStack(RedBenzonitePickaxe, 1), new Object[]
                               {
                                   "XXX", " O ", " O ", 'X', BenzoniteMod.RedIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(RedBenzoniteSpade, 1), new Object[]
                               {
                                   "X", "O", "O", 'X', BenzoniteMod.RedIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(RedBenzoniteSword, 1), new Object[]
                               {
                                   "X", "X", "O", 'X', BenzoniteMod.RedIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(RedBenzoniteHoe, 1), new Object[]
                               {
                                   "XX ", " O ", " O ", 'X', BenzoniteMod.RedIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(RedBenzoniteAxe, 1), new Object[]
                               {
                                   "XX ", "XO ", " O ", 'X', BenzoniteMod.RedIngot, 'O', Item.stick
                               });
        
        
        //Blue//
        GameRegistry.addRecipe(new ItemStack(BlueBenzonitePickaxe, 1), new Object[]
                               {
                                   "XXX", " O ", " O ", 'X', BenzoniteMod.BlueIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(BlueBenzoniteSpade, 1), new Object[]
                               {
                                   "X", "O", "O", 'X', BenzoniteMod.BlueIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(BlueBenzoniteSword, 1), new Object[]
                               {
                                   "X", "X", "O", 'X', BenzoniteMod.BlueIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(BlueBenzoniteHoe, 1), new Object[]
                               {
                                   "XX ", " O ", " O ", 'X', BenzoniteMod.BlueIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(BlueBenzoniteAxe, 1), new Object[]
                               {
                                   "XX ", "XO ", " O ", 'X', BenzoniteMod.BlueIngot, 'O', Item.stick
                               });
        
        
        //Green//
        GameRegistry.addRecipe(new ItemStack(GreenBenzonitePickaxe, 1), new Object[]
                               {
                                   "XXX", " O ", " O ", 'X', BenzoniteMod.GreenIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(GreenBenzoniteSpade, 1), new Object[]
                               {
                                   "X", "O", "O", 'X', BenzoniteMod.GreenIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(GreenBenzoniteSword, 1), new Object[]
                               {
                                   "X", "X", "O", 'X', BenzoniteMod.GreenIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(GreenBenzoniteHoe, 1), new Object[]
                               {
                                   "XX ", " O ", " O ", 'X', BenzoniteMod.GreenIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(GreenBenzoniteAxe, 1), new Object[]
                               {
                                   "XX ", "XO ", " O ", 'X', BenzoniteMod.GreenIngot, 'O', Item.stick
                               });
        
        
        //Orange//
        GameRegistry.addRecipe(new ItemStack(OrangeBenzonitePickaxe, 1), new Object[]
                               {
                                   "XXX", " O ", " O ", 'X', BenzoniteMod.OrangeIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeBenzoniteSpade, 1), new Object[]
                               {
                                   "X", "O", "O", 'X', BenzoniteMod.OrangeIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeBenzoniteSword, 1), new Object[]
                               {
                                   "X", "X", "O", 'X', BenzoniteMod.OrangeIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeBenzoniteHoe, 1), new Object[]
                               {
                                   "XX ", " O ", " O ", 'X', BenzoniteMod.OrangeIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeBenzoniteAxe, 1), new Object[]
                               {
                                   "XX ", "XO ", " O ", 'X', BenzoniteMod.OrangeIngot, 'O', Item.stick
                               });
        
        
        //Crystal//
        GameRegistry.addRecipe(new ItemStack(RedCrystal, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'X', Item.bucketLava, 'O', Block.blockRedstone, 'Z', Item.diamond
                               });
        GameRegistry.addRecipe(new ItemStack(BlueCrystal, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'X', Block.blockLapis, 'O', Item.bucketWater, 'Z', Item.diamond
                               });
        GameRegistry.addRecipe(new ItemStack(GreenCrystal, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'X', Block.cobblestoneMossy, 'O', Block.melon, 'Z', Item.diamond
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeCrystal, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'X', Item.blazeRod, 'O', Block.pumpkin, 'Z', Item.diamond
                               });
        GameRegistry.addRecipe(new ItemStack(RedCrystal, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'O', Item.bucketLava, 'X', Block.blockRedstone, 'Z', Item.diamond
                               });
        GameRegistry.addRecipe(new ItemStack(BlueCrystal, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'O', Block.blockLapis, 'X', Item.bucketWater, 'Z', Item.diamond
                               });
        GameRegistry.addRecipe(new ItemStack(GreenCrystal, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'O', Block.cobblestoneMossy, 'X', Block.melon, 'Z', Item.diamond
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeCrystal, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'O', Item.blazeRod, 'X', Block.pumpkin, 'Z', Item.diamond
                               });
        
        
        //Ingot//
        GameRegistry.addRecipe(new ItemStack(RedIngot, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'X', BenzoniteMod.RedCrystal, 'O', Block.obsidian, 'Z', Block.blockDiamond
                               });
        GameRegistry.addRecipe(new ItemStack(BlueIngot, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'X', BenzoniteMod.BlueCrystal, 'O', Block.obsidian, 'Z', Block.blockDiamond
                               });
        GameRegistry.addRecipe(new ItemStack(GreenIngot, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'X', BenzoniteMod.GreenCrystal, 'O', Block.obsidian, 'Z', Block.blockDiamond
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeIngot, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'X', BenzoniteMod.OrangeCrystal, 'O', Block.obsidian, 'Z', Block.blockDiamond
                               });
        GameRegistry.addRecipe(new ItemStack(RedIngot, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'O', BenzoniteMod.RedCrystal, 'X', Block.obsidian, 'Z', Block.blockDiamond
                               });
        GameRegistry.addRecipe(new ItemStack(BlueIngot, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'O', BenzoniteMod.BlueCrystal, 'X', Block.obsidian, 'Z', Block.blockDiamond
                               });
        GameRegistry.addRecipe(new ItemStack(GreenIngot, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'O', BenzoniteMod.GreenCrystal, 'X', Block.obsidian, 'Z', Block.blockDiamond
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeIngot, 4), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'O', BenzoniteMod.OrangeCrystal, 'X', Block.obsidian, 'Z', Block.blockDiamond
                               });
        
        
        //Blocks//
        GameRegistry.addRecipe(new ItemStack(RedBlock, 1), new Object[]
                               {
                                   "XXX", "XXX", "XXX", 'X', BenzoniteMod.RedIngot
                               });
        GameRegistry.addRecipe(new ItemStack(BlueBlock, 1), new Object[]
                               {
                                   "XXX", "XXX", "XXX", 'X', BenzoniteMod.BlueIngot
                               });
        GameRegistry.addRecipe(new ItemStack(GreenBlock, 1), new Object[]
                               {
                                   "XXX", "XXX", "XXX", 'X', BenzoniteMod.GreenIngot
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeBlock, 1), new Object[]
                               {
                                   "XXX", "XXX", "XXX", 'X', BenzoniteMod.OrangeIngot
                               });
        
        
        //Ingot-From-Blocks//
        GameRegistry.addRecipe(new ItemStack(RedIngot, 9), new Object[]
                               {
                                   "X", 'X', BenzoniteMod.RedBlock
                               });
        GameRegistry.addRecipe(new ItemStack(BlueIngot, 9), new Object[]
                               {
                                   "X", 'X', BenzoniteMod.BlueBlock
                               });
        GameRegistry.addRecipe(new ItemStack(GreenIngot, 9), new Object[]
                               {
                                   "X", 'X', BenzoniteMod.GreenBlock
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeIngot, 9), new Object[]
                               {
                                   "X", 'X', BenzoniteMod.OrangeBlock
                               });
        
        
        //GlowBlock//
        GameRegistry.addRecipe(new ItemStack(RedGlow, 1), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'X', BenzoniteMod.RedIngot, 'O', Item.stick, 'Z', Block.glowStone
                               });
        GameRegistry.addRecipe(new ItemStack(BlueGlow, 1), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'X', BenzoniteMod.BlueIngot, 'O', Item.stick, 'Z', Block.glowStone
                               });
        GameRegistry.addRecipe(new ItemStack(GreenGlow, 1), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'X', BenzoniteMod.GreenIngot, 'O', Item.stick, 'Z', Block.glowStone
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeGlow, 1), new Object[]
                               {
                                   "XOX", "OZO", "XOX", 'X', BenzoniteMod.OrangeIngot, 'O', Item.stick, 'Z', Block.glowStone
                               });
        GameRegistry.addRecipe(new ItemStack(MBlock, 4), new Object[]
                               {
                                   "XOW", "OGO", "ZOP", 'X', BenzoniteMod.OrangeGlow, 'W', BenzoniteMod.GreenGlow, 'Z', BenzoniteMod.BlueGlow, 'P', BenzoniteMod.RedGlow, 'O', Item.redstone, 'G', Item.diamond
                               });
        
        
        //MBlock//
        GameRegistry.addRecipe(new ItemStack(MBlock, 9), new Object[]
                               {
                                   "XOX", "OXO", "XOX", 'X', BenzoniteMod.RedIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(MBlock, 9), new Object[]
                               {
                                   "XOX", "OXO", "XOX", 'X', BenzoniteMod.BlueIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(MBlock, 9), new Object[]
                               {
                                   "XOX", "OXO", "XOX", 'X', BenzoniteMod.GreenIngot, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(MBlock, 9), new Object[]
                               {
                                   "XOX", "OXO", "XOX", 'X', BenzoniteMod.OrangeIngot, 'O', Item.stick
                               });
        
        
        //RandomStuff//
     
                 
        GameRegistry.addRecipe(new ItemStack(ChocolateMilk, 1), new Object[]
                               {
                                   "O", "X", 'O', Item.sugar, 'X', Item.bucketMilk
                               });
        GameRegistry.addRecipe(new ItemStack(Fuel, 16), new Object[]
                               {
                                   "XXX", "XOX", "XXX", 'O', Item.fireballCharge, 'X', Item.coal
                               });
        
        
        //armor//
        GameRegistry.addRecipe(new ItemStack(RedBenzoniteHelm, 1), new Object[]
                               {
                                   "XXX", "X X", 'X', BenzoniteMod.RedIngot
                               });
        GameRegistry.addRecipe(new ItemStack(RedBenzoniteChest, 1), new Object[]
                               {
                                   "X X", "XXX", "XXX", 'X', BenzoniteMod.RedIngot
                               });
        GameRegistry.addRecipe(new ItemStack(RedBenzoniteLeg, 1), new Object[]
                               {
                                   "XXX", "X X", "X X", 'X', BenzoniteMod.RedIngot
                               });
        GameRegistry.addRecipe(new ItemStack(RedBenzoniteBoot, 1), new Object[]
                               {
                                   "X X", "X X", 'X', BenzoniteMod.RedIngot
                               });
        GameRegistry.addRecipe(new ItemStack(BlueBenzoniteHelm, 1), new Object[]
                               {
                                   "XXX", "X X", 'X', BenzoniteMod.BlueIngot
                               });
        GameRegistry.addRecipe(new ItemStack(BlueBenzoniteChest, 1), new Object[]
                               {
                                   "X X", "XXX", "XXX", 'X', BenzoniteMod.BlueIngot
                               });
        GameRegistry.addRecipe(new ItemStack(BlueBenzoniteLeg, 1), new Object[]
                               {
                                   "XXX", "X X", "X X", 'X', BenzoniteMod.BlueIngot
                               });
        GameRegistry.addRecipe(new ItemStack(BlueBenzoniteBoot, 1), new Object[]
                               {
                                   "X X", "X X", 'X', BenzoniteMod.BlueIngot
                               });
        GameRegistry.addRecipe(new ItemStack(GreenBenzoniteHelm, 1), new Object[]
                               {
                                   "XXX", "X X", 'X', BenzoniteMod.GreenIngot
                               });
        GameRegistry.addRecipe(new ItemStack(GreenBenzoniteChest, 1), new Object[]
                               {
                                   "X X", "XXX", "XXX", 'X', BenzoniteMod.GreenIngot
                               });
        GameRegistry.addRecipe(new ItemStack(GreenBenzoniteLeg, 1), new Object[]
                               {
                                   "XXX", "X X", "X X", 'X', BenzoniteMod.GreenIngot
                               });
        GameRegistry.addRecipe(new ItemStack(GreenBenzoniteBoot, 1), new Object[]
                               {
                                   "X X", "X X", 'X', BenzoniteMod.GreenIngot
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeBenzoniteHelm, 1), new Object[]
                               {
                                   "XXX", "X X", 'X', BenzoniteMod.OrangeIngot
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeBenzoniteChest, 1), new Object[]
                               {
                                   "X X", "XXX", "XXX", 'X', BenzoniteMod.OrangeIngot
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeBenzoniteLeg, 1), new Object[]
                               {
                                   "XXX", "X X", "X X", 'X', BenzoniteMod.OrangeIngot
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeBenzoniteBoot, 1), new Object[]
                               {
                                   "X X", "X X", 'X', BenzoniteMod.OrangeIngot
                               });
        
        
        //staff//
        GameRegistry.addRecipe(new ItemStack(BenzoniteStaff, 1), new Object[]
                               {
                                   " XX", " OX", "O  ", 'X', Item.emerald, 'O', Item.stick
                               });
        GameRegistry.addRecipe(new ItemStack(EnderBow, 1), new Object[]
                               {
                                   " XX", " OX", "O  ", 'X', Item.enderPearl, 'O', Item.diamond
                               });
        
        
//Gun//
        GameRegistry.addRecipe(new ItemStack(Gun, 1), new Object[]
                               {
                                   "YXZ", " OM", "  W", 'X', BenzoniteMod.Spring, 'O', BenzoniteMod.Trigger, 'Z', BenzoniteMod.Houseing, 'Y', BenzoniteMod.Barrel, 'W', BenzoniteMod.Stock, 'M', BenzoniteMod.Receiver
                               });
        GameRegistry.addRecipe(new ItemStack(Barrel, 1), new Object[]
                               {
                                   "XXX", "X X", "XXX", 'X', Item.ingotIron
                               });
        GameRegistry.addRecipe(new ItemStack(Stock, 1), new Object[]
                               {
                                   " XX", " XY", " XX", 'Y', Item.ingotIron, 'X', Block.planks
                               });
        GameRegistry.addRecipe(new ItemStack(Trigger, 1), new Object[]
                               {
                                   " XX", "  X", "  X", 'X', Item.ingotIron
                               });
        GameRegistry.addRecipe(new ItemStack(Spring, 1), new Object[]
                               {
                                   " XX", "XXX", "XX ", 'X', Item.ingotIron
                               });
        GameRegistry.addRecipe(new ItemStack(Receiver, 1), new Object[]
                               {
                                   " XX", " XX", 'X', Item.ingotIron
                               });
        GameRegistry.addRecipe(new ItemStack(Houseing, 1), new Object[]
                               {
                                   "XXX", "  X", "XXX", 'X', Item.ingotIron
                               });
        GameRegistry.addRecipe(new ItemStack(Bullet, 16), new Object[]
                               {
                                   "X", "Z", "Y", 'X', Item.ingotGold, 'Z', Item.gunpowder, 'Y', Item.ingotIron
                               });
        
        
        //Fragments//
        GameRegistry.addRecipe(new ItemStack(RedFragment, 9), new Object[]
                               {
                                   "XXX", "XXX", "XXX", 'X', BenzoniteMod.RedShard
                               });
        GameRegistry.addRecipe(new ItemStack(BlueFragment, 9), new Object[]
                               {
                                   "XXX", "XXX", "XXX", 'X', BenzoniteMod.BlueShard
                               });
        GameRegistry.addRecipe(new ItemStack(GreenFragment, 9), new Object[]
                               {
                                   "XXX", "XXX", "XXX", 'X', BenzoniteMod.GreenShard
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeFragment, 9), new Object[]
                               {
                                   "XXX", "XXX", "XXX", 'X', BenzoniteMod.OrangeShard
                               });
        //chest//
        
        
        //Benzonite-Stone//
        GameRegistry.addRecipe(new ItemStack(RedStone, 1), new Object[]
                               {
                                   "XXX", "XXX", "XXX", 'X', BenzoniteMod.RedFragment
                               });
        GameRegistry.addRecipe(new ItemStack(BlueStone, 1), new Object[]
                               {
                                   "XXX", "XXX", "XXX", 'X', BenzoniteMod.BlueFragment
                               });
        GameRegistry.addRecipe(new ItemStack(GreenStone, 1), new Object[]
                               {
                                   "XXX", "XXX", "XXX", 'X', BenzoniteMod.GreenFragment
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeStone, 1), new Object[]
                               {
                                   "XXX", "XXX", "XXX", 'X', BenzoniteMod.OrangeFragment
                               });
        
        
//Bows//
        GameRegistry.addRecipe(new ItemStack(RedBow, 1), new Object[]
                               {
                                   " XY", "X Y", " XY", 'X', BenzoniteMod.RedIngot, 'Y', Item.silk
                               });
        GameRegistry.addRecipe(new ItemStack(BlueBow, 1), new Object[]
                               {
                                   " XY", "X Y", " XY", 'X', BenzoniteMod.BlueIngot, 'Y', Item.silk
                               });
        GameRegistry.addRecipe(new ItemStack(GreenBow, 1), new Object[]
                               {
                                   " XY", "X Y", " XY", 'X', BenzoniteMod.GreenIngot, 'Y', Item.silk
                               });
        GameRegistry.addRecipe(new ItemStack(OrangeBow, 1), new Object[]
                               {
                                   " XY", "X Y", " XY", 'X', BenzoniteMod.OrangeIngot, 'Y', Item.silk
                               });
        
        
//staff-sword//
        GameRegistry.addRecipe(new ItemStack(BenzoniteStriker, 1), new Object[]
                               {
                                   "X", "Y", 'X', BenzoniteMod.LifeSword, 'Y', BenzoniteMod.BenzoniteStaff
                               });
        GameRegistry.addRecipe(new ItemStack(BenzoniteDropper, 1), new Object[]
                               {
                                   "X", "Y", 'X', BenzoniteMod.LifeSword, 'Y', BenzoniteMod.TntStaff
                               });
        GameRegistry.addRecipe(new ItemStack(BenzoniteTelaporter, 1), new Object[]
                               {
                                   "X", "Y", 'X', BenzoniteMod.LifeSword, 'Y', BenzoniteMod.EnderBow
                               });
        
//crate//
        GameRegistry.addRecipe(new ItemStack(BenzoniteTable, 1), new Object[]
                               {
                                   "XYX", "Y Y", "XYX", 'X', Item.stick, 'Y', Block.woodSingleSlab
                               });
        
       //Ore To Ingot//
        
        GameRegistry.addSmelting(BenzoniteMod.RedOre.blockID, new ItemStack(this.RedIngot), 5.0F);
        GameRegistry.addSmelting(BenzoniteMod.BlueOre.blockID, new ItemStack(this.BlueIngot), 5.0F);
        GameRegistry.addSmelting(BenzoniteMod.GreenOre.blockID, new ItemStack(this.GreenIngot), 5.0F);
        GameRegistry.addSmelting(BenzoniteMod.OrangeOre.blockID, new ItemStack(this.OrangeIngot), 5.0F);
        
        GameRegistry.registerTileEntity(TileEntityTutBox.class, "tileEntityTutBox");
        
        {
        	 
        }
      
    }
}