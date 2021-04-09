package com.notpaingu.cheesemodnp.items;

import com.notpaingu.cheesemodnp.Main;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CheeseRottenFlesh extends Item {
    public CheeseRottenFlesh() {
        super(new Item.Properties().group(Main.CHEESE).food(
                new Food.Builder()
                        .hunger(4)
                        .saturation(0.8f)
                        .effect(new EffectInstance(Effects.HUNGER, 120), 1f)
                        .effect(new EffectInstance(Effects.HUNGER, 600), 0.8f)
                        .effect(new EffectInstance(Effects.NAUSEA, 120), 0.2f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 120), 1f)
                        .build()
        ));
    }
}
