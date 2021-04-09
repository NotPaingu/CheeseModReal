package com.notpaingu.cheesemodnp.items;

import com.notpaingu.cheesemodnp.Main;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CheesePufferfish extends Item {
    public CheesePufferfish() {
        super(new Item.Properties().group(Main.CHEESE).food(
                new Food.Builder()
                        .hunger(1)
                        .saturation(0.2f)
                        .effect(new EffectInstance(Effects.HUNGER, 300, 3), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .effect(new EffectInstance(Effects.NAUSEA, 300), 1f)
                        .effect(new EffectInstance(Effects.POISON, 1200, 4), 1f)
                .build()
        ));
    }
}
