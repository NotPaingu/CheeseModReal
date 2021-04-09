package com.notpaingu.cheesemodnp.items;

import com.notpaingu.cheesemodnp.Main;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CheeseFood extends Item {


    public CheeseFood(int hunger, float saturation) {
        super(new Item.Properties().group(Main.CHEESE).food(
                new Food.Builder()

                        .hunger(hunger)
                        .saturation(saturation)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
                )

        );
    }
}
