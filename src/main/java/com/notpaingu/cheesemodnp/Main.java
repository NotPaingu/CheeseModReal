package com.notpaingu.cheesemodnp;

import com.notpaingu.cheesemodnp.lists.ItemList;
import com.notpaingu.cheesemodnp.lists.PotionList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MOD_ID)
public class Main {
    public static Main instance;
    public static final String MOD_ID = "cheesemodnp";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup CHEESE = new Main.CheeseGroup("cheese_group");
    public Main() {
        instance = this;

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemList.ITEMS.register(modEventBus);
        PotionList.POTIONS.register(modEventBus);

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);

        ItemList.ITEMS.register(modEventBus);
    }

    private void setup(final FMLCommonSetupEvent event) {
        PotionList.addBrewingRecipes();
    }

    private void clientSetup(final FMLClientSetupEvent event) {

    }

    public static class CheeseGroup extends ItemGroup {

        public CheeseGroup(String name) {
            super(name);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemList.CHEESE.get());
        }
    }

    public void onServerStarting(FMLServerStartingEvent event) {

    }
}
