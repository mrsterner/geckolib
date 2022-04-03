package software.bernie.example.registry;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import software.bernie.example.block.tile.FertilizerTileEntity;
import software.bernie.geckolib3.GeckoLib;

public class TileRegistry {
	public static final BlockEntityType<BotariumTileEntity> BOTARIUM_TILE = Registry.register(
			Registry.BLOCK_ENTITY_TYPE, GeckoLib.ModID + ":botariumtile",
			FabricBlockEntityTypeBuilder.create(BotariumTileEntity::new, BlockRegistry.BOTARIUM_BLOCK).build(null));

	public static final BlockEntityType<FertilizerTileEntity> FERTILIZER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
			GeckoLib.ModID + ":fertilizertile",
			FabricBlockEntityTypeBuilder.create(FertilizerTileEntity::new, BlockRegistry.FERTILIZER_BLOCK).build(null));
}
