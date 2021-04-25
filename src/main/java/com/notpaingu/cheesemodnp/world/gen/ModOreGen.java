package com.notpaingu.cheesemodnp.world.gen;

import com.notpaingu.cheesemodnp.lists.BlockList;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;
public class ModOreGen {
    public static void generateOres(final BiomeLoadingEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if(biome.getCategory() == Biome.Category.NETHER) {

            } else if(biome.getCategory() == Biome.Category.THEEND) {

            } else {
                genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockList.MICROBE_ORE.get().getDefaultState(), 5, 0, 100, 20);
            }
        }
    }

    private static void genOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize)).withPlacement(
                        Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight))
                ).square().func_242731_b(amount));
    }

}
