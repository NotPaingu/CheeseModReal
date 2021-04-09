package com.notpaingu.cheesemodnp.items;

import com.notpaingu.cheesemodnp.Main;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CheesePoisonousPotato extends Item {
    public CheesePoisonousPotato() {
        super(new Item.Properties().group(Main.CHEESE).food(
                new Food.Builder()
                        .hunger(2)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.HUNGER, 120), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 120), 1f)
                        .effect(new EffectInstance(Effects.POISON, 120), 0.6f)
                        .build()
        ));
    }
}
