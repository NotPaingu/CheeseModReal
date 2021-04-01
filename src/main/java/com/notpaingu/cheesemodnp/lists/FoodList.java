package com.notpaingu.cheesemodnp.lists;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodList {

        public static final Food CHEESE_PUFFERFISH = (
                new Food.Builder()
                        .hunger(1)
                        .saturation(0.2f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_COOKIE = (
                new Food.Builder()
                        .hunger(2)
                        .saturation(0.4f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_DRIED_KELP = (
                new Food.Builder()
                        .hunger(1)
                        .saturation(0.6f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_ROTTEN_FLESH = (
                new Food.Builder()
                        .hunger(4)
                        .saturation(0.8f)
                        .effect(new EffectInstance(Effects.HUNGER, 700), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEEESE_BEETROOT = (
                new Food.Builder()
                        .hunger(1)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_MELON_SLICE = (
                new Food.Builder()
                        .hunger(2)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_POISONOUS_POTATO = (
                new Food.Builder()
                        .hunger(2)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .effect(new EffectInstance(Effects.POISON, 100), 0.6f)
                        .build()
        );
        public static final Food CHEESE_RAW_CHICKEN = (
                new Food.Builder()
                        .hunger(2)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .effect(new EffectInstance(Effects.HUNGER, 600), 0.3f)
                        .build()
        );
        public static final Food CHEESE_RAW_BEEF = (
                new Food.Builder()
                        .hunger(3)
                        .saturation(1.8f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_APPLE = (
                new Food.Builder()
                        .hunger(4)
                        .saturation(2.4f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_SPIDER_EYE = (
                new Food.Builder()
                        .hunger(2)
                        .saturation(3.2f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_CARROT = (
                new Food.Builder()
                        .hunger(3)
                        .saturation(3.6f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_PUMPKIN_PIE = (
                new Food.Builder()
                        .hunger(8)
                        .saturation(4.8f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_BAKED_POTATO = (
                new Food.Builder()
                        .hunger(5)
                        .saturation(6.0f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_BEETROOT_SOUP = (
                new Food.Builder()
                        .hunger(6)
                        .saturation(7.2f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_GOLDEN_APPLE = (
                new Food.Builder()
                        .hunger(4)
                        .saturation(9.6f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .effect(new EffectInstance(Effects.REGENERATION, 100, 2), 1f)
                        .effect(new EffectInstance(Effects.ABSORPTION, 2400), 1f)
                        .build()
        );
        public static final Food GOD_CHEESE = (
                new Food.Builder()
                        .hunger(4)
                        .saturation(9.6f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .effect(new EffectInstance(Effects.REGENERATION, 600, 2), 1f)
                        .effect(new EffectInstance(Effects.ABSORPTION, 2400, 4), 1f)
                        .effect(new EffectInstance(Effects.RESISTANCE, 6000), 1f)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 6000), 1f)
                        .build()
        );
        public static final Food CHEESE_COOKED_MUTTON = (
                new Food.Builder()
                        .hunger(6)
                        .saturation(9.6f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_RABBIT_STEW = (
                new Food.Builder()
                        .hunger(10)
                        .saturation(12f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_COOKED_PORKCHOP = (
                new Food.Builder()
                        .hunger(8)
                        .saturation(12.8f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
        public static final Food CHEESE_GOLDEN_CARROT = (
                new Food.Builder()
                        .hunger(6)
                        .saturation(14.4f)
                        .effect(new EffectInstance(Effects.HUNGER, 100), 1f)
                        .effect(new EffectInstance(Effects.SLOWNESS, 100), 1f)
                        .build()
        );
}
