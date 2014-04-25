package democretes.handlers;

import WayofTime.alchemicalWizardry.api.altarRecipeRegistry.AltarRecipeRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;
import thaumcraft.api.ItemApi;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.wands.WandCap;
import thaumcraft.api.wands.WandRod;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;
import thaumcraft.common.items.wands.ItemWandCasting;
import thermalexpansion.block.TEBlocks;
import thermalexpansion.block.energycell.BlockEnergyCell;
import thermalexpansion.item.TEItems;
import cpw.mods.fml.common.registry.GameRegistry;
import democretes.blocks.TMBlocks;
import democretes.items.TMItems;

public class CraftingHandler {
	

	
	public static void initThaumcraftRecipes() {
		
		//Infusion Recipes
		ResearchHandler.recipes.put("NodeGenerator", ThaumcraftApi.addInfusionCraftingRecipe("NODEGENERATOR", new ItemStack(TMBlocks.nodeGenerator, 1, 0), 20, 
				new AspectList().add(Aspect.AURA, 75).add(Aspect.ENERGY, 75).add(Aspect.TAINT, 75).add(Aspect.MAGIC, 75), new ItemStack(TMBlocks.nodeDynamo, 1, 0), 
				new ItemStack[] { new ItemStack(TMItems.itemMaterial, 1, 1), new ItemStack(Block.blockDiamond), new ItemStack((ItemApi.getBlock("blockCosmeticSolid", 4)).itemID, 1, 4), new ItemStack((ItemApi.getBlock("blockCosmeticSolid", 4)).itemID, 1, 4), new ItemStack(TMBlocks.essentiaContainer, 1, 0), new ItemStack(TMBlocks.essentiaContainer, 1, 0), new ItemStack(TEBlocks.blockEnergyCell, 1, 3)}));
		ResearchHandler.recipes.put("FluxLamp", ThaumcraftApi.addInfusionCraftingRecipe("FLUXLAMP", new ItemStack(TMBlocks.fluxLamp), 10,
				new AspectList().add(Aspect.MECHANISM,  45).add(Aspect.TAINT, 45).add(Aspect.ORDER, 45).add(Aspect.LIGHT, 45), new ItemStack((ItemApi.getBlock("blockMetalDevice", 7)).itemID, 1, 7),
				new ItemStack[] { new ItemStack((ItemApi.getItem("itemShard", 4)).itemID, 1, 4), new ItemStack((ItemApi.getItem("itemShard", 4)).itemID, 1, 4), new ItemStack(Item.bucketEmpty), new ItemStack(Item.bucketEmpty), new ItemStack(Item.emerald), new ItemStack(Item.emerald)}));
		ResearchHandler.recipes.put("EnergizedWandRod", ThaumcraftApi.addInfusionCraftingRecipe("ENERGIZEDWAND", new ItemStack(TMItems.itemWandCores, 1, 0), 25,
				new AspectList().add(Aspect.ENERGY, 50).add(Aspect.TOOL, 50).add(Aspect.MAGIC, 50).add(Aspect.MECHANISM, 50).add(Aspect.EXCHANGE, 50), new ItemStack(ConfigItems.itemWandRod, 1, 1),
				new ItemStack[] { new ItemStack((TEItems.capacitorResonant).itemID, 1, 4), new ItemStack((TEItems.powerCoilElectrum).itemID, 1, 193), new ItemStack((TEItems.powerCoilSilver).itemID, 1, 194), new ItemStack((TEItems.powerCoilGold).itemID, 1, 195), new ItemStack(TMItems.itemMaterial, 1, 1) }));
		//Arcane Recipes
		ResearchHandler.recipes.put("QuantumGlass", ThaumcraftApi.addArcaneCraftingRecipe("QUANTUMJARS", new ItemStack(TMBlocks.cosmeticOpaque, 4, 0), new AspectList().add(Aspect.ORDER, 5).add(Aspect.FIRE, 5), 
			new Object[] { "GG", "GG", 
			'G', new ItemStack(Block.glass)		}));
		ResearchHandler.recipes.put("QuantumJar", ThaumcraftApi.addArcaneCraftingRecipe("QUANTUMJARS", new ItemStack(TMBlocks.essentiaContainer, 1, 0), new AspectList().add(Aspect.ORDER, 15).add(Aspect.WATER, 10),
			new Object[] { "QNQ", "Q Q", "QQQ",
			'Q', new ItemStack(TMBlocks.cosmeticOpaque),
			'N', new ItemStack(TMItems.itemMaterial, 0)		}));
		ResearchHandler.recipes.put("NodeDynamo", ThaumcraftApi.addArcaneCraftingRecipe("DYNAMO", new ItemStack(TMBlocks.nodeDynamo, 1, 0), new AspectList().add(Aspect.EARTH, 5).add(Aspect.ORDER, 25).add(Aspect.FIRE, 15).add(Aspect.ENTROPY, 10),
				new Object[] {" C ", "GIG", "IRI",
				'C', new ItemStack(TMItems.itemMaterial, 1, 1),
				'G', new ItemStack(TMItems.itemMaterial, 1, 2),
				'I', new ItemStack(TMItems.itemMaterial, 0),
				'R', new ItemStack(Item.redstone)				}));
		ResearchHandler.recipes.put("EssentiaDynamo", ThaumcraftApi.addArcaneCraftingRecipe("DYNAMO", new ItemStack(TMBlocks.essentiaDynamo, 1, 0), new AspectList().add(Aspect.WATER, 15).add(Aspect.ORDER, 10).add(Aspect.FIRE, 5).add(Aspect.ENTROPY, 25),
				new Object[] {" C ", "GIG", "IWI",
				'W', new ItemStack((ItemApi.getBlock("blockJar", 0)).itemID, 1, 0),
				'C', new ItemStack(TMItems.itemMaterial, 1, 1),
				'G', new ItemStack(TMItems.itemMaterial, 1, 2),
				'I', new ItemStack((ItemApi.getBlock("blockTube", 0)).itemID, 1, 0),				}));	
		ResearchHandler.recipes.put("BiomeMorpher", ThaumcraftApi.addArcaneCraftingRecipe("BIOMEMORPHER", new ItemStack(TMBlocks.biomeMorpher), new AspectList().add(Aspect.EARTH, 30).add(Aspect.ORDER, 30).add(Aspect.WATER, 30), 
				new Object[] {" E ", "TOB", "GCG",
				'E', new ItemStack(Item.emerald),
				'T', new ItemStack((ItemApi.getItem("itemResource", 11)).itemID, 1, 11),
				'O', new ItemStack((ItemApi.getBlock("blockCosmeticSolid", 0)).itemID, 1, 0),
				'B', new ItemStack((ItemApi.getBlock("blockCustomPlant", 4)).itemID, 1, 4),
				'G', new ItemStack(TMItems.itemMaterial, 1, 2),
				'C', new ItemStack(TMItems.itemMaterial, 1, 1)		}));
		ResearchHandler.recipes.put("TeslaCoil", ThaumcraftApi.addArcaneCraftingRecipe("TESLACOIL", new ItemStack(TMBlocks.teslaCoil), new AspectList().add(Aspect.WATER, 20).add(Aspect.ORDER, 20).add(Aspect.ENTROPY, 20).add(Aspect.AIR, 20).add(Aspect.FIRE, 20).add(Aspect.EARTH, 20),
				new Object[] {" N ", " C ", "TBT",
				'N', new ItemStack(TMItems.itemMaterial, 1, 0),
				'C', new ItemStack(TMItems.itemMaterial, 1, 1),
				'T', new ItemStack((ItemApi.getItem("itemResource", 2)).itemID, 1, 2),
				'B', new ItemStack((ItemApi.getBlock("blockTube", 4)).itemID, 1, 4)		}));
		ResearchHandler.recipes.put("CoilCoupler", ThaumcraftApi.addArcaneCraftingRecipe("TESLACOIL", new ItemStack(TMItems.itemMaterial, 1, 4), new AspectList().add(Aspect.AIR, 10).add(Aspect.ORDER, 15),
				new Object[] {" C ", " T ", " S ",
				'C', new ItemStack(TMItems.itemMaterial, 1, 1),
				'T', new ItemStack((ItemApi.getItem("itemResource", 2)).itemID, 1, 2),
				'S', new ItemStack(Item.stick)	}));
		ResearchHandler.recipes.put("ElectricBellows", ThaumcraftApi.addArcaneCraftingRecipe("ELECTRICBELLOWS", new ItemStack(TMBlocks.electricBellows, 1, 0), new AspectList().add(Aspect.AIR, 30).add(Aspect.ORDER, 30).add(Aspect.FIRE, 30),
				new Object[] {"TG ", "EBC", "TG ",
				'T', new ItemStack((ItemApi.getItem("itemResource", 2)).itemID, 1, 2),
				'G', new ItemStack(TMItems.itemMaterial, 1, 2),
				'E', new ItemStack(TEBlocks.blockEnergyCell, 1, 2),
				'B', new ItemStack(ConfigBlocks.blockWoodenDevice, 1, 0),
				'C', new ItemStack(TMItems.itemMaterial, 1, 1)				}));
		//Crucible Recipes
		ResearchHandler.recipes.put("NeutronizedMetal", ThaumcraftApi.addCrucibleRecipe("THAUMIUM",	new ItemStack(TMItems.itemMaterial, 1, 0), new ItemStack((ItemApi.getItem("itemResource", 2)).itemID, 1, 2), new AspectList().add(Aspect.ORDER, 2).add(Aspect.ENERGY, 2)));
		
		//Crafting Recipes
		ResearchHandler.recipes.put("MagicCoil", GameRegistry.addShapedRecipe(new ItemStack(TMItems.itemMaterial, 1, 1), 
			new Object[] {"  N", " T ", "N  ", 
			'N', new ItemStack(Item.redstone), 
			'T', new ItemStack((ItemApi.getItem("itemResource",2)).itemID, 1, 2)	}));
		ResearchHandler.recipes.put("NeutronizedGear", GameRegistry.addShapedRecipe(new ItemStack(TMItems.itemMaterial, 1, 2), 
			new Object[] {" T ", "TIT", " T ",
			'T', new ItemStack(TMItems.itemMaterial, 0),
			'I', new ItemStack(Item.ingotIron)	}));
		ResearchHandler.recipes.put("PenCore", oreDictRecipe(new ItemStack(TMItems.itemMaterial, 1, 3), 
			new Object[] {" NI", "NIN", "IN ",
			Character.valueOf('N'), "nuggetIron",
			Character.valueOf('I'), "dyeBlack"		}));
		ResearchHandler.recipes.put("Pen", GameRegistry.addShapedRecipe(new ItemStack(TMItems.itemPen, 1), 
			new Object[] {			" IC", "IPI", "NI ",
			'I', new ItemStack(Item.ingotIron),
			'C', new ItemStack((ItemApi.getItem("itemWandCap", 0).itemID), 1, 0),
			'P', new ItemStack(TMItems.itemMaterial, 1, 3),
			'N', new ItemStack(Item.goldNugget)		}));	
		
		//Wand Recipes
		ItemStack electric = ItemApi.getItem("itemWandCasting", 72);
		((ItemWandCasting)electric.getItem()).setCap(electric, (WandCap)WandCap.caps.get("thaumium"));
		((ItemWandCasting)electric.getItem()).setRod(electric, (WandRod)WandRod.rods.get("electric"));
		ThaumcraftApi.addArcaneCraftingRecipe("ENERGIZEDWAND", electric, new AspectList().add(Aspect.AIR, 60).add(Aspect.ORDER, 60).add(Aspect.EARTH, 60).add(Aspect.FIRE, 60).add(Aspect.WATER, 60).add(Aspect.ENTROPY, 60), 
			new Object[]{"  C", " R ", "C  ", 
			Character.valueOf('C'), ((WandCap)WandCap.caps.get("thaumium")).getItem(), 
			Character.valueOf('R'), ((WandRod)WandRod.rods.get("electric")).getItem()		});
	}
	
	public static void initBloodMagicRecipes() {
		AltarRecipeRegistry.registerAltarRecipe(new ItemStack(TMBlocks.bloodDynamo), new ItemStack(TEBlocks.blockDynamo), 1, 5000, 10, 10, true);
	}
	
	static IRecipe oreDictRecipe(ItemStack res, Object[] params) {
		IRecipe rec = new ShapedOreRecipe(res, params);
		CraftingManager.getInstance().getRecipeList().add(rec);
		return rec;
	}
	
}