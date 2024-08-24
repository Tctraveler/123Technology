package com.newmaa.othtech.common.item;

import net.minecraft.item.Item;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemLoader {

    public static Item LookNEIdust = new LookNEIdust();
    public static Item dustIrOsSm = new dustIrOsSm();
    public static Item itemZhangww = new itemZhangww();
    public static Item ingotHotDog = new ingotHotDog();

    public static Item ingotDog = new ingotDog();
    public static Item lengjingqidian = new lengjingqidian();
    public static Item jixieqidian = new jixieqidian();
    public static Item Dasima = new Dasima();
    public static Item ShikanokoNoko = new ShikanokoNoko();
    public static Item dustSnAs = new dustSnAs();
    public static Item ingotSnAs = new ingotSnAs();
    public static Item IsaBee = new IsaBee();
    public static Item MagBee = new MagBee();
    public static Item socCosmic = new socCosmic();
    public static Item socInf = new socInf();
    public static Item socNor = new socNor();

    public ItemLoader(FMLPreInitializationEvent event) {
        IRegistry(LookNEIdust, "LookNEIdust");
        IRegistry(dustIrOsSm, "dustIrOsSm");
        IRegistry(itemZhangww, "itemZhangww");
        IRegistry(ingotHotDog, "ingotHotDog");
        IRegistry(ingotDog, "ingotDog");
        IRegistry(lengjingqidian, "lengjingqidian");
        IRegistry(jixieqidian, "jixieqidian");
        IRegistry(Dasima, "Dasima");
        IRegistry(ShikanokoNoko, "ShikanokoNoko");
        IRegistry(dustSnAs, "dustSnAs");
        IRegistry(ingotSnAs, "ingotSnAs");
        IRegistry(IsaBee, "IsaBee");
        IRegistry(MagBee, "MagBee");
        IRegistry(socCosmic, "socCosmic");
        IRegistry(socInf, "socInf");
        IRegistry(socNor, "socNor");
    }

    private static void IRegistry(Item item, String name) {
        GameRegistry.registerItem(item, name);
    }

}
