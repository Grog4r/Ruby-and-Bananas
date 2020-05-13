package com.Grog4r.mod.init;

import com.Grog4r.mod.Grog4rMod;
import com.Grog4r.mod.objects.items.RubyRing;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInitNew {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Grog4rMod.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().maxStackSize(64).group(Grog4rMod.TAB)));
    public static final RegistryObject<Item> RUBY_RING = ITEMS.register("ruby_ring",
            () -> new RubyRing(new Item.Properties().maxStackSize(1).group(Grog4rMod.TAB)));

    // Tools
    public static final RegistryObject<Item> RUBY_Sword = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModItemTier.RUBY, 2, -2f, new Item.Properties().group(Grog4rMod.TAB)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModItemTier.RUBY, -2, -2.5f, new Item.Properties().group(Grog4rMod.TAB)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModItemTier.RUBY, 2, -2.8f, new Item.Properties().group(Grog4rMod.TAB)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModItemTier.RUBY, -2, -2.8f, new Item.Properties().group(Grog4rMod.TAB)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModItemTier.RUBY, 1.0f, new Item.Properties().group(Grog4rMod.TAB)));

    // Armor
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(RubyArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(Grog4rMod.TAB)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(RubyArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(Grog4rMod.TAB)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(RubyArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(Grog4rMod.TAB)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(RubyArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(Grog4rMod.TAB)));

    public static final RegistryObject<Item> BANANA_SEED = ITEMS.register("banana_seeds",
            () -> new BlockItem(BlockInitNew.BANANA_TREE.get(), new Item.Properties().maxStackSize(64).group(Grog4rMod.TAB)));
    public static final RegistryObject<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties().maxStackSize(16).group(Grog4rMod.TAB).food(new Food.Builder().hunger(5).saturation(1.5f).build())));
    public static final RegistryObject<Item> BANANA_WOOD = ITEMS.register("banana_wood",
            () -> new Item(new Item.Properties().maxStackSize(64).group(Grog4rMod.TAB)));

}
