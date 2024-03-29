package com.notpaingu.cheesemodnp;

import com.notpaingu.cheesemodnp.items.BlockItemBase;
import com.notpaingu.cheesemodnp.items.BlockItemUnstackable;
import com.notpaingu.cheesemodnp.lists.BlockList;
import com.notpaingu.cheesemodnp.lists.ItemList;
import com.notpaingu.cheesemodnp.lists.PotionList;
import com.notpaingu.cheesemodnp.world.gen.ModOreGen;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Main.MOD_ID)
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Main {
    public static Main instance;
    public static final String MOD_ID = "cheesemodnp";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup CHEESE = new Main.CheeseGroup("cheese_group");
    public Main() {
        instance = this;

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockList.UNSTACKABLEBLOCKS.register(modEventBus);
        BlockList.BLOCKS.register(modEventBus);

        ItemList.ITEMS.register(modEventBus);

        PotionList.POTIONS.register(modEventBus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, ModOreGen::generateOres);

        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::clientSetup);

    }

    @SubscribeEvent
    public static void createUnstackableBlockItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockList.UNSTACKABLEBLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final BlockItemUnstackable blockItem = new BlockItemUnstackable(block);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
    }

    @SubscribeEvent
    public static void createBlockItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockList.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final BlockItem blockItem = new BlockItemBase(block);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
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
