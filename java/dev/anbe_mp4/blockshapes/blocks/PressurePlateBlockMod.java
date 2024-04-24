package dev.anbe_mp4.blockshapes.blocks;

import dev.anbe_mp4.blockshapes.BlockShapes;
import dev.anbe_mp4.blockshapes.items.ItemMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class PressurePlateBlockMod {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockShapes.MOD_ID);

    public static final RegistryObject<Block> POLISHED_GRANITE_PRESSURE_PLATE = register("polished_granite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.GRANITE).noCollission().strength(0.5F)),
            new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE));

    public static final RegistryObject<Block> POLISHED_DIORITE_PRESSURE_PLATE = register("polished_diorite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.DIORITE).noCollission().strength(0.5F)),
            new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE));

    public static final RegistryObject<Block> POLISHED_ANDESITE_PRESSURE_PLATE = register("polished_andesite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.ANDESITE).noCollission().strength(0.5F)),
            new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE));

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_PRESSURE_PLATE = register("polished_deepslate_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).noCollission().strength(1.0F)),
            new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE));

    public static final RegistryObject<Block> POLISHED_BASALT_PRESSURE_PLATE = register("polished_basalt_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.copy(Blocks.BASALT).noCollission().strength(0.5F)),
            new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemMod.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
