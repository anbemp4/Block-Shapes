package dev.anbe_mp4.blockshapes.blocks;

import dev.anbe_mp4.blockshapes.BlockShapes;
import dev.anbe_mp4.blockshapes.items.ItemMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StoneButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ButtonBlockMod {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockShapes.MOD_ID);

    public static final RegistryObject<Block> POLISHED_GRANITE_BUTTON = register("polished_granite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BUTTON)),
            new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE));

    public static final RegistryObject<Block> POLISHED_DIORITE_BUTTON = register("polished_diorite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BUTTON)),
            new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE));

    public static final RegistryObject<Block> POLISHED_ANDESITE_BUTTON = register("polished_andesite_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BUTTON)),
            new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE));

    public static final RegistryObject<Block> POLISHED_DEEPSLATE_BUTTON = register("polished_deepslate_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BUTTON)),
            new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE));

    public static final RegistryObject<Block> POLISHED_BASALT_BUTTON = register("polished_basalt_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BUTTON).sound(SoundType.BASALT)),
            new Item.Properties().tab(CreativeModeTab.TAB_REDSTONE));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemMod.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
