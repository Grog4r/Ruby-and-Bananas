package com.Grog4r.mod.objects.items;

import com.Grog4r.mod.Grog4rMod;
import com.Grog4r.mod.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class RubyRing extends Item {

    public RubyRing(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent("Gives the player 2 minutes of\u00A74 strength\u00A7f and\u00A74 speed"));
        } else {
            tooltip.add(new StringTextComponent("Hold\u00A74 Shift\u00A7f for more Information"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        Grog4rMod.LOGGER.info("Ring is now enabled");
        //Grog4rMod.LOGGER.debug("harvest level: " + Blocks.OBSIDIAN.getDefaultState().getHarvestLevel());
        playerIn.addPotionEffect(new EffectInstance(Effects.SPEED, 2400, 5));

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

}
