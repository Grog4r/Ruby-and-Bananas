package com.Grog4r.mod.world.gen;

import com.Grog4r.mod.init.BlockInitNew;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class RubyOreGeneration {

    public static void setupOreGeneration() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            ConfiguredPlacement customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(2,2, 5, 30));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                    //                                                                  HERE
                    new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInitNew.RUBY_ORE.get().getDefaultState(), 4)).withPlacement(customConfig));
        }
    }

}
