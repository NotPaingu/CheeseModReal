package com.notpaingu.cheesemodnp;

import com.notpaingu.cheesemodnp.lists.ItemList;
import com.notpaingu.cheesemodnp.lists.PotionList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
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

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
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
            return new ItemStack(ItemList.cheese);
        }
    }

    public void onServerStarting(FMLServerStartingEvent event) {

    }
}
