package com.Grog4r.mod.init;

import com.Grog4r.mod.Grog4rMod;
import com.Grog4r.mod.objects.blocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.TextComponentMessageFormatHandler;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.sql.Ref;

public class BlockInitNew {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Grog4rMod.MOD_ID);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
            () -> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(0.5f, 15.0f)
                    .sound(SoundType.CLOTH)));

    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore",
            () -> new RubyOre(Block.Properties.create(Material.IRON)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(4.0f)
                    .sound(SoundType.STONE)
                    .harvestLevel(2)));

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block",
            () -> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(5.0f, 6.0f)
                    .sound(SoundType.METAL)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> BANANA_TREE = BLOCKS.register("banana_tree",
            () -> new BananaTree(Block.Properties.from(Blocks.WHEAT)));

    public static final RegistryObject<Block> BANANA_PLANKS = BLOCKS.register("banana_planks",
            () -> new BananaPlanksBurnables(Block.Properties.from(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> BANANA_LOG = BLOCKS.register("banana_log",
            () -> new BananaLogBurnables(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> BANANA_WOOD_STAIRS = BLOCKS.register("banana_wood_stairs",
            () -> new StairsBlock(() -> BlockInitNew.BANANA_PLANKS.get().getDefaultState(), Block.Properties.from(Blocks.OAK_STAIRS)));

    public static final RegistryObject<Block> BANANA_WOOD_FENCE = BLOCKS.register("banana_wood_fence",
            () -> new FenceBlock(Block.Properties.from(Blocks.OAK_FENCE)));

    public static final RegistryObject<Block> BANANA_WOOD_BUTTON_BLOCK = BLOCKS.register("banana_wood_button",
            () -> new BananaWoodButtonBlock(Block.Properties.from(Blocks.OAK_BUTTON)));

    public static final RegistryObject<Block> BANANA_WOOD_PRESSURE_PLATE_BLOCK = BLOCKS.register("banana_wood_pressure_plate",
            () -> new BananaWoodPressurePlateBlock(Block.Properties.from(Blocks.OAK_PRESSURE_PLATE)));

    public static final RegistryObject<Block> BANANA_WOOD_SLAB = BLOCKS.register("banana_wood_slab",
            () -> new SlabBlock(Block.Properties.from(Blocks.OAK_SLAB)));

}
