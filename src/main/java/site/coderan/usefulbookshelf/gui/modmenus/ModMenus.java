package site.coderan.usefulbookshelf.gui.modmenus;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import site.coderan.usefulbookshelf.ModMain;

public class ModMenus {
    // 模组的Menu注册器
    public static final DeferredRegister<MenuType<?>> MENU_REGISTER = DeferredRegister.create(
            BuiltInRegistries.MENU,
            ModMain.MOD_ID
    );

    // 注册useful_bookshelf_menu
    public static final DeferredHolder<MenuType<?>, MenuType<UsefulBookshelfMenu>> USEFUL_BOOKSHELF_MENU = MENU_REGISTER.register(
            "useful_bookshelf_menu",
            () -> new MenuType<>(
                    UsefulBookshelfMenu::new,
                    FeatureFlags.DEFAULT_FLAGS
            )
    );
}
