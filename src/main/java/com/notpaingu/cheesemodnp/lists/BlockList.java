package com.notpaingu.cheesemodnp.lists;

import com.notpaingu.cheesemodnp.blocks.CheeseCake;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockList {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "cheesemodnp");

    public static final RegistryObject<CheeseCake> CHEESECAKE = BLOCKS.register("cheesecake", CheeseCake::new);
}
