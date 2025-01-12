package net.somfunambulist.setup.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.somfunambulist.setup.Setup;
import net.somfunambulist.setup.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Setup.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SETUP_TAB = CREATIVE_MODE_TABS.register("setup_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DOWSING_ROD.get()))
                    .title(Component.translatable("creativetab.setup_tab"))
                    .displayItems(((displayParameters, output) -> {
                        output.accept(ModItems.HAZEL_SAPLING.get());
                        output.accept(ModItems.DOWSING_ROD.get());

                        output.accept(ModBlocks.HAZEL_PLANKS.get());
                        output.accept(ModBlocks.HAZEL_SLAB.get());
                        output.accept(ModBlocks.HAZEL_STAIRS.get());
                        output.accept(ModBlocks.CARVED_HAZEL.get());
                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
