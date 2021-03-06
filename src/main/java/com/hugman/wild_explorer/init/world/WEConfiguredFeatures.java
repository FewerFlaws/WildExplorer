package com.hugman.wild_explorer.init.world;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.hugman.dawn.api.creator.ConfiguredFeatureCreator;
import com.hugman.dawn.api.util.DefaultBlockGetter;
import com.hugman.wild_explorer.init.WEBlocks;
import com.hugman.wild_explorer.init.WEPack;
import com.hugman.wild_explorer.object.world.gen.feature.config.BoulderFeatureConfig;
import com.hugman.wild_explorer.object.world.gen.feature.config.HugeMushroomFeatureConfig;
import com.hugman.wild_explorer.object.world.gen.feature.config.SpikeFeatureConfig;
import com.terraformersmc.terraform.tree.feature.TerraformTreeFeatures;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.UniformIntDistribution;
import net.minecraft.world.gen.decorator.CountExtraDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.placer.SimpleBlockPlacer;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Set;

public class WEConfiguredFeatures extends WEPack {
	public static final ConfiguredFeature<?, ?> ORE_BLUNITE = register("ore_blunite", Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, States.BLUNITE, 33)).rangeOf(80).spreadHorizontally().repeat(10));
	public static final ConfiguredFeature<?, ?> ORE_CARBONITE = register("ore_carbonite", Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, States.CARBONITE, 33)).rangeOf(80).spreadHorizontally().repeat(10));

	public static final ConfiguredFeature<TreeFeatureConfig, ?> AUTUMN_OAK = register("autumn_oak", Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OAK_LOG), new SimpleBlockStateProvider(States.AUTUMN_OAK_LEAVES), new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3), new StraightTrunkPlacer(4, 2, 0), new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build()));
	public static final ConfiguredFeature<TreeFeatureConfig, ?> AUTUMN_OAK_BEES_002 = register("autumn_oak_bees_002", Feature.TREE.configure(AUTUMN_OAK.getConfig().setTreeDecorators(ImmutableList.of(ConfiguredFeatures.Decorators.REGULAR_BEEHIVES_TREES))));
	public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_AUTUMN_OAK = register("fancy_autumn_oak", Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.OAK_LOG), new SimpleBlockStateProvider(States.AUTUMN_OAK_LEAVES), new LargeOakFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(4), 4), new LargeOakTrunkPlacer(3, 11, 0), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build()));
	public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_AUTUMN_OAK_BEES_002 = register("fancy_autumn_oak_bees_002", Feature.TREE.configure(FANCY_AUTUMN_OAK.getConfig().setTreeDecorators(ImmutableList.of(ConfiguredFeatures.Decorators.REGULAR_BEEHIVES_TREES))));
	public static final ConfiguredFeature<?, ?> PATCH_AUTUMN_OAK_LEAF_PILE = register("patch_autumn_oak_leaf_pile", Configs.patch(States.AUTUMN_OAK_LEAF_PILE, 32));
	public static final ConfiguredFeature<?, ?> PATCH_AUTUMN_OAK_LEAF_PILE_NORMAL = register("patch_autumn_oak_leaf_pile_normal", PATCH_AUTUMN_OAK_LEAF_PILE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).repeat(5));
	public static final ConfiguredFeature<TreeFeatureConfig, ?> AUTUMN_BIRCH = register("autumn_birch", Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.BIRCH_LOG), new SimpleBlockStateProvider(States.AUTUMN_BIRCH_LEAVES), new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3), new StraightTrunkPlacer(4, 2, 0), new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build()));
	public static final ConfiguredFeature<TreeFeatureConfig, ?> AUTUMN_BIRCH_BEES_002 = register("autumn_birch_bees_002", Feature.TREE.configure(AUTUMN_BIRCH.getConfig().setTreeDecorators(ImmutableList.of(ConfiguredFeatures.Decorators.REGULAR_BEEHIVES_TREES))));
	public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_AUTUMN_BIRCH = register("fancy_autumn_birch", Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.BIRCH_LOG), new SimpleBlockStateProvider(States.AUTUMN_BIRCH_LEAVES), new LargeOakFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(4), 4), new LargeOakTrunkPlacer(3, 11, 0), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build()));
	public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_AUTUMN_BIRCH_BEES_002 = register("fancy_autumn_birch_bees_002", Feature.TREE.configure(FANCY_AUTUMN_BIRCH.getConfig().setTreeDecorators(ImmutableList.of(ConfiguredFeatures.Decorators.REGULAR_BEEHIVES_TREES))));
	public static final ConfiguredFeature<?, ?> PATCH_AUTUMN_BIRCH_LEAF_PILE = register("patch_autumn_birch_leaf_pile", Configs.patch(States.AUTUMN_BIRCH_LEAF_PILE, 32));
	public static final ConfiguredFeature<?, ?> PATCH_AUTUMN_BIRCH_LEAF_PILE_NORMAL = register("patch_autumn_birch_leaf_pile_normal", PATCH_AUTUMN_BIRCH_LEAF_PILE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).repeat(5));
	public static final ConfiguredFeature<?, ?> PUMPKIN_PASTURES_TREES = register("pumpkin_pastures_trees", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(AUTUMN_OAK_BEES_002.withChance(0.2F), FANCY_AUTUMN_BIRCH_BEES_002.withChance(0.1F)), AUTUMN_BIRCH_BEES_002)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(10, 0.1F, 1))));

	public static final ConfiguredFeature<TreeFeatureConfig, ?> PINK_CHERRY_OAK = register("pink_cherry_oak", Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CHERRY_OAK_LOG), new SimpleBlockStateProvider(States.PINK_CHERRY_OAK_LEAVES), new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build()));
	public static final ConfiguredFeature<TreeFeatureConfig, ?> PINK_CHERRY_OAK_BEES_005 = register("pink_cherry_oak_bees_005", Feature.TREE.configure(PINK_CHERRY_OAK.getConfig().setTreeDecorators(ImmutableList.of(ConfiguredFeatures.Decorators.MORE_BEEHIVES_TREES))));
	public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_PINK_CHERRY_OAK = register("fancy_pink_cherry_oak", Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CHERRY_OAK_LOG), new SimpleBlockStateProvider(States.PINK_CHERRY_OAK_LEAVES), new LargeOakFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(4), 4), new LargeOakTrunkPlacer(4, 11, 0), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build()));
	public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_PINK_CHERRY_OAK_BEES_005 = register("fancy_pink_cherry_oak_bees_005", Feature.TREE.configure(FANCY_PINK_CHERRY_OAK.getConfig().setTreeDecorators(ImmutableList.of(ConfiguredFeatures.Decorators.MORE_BEEHIVES_TREES))));
	public static final ConfiguredFeature<?, ?> PATCH_PINK_CHERRY_OAK_LEAF_PILE = register("patch_pink_cherry_oak_leaf_pile", Configs.patch(States.PINK_CHERRY_OAK_LEAF_PILE, 32));
	public static final ConfiguredFeature<?, ?> PATCH_PINK_CHERRY_OAK_LEAF_PILE_NORMAL = register("patch_pink_cherry_oak_leaf_pile_normal", PATCH_PINK_CHERRY_OAK_LEAF_PILE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).repeat(12));
	public static final ConfiguredFeature<TreeFeatureConfig, ?> WHITE_CHERRY_OAK = register("white_cherry_oak", Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CHERRY_OAK_LOG), new SimpleBlockStateProvider(States.WHITE_CHERRY_OAK_LEAVES), new BlobFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0), 3), new StraightTrunkPlacer(5, 2, 0), new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build()));
	public static final ConfiguredFeature<TreeFeatureConfig, ?> WHITE_CHERRY_OAK_BEES_005 = register("white_cherry_oak_bees_005", Feature.TREE.configure(WHITE_CHERRY_OAK.getConfig().setTreeDecorators(ImmutableList.of(ConfiguredFeatures.Decorators.MORE_BEEHIVES_TREES))));
	public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_WHITE_CHERRY_OAK = register("fancy_white_cherry_oak", Feature.TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.CHERRY_OAK_LOG), new SimpleBlockStateProvider(States.WHITE_CHERRY_OAK_LEAVES), new LargeOakFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(4), 4), new LargeOakTrunkPlacer(4, 11, 0), new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4)))).ignoreVines().heightmap(Heightmap.Type.MOTION_BLOCKING).build()));
	public static final ConfiguredFeature<TreeFeatureConfig, ?> FANCY_WHITE_CHERRY_OAK_BEES_005 = register("fancy_white_cherry_oak_bees_005", Feature.TREE.configure(FANCY_WHITE_CHERRY_OAK.getConfig().setTreeDecorators(ImmutableList.of(ConfiguredFeatures.Decorators.MORE_BEEHIVES_TREES))));
	public static final ConfiguredFeature<?, ?> PATCH_WHITE_CHERRY_OAK_LEAF_PILE = register("patch_white_cherry_oak_leaf_pile", Configs.patch(States.WHITE_CHERRY_OAK_LEAF_PILE, 32));
	public static final ConfiguredFeature<?, ?> PATCH_WHITE_CHERRY_OAK_LEAF_PILE_NORMAL = register("patch_white_cherry_oak_leaf_pile_normal", PATCH_WHITE_CHERRY_OAK_LEAF_PILE.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).repeat(12));
	public static final ConfiguredFeature<?, ?> PINK_CHERRY_OAK_FOREST_TREES = register("pink_cherry_oak_forest_trees", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(WHITE_CHERRY_OAK.withChance(0.2F), FANCY_PINK_CHERRY_OAK.withChance(0.1F)), PINK_CHERRY_OAK)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(10, 0.1F, 1))));
	public static final ConfiguredFeature<?, ?> WHITE_CHERRY_OAK_FOREST_TREES = register("white_cherry_oak_forest_trees", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(PINK_CHERRY_OAK.withChance(0.2F), FANCY_WHITE_CHERRY_OAK.withChance(0.1F)), WHITE_CHERRY_OAK)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(10, 0.1F, 1))));

	public static final ConfiguredFeature<?, ?> PATCH_BLUEBERRY_BUSH = register("patch_blueberry_bush", Configs.patch(States.BLUEBERRY_BUSH, 64, ImmutableSet.of(States.GRASS_BLOCK.getBlock())));
	public static final ConfiguredFeature<?, ?> PATCH_BLUEBERRY_BUSH_SPARSE = register("patch_blueberry_bush_sparse", PATCH_BLUEBERRY_BUSH.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE));
	public static final ConfiguredFeature<?, ?> PATCH_BLUEBERRY_BUSH_DECORATED = register("patch_blueberry_bush_decorated", PATCH_BLUEBERRY_BUSH.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).applyChance(12));

	public static final ConfiguredFeature<TreeFeatureConfig, ?> PALM = register("palm", TerraformTreeFeatures.SANDY_TREE.configure((new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(States.PALM_LOG), new SimpleBlockStateProvider(States.PALM_LEAVES), new AcaciaFoliagePlacer(UniformIntDistribution.of(2), UniformIntDistribution.of(0)), new ForkingTrunkPlacer(16, 2, 2), new TwoLayersFeatureSize(1, 0, 1))).ignoreVines().build()));
	public static final ConfiguredFeature<?, ?> PALM_TREES = register("palm_trees", PALM.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).decorate(Decorator.COUNT_EXTRA.configure(new CountExtraDecoratorConfig(0, 0.12F, 1))));
	public static final ConfiguredFeature<?, ?> TALL_CRIMSON_FUNGI = register("tall_crimson_fungi", WEFeatures.TALL_HUGE_FUNGUS.configure(HugeFungusFeatureConfig.CRIMSON_FUNGUS_NOT_PLANTED_CONFIG).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(8))));
	public static final ConfiguredFeature<?, ?> TALL_WARPED_FUNGI = register("tall_warped_fungi", WEFeatures.TALL_HUGE_FUNGUS.configure(HugeFungusFeatureConfig.WARPED_FUNGUS_NOT_PLANTED_CONFIG).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(8))));

	public static final ConfiguredFeature<?, ?> PATCH_BLUE_MUSHROOM = register("patch_blue_mushroom", Configs.patch(States.BLUE_MUSHROOM, 64));
	public static final ConfiguredFeature<?, ?> PATCH_CYAN_MUSHROOM = register("patch_cyan_mushroom", Configs.patch(States.CYAN_MUSHROOM, 64));
	public static final ConfiguredFeature<?, ?> PATCH_YELLOW_MUSHROOM = register("patch_yellow_mushroom", Configs.patch(States.YELLOW_MUSHROOM, 64));
	public static final ConfiguredFeature<?, ?> PATCH_ORANGE_MUSHROOM = register("patch_orange_mushroom", Configs.patch(States.ORANGE_MUSHROOM, 64));
	public static final ConfiguredFeature<?, ?> PATCH_PINK_MUSHROOM = register("patch_pink_mushroom", Configs.patch(States.PINK_MUSHROOM, 64));
	public static final ConfiguredFeature<?, ?> PATCH_MAGENTA_MUSHROOM = register("patch_magenta_mushroom", Configs.patch(States.MAGENTA_MUSHROOM, 64));
	public static final ConfiguredFeature<?, ?> PATCH_WHITE_MUSHROOM = register("patch_white_mushroom", Configs.patch(States.WHITE_MUSHROOM, 64));
	public static final ConfiguredFeature<?, ?> PATCH_LIGHT_GRAY_MUSHROOM = register("patch_light_gray_mushroom", Configs.patch(States.LIGHT_GRAY_MUSHROOM, 64));
	public static final ConfiguredFeature<?, ?> PATCH_GRAY_MUSHROOM = register("patch_gray_mushroom", Configs.patch(States.GRAY_MUSHROOM, 64));
	public static final ConfiguredFeature<?, ?> PATCH_BLACK_MUSHROOM = register("patch_black_mushroom", Configs.patch(States.BLACK_MUSHROOM, 64));

	public static final ConfiguredFeature<?, ?> PATCH_BLUE_MUSHROOM_NORMAL = register("patch_blue_mushroom_normal", PATCH_BLUE_MUSHROOM.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).applyChance(4));
	public static final ConfiguredFeature<?, ?> PATCH_CYAN_MUSHROOM_NORMAL = register("patch_cyan_mushroom_normal", PATCH_CYAN_MUSHROOM.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).applyChance(4));
	public static final ConfiguredFeature<?, ?> PATCH_YELLOW_MUSHROOM_NORMAL = register("patch_yellow_mushroom_normal", PATCH_YELLOW_MUSHROOM.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).applyChance(4));
	public static final ConfiguredFeature<?, ?> PATCH_ORANGE_MUSHROOM_NORMAL = register("patch_orange_mushroom_normal", PATCH_ORANGE_MUSHROOM.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).applyChance(4));
	public static final ConfiguredFeature<?, ?> PATCH_PINK_MUSHROOM_NORMAL = register("patch_pink_mushroom_normal", PATCH_PINK_MUSHROOM.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).applyChance(4));
	public static final ConfiguredFeature<?, ?> PATCH_MAGENTA_MUSHROOM_NORMAL = register("patch_magenta_mushroom_normal", PATCH_MAGENTA_MUSHROOM.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).applyChance(4));
	public static final ConfiguredFeature<?, ?> PATCH_WHITE_MUSHROOM_NORMAL = register("patch_white_mushroom_normal", PATCH_WHITE_MUSHROOM.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).applyChance(4));
	public static final ConfiguredFeature<?, ?> PATCH_LIGHT_GRAY_MUSHROOM_NORMAL = register("patch_light_gray_mushroom_normal", PATCH_LIGHT_GRAY_MUSHROOM.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).applyChance(4));
	public static final ConfiguredFeature<?, ?> PATCH_GRAY_MUSHROOM_NORMAL = register("patch_gray_mushroom_normal", PATCH_GRAY_MUSHROOM.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).applyChance(4));
	public static final ConfiguredFeature<?, ?> PATCH_BLACK_MUSHROOM_NORMAL = register("patch_black_mushroom_normal", PATCH_BLACK_MUSHROOM.decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP_SPREAD_DOUBLE).applyChance(4));

	public static final ConfiguredFeature<?, ?> PATCH_BLUE_MUSHROOM_NETHER = register("patch_blue_mushroom_nether", PATCH_BLUE_MUSHROOM.rangeOf(128).applyChance(2));
	public static final ConfiguredFeature<?, ?> PATCH_CYAN_MUSHROOM_NETHER = register("patch_cyan_mushroom_nether", PATCH_CYAN_MUSHROOM.rangeOf(128).applyChance(2));
	public static final ConfiguredFeature<?, ?> PATCH_YELLOW_MUSHROOM_NETHER = register("patch_yellow_mushroom_nether", PATCH_YELLOW_MUSHROOM.rangeOf(128).applyChance(2));
	public static final ConfiguredFeature<?, ?> PATCH_ORANGE_MUSHROOM_NETHER = register("patch_orange_mushroom_nether", PATCH_ORANGE_MUSHROOM.rangeOf(128).applyChance(2));
	public static final ConfiguredFeature<?, ?> PATCH_PINK_MUSHROOM_NETHER = register("patch_pink_mushroom_nether", PATCH_PINK_MUSHROOM.rangeOf(128).applyChance(2));
	public static final ConfiguredFeature<?, ?> PATCH_MAGENTA_MUSHROOM_NETHER = register("patch_magenta_mushroom_nether", PATCH_MAGENTA_MUSHROOM.rangeOf(128).applyChance(2));
	public static final ConfiguredFeature<?, ?> PATCH_WHITE_MUSHROOM_NETHER = register("patch_white_mushroom_nether", PATCH_WHITE_MUSHROOM.rangeOf(128).applyChance(2));
	public static final ConfiguredFeature<?, ?> PATCH_LIGHT_GRAY_MUSHROOM_NETHER = register("patch_light_gray_mushroom_nether", PATCH_LIGHT_GRAY_MUSHROOM.rangeOf(128).applyChance(2));
	public static final ConfiguredFeature<?, ?> PATCH_GRAY_MUSHROOM_NETHER = register("patch_gray_mushroom_nether", PATCH_GRAY_MUSHROOM.rangeOf(128).applyChance(2));
	public static final ConfiguredFeature<?, ?> PATCH_BLACK_MUSHROOM_NETHER = register("patch_black_mushroom_nether", PATCH_BLACK_MUSHROOM.rangeOf(128).applyChance(2));

	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_BLUE = register("huge_nether_mushroom_blue", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_BLUE));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_CYAN = register("huge_nether_mushroom_cyan", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_CYAN));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_PINK = register("huge_nether_mushroom_pink", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_PINK));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_YELLOW = register("huge_nether_mushroom_yellow", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_YELLOW));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_BROWN = register("huge_nether_mushroom_brown", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_BROWN));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_WHITE = register("huge_nether_mushroom_white", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_WHITE));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_LIGHT_GRAY = register("huge_nether_mushroom_light_gray", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_LIGHT_GRAY));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_GRAY = register("huge_nether_mushroom_gray", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_GRAY));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_BLACK = register("huge_nether_mushroom_black", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_BLACK));

	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_BLUE_UPSIDE = register("huge_nether_mushroom_blue_upside", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_BLUE.setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_CYAN_UPSIDE = register("huge_nether_mushroom_cyan_upside", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_CYAN.setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_PINK_UPSIDE = register("huge_nether_mushroom_pink_upside", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_PINK.setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_YELLOW_UPSIDE = register("huge_nether_mushroom_yellow_upside", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_YELLOW.setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_BROWN_UPSIDE = register("huge_nether_mushroom_brown_upside", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_BROWN.setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_WHITE_UPSIDE = register("huge_nether_mushroom_white_upside", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_WHITE.setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_LIGHT_GRAY_UPSIDE = register("huge_nether_mushroom_light_gray_upside", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_LIGHT_GRAY.setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_GRAY_UPSIDE = register("huge_nether_mushroom_gray_upside", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_GRAY.setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_BLACK_UPSIDE = register("huge_nether_mushroom_black_upside", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_BLACK.setUpsideDown()));

	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_BLUE_FLAT = register("huge_nether_mushroom_blue_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_BLUE.setFlatHat()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_CYAN_FLAT = register("huge_nether_mushroom_cyan_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_CYAN.setFlatHat().setHatBaseSize(3)));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_PINK_FLAT = register("huge_nether_mushroom_pink_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_PINK.setFlatHat()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_YELLOW_FLAT = register("huge_nether_mushroom_yellow_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_YELLOW.setFlatHat()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_BROWN_FLAT = register("huge_nether_mushroom_brown_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_BROWN.setFlatHat()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_WHITE_FLAT = register("huge_nether_mushroom_white_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_WHITE.setFlatHat()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_LIGHT_GRAY_FLAT = register("huge_nether_mushroom_light_gray_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_LIGHT_GRAY.setFlatHat()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_GRAY_FLAT = register("huge_nether_mushroom_gray_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_GRAY.setFlatHat()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_BLACK_FLAT = register("huge_nether_mushroom_black_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_BLACK.setFlatHat()));

	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_BLUE_UPSIDE_FLAT = register("huge_nether_mushroom_blue_upside_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_BLUE.setFlatHat().setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_CYAN_UPSIDE_FLAT = register("huge_nether_mushroom_cyan_upside_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_CYAN.setFlatHat().setUpsideDown().setHatBaseSize(3)));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_PINK_UPSIDE_FLAT = register("huge_nether_mushroom_pink_upside_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_PINK.setFlatHat().setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_YELLOW_UPSIDE_FLAT = register("huge_nether_mushroom_yellow_upside_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_YELLOW.setFlatHat().setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_BROWN_UPSIDE_FLAT = register("huge_nether_mushroom_brown_upside_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_BROWN.setFlatHat().setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_WHITE_UPSIDE_FLAT = register("huge_nether_mushroom_white_upside_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_WHITE.setFlatHat().setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_LIGHT_GRAY_UPSIDE_FLAT = register("huge_nether_mushroom_light_gray_upside_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_LIGHT_GRAY.setFlatHat().setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_GRAY_UPSIDE_FLAT = register("huge_nether_mushroom_gray_upside_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_GRAY.setFlatHat().setUpsideDown()));
	public static final ConfiguredFeature<?, ?> HUGE_NETHER_MUSHROOM_BLACK_UPSIDE_FLAT = register("huge_nether_mushroom_black_upside_flat", WEFeatures.HUGE_MUSHROOM.configure(Configs.HUGE_NETHER_MUSHROOM_BLACK.setFlatHat().setUpsideDown()));

	public static final ConfiguredFeature<?, ?> TRITANOPIAN_GALLERY_GENERATION_1 = register("tritanopian_gallery_generation_1", Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_PINK, () -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_CYAN)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP));
	public static final ConfiguredFeature<?, ?> TRITANOPIAN_GALLERY_GENERATION_2 = register("tritanopian_gallery_generation_2", Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_PINK_FLAT, () -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_CYAN_FLAT)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP));
	public static final ConfiguredFeature<?, ?> TRITANOPIAN_GALLERY_GENERATION_3 = register("tritanopian_gallery_generation_3", Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_PINK_UPSIDE, () -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_CYAN_UPSIDE)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP));
	public static final ConfiguredFeature<?, ?> TRITANOPIAN_GALLERY_GENERATION_4 = register("tritanopian_gallery_generation_4", Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_PINK_UPSIDE_FLAT, () -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_CYAN_UPSIDE_FLAT)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP));

	public static final ConfiguredFeature<?, ?> ACHROMATOPSIAN_GALLERY_GENERATION_1 = register("achromatopsian_gallery_generation_1", Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_GRAY, () -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_BLACK)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP));
	public static final ConfiguredFeature<?, ?> ACHROMATOPSIAN_GALLERY_GENERATION_2 = register("achromatopsian_gallery_generation_2", Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_GRAY_FLAT, () -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_BLACK_FLAT)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP));
	public static final ConfiguredFeature<?, ?> ACHROMATOPSIAN_GALLERY_GENERATION_3 = register("achromatopsian_gallery_generation_3", Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_WHITE_UPSIDE, () -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_LIGHT_GRAY_UPSIDE)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP));
	public static final ConfiguredFeature<?, ?> ACHROMATOPSIAN_GALLERY_GENERATION_4 = register("achromatopsian_gallery_generation_4", Feature.RANDOM_BOOLEAN_SELECTOR.configure(new RandomBooleanFeatureConfig(() -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_WHITE_UPSIDE_FLAT, () -> WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_LIGHT_GRAY_UPSIDE_FLAT)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP));

	public static final ConfiguredFeature<?, ?> PROTANOPIAN_GALLERY_GENERATION_1 = register("protanopian_gallery_generation_1", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_BROWN_FLAT.withChance(0.25F), WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_YELLOW.withChance(0.25F), WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_CYAN.withChance(0.25F)), WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_BLUE)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP));
	public static final ConfiguredFeature<?, ?> PROTANOPIAN_GALLERY_GENERATION_2 = register("protanopian_gallery_generation_2", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_BROWN_UPSIDE_FLAT.withChance(0.25F), WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_YELLOW_UPSIDE.withChance(0.25F), WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_CYAN_UPSIDE.withChance(0.25F)), WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_BLUE_UPSIDE)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP));
	public static final ConfiguredFeature<?, ?> PROTANOPIAN_GALLERY_GENERATION_3 = register("protanopian_gallery_generation_3", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_YELLOW_FLAT.withChance(1F / 3F), WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_CYAN_FLAT.withChance(1F / 3F)), WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_BLUE_FLAT)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP));
	public static final ConfiguredFeature<?, ?> PROTANOPIAN_GALLERY_GENERATION_4 = register("protanopian_gallery_generation_4", Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(ImmutableList.of(WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_YELLOW_UPSIDE_FLAT.withChance(1F / 3F), WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_CYAN_UPSIDE_FLAT.withChance(1F / 3F)), WEConfiguredFeatures.HUGE_NETHER_MUSHROOM_BLUE_UPSIDE_FLAT)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP));

	public static final ConfiguredFeature<?, ?> AMARANTH_FUNGI = register("amaranth_fungi", Feature.HUGE_FUNGUS.configure(new HugeFungusFeatureConfig(States.AMARANTH_DYLIUM, States.DARK_AMARANTH_STEM, States.AMARANTH_WART_BLOCK, States.COBWEB, false)).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(2))));
	public static final ConfiguredFeature<?, ?> TALL_AMARANTH_FUNGI = register("tall_amaranth_fungi", WEFeatures.TALL_HUGE_FUNGUS.configure(new HugeFungusFeatureConfig(States.AMARANTH_DYLIUM, States.DARK_AMARANTH_STEM, States.AMARANTH_WART_BLOCK, States.COBWEB, false)).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(2))));
	public static final ConfiguredFeature<HugeFungusFeatureConfig, ?> AMARANTH_FUNGI_PLANTED = register("amaranth_fungi_planted", Feature.HUGE_FUNGUS.configure(new HugeFungusFeatureConfig(States.AMARANTH_DYLIUM, States.DARK_AMARANTH_STEM, States.AMARANTH_WART_BLOCK, States.COBWEB, true)));
	public static final ConfiguredFeature<?, ?> AMARANTH_FOREST_VEGETATION = register("amaranth_forest_vegetation", Feature.NETHER_FOREST_VEGETATION.configure(Configs.AMARANTH_ROOTS).decorate(Decorator.COUNT_MULTILAYER.configure(new CountConfig(4))));
	public static final ConfiguredFeature<?, ?> OBSIDIAN_SPIKE = register("obsidian_spike", WEFeatures.SPIKE.configure(new SpikeFeatureConfig(Blocks.OBSIDIAN.getDefaultState(), Arrays.asList(WEBlocks.BLACK_DYLIUM.getDefaultState(), Blocks.END_STONE.getDefaultState()), 6, 22, 2, 3, 0, 360, 150, 30, -4).setDecoration(Blocks.CRYING_OBSIDIAN.getDefaultState(), 0.08f)).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).repeatRandomly(12));
	public static final ConfiguredFeature<?, ?> ENDER_BOULDER = register("ender_boulder", WEFeatures.BOULDER.configure(new BoulderFeatureConfig(Blocks.OBSIDIAN.getDefaultState(), Arrays.asList(Blocks.END_STONE.getDefaultState()))).decorate(ConfiguredFeatures.Decorators.SQUARE_HEIGHTMAP).repeatRandomly(2));

	public static void init() {
	}


	public static void addToGen() {
	}


	private static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
		return register(new ConfiguredFeatureCreator.Builder<>(name, configuredFeature));
	}

	public static final class Configs {
		public static final BlockPileFeatureConfig AMARANTH_ROOTS = new BlockPileFeatureConfig((new WeightedBlockStateProvider()).addState(WEBlocks.DARK_AMARANTH_ROOTS.getDefaultState(), 80).addState(WEBlocks.DARK_AMARANTH_WOOD.getFungus().getDefaultState(), 4));
		protected static final HugeMushroomFeatureConfig HUGE_NETHER_MUSHROOM_BLUE = new HugeMushroomFeatureConfig(13, 8, States.BLUE_MUSHROOM_BLOCK, 3, 3, States.SHROOMLIGHT, 0.1F, 0.05F);
		protected static final HugeMushroomFeatureConfig HUGE_NETHER_MUSHROOM_CYAN = new HugeMushroomFeatureConfig(4, 3, States.CYAN_MUSHROOM_BLOCK, 2, 1, Blocks.SHROOMLIGHT.getDefaultState(), 0.05F, 0.1F);
		protected static final HugeMushroomFeatureConfig HUGE_NETHER_MUSHROOM_PINK = new HugeMushroomFeatureConfig(5, 4, States.PINK_MUSHROOM_BLOCK, 2, 1, Blocks.SHROOMLIGHT.getDefaultState(), 0.05F, 0.1F);
		protected static final HugeMushroomFeatureConfig HUGE_NETHER_MUSHROOM_YELLOW = new HugeMushroomFeatureConfig(4, 3, States.YELLOW_MUSHROOM_BLOCK, 3, 0, Blocks.SHROOMLIGHT.getDefaultState(), 0.1F, 0.0F);
		protected static final HugeMushroomFeatureConfig HUGE_NETHER_MUSHROOM_BROWN = new HugeMushroomFeatureConfig(4, 3, States.BROWN_MUSHROOM_BLOCK, 3, 0, Blocks.SHROOMLIGHT.getDefaultState(), 0.1F, 0.0F);
		protected static final HugeMushroomFeatureConfig HUGE_NETHER_MUSHROOM_WHITE = new HugeMushroomFeatureConfig(6, 2, States.WHITE_MUSHROOM_BLOCK, 2, 1, Blocks.SHROOMLIGHT.getDefaultState(), 0.05F, 0.0F);
		protected static final HugeMushroomFeatureConfig HUGE_NETHER_MUSHROOM_LIGHT_GRAY = new HugeMushroomFeatureConfig(4, 7, States.LIGHT_GRAY_MUSHROOM_BLOCK, 3, 1, Blocks.SHROOMLIGHT.getDefaultState(), 0.05F, 0.0F);
		protected static final HugeMushroomFeatureConfig HUGE_NETHER_MUSHROOM_GRAY = new HugeMushroomFeatureConfig(4, 7, States.GRAY_MUSHROOM_BLOCK, 3, 1, Blocks.SHROOMLIGHT.getDefaultState(), 0.01F, 0.0F);
		protected static final HugeMushroomFeatureConfig HUGE_NETHER_MUSHROOM_BLACK = new HugeMushroomFeatureConfig(6, 2, States.BLACK_MUSHROOM_BLOCK, 2, 1, Blocks.SHROOMLIGHT.getDefaultState(), 0.01F, 0.0F);

		protected static ConfiguredFeature<RandomPatchFeatureConfig, ?> patch(BlockState blockState, int tries) {
			return Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(blockState), SimpleBlockPlacer.INSTANCE)).tries(tries).cannotProject().build());
		}

		protected static ConfiguredFeature<RandomPatchFeatureConfig, ?> patch(BlockState blockState, int tries, Set<Block> whitelist) {
			return Feature.RANDOM_PATCH.configure((new RandomPatchFeatureConfig.Builder(new SimpleBlockStateProvider(blockState), SimpleBlockPlacer.INSTANCE)).tries(tries).whitelist(whitelist).cannotProject().build());
		}
	}

	public static final class States {
		protected static final BlockState GRASS_BLOCK = Blocks.GRASS_BLOCK.getDefaultState();

		protected static final BlockState BLUNITE = WEBlocks.BLUNITE.getBlock(DefaultBlockGetter.CUBE).getDefaultState();
		protected static final BlockState CARBONITE = WEBlocks.CARBONITE.getBlock(DefaultBlockGetter.CUBE).getDefaultState();

		protected static final BlockState OAK_LOG = Blocks.OAK_LOG.getDefaultState();
		protected static final BlockState AUTUMN_OAK_LEAVES = WEBlocks.AUTUMN_OAK_LEAVES.getLeaves().getDefaultState();
		protected static final BlockState AUTUMN_OAK_LEAF_PILE = WEBlocks.AUTUMN_OAK_LEAVES.getLeafPile().getDefaultState();

		protected static final BlockState BIRCH_LOG = Blocks.BIRCH_LOG.getDefaultState();
		protected static final BlockState AUTUMN_BIRCH_LEAVES = WEBlocks.AUTUMN_BIRCH_LEAVES.getLeaves().getDefaultState();
		protected static final BlockState AUTUMN_BIRCH_LEAF_PILE = WEBlocks.AUTUMN_BIRCH_LEAVES.getLeafPile().getDefaultState();

		protected static final BlockState CHERRY_OAK_LOG = WEBlocks.CHERRY_OAK_WOOD.getLog().getDefaultState();
		protected static final BlockState PINK_CHERRY_OAK_LEAVES = WEBlocks.PINK_CHERRY_OAK_LEAVES.getLeaves().getDefaultState();
		protected static final BlockState PINK_CHERRY_OAK_LEAF_PILE = WEBlocks.PINK_CHERRY_OAK_LEAVES.getLeafPile().getDefaultState();
		protected static final BlockState WHITE_CHERRY_OAK_LEAVES = WEBlocks.WHITE_CHERRY_OAK_LEAVES.getLeaves().getDefaultState();
		protected static final BlockState WHITE_CHERRY_OAK_LEAF_PILE = WEBlocks.WHITE_CHERRY_OAK_LEAVES.getLeafPile().getDefaultState();

		protected static final BlockState PALM_LOG = WEBlocks.PALM_WOOD.getLog().getDefaultState();
		protected static final BlockState PALM_LEAVES = WEBlocks.PALM_WOOD.getLeaves().getDefaultState();

		protected static final BlockState BLUEBERRY_BUSH = WEBlocks.BLUEBERRY_BUSH.getDefaultState();

		protected static final BlockState AMARANTH_DYLIUM = WEBlocks.BLACK_DYLIUM.getDefaultState();
		protected static final BlockState DARK_AMARANTH_STEM = WEBlocks.DARK_AMARANTH_WOOD.getStem().getDefaultState();
		protected static final BlockState AMARANTH_WART_BLOCK = WEBlocks.DARK_AMARANTH_WART_BLOCK.getDefaultState();
		protected static final BlockState COBWEB = Blocks.COBWEB.getDefaultState();

		protected static final BlockState BLUE_MUSHROOM = WEBlocks.BLUE_MUSHROOM.getPlant().getDefaultState();
		protected static final BlockState CYAN_MUSHROOM = WEBlocks.CYAN_MUSHROOM.getPlant().getDefaultState();
		protected static final BlockState YELLOW_MUSHROOM = WEBlocks.YELLOW_MUSHROOM.getPlant().getDefaultState();
		protected static final BlockState ORANGE_MUSHROOM = WEBlocks.ORANGE_MUSHROOM.getPlant().getDefaultState();
		protected static final BlockState PINK_MUSHROOM = WEBlocks.PINK_MUSHROOM.getPlant().getDefaultState();
		protected static final BlockState MAGENTA_MUSHROOM = WEBlocks.MAGENTA_MUSHROOM.getPlant().getDefaultState();
		protected static final BlockState WHITE_MUSHROOM = WEBlocks.WHITE_MUSHROOM.getPlant().getDefaultState();
		protected static final BlockState LIGHT_GRAY_MUSHROOM = WEBlocks.LIGHT_GRAY_MUSHROOM.getPlant().getDefaultState();
		protected static final BlockState GRAY_MUSHROOM = WEBlocks.GRAY_MUSHROOM.getPlant().getDefaultState();
		protected static final BlockState BLACK_MUSHROOM = WEBlocks.BLACK_MUSHROOM.getPlant().getDefaultState();

		protected static final BlockState BLUE_MUSHROOM_BLOCK = WEBlocks.BLUE_MUSHROOM_BLOCK.getDefaultState();
		protected static final BlockState CYAN_MUSHROOM_BLOCK = WEBlocks.CYAN_MUSHROOM_BLOCK.getDefaultState();
		protected static final BlockState YELLOW_MUSHROOM_BLOCK = WEBlocks.YELLOW_MUSHROOM_BLOCK.getDefaultState();
		protected static final BlockState BROWN_MUSHROOM_BLOCK = Blocks.BROWN_MUSHROOM_BLOCK.getDefaultState();
		protected static final BlockState ORANGE_MUSHROOM_BLOCK = WEBlocks.ORANGE_MUSHROOM_BLOCK.getDefaultState();
		protected static final BlockState PINK_MUSHROOM_BLOCK = WEBlocks.PINK_MUSHROOM_BLOCK.getDefaultState();
		protected static final BlockState MAGENTA_MUSHROOM_BLOCK = WEBlocks.MAGENTA_MUSHROOM_BLOCK.getDefaultState();
		protected static final BlockState WHITE_MUSHROOM_BLOCK = WEBlocks.WHITE_MUSHROOM_BLOCK.getDefaultState();
		protected static final BlockState LIGHT_GRAY_MUSHROOM_BLOCK = WEBlocks.LIGHT_GRAY_MUSHROOM_BLOCK.getDefaultState();
		protected static final BlockState GRAY_MUSHROOM_BLOCK = WEBlocks.GRAY_MUSHROOM_BLOCK.getDefaultState();
		protected static final BlockState BLACK_MUSHROOM_BLOCK = WEBlocks.BLACK_MUSHROOM_BLOCK.getDefaultState();

		protected static final BlockState SHROOMLIGHT = Blocks.SHROOMLIGHT.getDefaultState();
	}
}
