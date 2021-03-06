package democretes.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import democretes.blocks.dynamos.BlockBloodDynamo;
import democretes.blocks.dynamos.BlockEssentiaDynamo;
import democretes.blocks.dynamos.BlockFlowerDynamo;
import democretes.blocks.dynamos.BlockNodeDynamo;
import democretes.blocks.dynamos.tiles.TileBloodDynamo;
import democretes.blocks.dynamos.tiles.TileEssentiaDynamo;
import democretes.blocks.dynamos.tiles.TileFlowerDynamo;
import democretes.blocks.dynamos.tiles.TileNodeDynamo;
import democretes.blocks.machines.BlockBiomeMorpher;
import democretes.blocks.machines.BlockBloodFabricator;
import democretes.blocks.machines.BlockCondenser;
import democretes.blocks.machines.BlockElectricBellows;
import democretes.blocks.machines.BlockFluxLamp;
import democretes.blocks.machines.BlockManaFabricator;
import democretes.blocks.machines.BlockNodeGenerator;
import democretes.blocks.machines.BlockProcessor;
import democretes.blocks.machines.BlockReconstructor;
import democretes.blocks.machines.BlockTeslaCoil;
import democretes.blocks.machines.tiles.TileBMProcessor;
import democretes.blocks.machines.tiles.TileBOProcessor;
import democretes.blocks.machines.tiles.TileBiomeMorpher;
import democretes.blocks.machines.tiles.TileBloodFabricator;
import democretes.blocks.machines.tiles.TileCondenser;
import democretes.blocks.machines.tiles.TileElectricBellows;
import democretes.blocks.machines.tiles.TileFluxLamp;
import democretes.blocks.machines.tiles.TileManaFabricator;
import democretes.blocks.machines.tiles.TileNodeGenerator;
import democretes.blocks.machines.tiles.TileReconstructor;
import democretes.blocks.machines.tiles.TileTCProcessor;
import democretes.blocks.machines.tiles.TileTeslaCoil;
import democretes.blocks.storage.BlockCreativeJar;
import democretes.blocks.storage.BlockEssentiaContainer;
import democretes.blocks.storage.TileCreativeJar;
import democretes.blocks.storage.TileEssentiaContainer;
import democretes.lib.BlockIds;
import democretes.lib.LibNames;

public class TMBlocks {
	
	
	//Block Instances	
	public static Block nodeDynamo;
	public static Block essentiaContainer;
	public static Block cosmeticOpaque;
	public static Block cosmeticPane;
	public static Block essentiaDynamo;
	public static Block biomeMorpher;
	public static Block nodeGenerator;
	public static Block fluxLamp;
	public static Block teslaCoil;
	public static Block electricBellows;
	public static Block creativeJar;
	public static Block crystalBlock;	
	public static Block reconstructorBlock;
	public static Block bloodDynamo;
	public static Block condenserBlock;
	public static Block bloodFabricator;
	public static Block flowerDynamo;
	public static Block manaFabricator;
	public static Block processorTC;
	public static Block processorBM;
	public static Block processorBO;
	
