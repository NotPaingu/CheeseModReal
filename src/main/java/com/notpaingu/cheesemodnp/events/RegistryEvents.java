package com.notpaingu.cheesemodnp.events;

import com.notpaingu.cheesemodnp.Main;
import com.notpaingu.cheesemodnp.items.CheeseHoneyBottle;
import com.notpaingu.cheesemodnp.lists.FoodList;
import com.notpaingu.cheesemodnp.lists.ItemList;
import com.notpaingu.cheesemodnp.lists.PotionList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {
    public static final Logger LOGGER = Main.LOGGER;
    public static final String MOD_ID = Main.MOD_ID;
    public static final ItemGroup CHEESE = Main.CHEESE;

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "cheesemodnp");

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<CheeseHoneyBottle> CHEESE_HONEY_BOTTLE = ITEMS.register("cheese_honey_bottle", CheeseHoneyBottle::new);
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                ItemList.cheese = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_BAKED_POTATO)).setRegistryName(location("cheese")),
                ItemList.cheese_pufferfish = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_PUFFERFISH)).setRegistryName(location("cheese_pufferfish")),
                ItemList.cheese_tropical_fish = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_PUFFERFISH)).setRegistryName(location("cheese_tropical_fish")),
                ItemList.cheese_cookie = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_COOKIE)).setRegistryName(location("cheese_cookie")),
                ItemList.cheese_raw_cod = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_COOKIE)).setRegistryName(location("cheese_raw_cod")),
                ItemList.cheese_raw_salmon = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_COOKIE)).setRegistryName(location("cheese_raw_salmon")),
                ItemList.cheese_sweet_berries = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_COOKIE)).setRegistryName(location("cheese_sweet_berries")),
                ItemList.cheese_dried_kelp = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_DRIED_KELP)).setRegistryName(location("cheese_dried_kelp")),
                ItemList.cheese_potato = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_DRIED_KELP)).setRegistryName(location("cheese_potato")),
                ItemList.cheese_rotten_flesh = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_ROTTEN_FLESH)).setRegistryName(location("cheese_rotten_flesh")),
                ItemList.cheese_beetroot = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEEESE_BEETROOT)).setRegistryName(location("cheese_beetroot")),
                ItemList.cheese_melon_slice = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_MELON_SLICE)).setRegistryName(location("cheese_melon_slice")),
                ItemList.cheese_poisonous_potato = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_POISONOUS_POTATO)).setRegistryName(location("cheese_poisonous_potato")),
                ItemList.cheese_raw_chicken = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_RAW_CHICKEN)).setRegistryName(location("cheese_raw_chicken")),
                ItemList.cheese_raw_mutton = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_MELON_SLICE)).setRegistryName(location("cheese_raw_mutton")),
                ItemList.cheese_raw_beef = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_RAW_BEEF)).setRegistryName(location("cheese_raw_beef")),
                ItemList.cheese_raw_porkchop = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_RAW_BEEF)).setRegistryName(location("cheese_raw_porkchop")),
                ItemList.cheese_raw_rabbit = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_RAW_BEEF)).setRegistryName(location("cheese_raw_rabbit")),
                ItemList.cheese_apple = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_APPLE)).setRegistryName(location("cheese_apple")),
                ItemList.cheese_chorus_fruit = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_APPLE)).setRegistryName(location("cheese_chorus_fruit")),
                ItemList.cheese_spider_eye = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_SPIDER_EYE)).setRegistryName(location("cheese_spider_eye")),
                ItemList.cheese_carrot = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_CARROT)).setRegistryName(location("cheese_carrot")),
                ItemList.cheese_pumpkin_pie = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_PUMPKIN_PIE)).setRegistryName(location("cheese_pumpkin_pie")),
                ItemList.cheese_baked_potato = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_BAKED_POTATO)).setRegistryName(location("cheese_baked_potato")),
                ItemList.cheese_bread = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_BAKED_POTATO)).setRegistryName(location("cheese_bread")),
                ItemList.cheese_cooked_cod = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_BAKED_POTATO)).setRegistryName(location("cheese_cooked_cod")),
                ItemList.cheese_cooked_rabbit = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_BAKED_POTATO)).setRegistryName(location("cheese_cooked_rabbit")),
                ItemList.cheese_beetroot_soup = new Item(new Item.Properties().maxStackSize(1).group(CHEESE).food(FoodList.CHEESE_BEETROOT_SOUP)).setRegistryName(location("cheese_beetroot_soup")),
                ItemList.cheese_cooked_chicken = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_BEETROOT_SOUP)).setRegistryName(location("cheese_cooked_chicken")),
                ItemList.cheese_mushroom_stew = new Item(new Item.Properties().maxStackSize(1).group(CHEESE).food(FoodList.CHEESE_BEETROOT_SOUP)).setRegistryName(location("cheese_mushroom_soup")),
                ItemList.cheese_suspicious_stew = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_BEETROOT_SOUP)).setRegistryName(location("cheese_suspicious_stew")),
                ItemList.god_cheese = new Item(new Item.Properties().group(CHEESE).food(FoodList.GOD_CHEESE)).setRegistryName(location("god_cheese")),
                ItemList.cheese_golden_apple = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_GOLDEN_APPLE)).setRegistryName(location("cheese_golden_apple")),
                ItemList.cheese_cooked_mutton = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_COOKED_MUTTON)).setRegistryName(location("cheese_cooked_mutton")),
                ItemList.cheese_cooked_salmon = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_COOKED_MUTTON)).setRegistryName(location("cheese_cooked_salmon")),
                ItemList.cheese_rabbit_stew = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_RABBIT_STEW)).setRegistryName(location("cheese_rabbit_stew")),
                ItemList.cheese_steak = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_COOKED_PORKCHOP)).setRegistryName(location("cheese_steak")),
                ItemList.cheese_cooked_porkchop = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_COOKED_PORKCHOP)).setRegistryName(location("cheese_cooked_porkchop")),
                ItemList.cheese_golden_carrot = new Item(new Item.Properties().group(CHEESE).food(FoodList.CHEESE_GOLDEN_CARROT)).setRegistryName(location("cheese_golden_carrot"))



        );
    }

    @SubscribeEvent
    public static void registerPotions(final RegistryEvent.Register<Potion> event) {
        event.getRegistry().registerAll(

                //cheese infused regeneration potions
                PotionList.cheese_regen_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 900), new EffectInstance(Effects.HUNGER, 900), new EffectInstance(Effects.REGENERATION, 900)).setRegistryName(location("cheese_regen")),
                PotionList.long_cheese_regen_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 1800), new EffectInstance(Effects.HUNGER, 1800), new EffectInstance(Effects.REGENERATION, 1800)).setRegistryName(location("long_cheese_regen")),
                PotionList.strong_cheese_regen_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 440, 2), new EffectInstance(Effects.HUNGER, 440, 2), new EffectInstance(Effects.REGENERATION, 440, 2)).setRegistryName(location("strong_cheese_regen")),

                //cheese infused speed potions
                PotionList.cheese_speed_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 3600), new EffectInstance(Effects.SPEED, 3600)).setRegistryName(location("cheese_speed")),
                PotionList.long_cheese_speed_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 9600), new EffectInstance(Effects.SPEED, 9600)).setRegistryName(location("long_cheese_speed")),
                PotionList.strong_cheese_speed_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 1800, 2), new EffectInstance(Effects.HUNGER, 1800, 2), new EffectInstance(Effects.SPEED, 1800, 2)).setRegistryName(location("strong_cheese_speed")),

                //cheese infused fire resistance potions
                PotionList.cheese_fire_resistance_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 3600), new EffectInstance(Effects.FIRE_RESISTANCE, 3600)).setRegistryName(location("cheese_fire_resistance")),
                PotionList.long_cheese_fire_resistance_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 9600), new EffectInstance(Effects.FIRE_RESISTANCE, 9600)).setRegistryName(location("long_cheese_fire_resistance")),

                //cheese infused healing potions
                PotionList.cheese_healing_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 1), new EffectInstance(Effects.HUNGER, 1), new EffectInstance(Effects.INSTANT_HEALTH)).setRegistryName(location("cheese_healing")),
                PotionList.strong_cheese_healing_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 1, 2), new EffectInstance(Effects.HUNGER, 1, 2), new EffectInstance(Effects.INSTANT_HEALTH, 1,  2)).setRegistryName(location("strong_cheese_healing")),

                //cheese infused night vision potions
                PotionList.cheese_night_vision_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 3600), new EffectInstance(Effects.NIGHT_VISION, 3600)).setRegistryName(location("cheese_night_vision")),
                PotionList.long_cheese_night_vision_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 9600), new EffectInstance(Effects.NIGHT_VISION, 9600)).setRegistryName(location("long_cheese_night_vision")),

                //cheese infused strength potions
                PotionList.cheese_strength_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 3600), new EffectInstance(Effects.STRENGTH, 3600)).setRegistryName(location("cheese_strength")),
                PotionList.long_cheese_strength_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 9600), new EffectInstance(Effects.STRENGTH, 9600)).setRegistryName(location("long_cheese_strength")),
                PotionList.strong_cheese_strength_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 1800, 2), new EffectInstance(Effects.HUNGER, 1800, 2), new EffectInstance(Effects.STRENGTH, 1800, 2)).setRegistryName(location("strong_cheese_strength")),

                //cheese infused leaping potions
                PotionList.cheese_leaping_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 3600), new EffectInstance(Effects.JUMP_BOOST, 3600)).setRegistryName(location("cheese_leaping")),
                PotionList.long_cheese_leaping_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 9600), new EffectInstance(Effects.JUMP_BOOST, 9600)).setRegistryName(location("long_cheese_leaping")),
                PotionList.strong_cheese_leaping_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 1800, 2), new EffectInstance(Effects.HUNGER, 1800, 2), new EffectInstance(Effects.JUMP_BOOST, 1800, 2)).setRegistryName(location("strong_cheese_leaping")),

                //cheese infused water breathing potions
                PotionList.cheese_water_breathing_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 3600), new EffectInstance(Effects.WATER_BREATHING, 3600)).setRegistryName(location("cheese_water_breathing")),
                PotionList.long_cheese_water_breathing_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 9600), new EffectInstance(Effects.WATER_BREATHING, 9600)).setRegistryName(location("long_cheese_water_breathing")),

                //cheese infused invisibility potions
                PotionList.cheese_invisibility_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 3600), new EffectInstance(Effects.INVISIBILITY, 3600)).setRegistryName(location("cheese_invisibility")),
                PotionList.long_cheese_invisibility_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 9600), new EffectInstance(Effects.INVISIBILITY, 9600)).setRegistryName(location("long_cheese_invisibility")),

                //cheese infused slow falling potions
                PotionList.cheese_slow_falling_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 1800), new EffectInstance(Effects.HUNGER, 1800), new EffectInstance(Effects.SLOW_FALLING, 1800)).setRegistryName(location("cheese_slow_falling")),
                PotionList.long_cheese_slow_falling_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 4800), new EffectInstance(Effects.HUNGER, 4800), new EffectInstance(Effects.SLOW_FALLING, 4800)).setRegistryName(location("long_cheese_slow_falling")),

                //cheese infused luck potion
                PotionList.cheese_luck_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 6000), new EffectInstance(Effects.HUNGER, 6000), new EffectInstance(Effects.LUCK, 6000)).setRegistryName(location("cheese_luck")),

                //cheese infused poison potions
                PotionList.cheese_poison_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 900), new EffectInstance(Effects.HUNGER, 900), new EffectInstance(Effects.POISON, 900)).setRegistryName(location("cheese_poison")),
                PotionList.long_cheese_poison_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 1800), new EffectInstance(Effects.HUNGER, 1800), new EffectInstance(Effects.POISON, 1800)).setRegistryName(location("long_cheese_poison")),
                PotionList.strong_cheese_poison_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 432, 2), new EffectInstance(Effects.HUNGER, 432, 2), new EffectInstance(Effects.POISON, 432, 2)).setRegistryName(location("strong_cheese_poison")),

                //cheese infused weakness potions
                PotionList.cheese_weakness_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 1800), new EffectInstance(Effects.HUNGER, 1800), new EffectInstance(Effects.WEAKNESS, 1800)).setRegistryName(location("cheese_weakness")),
                PotionList.long_cheese_weakness_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 4800), new EffectInstance(Effects.HUNGER, 4800), new EffectInstance(Effects.WEAKNESS, 4800)).setRegistryName(location("long_cheese_weakness")),

                //cheese infused slowness potions
                PotionList.cheese_slowness_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 3600), new EffectInstance(Effects.HUNGER, 1800)).setRegistryName(location("cheese_slowness")),
                PotionList.long_cheese_slowness_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 9600), new EffectInstance(Effects.HUNGER, 4800)).setRegistryName(location("long_cheese_slowness")),
                PotionList.strong_cheese_slowness_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 800, 2), new EffectInstance(Effects.HUNGER, 400, 2)).setRegistryName(location("strong_cheese_slowness")),

                //cheese infused harming potions
                PotionList.cheese_harming_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 1), new EffectInstance(Effects.HUNGER, 1), new EffectInstance(Effects.INSTANT_DAMAGE)).setRegistryName(location("cheese_harming")),
                PotionList.strong_cheese_harming_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 1, 2), new EffectInstance(Effects.HUNGER, 1, 2), new EffectInstance(Effects.INSTANT_DAMAGE, 1,  2)).setRegistryName(location("strong_cheese_harming")),

                //cheese infused turtle master potions
                PotionList.cheese_turtle_master_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 400, 4), new EffectInstance(Effects.HUNGER, 400), new EffectInstance(Effects.RESISTANCE, 400, 3)).setRegistryName(location("cheese_turtle_master")),
                PotionList.long_cheese_turtle_master_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 800, 4), new EffectInstance(Effects.HUNGER, 800), new EffectInstance(Effects.RESISTANCE, 800, 3)).setRegistryName(location("long_cheese_turtle_master")),
                PotionList.strong_cheese_turtle_master_potion = new Potion(new EffectInstance(Effects.SLOWNESS, 400, 6), new EffectInstance(Effects.HUNGER, 400, 2), new EffectInstance(Effects.RESISTANCE, 400, 4)).setRegistryName(location("strong_cheese_turtle_master"))

        );
    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

}
