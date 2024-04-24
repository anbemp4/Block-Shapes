package dev.anbe_mp4.blockshapes;

import dev.anbe_mp4.blockshapes.blocks.*;
import dev.anbe_mp4.blockshapes.items.ItemMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BlockShapes.MOD_ID)
public class BlockShapes {
    public static final String MOD_ID = "blockshapes";

    public BlockShapes() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        SlabBlockMod.BLOCKS.register(bus);
        StairBlockMod.BLOCKS.register(bus);
        WallBlockMod.BLOCKS.register(bus);
        ButtonBlockMod.BLOCKS.register(bus);
        PressurePlateBlockMod.BLOCKS.register(bus);
        ItemMod.ITEMS.register(bus);
    }
}
