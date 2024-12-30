package site.coderan.usefulbookshelf;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ModelEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import site.coderan.usefulbookshelf.gui.modmenus.ModMenus;
import site.coderan.usefulbookshelf.gui.modscreens.UsefulBookshelfScreen;

@EventBusSubscriber(modid = ModMain.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModModels {
    @SubscribeEvent
    public static void registerModels(ModelEvent.RegisterAdditional event) {
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book01_f1_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book02_f1_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book03_f1_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book04_f1_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book05_f1_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book06_f1_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book07_f1_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book08_f1_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book09_f1_n")
        ));

        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book01_f2_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book02_f2_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book03_f2_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book04_f2_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book05_f2_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book06_f2_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book07_f2_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book08_f2_n")
        ));
        event.register(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book09_f2_n")
        ));
    }
}
