package com.newmaa.othtech.common.recipemap;

import com.newmaa.othtech.common.recipemap.recipeMapFrontends.OTH_GeneralFrontend;

import gregtech.api.enums.ItemList;
import gregtech.api.gui.modularui.GT_UITextures;
import gregtech.api.recipe.RecipeMap;
import gregtech.api.recipe.RecipeMapBuilder;
import gregtech.api.util.GT_ModHandler;
import gregtech.nei.formatter.HeatingCoilSpecialValueFormatter;

public class Recipemaps {

    public static final RecipeMap<OTH_RecipeMapBackend> MegaIsaForge = RecipeMapBuilder
        .of("otht.recipe.MegaIsaForge", OTH_RecipeMapBackend::new)
        .maxIO(16, 16, 16, 16)
        .progressBar(GT_UITextures.PROGRESSBAR_ARROW_MULTIPLE)
        .frontend(OTH_GeneralFrontend::new)
        .neiHandlerInfo(
            builder -> builder.setDisplayStack(ItemList.Electric_Motor_MAX.get(1))
                .setMaxRecipesPerPage(1))
        .disableOptimize()
        .build();
    public static final RecipeMap<OTH_RecipeMapBackend> QFTMega = RecipeMapBuilder
        .of("otht.recipe.GT_TE_MegaQFTFake", OTH_RecipeMapBackend::new)
        .maxIO(8, 8, 8, 8)
        .progressBar(GT_UITextures.PROGRESSBAR_ARROW_MULTIPLE)
        .frontend(OTH_GeneralFrontend::new)
        .neiHandlerInfo(
            builder -> builder.setDisplayStack(ItemList.Field_Generator_MAX.get(1))
                .setMaxRecipesPerPage(2))
        .disableOptimize()
        .build();
    public static final RecipeMap<OTH_RecipeMapBackend> Cannon = RecipeMapBuilder
        .of("otht.recipe.EVACannon", OTH_RecipeMapBackend::new)
        .maxIO(1, 1, 0, 0)
        .progressBar(GT_UITextures.PROGRESSBAR_ARROW_MULTIPLE)
        .frontend(OTH_GeneralFrontend::new)
        .neiHandlerInfo(
            builder -> builder.setDisplayStack(GT_ModHandler.getModItem("123Technology", "dustIrOsSm", 1))
                .setMaxRecipesPerPage(2))
        .disableOptimize()
        .build();

    public static final RecipeMap<OTH_RecipeMapBackend> SINOPEC = RecipeMapBuilder
        .of("otht.recipe.SINOPEC", OTH_RecipeMapBackend::new)
        .maxIO(8, 8, 16, 16)
        .progressBar(GT_UITextures.PROGRESSBAR_ARROW_MULTIPLE)
        .frontend(OTH_GeneralFrontend::new)
        .neiHandlerInfo(
            builder -> builder.setDisplayStack(GT_ModHandler.getModItem("123Technology", "itemZhangww", 1))
                .setMaxRecipesPerPage(1))
        .disableOptimize()
        .build();

    public static final RecipeMap<OTH_RecipeMapBackend> MEEC = RecipeMapBuilder
        .of("otht.recipe.MEEC", OTH_RecipeMapBackend::new)
        .maxIO(8, 8, 16, 16)
        .progressBar(GT_UITextures.PROGRESSBAR_ARROW_MULTIPLE)
        .frontend(OTH_GeneralFrontend::new)
        .neiHandlerInfo(
            builder -> builder.setDisplayStack(GT_ModHandler.getModItem("gregtech", "gt.blockmachines", 1, 23536))
                .setMaxRecipesPerPage(1))
        .disableOptimize()
        .build();

    public static final RecipeMap<OTH_RecipeMapBackend> TSSF = RecipeMapBuilder
        .of("otht.recipe.TSSF", OTH_RecipeMapBackend::new)
        .maxIO(24, 24, 4, 4)
        .progressBar(GT_UITextures.PROGRESSBAR_ARROW_MULTIPLE)
        .neiSpecialInfoFormatter(HeatingCoilSpecialValueFormatter.INSTANCE)
        .frontend(OTH_GeneralFrontend::new)
        .neiHandlerInfo(
            builder -> builder.setDisplayStack(GT_ModHandler.getModItem("123Technology", "Dasima", 1))
                .setMaxRecipesPerPage(1))
        .disableOptimize()
        .build();

    public static final RecipeMap<OTH_RecipeMapBackend> SF1 = RecipeMapBuilder
        .of("otht.recipe.MegaPCB", OTH_RecipeMapBackend::new)
        .maxIO(16, 16, 16, 16)
        .progressBar(GT_UITextures.PROGRESSBAR_ARROW_MULTIPLE)
        .frontend(OTH_GeneralFrontend::new)
        .neiHandlerInfo(
            builder -> builder.setDisplayStack(GT_ModHandler.getModItem("gregtech", "gt.metaitem.03", 1, 32728))
                .setMaxRecipesPerPage(1))
        .disableOptimize()
        .build();

    public static final RecipeMap<OTH_RecipeMapBackend> SF2 = RecipeMapBuilder
        .of("otht.recipe.MegaPCB_A", OTH_RecipeMapBackend::new)
        .maxIO(16, 16, 16, 16)
        .progressBar(GT_UITextures.PROGRESSBAR_ARROW_MULTIPLE)
        .frontend(OTH_GeneralFrontend::new)
        .neiHandlerInfo(
            builder -> builder.setDisplayStack(GT_ModHandler.getModItem("gregtech", "gt.metaitem.03", 1, 32178))
                .setMaxRecipesPerPage(1))
        .disableOptimize()
        .build();

    public static final RecipeMap<OTH_RecipeMapBackend> SF3 = RecipeMapBuilder
        .of("otht.recipe.MegaPCB_B", OTH_RecipeMapBackend::new)
        .maxIO(16, 16, 16, 16)
        .progressBar(GT_UITextures.PROGRESSBAR_ARROW_MULTIPLE)
        .frontend(OTH_GeneralFrontend::new)
        .neiHandlerInfo(
            builder -> builder.setDisplayStack(GT_ModHandler.getModItem("gregtech", "gt.metaitem.03", 1, 32725))
                .setMaxRecipesPerPage(1))
        .disableOptimize()
        .build();

    public static final RecipeMap<OTH_RecipeMapBackend> SF4 = RecipeMapBuilder
        .of("otht.recipe.MegaPCB_C", OTH_RecipeMapBackend::new)
        .maxIO(16, 16, 16, 16)
        .progressBar(GT_UITextures.PROGRESSBAR_ARROW_MULTIPLE)
        .frontend(OTH_GeneralFrontend::new)
        .neiHandlerInfo(
            builder -> builder.setDisplayStack(GT_ModHandler.getModItem("gregtech", "gt.metaitem.03", 1, 32725))
                .setMaxRecipesPerPage(1))
        .disableOptimize()
        .build();

}
