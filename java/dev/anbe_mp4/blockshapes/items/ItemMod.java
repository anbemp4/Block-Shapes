package dev.anbe_mp4.blockshapes.items;

import dev.anbe_mp4.blockshapes.BlockShapes;
import dev.anbe_mp4.blockshapes.blocks.SlabBlockMod;
import dev.anbe_mp4.blockshapes.blocks.StairBlockMod;
import dev.anbe_mp4.blockshapes.blocks.WallBlockMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemMod {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlockShapes.MOD_ID);

    //SLAB
    public static final RegistryObject<BlockItem> OAK_LOG_SLAB = ITEMS.register("oak_log_slab",
            () -> new FuelBlockItem(SlabBlockMod.OAK_LOG_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> SPRUCE_LOG_SLAB = ITEMS.register("spruce_log_slab",
            () -> new FuelBlockItem(SlabBlockMod.SPRUCE_LOG_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> BIRCH_LOG_SLAB = ITEMS.register("birch_log_slab",
            () -> new FuelBlockItem(SlabBlockMod.BIRCH_LOG_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> JUNGLE_LOG_SLAB = ITEMS.register("jungle_log_slab",
            () -> new FuelBlockItem(SlabBlockMod.JUNGLE_LOG_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> ACACIA_LOG_SLAB = ITEMS.register("acacia_log_slab",
            () -> new FuelBlockItem(SlabBlockMod.ACACIA_LOG_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> DARK_OAK_LOG_SLAB = ITEMS.register("dark_oak_log_slab",
            () -> new FuelBlockItem(SlabBlockMod.DARK_OAK_LOG_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> MANGROVE_LOG_SLAB = ITEMS.register("mangrove_log_slab",
            () -> new FuelBlockItem(SlabBlockMod.MANGROVE_LOG_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> CRIMSON_STEM_SLAB = ITEMS.register("crimson_stem_slab",
            () -> new BlockItem(SlabBlockMod.CRIMSON_STEM_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> WARPED_STEM_SLAB = ITEMS.register("warped_stem_slab",
            () -> new BlockItem(SlabBlockMod.WARPED_STEM_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> STRIPPED_OAK_LOG_SLAB = ITEMS.register("stripped_oak_log_slab",
            () -> new FuelBlockItem(SlabBlockMod.STRIPPED_OAK_LOG_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_SPRUCE_LOG_SLAB = ITEMS.register("stripped_spruce_log_slab",
            () -> new FuelBlockItem(SlabBlockMod.STRIPPED_SPRUCE_LOG_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_BIRCH_LOG_SLAB = ITEMS.register("stripped_birch_log_slab",
            () -> new FuelBlockItem(SlabBlockMod.STRIPPED_BIRCH_LOG_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_JUNGLE_LOG_SLAB = ITEMS.register("stripped_jungle_log_slab",
            () -> new FuelBlockItem(SlabBlockMod.STRIPPED_JUNGLE_LOG_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_ACACIA_LOG_SLAB = ITEMS.register("stripped_acacia_log_slab",
            () -> new FuelBlockItem(SlabBlockMod.STRIPPED_ACACIA_LOG_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_DARK_OAK_LOG_SLAB = ITEMS.register("stripped_dark_oak_log_slab",
            () -> new FuelBlockItem(SlabBlockMod.STRIPPED_DARK_OAK_LOG_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_MANGROVE_LOG_SLAB = ITEMS.register("stripped_mangrove_log_slab",
            () -> new FuelBlockItem(SlabBlockMod.STRIPPED_MANGROVE_LOG_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_CRIMSON_STEM_SLAB = ITEMS.register("stripped_crimson_stem_slab",
            () -> new BlockItem(SlabBlockMod.STRIPPED_CRIMSON_STEM_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> STRIPPED_WARPED_STEM_SLAB = ITEMS.register("stripped_warped_stem_slab",
            () -> new BlockItem(SlabBlockMod.STRIPPED_WARPED_STEM_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> OAK_WOOD_SLAB = ITEMS.register("oak_wood_slab",
            () -> new FuelBlockItem(SlabBlockMod.OAK_WOOD_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> SPRUCE_WOOD_SLAB = ITEMS.register("spruce_wood_slab",
            () -> new FuelBlockItem(SlabBlockMod.SPRUCE_WOOD_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> BIRCH_WOOD_SLAB = ITEMS.register("birch_wood_slab",
            () -> new FuelBlockItem(SlabBlockMod.BIRCH_WOOD_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> JUNGLE_WOOD_SLAB = ITEMS.register("jungle_wood_slab",
            () -> new FuelBlockItem(SlabBlockMod.JUNGLE_WOOD_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> ACACIA_WOOD_SLAB = ITEMS.register("acacia_wood_slab",
            () -> new FuelBlockItem(SlabBlockMod.ACACIA_WOOD_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> DARK_OAK_WOOD_SLAB = ITEMS.register("dark_oak_wood_slab",
            () -> new FuelBlockItem(SlabBlockMod.DARK_OAK_WOOD_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> MANGROVE_WOOD_SLAB = ITEMS.register("mangrove_wood_slab",
            () -> new FuelBlockItem(SlabBlockMod.MANGROVE_WOOD_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> CRIMSON_HYPHAE_SLAB = ITEMS.register("crimson_hyphae_slab",
            () -> new BlockItem(SlabBlockMod.CRIMSON_HYPHAE_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> WARPED_HYPHAE_SLAB = ITEMS.register("warped_hyphae_slab",
            () -> new BlockItem(SlabBlockMod.WARPED_HYPHAE_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> STRIPPED_OAK_WOOD_SLAB = ITEMS.register("stripped_oak_wood_slab",
            () -> new FuelBlockItem(SlabBlockMod.STRIPPED_OAK_WOOD_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_SPRUCE_WOOD_SLAB = ITEMS.register("stripped_spruce_wood_slab",
            () -> new FuelBlockItem(SlabBlockMod.STRIPPED_SPRUCE_WOOD_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_BIRCH_WOOD_SLAB = ITEMS.register("stripped_birch_wood_slab",
            () -> new FuelBlockItem(SlabBlockMod.STRIPPED_BIRCH_WOOD_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_JUNGLE_WOOD_SLAB = ITEMS.register("stripped_jungle_wood_slab",
            () -> new FuelBlockItem(SlabBlockMod.STRIPPED_JUNGLE_WOOD_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_ACACIA_WOOD_SLAB = ITEMS.register("stripped_acacia_wood_slab",
            () -> new FuelBlockItem(SlabBlockMod.STRIPPED_ACACIA_WOOD_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_DARK_OAK_WOOD_SLAB = ITEMS.register("stripped_dark_oak_wood_slab",
            () -> new FuelBlockItem(SlabBlockMod.STRIPPED_DARK_OAK_WOOD_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_MANGROVE_WOOD_SLAB = ITEMS.register("stripped_mangrove_wood_slab",
            () -> new FuelBlockItem(SlabBlockMod.STRIPPED_MANGROVE_WOOD_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final RegistryObject<BlockItem> STRIPPED_CRIMSON_HYPHAE_SLAB = ITEMS.register("stripped_crimson_hyphae_slab",
            () -> new BlockItem(SlabBlockMod.STRIPPED_CRIMSON_HYPHAE_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> STRIPPED_WARPED_HYPHAE_SLAB = ITEMS.register("stripped_warped_hyphae_slab",
            () -> new BlockItem(SlabBlockMod.STRIPPED_WARPED_HYPHAE_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> WHITE_WOOL_SLAB = ITEMS.register("white_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.WHITE_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> ORANGE_WOOL_SLAB = ITEMS.register("orange_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.ORANGE_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> MAGENTA_WOOL_SLAB = ITEMS.register("magenta_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.MAGENTA_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> LIGHT_BLUE_WOOL_SLAB = ITEMS.register("light_blue_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.LIGHT_BLUE_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> YELLOW_WOOL_SLAB = ITEMS.register("yellow_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.YELLOW_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> LIME_WOOL_SLAB = ITEMS.register("lime_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.LIME_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> PINK_WOOL_SLAB = ITEMS.register("pink_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.PINK_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> GRAY_WOOL_SLAB = ITEMS.register("gray_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.GRAY_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> LIGHT_GRAY_WOOL_SLAB = ITEMS.register("light_gray_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.LIGHT_GRAY_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> CYAN_WOOL_SLAB = ITEMS.register("cyan_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.CYAN_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> PURPLE_WOOL_SLAB = ITEMS.register("purple_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.PURPLE_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> BLUE_WOOL_SLAB = ITEMS.register("blue_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.BLUE_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> BROWN_WOOL_SLAB = ITEMS.register("brown_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.BROWN_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> GREEN_WOOL_SLAB = ITEMS.register("green_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.GREEN_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> RED_WOOL_SLAB = ITEMS.register("red_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.RED_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> BLACK_WOOL_SLAB = ITEMS.register("black_wool_slab",
            () -> new FuelBlockItem(SlabBlockMod.BLACK_WOOL_SLAB.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    //STAIRS
    public static final  RegistryObject<BlockItem> OAK_LOG_STAIRS = ITEMS.register("oak_log_stairs",
            () -> new FuelBlockItem(StairBlockMod.OAK_LOG_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> SPRUCE_LOG_STAIRS = ITEMS.register("spruce_log_stairs",
            () -> new FuelBlockItem(StairBlockMod.SPRUCE_LOG_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> BIRCH_LOG_STAIRS = ITEMS.register("birch_log_stairs",
            () -> new FuelBlockItem(StairBlockMod.BIRCH_LOG_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> JUNGLE_LOG_STAIRS = ITEMS.register("jungle_log_stairs",
            () -> new FuelBlockItem(StairBlockMod.JUNGLE_LOG_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> ACACIA_LOG_STAIRS = ITEMS.register("acacia_log_stairs",
            () -> new FuelBlockItem(StairBlockMod.ACACIA_LOG_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> DARK_OAK_LOG_STAIRS = ITEMS.register("dark_oak_log_stairs",
            () -> new FuelBlockItem(StairBlockMod.DARK_OAK_LOG_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> MANGROVE_LOG_STAIRS = ITEMS.register("mangrove_log_stairs",
            () -> new FuelBlockItem(StairBlockMod.MANGROVE_LOG_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> CRIMSON_STEM_STAIRS = ITEMS.register("crimson_stem_stairs",
            () -> new BlockItem(StairBlockMod.CRIMSON_STEM_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final  RegistryObject<BlockItem> WARPED_STEM_STAIRS = ITEMS.register("warped_stem_stairs",
            () -> new BlockItem(StairBlockMod.WARPED_STEM_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final  RegistryObject<BlockItem> STRIPPED_OAK_LOG_STAIRS = ITEMS.register("stripped_oak_log_stairs",
            () -> new FuelBlockItem(StairBlockMod.STRIPPED_OAK_LOG_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_SPRUCE_LOG_STAIRS = ITEMS.register("stripped_spruce_log_stairs",
            () -> new FuelBlockItem(StairBlockMod.STRIPPED_SPRUCE_LOG_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_BIRCH_LOG_STAIRS = ITEMS.register("stripped_birch_log_stairs",
            () -> new FuelBlockItem(StairBlockMod.STRIPPED_BIRCH_LOG_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_JUNGLE_LOG_STAIRS = ITEMS.register("stripped_jungle_log_stairs",
            () -> new FuelBlockItem(StairBlockMod.STRIPPED_JUNGLE_LOG_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_ACACIA_LOG_STAIRS = ITEMS.register("stripped_acacia_log_stairs",
            () -> new FuelBlockItem(StairBlockMod.STRIPPED_ACACIA_LOG_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_DARK_OAK_LOG_STAIRS = ITEMS.register("stripped_dark_oak_log_stairs",
            () -> new FuelBlockItem(StairBlockMod.STRIPPED_DARK_OAK_LOG_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_MANGROVE_LOG_STAIRS = ITEMS.register("stripped_mangrove_log_stairs",
            () -> new FuelBlockItem(StairBlockMod.STRIPPED_MANGROVE_LOG_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_CRIMSON_STEM_STAIRS = ITEMS.register("stripped_crimson_stem_stairs",
            () -> new BlockItem(StairBlockMod.STRIPPED_CRIMSON_STEM_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final  RegistryObject<BlockItem> STRIPPED_WARPED_STEM_STAIRS = ITEMS.register("stripped_warped_stem_stairs",
            () -> new BlockItem(StairBlockMod.STRIPPED_WARPED_STEM_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final  RegistryObject<BlockItem> OAK_WOOD_STAIRS = ITEMS.register("oak_wood_stairs",
            () -> new FuelBlockItem(StairBlockMod.OAK_WOOD_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> SPRUCE_WOOD_STAIRS = ITEMS.register("spruce_wood_stairs",
            () -> new FuelBlockItem(StairBlockMod.SPRUCE_WOOD_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> BIRCH_WOOD_STAIRS = ITEMS.register("birch_wood_stairs",
            () -> new FuelBlockItem(StairBlockMod.BIRCH_WOOD_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> JUNGLE_WOOD_STAIRS = ITEMS.register("jungle_wood_stairs",
            () -> new FuelBlockItem(StairBlockMod.JUNGLE_WOOD_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> ACACIA_WOOD_STAIRS = ITEMS.register("acacia_wood_stairs",
            () -> new FuelBlockItem(StairBlockMod.ACACIA_WOOD_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> DARK_OAK_WOOD_STAIRS = ITEMS.register("dark_oak_wood_stairs",
            () -> new FuelBlockItem(StairBlockMod.DARK_OAK_WOOD_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> MANGROVE_WOOD_STAIRS = ITEMS.register("mangrove_wood_stairs",
            () -> new FuelBlockItem(StairBlockMod.MANGROVE_WOOD_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> CRIMSON_HYPHAE_STAIRS = ITEMS.register("crimson_hyphae_stairs",
            () -> new BlockItem(StairBlockMod.CRIMSON_HYPHAE_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final  RegistryObject<BlockItem> WARPED_HYPHAE_STAIRS = ITEMS.register("warped_hyphae_stairs",
            () -> new BlockItem(StairBlockMod.WARPED_HYPHAE_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final  RegistryObject<BlockItem> STRIPPED_OAK_WOOD_STAIRS = ITEMS.register("stripped_oak_wood_stairs",
            () -> new FuelBlockItem(StairBlockMod.STRIPPED_OAK_WOOD_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_SPRUCE_WOOD_STAIRS = ITEMS.register("stripped_spruce_wood_stairs",
            () -> new FuelBlockItem(StairBlockMod.STRIPPED_SPRUCE_WOOD_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_BIRCH_WOOD_STAIRS = ITEMS.register("stripped_birch_wood_stairs",
            () -> new FuelBlockItem(StairBlockMod.STRIPPED_BIRCH_WOOD_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_JUNGLE_WOOD_STAIRS = ITEMS.register("stripped_jungle_wood_stairs",
            () -> new FuelBlockItem(StairBlockMod.STRIPPED_JUNGLE_WOOD_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_ACACIA_WOOD_STAIRS = ITEMS.register("stripped_acacia_wood_stairs",
            () -> new FuelBlockItem(StairBlockMod.STRIPPED_ACACIA_WOOD_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_DARK_OAK_WOOD_STAIRS = ITEMS.register("stripped_dark_oak_wood_stairs",
            () -> new FuelBlockItem(StairBlockMod.STRIPPED_DARK_OAK_WOOD_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_MANGROVE_WOOD_STAIRS = ITEMS.register("stripped_mangrove_wood_stairs",
            () -> new FuelBlockItem(StairBlockMod.STRIPPED_MANGROVE_WOOD_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_CRIMSON_HYPHAE_STAIRS = ITEMS.register("stripped_crimson_hyphae_stairs",
            () -> new BlockItem(StairBlockMod.STRIPPED_CRIMSON_HYPHAE_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final  RegistryObject<BlockItem> STRIPPED_WARPED_HYPHAE_STAIRS = ITEMS.register("stripped_warped_hyphae_stairs",
            () -> new BlockItem(StairBlockMod.STRIPPED_WARPED_HYPHAE_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> WHITE_WOOL_STAIRS = ITEMS.register("white_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.WHITE_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> ORANGE_WOOL_STAIRS = ITEMS.register("orange_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.ORANGE_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> MAGENTA_WOOL_STAIRS = ITEMS.register("magenta_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.MAGENTA_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> LIGHT_BLUE_WOOL_STAIRS = ITEMS.register("light_blue_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.LIGHT_BLUE_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> YELLOW_WOOL_STAIRS = ITEMS.register("yellow_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.YELLOW_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> LIME_WOOL_STAIRS = ITEMS.register("lime_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.LIME_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> PINK_WOOL_STAIRS = ITEMS.register("pink_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.PINK_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> GRAY_WOOL_STAIRS = ITEMS.register("gray_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.GRAY_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> LIGHT_GRAY_WOOL_STAIRS = ITEMS.register("light_gray_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.LIGHT_GRAY_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> CYAN_WOOL_STAIRS = ITEMS.register("cyan_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.CYAN_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> PURPLE_WOOL_STAIRS = ITEMS.register("purple_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.PURPLE_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> BLUE_WOOL_STAIRS = ITEMS.register("blue_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.BLUE_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> BROWN_WOOL_STAIRS = ITEMS.register("brown_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.BROWN_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> GREEN_WOOL_STAIRS = ITEMS.register("green_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.GREEN_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> RED_WOOL_STAIRS = ITEMS.register("red_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.RED_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    public static final RegistryObject<BlockItem> BLACK_WOOL_STAIRS = ITEMS.register("black_wool_stairs",
            () -> new FuelBlockItem(StairBlockMod.BLACK_WOOL_STAIRS.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 100));

    //WALL
    public static final  RegistryObject<BlockItem> OAK_WOOD_WALL = ITEMS.register("oak_wood_wall",
            () -> new FuelBlockItem(WallBlockMod.OAK_WOOD_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final  RegistryObject<BlockItem> SPRUCE_WOOD_WALL = ITEMS.register("spruce_wood_wall",
            () -> new FuelBlockItem(WallBlockMod.SPRUCE_WOOD_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final  RegistryObject<BlockItem> BIRCH_WOOD_WALL = ITEMS.register("birch_wood_wall",
            () -> new FuelBlockItem(WallBlockMod.BIRCH_WOOD_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final  RegistryObject<BlockItem> JUNGLE_WOOD_WALL = ITEMS.register("jungle_wood_wall",
            () -> new FuelBlockItem(WallBlockMod.JUNGLE_WOOD_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final  RegistryObject<BlockItem> ACACIA_WOOD_WALL = ITEMS.register("acacia_wood_wall",
            () -> new FuelBlockItem(WallBlockMod.ACACIA_WOOD_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final  RegistryObject<BlockItem> DARK_OAK_WOOD_WALL = ITEMS.register("dark_oak_wood_wall",
            () -> new FuelBlockItem(WallBlockMod.DARK_OAK_WOOD_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final  RegistryObject<BlockItem> MANGROVE_WOOD_WALL = ITEMS.register("mangrove_wood_wall",
            () -> new FuelBlockItem(WallBlockMod.MANGROVE_WOOD_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final  RegistryObject<BlockItem> CRIMSON_HYPHAE_WALL = ITEMS.register("crimson_hyphae_wall",
            () -> new BlockItem(WallBlockMod.CRIMSON_HYPHAE_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final  RegistryObject<BlockItem> WARPED_HYPHAE_WALL = ITEMS.register("warped_hyphae_wall",
            () -> new BlockItem(WallBlockMod.WARPED_HYPHAE_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final  RegistryObject<BlockItem> STRIPPED_OAK_WOOD_WALL = ITEMS.register("stripped_oak_wood_wall",
            () -> new FuelBlockItem(WallBlockMod.STRIPPED_OAK_WOOD_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_SPRUCE_WOOD_WALL = ITEMS.register("stripped_spruce_wood_wall",
            () -> new FuelBlockItem(WallBlockMod.STRIPPED_SPRUCE_WOOD_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_BIRCH_WOOD_WALL = ITEMS.register("stripped_birch_wood_wall",
            () -> new FuelBlockItem(WallBlockMod.STRIPPED_BIRCH_WOOD_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_JUNGLE_WOOD_WALL = ITEMS.register("stripped_jungle_wood_wall",
            () -> new FuelBlockItem(WallBlockMod.STRIPPED_JUNGLE_WOOD_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_ACACIA_WOOD_WALL = ITEMS.register("stripped_acacia_wood_wall",
            () -> new FuelBlockItem(WallBlockMod.STRIPPED_ACACIA_WOOD_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_DARK_OAK_WOOD_WALL = ITEMS.register("stripped_dark_oak_wood_wall",
            () -> new FuelBlockItem(WallBlockMod.STRIPPED_DARK_OAK_WOOD_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_MANGROVE_WOOD_WALL = ITEMS.register("stripped_mangrove_wood_wall",
            () -> new FuelBlockItem(WallBlockMod.STRIPPED_MANGROVE_WOOD_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS), 300));

    public static final  RegistryObject<BlockItem> STRIPPED_CRIMSON_HYPHAE_WALL = ITEMS.register("stripped_crimson_hyphae_wall",
            () -> new BlockItem(WallBlockMod.STRIPPED_CRIMSON_HYPHAE_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));

    public static final  RegistryObject<BlockItem> STRIPPED_WARPED_HYPHAE_WALL = ITEMS.register("stripped_warped_hyphae_wall",
            () -> new BlockItem(WallBlockMod.STRIPPED_WARPED_HYPHAE_WALL.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
}
