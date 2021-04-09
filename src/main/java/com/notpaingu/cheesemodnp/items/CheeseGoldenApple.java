package com.notpaingu.cheesemodnp.items;

import com.notpaingu.cheesemodnp.Main;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CheeseGoldenApple extends Item {
    public CheeseGoldenApple() {
        super(new Item.Properties().group(Main.CHEESE).food(
                new Food.Builder()
                        .hunger(4)
                        .saturation(9.6f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .effect(new EffectInstance(Effects.REGENERATION, 2400), 1f)
                        .effect(new EffectInstance(Effects.ABSORPTION, 2400), 1f)
                        .build()
        ));
    }
}
