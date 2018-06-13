package kerbinfiber.hydroponicsmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "hydromod", name = "Hydroponics Mod",  version = "1.0")
public class HydroponicsMod {
	
		//Items
	
		public static Item hydroTray;
		public static Item seedPack;
		public static Item banana;
		public static Item bluespaceBanana;
		public static Item plantDisk;
		public static Item plantBag;
		public static Item nutrimentBottle;
		
		//Item Health
		
		public static final Item.ToolMaterial bottleCapacity = EnumHelper.addToolMaterial("bottleCapacity", 0, 5, 0.0F, 0.0F, 0);
		
		//Blocks
		
		public static Block dnaScanner;
		public static Block seedExtractor;
	
		@EventHandler
		public void preInit(FMLPreInitializationEvent event)	// Item & Block Initialization and Registering | Configuration Handling
		{
			//Items
			
			hydroTray = new HydroTray().setUnlocalizedName("HydroTray").setTextureName("hydromod:hydroponicstray").setCreativeTab(tabHydroponicsMod);
			seedPack = new SeedPack().setUnlocalizedName("SeedPack").setTextureName("hydromod:seedpack").setCreativeTab(tabHydroponicsMod);
			plantDisk = new PlantDisk().setUnlocalizedName("PlantDisk").setTextureName("hydromod:plantdisk").setCreativeTab(tabHydroponicsMod);
			plantBag = new PlantBag().setUnlocalizedName("PlantBag").setTextureName("hydromod:plantbag").setCreativeTab(tabHydroponicsMod);
			nutrimentBottle = new NutrimentBottle().setUnlocalizedName("NutrimentBottle").setTextureName("hydromod:nutribottle").setCreativeTab(tabHydroponicsMod);
			
			//Food
			
			banana = new ItemFood(5, 0.5F, false).setUnlocalizedName("Banana").setTextureName("hydromod:banana").setCreativeTab(tabHydroponicsMod);
			bluespaceBanana = new ItemFood(2, 0.2F, false).setUnlocalizedName("BluespaceBanana").setTextureName("hydromod:bluespacebanana").setCreativeTab(tabHydroponicsMod);
			
			//Blocks
			
			dnaScanner = new DnaScanner(Material.iron).setBlockName("DnaScanner").setBlockTextureName("hydromod:dnascanner").setCreativeTab(tabHydroponicsMod);
			seedExtractor = new SeedExtractor(Material.iron).setBlockName("SeedExtractor").setBlockTextureName("hydromod:seedextractor").setCreativeTab(tabHydroponicsMod);
			
			//------------------------------
			
			//Items
			
			GameRegistry.registerItem(hydroTray, hydroTray.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(seedPack, seedPack.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(plantDisk, plantDisk.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(plantBag, plantBag.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(nutrimentBottle, nutrimentBottle.getUnlocalizedName().substring(5));
			
			//Food
			
			GameRegistry.registerItem(banana, banana.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(bluespaceBanana, bluespaceBanana.getUnlocalizedName().substring(5));
			
			//Blocks
			
			GameRegistry.registerBlock(dnaScanner, dnaScanner.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(seedExtractor, seedExtractor.getUnlocalizedName().substring(5));
			System.out.println(dnaScanner.getUnlocalizedName().substring(5));
			System.out.println(seedExtractor.getUnlocalizedName().substring(5));
			
		}
		
		@EventHandler
		public void init(FMLInitializationEvent event)	// Proxy, TileEntity, Entity, GUI and Packet Registering
		{
			//Item Recipes
			GameRegistry.addRecipe(new ItemStack(dnaScanner), new Object[]{"ICI","III"," R ", 'I', Items.iron_ingot, 'C', Items.cauldron, 'R', Items.redstone});
			
			//Block Recipes
			
			
		}
		
		@EventHandler
		public void postInit(FMLPostInitializationEvent event)
		{
			
			
			
		}
		
		public static CreativeTabs tabHydroponicsMod = new CreativeTabs("tabHydroponicsMod")
		{

			@Override
			public Item getTabIconItem() 
			{
				return new ItemStack(bluespaceBanana).getItem();
			}
			
			
		};
		
}
