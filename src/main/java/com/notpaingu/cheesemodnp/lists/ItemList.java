package com.notpaingu.cheesemodnp.lists;

import com.notpaingu.cheesemodnp.items.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemList {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "cheesemodnp");

    public static final RegistryObject<CheeseHoneyBottle> CHEESE_HONEY_BOTTLE = ITEMS.register("cheese_honey_bottle", CheeseHoneyBottle::new);
    public static final RegistryObject<CheeseFood> CHEESE = ITEMS.register("cheese", () -> new CheeseFood(4, 9.6f));
    public static final RegistryObject<CheeseFood> CHEESE_BEETROOT = ITEMS.register("cheese_beetroot", () -> new CheeseFood(1, 1.2f));
    public static final RegistryObject<CheeseFood> CHEESE_APPLE = ITEMS.register("cheese_apple", () -> new CheeseFood(4, 2.4f));
    public static final RegistryObject<CheeseFood> CHEESE_BAKED_POTATO = ITEMS.register("cheese_baked_potato", () -> new CheeseFood(5, 6.0f));
    public static final RegistryObject<CheesePufferfish> CHEESE_PUFFERFISH = ITEMS.register("cheese_pufferfish", CheesePufferfish::new);
    public static final RegistryObject<CheeseFood> CHEESE_TROPICAL_FISH = ITEMS.register("cheese_tropical_fish", () -> new CheeseFood(1, 0.2f));
    public static final RegistryObject<CheeseFood> CHEESE_COOKIE = ITEMS.register("cheese_cookie", () -> new CheeseFood(2, 0.4f));
    public static final RegistryObject<CheeseFood> CHEESE_RAW_COD = ITEMS.register("cheese_raw_cod", () -> new CheeseFood(2, 0.4f));
    public static final RegistryObject<CheeseFood> CHEESE_RAW_SALMON = ITEMS.register("cheese_raw_salmon", () -> new CheeseFood(2, 0.4f));
    public static final RegistryObject<CheeseFood> CHEESE_SWEET_BERRIES = ITEMS.register("cheese_sweet_berries", () -> new CheeseFood(2, 0.4f));
    public static final RegistryObject<CheeseFood> CHEESE_DRIED_KELP = ITEMS.register("cheese_dried_kelp", () -> new CheeseFood(1, 0.6f));
    public static final RegistryObject<CheeseFood> CHEESE_POTATO = ITEMS.register("cheese_potato", () -> new CheeseFood(1, 0.6f));
    public static final RegistryObject<CheeseRottenFlesh> CHEESE_ROTTEN_FLESH = ITEMS.register("cheese_rotten_flesh", CheeseRottenFlesh::new);
    public static final RegistryObject<CheeseFood> CHEESE_MELON_SLICE = ITEMS.register("cheese_melon_slice", () -> new CheeseFood(2, 1.2f));
    public static final RegistryObject<CheesePoisonousPotato> CHEESE_POISONOUS_POTATO = ITEMS.register("cheese_poisonous_potato", CheesePoisonousPotato::new);
    public static final RegistryObject<CheeseRawChicken> CHEESE_RAW_CHICKEN = ITEMS.register("cheese_raw_chicken", CheeseRawChicken::new);
    public static final RegistryObject<CheeseFood> CHEESE_RAW_MUTTON = ITEMS.register("cheese_raw_mutton", () -> new CheeseFood(2, 1.2f));
    public static final RegistryObject<CheeseFood> CHEESE_RAW_BEEF = ITEMS.register("cheese_raw_beef", () -> new CheeseFood(3, 1.8f));
    public static final RegistryObject<CheeseFood> CHEESE_RAW_PORKCHOP = ITEMS.register("cheese_raw_porkchop", () -> new CheeseFood(3, 1.8f));
    public static final RegistryObject<CheeseFood> CHEESE_RAW_RABBIT = ITEMS.register("cheese_raw_rabbit", () -> new CheeseFood(3, 1.8f));
    public static final RegistryObject<CheeseFood> CHEESE_CHORUS_FRUIT = ITEMS.register("cheese_chorus_fruit", () -> new CheeseFood(4, 2.4f));
    public static final RegistryObject<CheeseSpiderEye> CHEESE_SPIDER_EYE = ITEMS.register("cheese_spider_eye", CheeseSpiderEye::new);
    public static final RegistryObject<CheeseFood> CHEESE_CARROT = ITEMS.register("cheese_carrot", () -> new CheeseFood(3, 3.6f));
    public static final RegistryObject<CheeseFood> CHEESE_PUMPKIN_PIE = ITEMS.register("cheese_pumpkin_pie", () -> new CheeseFood(8, 4.8f));
    public static final RegistryObject<CheeseFood> CHEESE_BREAD = ITEMS.register("cheese_bread", () -> new CheeseFood(5, 6f));
    public static final RegistryObject<CheeseFood> CHEESE_COOKED_COD = ITEMS.register("cheese_cooked_cod", () -> new CheeseFood(5, 6f));
    public static final RegistryObject<CheeseFood> CHEESE_COOKED_RABBIT = ITEMS.register("cheese_cooked_rabbit", () -> new CheeseFood(5, 6f));
    public static final RegistryObject<CheeseFood> CHEESE_BEETROOT_SOUP = ITEMS.register("cheese_beetroot_soup", () -> new CheeseFood(6, 7.2f));
    public static final RegistryObject<CheeseFood> CHEESE_COOKED_CHICKEN = ITEMS.register("cheese_cooked_chicken", () -> new CheeseFood(6, 7.2f));
    public static final RegistryObject<CheeseFood> CHEESE_MUSHROOM_STEW = ITEMS.register("cheese_mushroom_stew", () -> new CheeseFood(6, 7.2f));
    public static final RegistryObject<CheeseFood> CHEESE_SUSPICIOUS_STEW = ITEMS.register("cheese_suspicious_stew", () -> new CheeseFood(6, 7.2f));
    public static final RegistryObject<GodCheese> GOD_CHEESE = ITEMS.register("god_cheese", GodCheese::new);
    public static final RegistryObject<CheeseGoldenApple> CHEESE_GOLDEN_APPLE = ITEMS.register("cheese_golden_apple", CheeseGoldenApple::new);
    public static final RegistryObject<CheeseFood> CHEESE_COOKED_MUTTON = ITEMS.register("cheese_cooked_mutton", () -> new CheeseFood(6, 9.6f));
    public static final RegistryObject<CheeseFood> CHEESE_COOKED_SALMON = ITEMS.register("cheese_cooked_salmon", () -> new CheeseFood(6, 9.6f));
    public static final RegistryObject<CheeseFood> CHEESE_RABBIT_STEW = ITEMS.register("cheese_rabbit_stew", () -> new CheeseFood(10, 12f));
    public static final RegistryObject<CheeseFood> CHEESE_COOKED_PORKCHOP = ITEMS.register("cheese_cooked_porkchop", () -> new CheeseFood(8, 12.8f));
    public static final RegistryObject<CheeseFood> CHEESE_STEAK = ITEMS.register("cheese_steak", () -> new CheeseFood(8, 12.8f));
    public static final RegistryObject<CheeseFood> CHEESE_GOLDEN_CARROT = ITEMS.register("cheese_golden_carrot", () -> new CheeseFood(6, 14.4f));

    public static final RegistryObject<Item> MICROBE = ITEMS.register("microbe", ItemBase::new);
}
