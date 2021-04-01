package com.notpaingu.cheesemodnp.lists;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.*;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PotionList {
    //cheese infused regeneration potions
    public static Potion cheese_regen_potion = null;
    public static Potion strong_cheese_regen_potion = null;
    public static Potion long_cheese_regen_potion = null;

    //cheese infused speed potions
    public static Potion cheese_speed_potion = null;
    public static Potion strong_cheese_speed_potion = null;
    public static Potion long_cheese_speed_potion = null;

    //cheese infused fire resistance potions
    public static Potion cheese_fire_resistance_potion = null;
    public static Potion long_cheese_fire_resistance_potion = null;

    //cheese infused poison potions
    public static Potion cheese_poison_potion = null;
    public static Potion strong_cheese_poison_potion = null;
    public static Potion long_cheese_poison_potion = null;

    //cheese infused healing potions
    public static Potion cheese_healing_potion = null;
    public static Potion strong_cheese_healing_potion = null;

    //cheese infused night vision potions
    public static Potion cheese_night_vision_potion = null;
    public static Potion long_cheese_night_vision_potion = null;

    //cheese infused strength potions
    public static Potion cheese_strength_potion = null;
    public static Potion strong_cheese_strength_potion = null;
    public static Potion long_cheese_strength_potion = null;

    //cheese infused leaping potions
    public static Potion cheese_leaping_potion = null;
    public static Potion strong_cheese_leaping_potion = null;
    public static Potion long_cheese_leaping_potion = null;

    //cheese infused water breathing potions
    public static Potion cheese_water_breathing_potion = null;
    public static Potion long_cheese_water_breathing_potion = null;

    //cheese infused invisibility potions
    public static Potion cheese_invisibility_potion = null;
    public static Potion long_cheese_invisibility_potion = null;

    //cheese infused slow falling potions
    public static Potion cheese_slow_falling_potion = null;
    public static Potion long_cheese_slow_falling_potion = null;

    //cheese infused luck potions
    public static Potion cheese_luck_potion = null;

    //cheese infused weakness potions
    public static Potion cheese_weakness_potion = null;
    public static Potion long_cheese_weakness_potion = null;

    //cheese infused slowness potions
    public static Potion cheese_slowness_potion = null;
    public static Potion long_cheese_slowness_potion = null;
    public static Potion strong_cheese_slowness_potion = null;

    //cheese infused harming potions
    public static Potion cheese_harming_potion = null;
    public static Potion strong_cheese_harming_potion = null;

    //cheese infused turtle master potions
    public static Potion cheese_turtle_master_potion = null;
    public static Potion strong_cheese_turtle_master_potion = null;
    public static Potion long_cheese_turtle_master_potion = null;

    private static Method brewing_mixes;

    private static void addMix(Potion start, Item ingredient, Potion result) {
        if(brewing_mixes == null) {
            brewing_mixes = ObfuscationReflectionHelper.findMethod(PotionBrewing.class, "addMix", Potion.class, Item.class, Potion.class);
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
        addMix(Potions.REGENERATION, ItemList.cheese, PotionList.cheese_regen_potion);
        addMix(Potions.LONG_REGENERATION, ItemList.cheese, PotionList.long_cheese_regen_potion);
        addMix(Potions.STRONG_REGENERATION, ItemList.cheese, PotionList.strong_cheese_regen_potion);
        addMix(PotionList.cheese_regen_potion, Items.REDSTONE, PotionList.long_cheese_regen_potion);
        addMix(PotionList.cheese_regen_potion, Items.GLOWSTONE_DUST, PotionList.strong_cheese_regen_potion);

        //cheese infused speed potions
        addMix(Potions.SWIFTNESS, ItemList.cheese, PotionList.cheese_speed_potion);
        addMix(Potions.LONG_SWIFTNESS, ItemList.cheese, PotionList.long_cheese_speed_potion);
        addMix(Potions.STRONG_SWIFTNESS, ItemList.cheese, PotionList.strong_cheese_speed_potion);
        addMix(PotionList.cheese_speed_potion, Items.REDSTONE, PotionList.long_cheese_speed_potion);
        addMix(PotionList.cheese_speed_potion, Items.GLOWSTONE_DUST, PotionList.strong_cheese_speed_potion);

        //cheese infused fire resistance potions
        addMix(Potions.FIRE_RESISTANCE, ItemList.cheese, PotionList.cheese_fire_resistance_potion);
        addMix(Potions.LONG_FIRE_RESISTANCE, ItemList.cheese, PotionList.long_cheese_fire_resistance_potion);
        addMix(PotionList.cheese_fire_resistance_potion, Items.REDSTONE, PotionList.long_cheese_fire_resistance_potion);

        //cheese infused poison potions
        addMix(Potions.POISON, ItemList.cheese, PotionList.cheese_poison_potion);
        addMix(Potions.LONG_POISON, ItemList.cheese, PotionList.long_cheese_poison_potion);
        addMix(Potions.STRONG_POISON, ItemList.cheese, PotionList.strong_cheese_poison_potion);
        addMix(PotionList.cheese_poison_potion, Items.REDSTONE, PotionList.long_cheese_poison_potion);
        addMix(PotionList.cheese_poison_potion, Items.GLOWSTONE_DUST, PotionList.strong_cheese_poison_potion);

        //cheese infused healing potions
        addMix(Potions.HEALING, ItemList.cheese, PotionList.cheese_healing_potion);
        addMix(Potions.STRONG_HEALING, ItemList.cheese, PotionList.strong_cheese_healing_potion);
        addMix(PotionList.cheese_healing_potion, Items.GLOWSTONE_DUST, PotionList.strong_cheese_healing_potion);

        //cheese infused night vision potions
        addMix(Potions.NIGHT_VISION, ItemList.cheese, PotionList.cheese_night_vision_potion);
        addMix(Potions.LONG_NIGHT_VISION, ItemList.cheese, PotionList.long_cheese_night_vision_potion);
        addMix(PotionList.cheese_night_vision_potion, Items.REDSTONE, PotionList.long_cheese_night_vision_potion);

        //cheese infused strength potions
        addMix(Potions.STRENGTH, ItemList.cheese, PotionList.cheese_strength_potion);
        addMix(Potions.LONG_STRENGTH, ItemList.cheese, PotionList.long_cheese_strength_potion);
        addMix(Potions.STRONG_STRENGTH, ItemList.cheese, PotionList.strong_cheese_strength_potion);
        addMix(PotionList.cheese_strength_potion, Items.REDSTONE, PotionList.long_cheese_strength_potion);
        addMix(PotionList.cheese_strength_potion, Items.GLOWSTONE_DUST, PotionList.strong_cheese_strength_potion);

        //cheese infused leaping potions
        addMix(Potions.LEAPING, ItemList.cheese, PotionList.cheese_leaping_potion);
        addMix(Potions.LONG_LEAPING, ItemList.cheese, PotionList.long_cheese_leaping_potion);
        addMix(Potions.STRONG_LEAPING, ItemList.cheese, PotionList.strong_cheese_leaping_potion);
        addMix(PotionList.cheese_leaping_potion, Items.REDSTONE, PotionList.long_cheese_leaping_potion);
        addMix(PotionList.cheese_leaping_potion, Items.GLOWSTONE_DUST, PotionList.strong_cheese_leaping_potion);

        //cheese infused water breathing potions
        addMix(Potions.WATER_BREATHING, ItemList.cheese, PotionList.cheese_water_breathing_potion);
        addMix(Potions.LONG_WATER_BREATHING, ItemList.cheese, PotionList.long_cheese_water_breathing_potion);
        addMix(PotionList.cheese_water_breathing_potion, Items.REDSTONE, PotionList.long_cheese_water_breathing_potion);

        //cheese infused invisibility potions
        addMix(Potions.INVISIBILITY, ItemList.cheese, PotionList.cheese_invisibility_potion);
        addMix(Potions.LONG_INVISIBILITY, ItemList.cheese, PotionList.long_cheese_invisibility_potion);
        addMix(PotionList.cheese_invisibility_potion, Items.REDSTONE, PotionList.long_cheese_invisibility_potion);

        //cheese infused slow falling potions
        addMix(Potions.SLOW_FALLING, ItemList.cheese, PotionList.cheese_slow_falling_potion);
        addMix(Potions.LONG_SLOW_FALLING, ItemList.cheese, PotionList.long_cheese_slow_falling_potion);
        addMix(PotionList.cheese_slow_falling_potion, Items.REDSTONE, PotionList.long_cheese_slow_falling_potion);

        //cheese infused luck potion
        addMix(Potions.LUCK, ItemList.cheese, PotionList.cheese_luck_potion);

        //cheese infused weakness potions
        addMix(Potions.WEAKNESS, ItemList.cheese, PotionList.cheese_weakness_potion);
        addMix(Potions.LONG_WEAKNESS, ItemList.cheese, PotionList.long_cheese_weakness_potion);
        addMix(PotionList.cheese_weakness_potion, Items.REDSTONE, PotionList.long_cheese_weakness_potion);

        //cheese infused slowness potions
        addMix(Potions.SLOWNESS, ItemList.cheese, PotionList.cheese_slowness_potion);
        addMix(Potions.LONG_SLOWNESS, ItemList.cheese, PotionList.long_cheese_slowness_potion);
        addMix(Potions.STRONG_SLOWNESS, ItemList.cheese, PotionList.strong_cheese_slowness_potion);
        addMix(PotionList.cheese_slowness_potion, Items.REDSTONE, PotionList.long_cheese_slowness_potion);
        addMix(PotionList.cheese_slowness_potion, Items.GLOWSTONE_DUST, PotionList.strong_cheese_slowness_potion);

        //cheese infused harming potions
        addMix(Potions.HARMING, ItemList.cheese, PotionList.cheese_harming_potion);
        addMix(Potions.STRONG_HARMING, ItemList.cheese, PotionList.strong_cheese_harming_potion);
        addMix(PotionList.cheese_harming_potion, Items.GLOWSTONE_DUST, PotionList.strong_cheese_harming_potion);

        //cheese infused turtle master potions
        addMix(Potions.TURTLE_MASTER, ItemList.cheese, PotionList.cheese_turtle_master_potion);
        addMix(Potions.LONG_TURTLE_MASTER, ItemList.cheese, PotionList.long_cheese_turtle_master_potion);
        addMix(Potions.STRONG_TURTLE_MASTER, ItemList.cheese, PotionList.strong_cheese_turtle_master_potion);
        addMix(PotionList.cheese_turtle_master_potion, Items.REDSTONE, PotionList.long_cheese_turtle_master_potion);
        addMix(PotionList.cheese_turtle_master_potion, Items.GLOWSTONE_DUST, PotionList.strong_cheese_turtle_master_potion);

    }


}
