package com.notpaingu.cheesemodnp.events;

import com.notpaingu.cheesemodnp.Main;
import com.notpaingu.cheesemodnp.lists.PotionList;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {
    public static final Logger LOGGER = Main.LOGGER;
    public static final String MOD_ID = Main.MOD_ID;
    public static final ItemGroup CHEESE = Main.CHEESE;


    public static ResourceLocation location(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

}
