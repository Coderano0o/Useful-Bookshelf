package site.coderan.usefulbookshelf;

import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import site.coderan.usefulbookshelf.block.modblockentities.ModBlockEntities;
import site.coderan.usefulbookshelf.block.modblocks.ModBlocks;
import site.coderan.usefulbookshelf.gui.modmenus.ModMenus;
import site.coderan.usefulbookshelf.item.ModItems;

@Mod(ModMain.MOD_ID)
public class ModMain {
    public static final String MOD_ID = "usefulbookshelf";

    public ModMain(IEventBus modEventBus) {
        ModItems.ITEM_REGISTER.register(modEventBus);
        ModBlocks.BLOCK_REGISTER.register(modEventBus);
        ModBlockEntities.BLOCK_ENTITY_REGISTER.register(modEventBus);
        ModMenus.MENU_REGISTER.register(modEventBus);
    }
}
