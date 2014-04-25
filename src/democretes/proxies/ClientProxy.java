package democretes.proxies;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import thaumcraft.client.fx.FXEssentiaTrail;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import democretes.blocks.dynamos.tiles.TileBloodDynamo;
import democretes.blocks.dynamos.tiles.TileEssentiaDynamo;
import democretes.blocks.dynamos.tiles.TileNodeDynamo;
import democretes.blocks.machines.tiles.TileBiomeMorpher;
import democretes.blocks.machines.tiles.TileElectricBellows;
import democretes.blocks.machines.tiles.TileFluxLamp;
import democretes.blocks.machines.tiles.TileNodeGenerator;
import democretes.blocks.machines.tiles.TileReconstructor;
import democretes.blocks.machines.tiles.TileTeslaCoil;
import democretes.blocks.storage.TileCreativeJar;
import democretes.blocks.storage.TileEssentiaContainer;
import democretes.lib.RenderIds;
import democretes.renderer.blocks.BlockBiomeMorpherRenderer;
import democretes.renderer.blocks.BlockBloodDynamoRenderer;
import democretes.renderer.blocks.BlockCreativeJarRenderer;
import democretes.renderer.blocks.BlockElectricBellowsRenderer;
import democretes.renderer.blocks.BlockEssentiaContainerRenderer;
import democretes.renderer.blocks.BlockEssentiaDynamoRenderer;
import democretes.renderer.blocks.BlockFluxLampRenderer;
import democretes.renderer.blocks.BlockNodeDynamoRenderer;
import democretes.renderer.blocks.BlockNodeGeneratorRenderer;
import democretes.renderer.blocks.BlockReconstructorRenderer;
import democretes.renderer.blocks.BlockTeslaCoilRenderer;
import democretes.renderer.tiles.TileBiomeMorpherRenderer;
import democretes.renderer.tiles.TileBloodDynamoRenderer;
import democretes.renderer.tiles.TileCreativeJarRenderer;
import democretes.renderer.tiles.TileElectricBellowsRenderer;
import democretes.renderer.tiles.TileEssentiaContainerRenderer;
import democretes.renderer.tiles.TileEssentiaDynamoRenderer;
import democretes.renderer.tiles.TileFluxLampRenderer;
import democretes.renderer.tiles.TileNodeDynamoRenderer;
import democretes.renderer.tiles.TileNodeGeneratorRenderer;
import democretes.renderer.tiles.TileReconstructorRenderer;
import democretes.renderer.tiles.TileTeslaCoilRenderer;

public class ClientProxy extends CommonProxy {

    @Override
    public void initSounds() {

    }

    @Override
    public void initRenderers() {
    	ClientRegistry.bindTileEntitySpecialRenderer(TileNodeDynamo.class, new TileNodeDynamoRenderer());
    	RenderIds.idNodeDynamo = RenderingRegistry.getNextAvailableRenderId();
    	
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEssentiaDynamo.class, new TileEssentiaDynamoRenderer());
    	RenderIds.idEssentiaDynamo = RenderingRegistry.getNextAvailableRenderId();
    	
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEssentiaContainer.class, new TileEssentiaContainerRenderer());
    	RenderIds.idEssentiaContainer = RenderingRegistry.getNextAvailableRenderId();    	
    	
    	ClientRegistry.bindTileEntitySpecialRenderer(TileBiomeMorpher.class, new TileBiomeMorpherRenderer());
    	RenderIds.idBiomeMorpher = RenderingRegistry.getNextAvailableRenderId(); 
    	
    	ClientRegistry.bindTileEntitySpecialRenderer(TileNodeGenerator.class, new TileNodeGeneratorRenderer());
    	RenderIds.idNodeGenerator = RenderingRegistry.getNextAvailableRenderId(); 

    	ClientRegistry.bindTileEntitySpecialRenderer(TileFluxLamp.class, new TileFluxLampRenderer());
    	RenderIds.idFluxLamp = RenderingRegistry.getNextAvailableRenderId();
    	
    	ClientRegistry.bindTileEntitySpecialRenderer(TileTeslaCoil.class, new TileTeslaCoilRenderer());
    	RenderIds.idTeslaCoil = RenderingRegistry.getNextAvailableRenderId(); 
    	
    	ClientRegistry.bindTileEntitySpecialRenderer(TileElectricBellows.class, new TileElectricBellowsRenderer());
    	RenderIds.idElectricBellows = RenderingRegistry.getNextAvailableRenderId();
    	
    	ClientRegistry.bindTileEntitySpecialRenderer(TileCreativeJar.class, new TileCreativeJarRenderer());
    	RenderIds.idCreativeJar = RenderingRegistry.getNextAvailableRenderId(); 
    	
    	ClientRegistry.bindTileEntitySpecialRenderer(TileReconstructor.class, new TileReconstructorRenderer());
    	RenderIds.idReconstructor = RenderingRegistry.getNextAvailableRenderId();
    	
    	ClientRegistry.bindTileEntitySpecialRenderer(TileBloodDynamo.class, new TileBloodDynamoRenderer());
    	RenderIds.idBloodDynamo = RenderingRegistry.getNextAvailableRenderId();

    	RenderingRegistry.registerBlockHandler(new BlockNodeDynamoRenderer());
    	RenderingRegistry.registerBlockHandler(new BlockEssentiaDynamoRenderer());
    	RenderingRegistry.registerBlockHandler(new BlockEssentiaContainerRenderer());  	
    	RenderingRegistry.registerBlockHandler(new BlockBiomeMorpherRenderer());
    	RenderingRegistry.registerBlockHandler(new BlockNodeGeneratorRenderer()); 
    	RenderingRegistry.registerBlockHandler(new BlockFluxLampRenderer());
    	RenderingRegistry.registerBlockHandler(new BlockTeslaCoilRenderer());  
    	RenderingRegistry.registerBlockHandler(new BlockElectricBellowsRenderer());
    	RenderingRegistry.registerBlockHandler(new BlockCreativeJarRenderer());
    	RenderingRegistry.registerBlockHandler(new BlockReconstructorRenderer());
    	RenderingRegistry.registerBlockHandler(new BlockBloodDynamoRenderer());

    	
    }
    
    
    public void essentiaTrail(World world, double x, double y, double z, double tx, double ty, double tz, int color) {
    	if(Minecraft.getMinecraft().renderViewEntity == null) {
    	      return;
    	}
    	if(Minecraft.getMinecraft().renderViewEntity instanceof EntityPlayer == false) {
    		return;
    	}
    	FXEssentiaTrail fx = new FXEssentiaTrail(world, tx, ty, tz, x, y, z, 25, color, 1.0F);
        Minecraft.getMinecraft().effectRenderer.addEffect(fx);
    }

}
