package dev.anbe_mp4.blockshapes.blocks;

import dev.anbe_mp4.blockshapes.BlockShapes;
import dev.anbe_mp4.blockshapes.items.ItemMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class StairBlockMod {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockShapes.MOD_ID);

    public static final RegistryObject<Block> DEEPSLATE_STAIRS = register("deepslate_stairs",
            () -> new StairBlock(() -> Blocks.DEEPSLATE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> CALCITE_STAIRS = register("calcite_stairs",
            () -> new StairBlock(() -> Blocks.CALCITE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CALCITE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> TUFF_STAIRS = register("tuff_stairs",
            () -> new StairBlock(() -> Blocks.TUFF.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TUFF)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> DRIPSTONE_STAIRS = register("dripstone_stairs",
            () -> new StairBlock(() -> Blocks.DRIPSTONE_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> AMETHYST_STAIRS = register("amethyst_stairs",
            () -> new StairBlock(() -> Blocks.AMETHYST_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = register("cut_sandstone_stairs",
            () -> new StairBlock(() -> Blocks.CUT_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SANDSTONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = register("smooth_stone_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> OBSIDIAN_STAIRS = register("obsidian_stairs",
            () -> new StairBlock(() -> Blocks.OBSIDIAN.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> SNOW_STAIRS = register("snow_stairs",
            () -> new StairBlock(() -> Blocks.SNOW_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> NETHERRACK_STAIRS = register("netherrack_stairs",
            () -> new StairBlock(() -> Blocks.NETHERRACK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.NETHERRACK)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BASALT_STAIRS = register("basalt_stairs",
            () -> new StairBlock(() -> Blocks.BASALT.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BASALT)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> POLISHED_BASALT_STAIRS = register("polished_basalt_stairs",
            () -> new StairBlock(() -> Blocks.POLISHED_BASALT.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BASALT)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> SMOOTH_BASALT_STAIRS = register("smooth_basalt_stairs",
            () -> new StairBlock(() -> Blocks.SMOOTH_BASALT.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BASALT)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> PACKED_MUD_STAIRS = register("packed_mud_stairs",
            () -> new StairBlock(() -> Blocks.PACKED_MUD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> END_STONE_STAIRS = register("end_stone_stairs",
            () -> new StairBlock(() -> Blocks.END_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.END_STONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs",
            () -> new StairBlock(() -> Blocks.QUARTZ_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> TERRACOTTA_STAIRS = register("terracotta_stairs",
            () -> new StairBlock(() -> Blocks.TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> CUT_RED_SANDSTONE_STAIRS = register("cut_red_sandstone_stairs",
            () -> new StairBlock(() -> Blocks.CUT_RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BONE_STAIRS = register("bone_stairs",
            () -> new StairBlock(() -> Blocks.BONE_BLOCK.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> CRYING_OBSIDIAN_STAIRS = register("crying_obsidian_stairs",
            () -> new StairBlock(() -> Blocks.CRYING_OBSIDIAN.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> GILDED_BLACKSTONE_STAIRS = register("gilded_blackstone_stairs",
            () -> new StairBlock(() -> Blocks.GILDED_BLACKSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    //LOGS & STEMS
    public static final RegistryObject<Block> OAK_LOG_STAIRS = BLOCKS.register("oak_log_stairs",
            () -> new FlammableStairWood(() -> Blocks.OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SPRUCE_LOG_STAIRS = BLOCKS.register("spruce_log_stairs",
            () -> new FlammableStairWood(() -> Blocks.SPRUCE_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BIRCH_LOG_STAIRS = BLOCKS.register("birch_log_stairs",
            () -> new FlammableStairWood(() -> Blocks.BIRCH_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> JUNGLE_LOG_STAIRS = BLOCKS.register("jungle_log_stairs",
            () -> new FlammableStairWood(() -> Blocks.JUNGLE_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ACACIA_LOG_STAIRS = BLOCKS.register("acacia_log_stairs",
            () -> new FlammableStairWood(() -> Blocks.ACACIA_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> DARK_OAK_LOG_STAIRS = BLOCKS.register("dark_oak_log_stairs",
            () -> new FlammableStairWood(() -> Blocks.DARK_OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> MANGROVE_LOG_STAIRS = BLOCKS.register("mangrove_log_stairs",
            () -> new FlammableStairWood(() -> Blocks.MANGROVE_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CRIMSON_STEM_STAIRS = BLOCKS.register("crimson_stem_stairs",
            () -> new StairBlock(() -> Blocks.CRIMSON_STEM.defaultBlockState(), BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.CRIMSON_STEM)
                    .strength(2.0F).sound(SoundType.STEM)));

    public static final RegistryObject<Block> WARPED_STEM_STAIRS = BLOCKS.register("warped_stem_stairs",
            () -> new StairBlock(() -> Blocks.WARPED_STEM.defaultBlockState(), BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.WARPED_STEM)
                    .strength(2.0F).sound(SoundType.STEM)));

    //STRIPPED LOGS & STEMS
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_STAIRS = BLOCKS.register("stripped_oak_log_stairs",
            () -> new FlammableStairWood(() -> Blocks.STRIPPED_OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_STAIRS = BLOCKS.register("stripped_spruce_log_stairs",
            () -> new FlammableStairWood(() -> Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_STAIRS = BLOCKS.register("stripped_birch_log_stairs",
            () -> new FlammableStairWood(() -> Blocks.STRIPPED_BIRCH_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_STAIRS = BLOCKS.register("stripped_jungle_log_stairs",
            () -> new FlammableStairWood(() -> Blocks.STRIPPED_JUNGLE_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_STAIRS = BLOCKS.register("stripped_acacia_log_stairs",
            () -> new FlammableStairWood(() -> Blocks.STRIPPED_ACACIA_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_STAIRS = BLOCKS.register("stripped_dark_oak_log_stairs",
            () -> new FlammableStairWood(() -> Blocks.STRIPPED_DARK_OAK_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_STAIRS = BLOCKS.register("stripped_mangrove_log_stairs",
            () -> new FlammableStairWood(() -> Blocks.STRIPPED_MANGROVE_LOG.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM_STAIRS = BLOCKS.register("stripped_crimson_stem_stairs",
            () -> new StairBlock(() -> Blocks.STRIPPED_CRIMSON_STEM.defaultBlockState(), BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.CRIMSON_STEM)
                    .strength(2.0F).sound(SoundType.STEM)));

    public static final RegistryObject<Block> STRIPPED_WARPED_STEM_STAIRS = BLOCKS.register("stripped_warped_stem_stairs",
            () -> new StairBlock(() -> Blocks.STRIPPED_WARPED_STEM.defaultBlockState(), BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.WARPED_STEM)
                    .strength(2.0F).sound(SoundType.STEM)));

    //WOODS & HYPHAES
    public static final RegistryObject<Block> OAK_WOOD_STAIRS = BLOCKS.register("oak_wood_stairs",
            () -> new FlammableStairWood(() -> Blocks.OAK_WOOD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> SPRUCE_WOOD_STAIRS = BLOCKS.register("spruce_wood_stairs",
            () -> new FlammableStairWood(() -> Blocks.SPRUCE_WOOD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)));

    public static final RegistryObject<Block> BIRCH_WOOD_STAIRS = BLOCKS.register("birch_wood_stairs",
            () -> new FlammableStairWood(() -> Blocks.BIRCH_WOOD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD)));

    public static final RegistryObject<Block> JUNGLE_WOOD_STAIRS = BLOCKS.register("jungle_wood_stairs",
            () -> new FlammableStairWood(() -> Blocks.JUNGLE_WOOD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD)));

    public static final RegistryObject<Block> ACACIA_WOOD_STAIRS = BLOCKS.register("acacia_wood_stairs",
            () -> new FlammableStairWood(() -> Blocks.ACACIA_WOOD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD)));

    public static final RegistryObject<Block> DARK_OAK_WOOD_STAIRS = BLOCKS.register("dark_oak_wood_stairs",
            () -> new FlammableStairWood(() -> Blocks.DARK_OAK_WOOD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD)));

    public static final RegistryObject<Block> MANGROVE_WOOD_STAIRS = BLOCKS.register("mangrove_wood_stairs",
            () -> new FlammableStairWood(() -> Blocks.MANGROVE_WOOD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD)));

    public static final RegistryObject<Block> CRIMSON_HYPHAE_STAIRS = BLOCKS.register("crimson_hyphae_stairs",
            () -> new StairBlock(() -> Blocks.CRIMSON_HYPHAE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE)));

    public static final RegistryObject<Block> WARPED_HYPHAE_STAIRS = BLOCKS.register("warped_hyphae_stairs",
            () -> new StairBlock(() -> Blocks.WARPED_HYPHAE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_HYPHAE)));

    //STRIPPED WOODS & HYPHAES
    public static final RegistryObject<Block> STRIPPED_OAK_WOOD_STAIRS = BLOCKS.register("stripped_oak_wood_stairs",
            () -> new FlammableStairWood(() -> Blocks.STRIPPED_OAK_WOOD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_STAIRS = BLOCKS.register("stripped_spruce_wood_stairs",
            () -> new FlammableStairWood(() -> Blocks.STRIPPED_SPRUCE_WOOD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD)));

    public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_STAIRS = BLOCKS.register("stripped_birch_wood_stairs",
            () -> new FlammableStairWood(() -> Blocks.STRIPPED_BIRCH_WOOD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_WOOD)));

    public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_STAIRS = BLOCKS.register("stripped_jungle_wood_stairs",
            () -> new FlammableStairWood(() -> Blocks.STRIPPED_JUNGLE_WOOD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_WOOD)));

    public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_STAIRS = BLOCKS.register("stripped_acacia_wood_stairs",
            () -> new FlammableStairWood(() -> Blocks.STRIPPED_ACACIA_WOOD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_WOOD)));

    public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_STAIRS = BLOCKS.register("stripped_dark_oak_wood_stairs",
            () -> new FlammableStairWood(() -> Blocks.STRIPPED_DARK_OAK_WOOD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_MANGROVE_WOOD_STAIRS = BLOCKS.register("stripped_mangrove_wood_stairs",
            () -> new FlammableStairWood(() -> Blocks.STRIPPED_MANGROVE_WOOD.defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_STAIRS = BLOCKS.register("stripped_crimson_hyphae_stairs",
            () -> new StairBlock(() -> Blocks.STRIPPED_CRIMSON_HYPHAE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));

    public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_STAIRS = BLOCKS.register("stripped_warped_hyphae_stairs",
            () -> new StairBlock(() -> Blocks.STRIPPED_WARPED_HYPHAE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_HYPHAE)));

    //WOOL
    public static final RegistryObject<Block> WHITE_WOOL_STAIRS = BLOCKS.register("white_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.WHITE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> ORANGE_WOOL_STAIRS = BLOCKS.register("orange_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.ORANGE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)));

    public static final RegistryObject<Block> MAGENTA_WOOL_STAIRS = BLOCKS.register("magenta_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.MAGENTA_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)));

    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_STAIRS = BLOCKS.register("light_blue_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.LIGHT_BLUE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)));

    public static final RegistryObject<Block> YELLOW_WOOL_STAIRS = BLOCKS.register("yellow_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.YELLOW_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)));

    public static final RegistryObject<Block> LIME_WOOL_STAIRS = BLOCKS.register("lime_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.LIME_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)));

    public static final RegistryObject<Block> PINK_WOOL_STAIRS = BLOCKS.register("pink_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.PINK_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)));

    public static final RegistryObject<Block> GRAY_WOOL_STAIRS = BLOCKS.register("gray_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.GRAY_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)));

    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_STAIRS = BLOCKS.register("light_gray_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.LIGHT_GRAY_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)));

    public static final RegistryObject<Block> CYAN_WOOL_STAIRS = BLOCKS.register("cyan_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.CYAN_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)));

    public static final RegistryObject<Block> PURPLE_WOOL_STAIRS = BLOCKS.register("purple_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.PURPLE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)));

    public static final RegistryObject<Block> BLUE_WOOL_STAIRS = BLOCKS.register("blue_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.BLUE_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)));

    public static final RegistryObject<Block> BROWN_WOOL_STAIRS = BLOCKS.register("brown_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.BROWN_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));

    public static final RegistryObject<Block> GREEN_WOOL_STAIRS = BLOCKS.register("green_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.GREEN_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));

    public static final RegistryObject<Block> RED_WOOL_STAIRS = BLOCKS.register("red_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.RED_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_WOOL)));

    public static final RegistryObject<Block> BLACK_WOOL_STAIRS = BLOCKS.register("black_wool_stairs",
            () -> new FlammableStairWool(() -> Blocks.BLACK_WOOL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)));

    //TERRACOTTA
    public static final RegistryObject<Block> WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.WHITE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.ORANGE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.MAGENTA_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.YELLOW_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.LIME_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.PINK_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.GRAY_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.CYAN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.PURPLE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.BLUE_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.BROWN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.GREEN_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.RED_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.BLACK_TERRACOTTA.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    //CONCRETE
    public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = register("white_concrete_stairs",
            () -> new StairBlock(() -> Blocks.WHITE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs",
            () -> new StairBlock(() -> Blocks.ORANGE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs",
            () -> new StairBlock(() -> Blocks.MAGENTA_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs",
            () -> new StairBlock(() -> Blocks.LIGHT_BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs",
            () -> new StairBlock(() -> Blocks.YELLOW_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = register("lime_concrete_stairs",
            () -> new StairBlock(() -> Blocks.LIME_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = register("pink_concrete_stairs",
            () -> new StairBlock(() -> Blocks.PINK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs",
            () -> new StairBlock(() -> Blocks.GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs",
            () -> new StairBlock(() -> Blocks.LIGHT_GRAY_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs",
            () -> new StairBlock(() -> Blocks.CYAN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs",
            () -> new StairBlock(() -> Blocks.PURPLE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs",
            () -> new StairBlock(() -> Blocks.BLUE_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs",
            () -> new StairBlock(() -> Blocks.BROWN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = register("green_concrete_stairs",
            () -> new StairBlock(() -> Blocks.GREEN_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> RED_CONCRETE_STAIRS = register("red_concrete_stairs",
            () -> new StairBlock(() -> Blocks.RED_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = register("black_concrete_stairs",
            () -> new StairBlock(() -> Blocks.BLACK_CONCRETE.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemMod.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
