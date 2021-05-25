package com.notpaingu.cheesemodnp.events;


import com.notpaingu.cheesemodnp.Main;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "cheesemodnp", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onEatFood(LivingEntityUseItemEvent event) {
        if(event.getItem().getItem().getGroup() == ItemGroup.FOOD) {
            event.setCanceled(true);
        }
    }

}
