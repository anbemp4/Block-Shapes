package dev.anbe_mp4.blockshapes.blocks;

import dev.anbe_mp4.blockshapes.BlockShapes;
import dev.anbe_mp4.blockshapes.items.ItemMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class SlabBlockMod {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockShapes.MOD_ID);

    public static final RegistryObject<Block> DEEPSLATE_SLAB = register("deepslate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> CALCITE_SLAB = register("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> TUFF_SLAB = register("tuff_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> DRIPSTONE_SLAB = register("dripstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> AMETHYST_SLAB = register("amethyst_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> OBSIDIAN_SLAB = register("obsidian_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> SNOW_SLAB = register("snow_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SNOW_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> NETHERRACK_SLAB = register("netherrack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BASALT_SLAB = register("basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BASALT)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> POLISHED_BASALT_SLAB = register("polished_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BASALT)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = register("smooth_basalt_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BASALT)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> PACKED_MUD_SLAB = register("packed_mud_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> END_STONE_SLAB = register("end_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> QUARTZ_BRICK_SLAB = register("quartz_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> TERRACOTTA_SLAB = register("terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BONE_SLAB = register("bone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> CRYING_OBSIDIAN_SLAB = register("crying_obsidian_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> GILDED_BLACKSTONE_SLAB = register("gilded_blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GILDED_BLACKSTONE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    //LOGS & STEMS
    public static final RegistryObject<Block> OAK_LOG_SLAB = BLOCKS.register("oak_log_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SPRUCE_LOG_SLAB = BLOCKS.register("spruce_log_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BIRCH_LOG_SLAB = BLOCKS.register("birch_log_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> JUNGLE_LOG_SLAB = BLOCKS.register("jungle_log_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> ACACIA_LOG_SLAB = BLOCKS.register("acacia_log_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> DARK_OAK_LOG_SLAB = BLOCKS.register("dark_oak_log_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> MANGROVE_LOG_SLAB = BLOCKS.register("mangrove_log_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CRIMSON_STEM_SLAB = BLOCKS.register("crimson_stem_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.CRIMSON_STEM)
                    .strength(2.0F).sound(SoundType.STEM)));

    public static final RegistryObject<Block> WARPED_STEM_SLAB = BLOCKS.register("warped_stem_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.WARPED_STEM)
                    .strength(2.0F).sound(SoundType.STEM)));

    //STRIPPED LOGS & STEMS
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_SLAB = BLOCKS.register("stripped_oak_log_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_SLAB = BLOCKS.register("stripped_spruce_log_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_SLAB = BLOCKS.register("stripped_birch_log_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_SLAB = BLOCKS.register("stripped_jungle_log_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_SLAB = BLOCKS.register("stripped_acacia_log_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_SLAB = BLOCKS.register("stripped_dark_oak_log_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_SLAB = BLOCKS.register("stripped_mangrove_log_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM_SLAB = BLOCKS.register("stripped_crimson_stem_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.CRIMSON_STEM)
                    .strength(2.0F).sound(SoundType.STEM)));

    public static final RegistryObject<Block> STRIPPED_WARPED_STEM_SLAB = BLOCKS.register("stripped_warped_stem_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.WARPED_STEM)
                    .strength(2.0F).sound(SoundType.STEM)));

    //WOODS & HYPHAES
    public static final RegistryObject<Block> OAK_WOOD_SLAB = BLOCKS.register("oak_wood_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

    public static final RegistryObject<Block> SPRUCE_WOOD_SLAB = BLOCKS.register("spruce_wood_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD)));

    public static final RegistryObject<Block> BIRCH_WOOD_SLAB = BLOCKS.register("birch_wood_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD)));

    public static final RegistryObject<Block> JUNGLE_WOOD_SLAB = BLOCKS.register("jungle_wood_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD)));

    public static final RegistryObject<Block> ACACIA_WOOD_SLAB = BLOCKS.register("acacia_wood_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD)));

    public static final RegistryObject<Block> DARK_OAK_WOOD_SLAB = BLOCKS.register("dark_oak_wood_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD)));

    public static final RegistryObject<Block> MANGROVE_WOOD_SLAB = BLOCKS.register("mangrove_wood_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD)));

    public static final RegistryObject<Block> CRIMSON_HYPHAE_SLAB = BLOCKS.register("crimson_hyphae_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE)));

    public static final RegistryObject<Block> WARPED_HYPHAE_SLAB = BLOCKS.register("warped_hyphae_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_HYPHAE)));

    //STRIPPED WOODS & HYPHAES
    public static final RegistryObject<Block> STRIPPED_OAK_WOOD_SLAB = BLOCKS.register("stripped_oak_wood_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_SPRUCE_WOOD_SLAB = BLOCKS.register("stripped_spruce_wood_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_WOOD)));

    public static final RegistryObject<Block> STRIPPED_BIRCH_WOOD_SLAB = BLOCKS.register("stripped_birch_wood_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_WOOD)));

    public static final RegistryObject<Block> STRIPPED_JUNGLE_WOOD_SLAB = BLOCKS.register("stripped_jungle_wood_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_WOOD)));

    public static final RegistryObject<Block> STRIPPED_ACACIA_WOOD_SLAB = BLOCKS.register("stripped_acacia_wood_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_WOOD)));

    public static final RegistryObject<Block> STRIPPED_DARK_OAK_WOOD_SLAB = BLOCKS.register("stripped_dark_oak_wood_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));

    public static final RegistryObject<Block> STRIPPED_MANGROVE_WOOD_SLAB = BLOCKS.register("stripped_mangrove_wood_slab",
            () -> new FlammableSlabWood(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_RED)
                    .strength(2.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STRIPPED_CRIMSON_HYPHAE_SLAB = BLOCKS.register("stripped_crimson_hyphae_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));

    public static final RegistryObject<Block> STRIPPED_WARPED_HYPHAE_SLAB = BLOCKS.register("stripped_warped_hyphae_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_HYPHAE)));

    //WOOL
    public static final RegistryObject<Block> WHITE_WOOL_SLAB = BLOCKS.register("white_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> ORANGE_WOOL_SLAB = BLOCKS.register("orange_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL)));

    public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = BLOCKS.register("magenta_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL)));

    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = BLOCKS.register("light_blue_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)));

    public static final RegistryObject<Block> YELLOW_WOOL_SLAB = BLOCKS.register("yellow_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL)));

    public static final RegistryObject<Block> LIME_WOOL_SLAB = BLOCKS.register("lime_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL)));

    public static final RegistryObject<Block> PINK_WOOL_SLAB = BLOCKS.register("pink_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL)));

    public static final RegistryObject<Block> GRAY_WOOL_SLAB = BLOCKS.register("gray_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL)));

    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = BLOCKS.register("light_gray_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL)));

    public static final RegistryObject<Block> CYAN_WOOL_SLAB = BLOCKS.register("cyan_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL)));

    public static final RegistryObject<Block> PURPLE_WOOL_SLAB = BLOCKS.register("purple_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL)));

    public static final RegistryObject<Block> BLUE_WOOL_SLAB = BLOCKS.register("blue_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL)));

    public static final RegistryObject<Block> BROWN_WOOL_SLAB = BLOCKS.register("brown_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));

    public static final RegistryObject<Block> GREEN_WOOL_SLAB = BLOCKS.register("green_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));

    public static final RegistryObject<Block> RED_WOOL_SLAB = BLOCKS.register("red_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.RED_WOOL)));

    public static final RegistryObject<Block> BLACK_WOOL_SLAB = BLOCKS.register("black_wool_slab",
            () -> new FlammableSlabWool(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL)));

    //TERRACOTTA
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = register("red_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    //CONCRETE
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = register("white_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = register("orange_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = register("lime_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = register("pink_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = register("gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = register("cyan_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = register("purple_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = register("blue_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = register("brown_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = register("green_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> RED_CONCRETE_SLAB = register("red_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = register("black_concrete_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)),
            new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemMod.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }
}
