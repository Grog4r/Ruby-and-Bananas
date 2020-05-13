package com.Grog4r.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Random;

public class RubyOre extends OreBlock {
    public RubyOre(Properties properties) {
        super(properties);
    }

    @Override
    protected int getExperience(Random rand) {
        return MathHelper.nextInt(rand, 3, 7);
    }

}
