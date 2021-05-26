package com.notpaingu.cheesemodnp.lists;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PotionList {

    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTION_TYPES, "cheesemodnp");

    //cheese infused regeneration potions
    public static final RegistryObject<Potion> CHEESE_REGEN_POTION = POTIONS.register("cheese_regen", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 900), new EffectInstance(Effects.HUNGER, 900), new EffectInstance(Effects.REGENERATION, 900)));
    public static final RegistryObject<Potion> STRONG_CHEESE_REGEN_POTION = POTIONS.register("strong_cheese_regen", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 1800), new EffectInstance(Effects.HUNGER, 1800), new EffectInstance(Effects.REGENERATION, 1800)));
    public static final RegistryObject<Potion> LONG_CHEESE_REGEN_POTION = POTIONS.register("long_cheese_regen", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 440, 2), new EffectInstance(Effects.HUNGER, 440, 2), new EffectInstance(Effects.REGENERATION, 440, 2)));

    //cheese infused speed potions
    public static final RegistryObject<Potion> CHEESE_SPEED_POTION = POTIONS.register("cheese_speed", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 3600), new EffectInstance(Effects.SPEED, 3600)));
    public static final RegistryObject<Potion> STRONG_CHEESE_SPEED_POTION = POTIONS.register("strong_cheese_speed", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 9600), new EffectInstance(Effects.SPEED, 9600)));
    public static final RegistryObject<Potion> LONG_CHEESE_SPEED_POTION = POTIONS.register("long_cheese_speed", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 1800, 2), new EffectInstance(Effects.HUNGER, 1800, 2), new EffectInstance(Effects.SPEED, 1800, 2)));

    //cheese infused fire resistance potions
    public static final RegistryObject<Potion> CHEESE_FIRE_RESISTANCE_POTION = POTIONS.register("cheese_fire_resistance", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 3600), new EffectInstance(Effects.FIRE_RESISTANCE, 3600)));
    public static final RegistryObject<Potion> LONG_CHEESE_FIRE_RESISTANCE_POTION = POTIONS.register("long_cheese_fire_resistance", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 9600), new EffectInstance(Effects.FIRE_RESISTANCE, 9600)));

    //cheese infused poison potions
    public static final RegistryObject<Potion> CHEESE_POISON_POTION = POTIONS.register("cheese_poison", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 900), new EffectInstance(Effects.HUNGER, 900), new EffectInstance(Effects.POISON, 900)));
    public static final RegistryObject<Potion> STRONG_CHEESE_POISON_POTION = POTIONS.register("strong_cheese_poison", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 1800), new EffectInstance(Effects.HUNGER, 1800), new EffectInstance(Effects.POISON, 1800)));
    public static final RegistryObject<Potion> LONG_CHEESE_POISON_POTION = POTIONS.register("long_cheese_poison", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 432, 2), new EffectInstance(Effects.HUNGER, 432, 2), new EffectInstance(Effects.POISON, 432, 2)));

    //cheese infused healing potions
    public static final RegistryObject<Potion> CHEESE_HEALING_POTION = POTIONS.register("cheese_healing", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 1), new EffectInstance(Effects.HUNGER, 1), new EffectInstance(Effects.INSTANT_HEALTH)));
    public static final RegistryObject<Potion> STRONG_CHEESE_HEALING_POTION = POTIONS.register("strong_cheese_healing", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 1, 2), new EffectInstance(Effects.HUNGER, 1, 2), new EffectInstance(Effects.INSTANT_HEALTH, 1,  2)));

    //cheese infused night vision potions
    public static final RegistryObject<Potion> CHEESE_NIGHT_VISION_POTION = POTIONS.register("cheese_night_vision", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 3600), new EffectInstance(Effects.NIGHT_VISION, 3600)));
    public static final RegistryObject<Potion> LONG_CHEESE_NIGHT_VISION_POTION = POTIONS.register("long_cheese_night_vision", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 9600), new EffectInstance(Effects.NIGHT_VISION, 9600)));

    //cheese infused strength potions
    public static final RegistryObject<Potion> CHEESE_STRENGTH_POTION = POTIONS.register("cheese_strength", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 3600), new EffectInstance(Effects.STRENGTH, 3600)));
    public static final RegistryObject<Potion> STRONG_CHEESE_STRENGTH_POTION = POTIONS.register("strong_cheese_strength", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 1800, 2), new EffectInstance(Effects.HUNGER, 1800, 2), new EffectInstance(Effects.STRENGTH, 1800, 2)));
    public static final RegistryObject<Potion> LONG_CHEESE_STRENGTH_POTION = POTIONS.register("long_cheese_strength", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 9600), new EffectInstance(Effects.STRENGTH, 9600)));

    //cheese infused leaping potions
    public static final RegistryObject<Potion> CHEESE_LEAPING_POTION = POTIONS.register("cheese_leaping", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 3600), new EffectInstance(Effects.JUMP_BOOST, 3600)));
    public static final RegistryObject<Potion> STRONG_CHEESE_LEAPING_POTION = POTIONS.register("strong_cheese_leaping", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 9600), new EffectInstance(Effects.JUMP_BOOST, 9600)));
    public static final RegistryObject<Potion> LONG_CHEESE_LEAPING_POTION = POTIONS.register("long_cheese_leaping", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 1800, 2), new EffectInstance(Effects.HUNGER, 1800, 2), new EffectInstance(Effects.JUMP_BOOST, 1800, 2)));

    //cheese infused water breathing potions
    public static final RegistryObject<Potion> CHEESE_WATER_BREATHING_POTION = POTIONS.register("cheese_water_breathing", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 3600), new EffectInstance(Effects.WATER_BREATHING, 3600)));
    public static final RegistryObject<Potion> LONG_CHEESE_WATER_BREATHING_POTION = POTIONS.register("long_cheese_water_breathing", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 9600), new EffectInstance(Effects.WATER_BREATHING, 9600)));

    //cheese infused invisibility potions
    public static final RegistryObject<Potion> CHEESE_INVISIBILITY_POTION = POTIONS.register("cheese_invisibility", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 3600), new EffectInstance(Effects.INVISIBILITY, 3600)));
    public static final RegistryObject<Potion> LONG_CHEESE_INVISIBILITY_POTION = POTIONS.register("long_cheese_invisibility", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 9600), new EffectInstance(Effects.INVISIBILITY, 9600)));

    //cheese infused slow falling potions
    public static final RegistryObject<Potion> CHEESE_SLOW_FALLING_POTION = POTIONS.register("cheese_slow_falling", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 1800), new EffectInstance(Effects.HUNGER, 1800), new EffectInstance(Effects.SLOW_FALLING, 1800)));
    public static final RegistryObject<Potion> LONG_CHEESE_SLOW_FALLING_POTION = POTIONS.register("long_cheese_slow_falling", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 4800), new EffectInstance(Effects.HUNGER, 4800), new EffectInstance(Effects.SLOW_FALLING, 4800)));

    //cheese infused luck potion
    public static final RegistryObject<Potion> CHEESE_LUCK_POTION = POTIONS.register("cheese_luck", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 6000), new EffectInstance(Effects.HUNGER, 6000), new EffectInstance(Effects.LUCK, 6000)));

    //cheese infused weakness potions
    public static RegistryObject<Potion> CHEESE_WEAKNESS_POTION = POTIONS.register("cheese_weakness", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 1800), new EffectInstance(Effects.HUNGER, 1800), new EffectInstance(Effects.WEAKNESS, 1800)));
    public static RegistryObject<Potion> LONG_CHEESE_WEAKNESS_POTION = POTIONS.register("long_cheese_weakness", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 4800), new EffectInstance(Effects.HUNGER, 4800), new EffectInstance(Effects.WEAKNESS, 4800)));

    //cheese infused slowness potions
    public static RegistryObject<Potion> CHEESE_SLOWNESS_POTION = POTIONS.register("cheese_slowness", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 1800)));
    public static RegistryObject<Potion> STRONG_CHEESE_SLOWNESS_POTION = POTIONS.register("strong_cheese_slowness", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 4800)));
    public static RegistryObject<Potion> LONG_CHEESE_SLOWNESS_POTION = POTIONS.register("long_cheese_slowness", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 800, 2), new EffectInstance(Effects.HUNGER, 400, 2)));

    //cheese infused harming potions
    public static RegistryObject<Potion> CHEESE_HARMING_POTION = POTIONS.register("cheese_harming", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 1), new EffectInstance(Effects.HUNGER, 1), new EffectInstance(Effects.INSTANT_DAMAGE)));
    public static RegistryObject<Potion> STRONG_CHEESE_HARMING_POTION = POTIONS.register("strong_cheese_harming", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 1, 2), new EffectInstance(Effects.HUNGER, 1, 2), new EffectInstance(Effects.INSTANT_DAMAGE, 1,  2)));

    //cheese infused turtle master potions
    public static RegistryObject<Potion> CHEESE_TURTLE_MASTER_POTION = POTIONS.register("cheese_turtle_master", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 400, 4), new EffectInstance(Effects.HUNGER, 400), new EffectInstance(Effects.RESISTANCE, 400, 3)));
    public static RegistryObject<Potion> STRONG_CHEESE_TURTLE_MASTER_POTION = POTIONS.register("strong_cheese_turtle_master", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 800, 4), new EffectInstance(Effects.HUNGER, 800), new EffectInstance(Effects.RESISTANCE, 800, 3)));
    public static RegistryObject<Potion> LONG_CHEESE_TURTLE_MASTER_POTION = POTIONS.register("long_cheese_turtle_master", () -> new Potion(new EffectInstance(Effects.SLOWNESS, 400, 6), new EffectInstance(Effects.HUNGER, 400, 2), new EffectInstance(Effects.RESISTANCE, 400, 4)));

    private static Method brewing_mixes;

    private static void addMix(Potion start, Item ingredient, Potion result) {
        if(brewing_mixes == null) {
            brewing_mixes = ObfuscationReflectionHelper.findMethod(PotionBrewing.class, "func_193357_a", Potion.class, Item.class, Potion.class);
            brewing_mixes.setAccessible(true);
        }
        try {
            brewing_mixes.invoke(null, start, ingredient, result);
        } catch (IllegalAccessException|IllegalArgumentException| InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void addBrewingRecipes() {
        //cheese infused regeneration potions
        addMix(Potions.REGENERATION, ItemList.CHEESE.get(), PotionList.CHEESE_REGEN_POTION.get());
        addMix(Potions.LONG_REGENERATION, ItemList.CHEESE.get(), PotionList.LONG_CHEESE_REGEN_POTION.get());
        addMix(Potions.STRONG_REGENERATION, ItemList.CHEESE.get(), PotionList.STRONG_CHEESE_REGEN_POTION.get());
        addMix(PotionList.CHEESE_REGEN_POTION.get(), Items.REDSTONE, PotionList.LONG_CHEESE_REGEN_POTION.get());
        addMix(PotionList.CHEESE_REGEN_POTION.get(), Items.GLOWSTONE_DUST, PotionList.STRONG_CHEESE_REGEN_POTION.get());

        //cheese infused speed potions
        addMix(Potions.SWIFTNESS, ItemList.CHEESE.get(), PotionList.CHEESE_SPEED_POTION.get());
        addMix(Potions.LONG_SWIFTNESS, ItemList.CHEESE.get(), PotionList.LONG_CHEESE_SPEED_POTION.get());
        addMix(Potions.STRONG_SWIFTNESS, ItemList.CHEESE.get(), PotionList.STRONG_CHEESE_SPEED_POTION.get());
        addMix(PotionList.CHEESE_SPEED_POTION.get(), Items.REDSTONE, PotionList.LONG_CHEESE_SPEED_POTION.get());
        addMix(PotionList.CHEESE_SPEED_POTION.get(), Items.GLOWSTONE_DUST, PotionList.STRONG_CHEESE_SPEED_POTION.get());

        //cheese infused fire resistance potions
        addMix(Potions.FIRE_RESISTANCE, ItemList.CHEESE.get(), PotionList.CHEESE_FIRE_RESISTANCE_POTION.get());
        addMix(Potions.LONG_FIRE_RESISTANCE, ItemList.CHEESE.get(), PotionList.LONG_CHEESE_FIRE_RESISTANCE_POTION.get());
        addMix(PotionList.CHEESE_FIRE_RESISTANCE_POTION.get(), Items.REDSTONE, PotionList.LONG_CHEESE_FIRE_RESISTANCE_POTION.get());

        //cheese infused poison potions
        addMix(Potions.POISON, ItemList.CHEESE.get(), PotionList.CHEESE_POISON_POTION.get());
        addMix(Potions.LONG_POISON, ItemList.CHEESE.get(), PotionList.LONG_CHEESE_POISON_POTION.get());
        addMix(Potions.STRONG_POISON, ItemList.CHEESE.get(), PotionList.STRONG_CHEESE_POISON_POTION.get());
        addMix(PotionList.CHEESE_POISON_POTION.get(), Items.REDSTONE, PotionList.LONG_CHEESE_POISON_POTION.get());
        addMix(PotionList.CHEESE_POISON_POTION.get(), Items.GLOWSTONE_DUST, PotionList.STRONG_CHEESE_POISON_POTION.get());

        //cheese infused healing potions
        addMix(Potions.HEALING, ItemList.CHEESE.get(), PotionList.CHEESE_HEALING_POTION.get());
        addMix(Potions.STRONG_HEALING, ItemList.CHEESE.get(), PotionList.STRONG_CHEESE_HEALING_POTION.get());
        addMix(PotionList.CHEESE_HEALING_POTION.get(), Items.GLOWSTONE_DUST, PotionList.STRONG_CHEESE_HEALING_POTION.get());

        //cheese infused night vision potions
        addMix(Potions.NIGHT_VISION, ItemList.CHEESE.get(), PotionList.CHEESE_NIGHT_VISION_POTION.get());
        addMix(Potions.LONG_NIGHT_VISION, ItemList.CHEESE.get(), PotionList.LONG_CHEESE_NIGHT_VISION_POTION.get());
        addMix(PotionList.CHEESE_NIGHT_VISION_POTION.get(), Items.REDSTONE, PotionList.LONG_CHEESE_NIGHT_VISION_POTION.get());

        //cheese infused strength potions
        addMix(Potions.STRENGTH, ItemList.CHEESE.get(), PotionList.CHEESE_STRENGTH_POTION.get());
        addMix(Potions.LONG_STRENGTH, ItemList.CHEESE.get(), PotionList.LONG_CHEESE_STRENGTH_POTION.get());
        addMix(Potions.STRONG_STRENGTH, ItemList.CHEESE.get(), PotionList.STRONG_CHEESE_STRENGTH_POTION.get());
        addMix(PotionList.CHEESE_STRENGTH_POTION.get(), Items.REDSTONE, PotionList.LONG_CHEESE_STRENGTH_POTION.get());
        addMix(PotionList.CHEESE_STRENGTH_POTION.get(), Items.GLOWSTONE_DUST, PotionList.STRONG_CHEESE_STRENGTH_POTION.get());

        //cheese infused leaping potions
        addMix(Potions.LEAPING, ItemList.CHEESE.get(), PotionList.CHEESE_LEAPING_POTION.get());
        addMix(Potions.LONG_LEAPING, ItemList.CHEESE.get(), PotionList.LONG_CHEESE_LEAPING_POTION.get());
        addMix(Potions.STRONG_LEAPING, ItemList.CHEESE.get(), PotionList.STRONG_CHEESE_LEAPING_POTION.get());
        addMix(PotionList.CHEESE_LEAPING_POTION.get(), Items.REDSTONE, PotionList.LONG_CHEESE_LEAPING_POTION.get());
        addMix(PotionList.CHEESE_LEAPING_POTION.get(), Items.GLOWSTONE_DUST, PotionList.STRONG_CHEESE_LEAPING_POTION.get());

        //cheese infused water breathing potions
        addMix(Potions.WATER_BREATHING, ItemList.CHEESE.get(), PotionList.CHEESE_WATER_BREATHING_POTION.get());
        addMix(Potions.LONG_WATER_BREATHING, ItemList.CHEESE.get(), PotionList.LONG_CHEESE_WATER_BREATHING_POTION.get());
        addMix(PotionList.CHEESE_WATER_BREATHING_POTION.get(), Items.REDSTONE, PotionList.LONG_CHEESE_WATER_BREATHING_POTION.get());

        //cheese infused invisibility potions
        addMix(Potions.INVISIBILITY, ItemList.CHEESE.get(), PotionList.CHEESE_INVISIBILITY_POTION.get());
        addMix(Potions.LONG_INVISIBILITY, ItemList.CHEESE.get(), PotionList.LONG_CHEESE_INVISIBILITY_POTION.get());
        addMix(PotionList.CHEESE_INVISIBILITY_POTION.get(), Items.REDSTONE, PotionList.LONG_CHEESE_INVISIBILITY_POTION.get());

        //cheese infused slow falling potions
        addMix(Potions.SLOW_FALLING, ItemList.CHEESE.get(), PotionList.CHEESE_SLOW_FALLING_POTION.get());
        addMix(Potions.LONG_SLOW_FALLING, ItemList.CHEESE.get(), PotionList.LONG_CHEESE_SLOW_FALLING_POTION.get());
        addMix(PotionList.CHEESE_SLOW_FALLING_POTION.get(), Items.REDSTONE, PotionList.LONG_CHEESE_SLOW_FALLING_POTION.get());

        //cheese infused luck potion
        addMix(Potions.LUCK, ItemList.CHEESE.get(), PotionList.CHEESE_LUCK_POTION.get());

        //cheese infused weakness potions
        addMix(Potions.WEAKNESS, ItemList.CHEESE.get(), PotionList.CHEESE_WEAKNESS_POTION.get());
        addMix(Potions.LONG_WEAKNESS, ItemList.CHEESE.get(), PotionList.LONG_CHEESE_WEAKNESS_POTION.get());
        addMix(PotionList.CHEESE_WEAKNESS_POTION.get(), Items.REDSTONE, PotionList.LONG_CHEESE_WEAKNESS_POTION.get());

        //cheese infused slowness potions
        addMix(Potions.SLOWNESS, ItemList.CHEESE.get(), PotionList.CHEESE_SLOWNESS_POTION.get());
        addMix(Potions.LONG_SLOWNESS, ItemList.CHEESE.get(), PotionList.LONG_CHEESE_SLOWNESS_POTION.get());
        addMix(Potions.STRONG_SLOWNESS, ItemList.CHEESE.get(), PotionList.STRONG_CHEESE_SLOWNESS_POTION.get());
        addMix(PotionList.CHEESE_SLOWNESS_POTION.get(), Items.REDSTONE, PotionList.LONG_CHEESE_SLOWNESS_POTION.get());
        addMix(PotionList.CHEESE_SLOWNESS_POTION.get(), Items.GLOWSTONE_DUST, PotionList.STRONG_CHEESE_SLOWNESS_POTION.get());

        //cheese infused harming potions
        addMix(Potions.HARMING, ItemList.CHEESE.get(), PotionList.CHEESE_HARMING_POTION.get());
        addMix(Potions.STRONG_HARMING, ItemList.CHEESE.get(), PotionList.STRONG_CHEESE_HARMING_POTION.get());
        addMix(PotionList.CHEESE_HARMING_POTION.get(), Items.GLOWSTONE_DUST, PotionList.STRONG_CHEESE_HARMING_POTION.get());

        //cheese infused turtle master potions
        addMix(Potions.TURTLE_MASTER, ItemList.CHEESE.get(), PotionList.CHEESE_TURTLE_MASTER_POTION.get());
        addMix(Potions.LONG_TURTLE_MASTER, ItemList.CHEESE.get(), PotionList.LONG_CHEESE_TURTLE_MASTER_POTION.get());
        addMix(Potions.STRONG_TURTLE_MASTER, ItemList.CHEESE.get(), PotionList.STRONG_CHEESE_TURTLE_MASTER_POTION.get());
        addMix(PotionList.CHEESE_TURTLE_MASTER_POTION.get(), Items.REDSTONE, PotionList.LONG_CHEESE_TURTLE_MASTER_POTION.get());
        addMix(PotionList.CHEESE_TURTLE_MASTER_POTION.get(), Items.GLOWSTONE_DUST, PotionList.STRONG_CHEESE_TURTLE_MASTER_POTION.get());

    }


}
