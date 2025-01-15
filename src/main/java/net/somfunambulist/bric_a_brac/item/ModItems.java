package net.somfunambulist.bric_a_brac.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.somfunambulist.bric_a_brac.Bric_A_Brac;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Bric_A_Brac.MOD_ID);
    /*
    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new Item(new Item.Properties()));
     */


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
