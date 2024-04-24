package dev.anbe_mp4.blockshapes.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class FuelBlockItem extends BlockItem {
    private final int BurnTime;

    public FuelBlockItem(Block block, Properties properties, int burnTime) {
        super(block, properties);
        this.BurnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.BurnTime;
    }
}
