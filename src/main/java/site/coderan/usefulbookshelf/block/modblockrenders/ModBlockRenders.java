package site.coderan.usefulbookshelf.block.modblockrenders;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import site.coderan.usefulbookshelf.ModMain;
import site.coderan.usefulbookshelf.block.modblockentities.ModBlockEntities;
import site.coderan.usefulbookshelf.gui.modmenus.ModMenus;
import site.coderan.usefulbookshelf.gui.modscreens.UsefulBookshelfScreen;

@EventBusSubscriber(modid = ModMain.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModBlockRenders {
    @SubscribeEvent
    // 注册screen并将其绑定到对应menu
    public static void registerBlockEntityRender(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(
                ModBlockEntities.USEFUL_BOOKSHELF_ENTITY.get(),
                UsefulBookshelfBlockEntityRender::new
        );
    }
}
