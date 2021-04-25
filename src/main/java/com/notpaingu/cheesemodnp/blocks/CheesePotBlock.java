package com.notpaingu.cheesemodnp.blocks;

import com.notpaingu.cheesemodnp.lists.ItemList;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.stream.Stream;

public class CheesePotBlock extends Block {

    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(1, 0, 1, 15, 1, 15),
            Block.makeCuboidShape(1, 1, 1, 15, 3, 2),
            Block.makeCuboidShape(1, 1, 2, 2, 3, 15),
            Block.makeCuboidShape(14, 1, 2, 15, 3, 15),
            Block.makeCuboidShape(2, 1, 14, 14, 3, 15),
            Block.makeCuboidShape(7, 3, 7, 9, 15, 9),
            Block.makeCuboidShape(3, 5, 3, 13, 6, 13),
            Block.makeCuboidShape(5, 8, 5, 11, 9, 11),
            Block.makeCuboidShape(6, 11, 6, 10, 12, 10),
            Block.makeCuboidShape(3, 2, 3, 13, 5, 13),
            Block.makeCuboidShape(5, 6, 5, 11, 8, 11),
            Block.makeCuboidShape(6, 9, 6, 10, 11, 10)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    public CheesePotBlock() {
        super(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(15f).sound(SoundType.STONE));

    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {

        ItemStack itemstack = player.getHeldItem(handIn);
        if (itemstack.isEmpty()) {
            return ActionResultType.PASS;
        } else {
            Item item = itemstack.getItem();
                if(item == Items.HONEY_BOTTLE ) {
                    player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_HONEY_BOTTLE.get()));
                } else if(item == Items.BEETROOT) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_BEETROOT.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_BEETROOT.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_BEETROOT.get()), false);
                        }
                } else if(item == Items.APPLE) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_APPLE.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_APPLE.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_APPLE.get()), false);
                        }
                } else if(item == Items.BAKED_POTATO) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_BAKED_POTATO.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_BAKED_POTATO.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_BAKED_POTATO.get()), false);
                        }
                } else if(item == Items.PUFFERFISH) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_PUFFERFISH.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_PUFFERFISH.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_PUFFERFISH.get()), false);
                        }
                } else if(item == Items.TROPICAL_FISH) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_TROPICAL_FISH.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_TROPICAL_FISH.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_TROPICAL_FISH.get()), false);
                        }
                } else if(item == Items.COOKIE) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_COOKIE.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_COOKIE.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_COOKIE.get()), false);
                        }
                } else if(item == Items.COD) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_RAW_COD.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_RAW_COD.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_RAW_COD.get()), false);
                        }
                } else if(item == Items.SALMON) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_RAW_SALMON.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_RAW_SALMON.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_RAW_SALMON.get()), false);
                        }
                } else if(item == Items.SWEET_BERRIES) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_SWEET_BERRIES.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_SWEET_BERRIES.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_SWEET_BERRIES.get()), false);
                        }
                } else if(item == Items.DRIED_KELP) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_DRIED_KELP.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_DRIED_KELP.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_DRIED_KELP.get()), false);
                        }
                } else if(item == Items.POTATO) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_POTATO.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_POTATO.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_POTATO.get()), false);
                        }
                } else if(item == Items.ROTTEN_FLESH) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_ROTTEN_FLESH.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_ROTTEN_FLESH.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_ROTTEN_FLESH.get()), false);
                        }
                } else if(item == Items.MELON_SLICE) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_MELON_SLICE.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_MELON_SLICE.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_MELON_SLICE.get()), false);
                        }
                } else if(item == Items.POISONOUS_POTATO) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_POISONOUS_POTATO.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_POISONOUS_POTATO.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_POISONOUS_POTATO.get()), false);
                        }
                } else if(item == Items.CHICKEN) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_RAW_CHICKEN.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_RAW_CHICKEN.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_RAW_CHICKEN.get()), false);
                        }
                } else if(item == Items.MUTTON) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_RAW_MUTTON.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_RAW_MUTTON.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_RAW_MUTTON.get()), false);
                        }
                } else if(item == Items.BEEF) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_RAW_BEEF.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_RAW_BEEF.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_RAW_BEEF.get()), false);
                        }
                } else if(item == Items.PORKCHOP) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_RAW_PORKCHOP.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_RAW_PORKCHOP.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_RAW_PORKCHOP.get()), false);
                        }
                } else if(item == Items.RABBIT) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_RAW_RABBIT.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_RAW_RABBIT.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_RAW_RABBIT.get()), false);
                        }
                } else if(item == Items.CHORUS_FRUIT) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_CHORUS_FRUIT.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_CHORUS_FRUIT.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_CHORUS_FRUIT.get()), false);
                        }
                } else if(item == Items.SPIDER_EYE) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_SPIDER_EYE.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_SPIDER_EYE.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_SPIDER_EYE.get()), false);
                        }
                } else if(item == Items.CARROT) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_CARROT.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_CARROT.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_CARROT.get()), false);
                        }
                } else if(item == Items.PUMPKIN_PIE) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_PUMPKIN_PIE.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_PUMPKIN_PIE.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_PUMPKIN_PIE.get()), false);
                        }
                } else if(item == Items.BREAD) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_BREAD.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_BREAD.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_BREAD.get()), false);
                        }
                } else if(item == Items.COOKED_COD) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_COOKED_COD.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_COOKED_COD.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_COOKED_COD.get()), false);
                        }
                } else if(item == Items.COOKED_RABBIT) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_COOKED_RABBIT.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_COOKED_RABBIT.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_COOKED_RABBIT.get()), false);
                        }
                } else if(item == Items.BEETROOT_SOUP) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_BEETROOT_SOUP.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_BEETROOT_SOUP.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_BEETROOT_SOUP.get()), false);
                        }
                } else if(item == Items.COOKED_CHICKEN) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_COOKED_CHICKEN.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_COOKED_CHICKEN.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_COOKED_CHICKEN.get()), false);
                        }
                } else if(item == Items.MUSHROOM_STEW) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_MUSHROOM_STEW.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_MUSHROOM_STEW.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_MUSHROOM_STEW.get()), false);
                        }
                } else if(item == Items.SUSPICIOUS_STEW) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_SUSPICIOUS_STEW.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_SUSPICIOUS_STEW.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_SUSPICIOUS_STEW.get()), false);
                        }
                } else if(item == Items.ENCHANTED_GOLDEN_APPLE) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.GOD_CHEESE.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.GOD_CHEESE.get()))) {
                            player.dropItem(new ItemStack(ItemList.GOD_CHEESE.get()), false);
                        }
                } else if(item == Items.GOLDEN_APPLE) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_GOLDEN_APPLE.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_GOLDEN_APPLE.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_GOLDEN_APPLE.get()), false);
                        }
                } else if(item == Items.COOKED_MUTTON) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_COOKED_MUTTON.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_COOKED_MUTTON.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_COOKED_MUTTON.get()), false);
                        }
                } else if(item == Items.COOKED_SALMON) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_COOKED_SALMON.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_COOKED_SALMON.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_COOKED_SALMON.get()), false);
                        }
                } else if(item == Items.RABBIT_STEW) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_RABBIT_STEW.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_RABBIT_STEW.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_RABBIT_STEW.get()), false);
                        }
                } else if(item == Items.COOKED_PORKCHOP) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_COOKED_PORKCHOP.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_COOKED_PORKCHOP.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_COOKED_PORKCHOP.get()), false);
                        }
                } else if(item == Items.COOKED_BEEF) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_STEAK.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_STEAK.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_STEAK.get()), false);
                        }
                } else if(item == Items.GOLDEN_CARROT) {
                    if (!player.abilities.isCreativeMode) {
                        itemstack.shrink(1);
                    }
                    if (itemstack.isEmpty()) {
                            player.setHeldItem(handIn, new ItemStack(ItemList.CHEESE_GOLDEN_CARROT.get()));
                        } else if (!player.inventory.addItemStackToInventory(new ItemStack(ItemList.CHEESE_GOLDEN_CARROT.get()))) {
                            player.dropItem(new ItemStack(ItemList.CHEESE_GOLDEN_CARROT.get()), false);
                        }
                }
            }


        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }
}
