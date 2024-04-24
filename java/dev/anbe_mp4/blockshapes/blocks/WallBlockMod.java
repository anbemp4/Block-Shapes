package dev.anbe_mp4.blockshapes.blocks;

import dev.anbe_mp4.blockshapes.BlockShapes;
import dev.anbe_mp4.blockshapes.items.ItemMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class WallBlockMod {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockShapes.MOD_ID);

    public static final RegistryObject<Block> STONE_WALL = register("stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> POLISHED_GRANITE_WALL = register("polished_granite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> POLISHED_DIORITE_WALL = register("polished_diorite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = register("polished_andesite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> DEEPSLATE_WALL = register("deepslate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> CALCITE_WALL = register("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> TUFF_WALL = register("tuff_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> DRIPSTONE_WALL = register("dripstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> AMETHYST_WALL = register("amethyst_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> CUT_SANDSTONE_WALL = register("cut_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = register("smooth_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = register("smooth_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> SMOOTH_STONE_WALL = register("smooth_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> OBSIDIAN_WALL = register("obsidian_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> PURPUR_WALL = register("purpur_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> SNOW_WALL = register("snow_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> NETHERRACK_WALL = register("netherrack_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> BASALT_WALL = register("basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BASALT)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> POLISHED_BASALT_WALL = register("polished_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BASALT)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> SMOOTH_BASALT_WALL = register("smooth_basalt_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BASALT)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> PACKED_MUD_WALL = register("packed_mud_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> END_STONE_WALL = register("end_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> QUARTZ_WALL = register("quartz_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> QUARTZ_BRICK_WALL = register("quartz_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> TERRACOTTA_WALL = register("terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> PRISMARINE_BRICK_WALL = register("prismarine_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> DARK_PRISMARINE_WALL = register("dark_prismarine_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> CUT_RED_SANDSTONE_WALL = register("cut_red_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> BONE_WALL = register("bone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> CRYING_OBSIDIAN_WALL = register("crying_obsidian_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> GILDED_BLACKSTONE_WALL = register("gilded_blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    //WOODS & HYPHAES
    public static final RegistryObject<Block> OAK_WOOD_WALL = BLOCKS.register("oak_wood_wall",
            () -> new FlammableWallWood(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> SPRUCE_WOOD_WALL = BLOCKS.register("spruce_wood_wall",
            () -> new FlammableWallWood(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)));

    public static final RegistryObject<Block> BIRCH_WOOD_WALL = BLOCKS.register("birch_wood_wall",
            () -> new FlammableWallWood(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD)));

    public static final RegistryObject<Block> JUNGLE_WOOD_WALL = BLOCKS.register("jungle_wood_wall",
            () -> new FlammableWallWood(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD)));

    public static final RegistryObject<Block> ACACIA_WOOD_WALL = BLOCKS.register("acacia_wood_wall",
            () -> new FlammableWallWood(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD)));

    public static final RegistryObject<Block> DARK_OAK_WOOD_WALL = BLOCKS.register("dark_oak_wood_wall",
            () -> new FlammableWallWood(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD)));

    public static final RegistryObject<Block> MANGROVE_WOOD_WALL = BLOCKS.register("mangrove_wood_wall",
            () -> new FlammableWallWood(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD)));

    public static final RegistryObject<Block> CRIMSON_HYPHAE_WALL = BLOCKS.register("crimson_hyphae_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE)));

    public static final RegistryObject<Block> WARPED_HYPHAE_WALL = BLOCKS.register("warped_hyphae_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_HYPHAE)));

    //STRIPPED WOODS & HYPHAES
    public static final RegistryObject<Block> STRIPPED_OAK_WOOD_WALL = BLOCKS.register("stripped_oak_wood_wall",
            () -> new FlammableWallWood(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_WALL = BLOCKS.register("stripped_spruce_wood_wall",
            () -> new FlammableWallWood(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD)));

    public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_WALL = BLOCKS.register("stripped_birch_wood_wall",
            () -> new FlammableWallWood(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_WOOD)));

    public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_WALL = BLOCKS.register("stripped_jungle_wood_wall",
            () -> new FlammableWallWood(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_WOOD)));

    public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_WALL = BLOCKS.register("stripped_acacia_wood_wall",
            () -> new FlammableWallWood(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_WOOD)));

    public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_WALL = BLOCKS.register("stripped_dark_oak_wood_wall",
            () -> new FlammableWallWood(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_MANGROVE_WOOD_WALL = BLOCKS.register("stripped_mangrove_wood_wall",
            () -> new FlammableWallWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_WALL = BLOCKS.register("stripped_crimson_hyphae_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));

    public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_WALL = BLOCKS.register("stripped_warped_hyphae_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_HYPHAE)));

    //TERRACOTTA
    public static final RegistryObject<Block> WHITE_TERRACOTTA_WALL = register("white_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_WALL = register("orange_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_WALL = register("magenta_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_WALL = register("light_blue_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_WALL = register("yellow_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> LIME_TERRACOTTA_WALL = register("lime_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> PINK_TERRACOTTA_WALL = register("pink_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_WALL = register("gray_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_WALL = register("light_gray_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_WALL = register("cyan_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_WALL = register("purple_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_WALL = register("blue_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_WALL = register("brown_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_WALL = register("green_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> RED_TERRACOTTA_WALL = register("red_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_WALL = register("black_terracotta_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    //CONCRETE
    public static final RegistryObject<Block> WHITE_CONCRETE_WALL = register("white_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> ORANGE_CONCRETE_WALL = register("orange_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> MAGENTA_CONCRETE_WALL = register("magenta_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_WALL = register("light_blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> YELLOW_CONCRETE_WALL = register("yellow_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> LIME_CONCRETE_WALL = register("lime_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> PINK_CONCRETE_WALL = register("pink_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> GRAY_CONCRETE_WALL = register("gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_WALL = register("light_gray_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> CYAN_CONCRETE_WALL = register("cyan_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> PURPLE_CONCRETE_WALL = register("purple_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> BLUE_CONCRETE_WALL = register("blue_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> BROWN_CONCRETE_WALL = register("brown_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> GREEN_CONCRETE_WALL = register("green_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> RED_CONCRETE_WALL = register("red_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    public static final RegistryObject<Block> BLACK_CONCRETE_WALL = register("black_concrete_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemMod.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