	public static void initThaumcraft() {
		//Block Initializaton
		nodeDynamo = new BlockNodeDynamo(BlockIds.idNODE_DYNAMO);
		essentiaContainer = new BlockEssentiaContainer(BlockIds.idESSENTIA_CONTAINER);
		cosmeticOpaque = new BlockCosmeticOpaque(BlockIds.idCOSMETIC_OPAQUE);
		essentiaDynamo = new BlockEssentiaDynamo(BlockIds.idESSENTIA_DYNAMO);
		biomeMorpher = new BlockBiomeMorpher(BlockIds.idBIOME_MORPHER);
		nodeGenerator = new BlockNodeGenerator(BlockIds.idNODE_GENERATOR);
		fluxLamp = new BlockFluxLamp(BlockIds.idFLUX_LAMP);
		teslaCoil = new BlockTeslaCoil(BlockIds.idTESLA_COIL);
		electricBellows = new BlockElectricBellows(BlockIds.idELECTRIC_BELLOWS);
		creativeJar = new BlockCreativeJar(BlockIds.idCREATIVE_JAR);
		crystalBlock = new BlockCrystal(BlockIds.idCRYSTAL_BLOCK);
		reconstructorBlock = new BlockReconstructor(BlockIds.idRECONSTRUCTOR);
		condenserBlock = new BlockCondenser(BlockIds.idCONDENSER);
		processorTC = new BlockProcessor.BlockTCProcessor(BlockIds.idPROCESSOR_TC);
		
		//Registry
		GameRegistry.registerBlock(nodeDynamo, LibNames.NODE_DYNAMO_NAME);
		GameRegistry.registerBlock(essentiaContainer, LibNames.ESSENTIA_CONTAINER_NAME);
		GameRegistry.registerBlock(cosmeticOpaque, LibNames.COSMETIC_OPAQUE_NAME);
		GameRegistry.registerBlock(essentiaDynamo, LibNames.ESSENTIA_DYNAMO_NAME);
		GameRegistry.registerBlock(biomeMorpher, LibNames.BIOME_MORPHER_NAME);
		GameRegistry.registerBlock(nodeGenerator, LibNames.NODE_GENERATOR_NAME);
		GameRegistry.registerBlock(fluxLamp, LibNames.FLUX_LAMP_NAME);
		GameRegistry.registerBlock(teslaCoil, LibNames.TESLA_COIL_NAME);
		GameRegistry.registerBlock(electricBellows, LibNames.ELECTRIC_BELLOWS_NAME);
		GameRegistry.registerBlock(creativeJar, LibNames.CREATIVE_JAR_NAME);
		GameRegistry.registerBlock(crystalBlock, LibNames.CRYSTAL_NAME);
		GameRegistry.registerBlock(reconstructorBlock, LibNames.RECONSTRUCTOR_NAME);
		GameRegistry.registerBlock(condenserBlock, LibNames.CONDENSER_NAME);
		GameRegistry.registerBlock(processorTC, LibNames.PROCESSOR_NAME + "TC");

		
		//Tiles registry
		GameRegistry.registerTileEntity(TileEssentiaContainer.class, "TileEssentiacontainer");
		GameRegistry.registerTileEntity(TileNodeDynamo.class, "TileNodeDynamo");
		GameRegistry.registerTileEntity(TileEssentiaDynamo.class, "TileEssentiaDynamo");
		GameRegistry.registerTileEntity(TileBiomeMorpher.class, "TileBiomeMorpher");
		GameRegistry.registerTileEntity(TileNodeGenerator.class, "TileNodeGenerator");
		GameRegistry.registerTileEntity(TileFluxLamp.class, "TileFluxLamp");
		GameRegistry.registerTileEntity(TileTeslaCoil.class, "TileTeslaCoil");
		GameRegistry.registerTileEntity(TileElectricBellows.class, "TileElectricBellows");
		GameRegistry.registerTileEntity(TileCreativeJar.class, "TileCreativeJar");
		GameRegistry.registerTileEntity(TileReconstructor.class, "TileReconstructor");
		GameRegistry.registerTileEntity(TileCondenser.class, "TileCondenser");
		GameRegistry.registerTileEntity(TileTCProcessor.class, "TileProcessorTC");
		
	}
	
	public static void initBloodMagic() {
		//Block Initialization
		bloodDynamo = new BlockBloodDynamo(BlockIds.idBLOOD_DYNAMO);	
		bloodFabricator = new BlockBloodFabricator(BlockIds.idBLOOD_FABRICATOR);
		processorBM = new BlockProcessor.BlockBMProcessor(BlockIds.idPROCESSOR_BM);

		//Registry
		GameRegistry.registerBlock(bloodDynamo, LibNames.BLOOD_DYNAMO_NAME);
		GameRegistry.registerBlock(bloodFabricator, LibNames.BLOOD_FABRICATOR_NAME);
		GameRegistry.registerBlock(processorBM, LibNames.PROCESSOR_NAME + "BM");

		//Tiles registry
		GameRegistry.registerTileEntity(TileBloodDynamo.class, "TileBloodDynamo");
		GameRegistry.registerTileEntity(TileBloodFabricator.class, "TileBloodFabricator");
		GameRegistry.registerTileEntity(TileBMProcessor.class, "TileProcessorBM");

	}
	
	public static void initBotania() {
		//Block Initialization
		flowerDynamo = new BlockFlowerDynamo(BlockIds.idFLOWER_DYNAMO);
		manaFabricator = new BlockManaFabricator(BlockIds.idMANA_FABRICATOR);
		processorBO = new BlockProcessor.BlockBOProcessor(BlockIds.idPROCESSOR_BO);
		
		//Block Registry
		GameRegistry.registerBlock(flowerDynamo, LibNames.FLOWER_DYNAMO_NAME);
		GameRegistry.registerBlock(manaFabricator, LibNames.MANA_FABRICATOR_NAME);
		GameRegistry.registerBlock(processorBO, LibNames.PROCESSOR_NAME + "BO");

		//Tile Registry
		GameRegistry.registerTileEntity(TileFlowerDynamo.class, "TileFlowerDynamo");
		GameRegistry.registerTileEntity(TileManaFabricator.class, "ManaFabricator");
		GameRegistry.registerTileEntity(TileBOProcessor.class, "TileProcessorBO");

	}
	


}
