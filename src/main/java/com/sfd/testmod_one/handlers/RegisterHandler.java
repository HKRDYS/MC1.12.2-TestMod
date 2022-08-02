package com.sfd.testmod_one.handlers;


import com.sfd.testmod_one.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class RegisterHandler {
    /**
     * 注册物品
     * **/
    @SubscribeEvent
    public static void ItemRegister(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

    }

    /**
     * 注册方块
     * **/
    @SubscribeEvent
    public static void BlockRegister(RegistryEvent.Register<Block> event){

    }
}
