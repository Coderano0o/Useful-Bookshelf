package site.coderan.usefulbookshelf.gui.modscreens;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import site.coderan.usefulbookshelf.ModMain;
import site.coderan.usefulbookshelf.gui.modmenus.ModMenus;

@EventBusSubscriber(modid = ModMain.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModScreens {
    @SubscribeEvent
    // 注册screen并将其绑定到对应menu
    public static void registerScreens(RegisterMenuScreensEvent event) {
        event.register(ModMenus.USEFUL_BOOKSHELF_MENU.get(), UsefulBookshelfScreen::new);
    }
}
