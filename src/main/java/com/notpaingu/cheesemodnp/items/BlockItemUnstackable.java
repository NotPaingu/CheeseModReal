package com.notpaingu.cheesemodnp.items;

import com.notpaingu.cheesemodnp.Main;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemUnstackable extends BlockItem {

    public BlockItemUnstackable(Block blockIn) {
        super(blockIn, new Item.Properties().group(Main.CHEESE).maxStackSize(1));
    }
}
