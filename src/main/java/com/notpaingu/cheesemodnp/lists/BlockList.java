package com.notpaingu.cheesemodnp.lists;

import com.notpaingu.cheesemodnp.blocks.CheeseCake;
import com.notpaingu.cheesemodnp.blocks.CheesePotBlock;
import com.notpaingu.cheesemodnp.blocks.MicrobeOre;
import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {
    public static final DeferredRegister<Block> UNSTACKABLEBLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "cheesemodnp");
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "cheesemodnp");

    public static final RegistryObject<Block> CHEESEPOT = BLOCKS.register("cheesepot", CheesePotBlock::new);
    public static final RegistryObject<Block> MICROBE_ORE = BLOCKS.register("microbe_ore", MicrobeOre::new);

    public static final RegistryObject<CheeseCake> CHEESECAKE = UNSTACKABLEBLOCKS.register("cheesecake", CheeseCake::new);

}
