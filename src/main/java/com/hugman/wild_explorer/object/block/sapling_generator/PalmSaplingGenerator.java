package com.hugman.wild_explorer.object.block.sapling_generator;

import com.hugman.wild_explorer.init.world.WEConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import java.util.Random;

public class PalmSaplingGenerator extends SaplingGenerator {
	@Override
	protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean beeHive) {
		return WEConfiguredFeatures.PALM;
	}
}