package com.Grog4r.mod;

import com.Grog4r.mod.init.BlockInitNew;
import com.Grog4r.mod.init.ItemInitNew;
import com.Grog4r.mod.objects.blocks.BananaTree;
import com.Grog4r.mod.world.gen.RubyOreGeneration;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("grog4rmod")
@Mod.EventBusSubscriber(modid = Grog4rMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Grog4rMod {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "grog4rmod";

    public Grog4rMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        ItemInitNew.ITEMS.register(modEventBus);
        BlockInitNew.BLOCKS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        BlockInitNew.BLOCKS.getEntries().stream().filter(block -> !(block.get() instanceof BananaTree)).map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(Grog4rMod.TAB);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        LOGGER.debug("Registered BlockItems!");
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
        RubyOreGeneration.setupOreGeneration();
    }

    public static final ItemGroup TAB = new ItemGroup("grog4rTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInitNew.RUBY.get());
        }
    };

}
