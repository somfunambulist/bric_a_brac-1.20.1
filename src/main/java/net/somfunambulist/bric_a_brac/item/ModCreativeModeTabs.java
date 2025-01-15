package net.somfunambulist.bric_a_brac.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.somfunambulist.bric_a_brac.Bric_A_Brac;
import net.somfunambulist.bric_a_brac.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Bric_A_Brac.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BRIC_A_BRAC_TAB = CREATIVE_MODE_TABS.register("bric_a_brac_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.WALNUT_BUNDLE.get()))
                    .title(Component.translatable("creativetab.bric_a_brac_tab"))
                    .displayItems(((displayParameters, output) -> {
                        //output.accept(ModItems.DOWSING_ROD.get());

                        output.accept(ModBlocks.WALNUT_BUNDLE.get());
                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
