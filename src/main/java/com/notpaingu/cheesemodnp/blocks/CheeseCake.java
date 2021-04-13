package com.notpaingu.cheesemodnp.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class CheeseCake extends CakeBlock {
    public CheeseCake() {
        super(AbstractBlock.Properties.create(Material.CAKE).noDrops());
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        player.addPotionEffect(new EffectInstance(Effects.HUNGER, 120));
        player.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 120));
        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }
}
