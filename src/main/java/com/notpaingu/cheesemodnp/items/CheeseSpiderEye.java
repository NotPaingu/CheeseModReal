package com.notpaingu.cheesemodnp.items;

import com.notpaingu.cheesemodnp.Main;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CheeseSpiderEye extends Item {
    public CheeseSpiderEye() {
        super(new Item.Properties().group(Main.CHEESE).food(
                new Food.Builder()
                        .hunger(2)
                        .saturation(3.2f)
                        .effect(new EffectInstance(Effects.HUNGER, 120), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 120), 1f)
                        .effect(new EffectInstance(Effects.POISON, 120), 1f)
                        .build()
        ));
    }
}
