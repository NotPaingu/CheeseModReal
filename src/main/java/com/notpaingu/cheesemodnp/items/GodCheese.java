package com.notpaingu.cheesemodnp.items;

import com.notpaingu.cheesemodnp.Main;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class GodCheese extends Item {
    public GodCheese() {
        super(new Item.Properties().group(Main.CHEESE).food(
                new Food.Builder()
                        .hunger(4)
                        .saturation(9.6f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .effect(new EffectInstance(Effects.REGENERATION, 600, 7), 1f)
                        .effect(new EffectInstance(Effects.ABSORPTION, 2400, 4), 1f)
                        .effect(new EffectInstance(Effects.RESISTANCE, 6000), 1f)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 6000), 1f)
                        .build()

        ));
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
