package site.coderan.usefulbookshelf.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import site.coderan.usefulbookshelf.ModMain;
import site.coderan.usefulbookshelf.block.modblocks.ModBlocks;

public class ModItems {
    // 模组物品注册器
    public static final DeferredRegister.Items ITEM_REGISTER = DeferredRegister.createItems(
            ModMain.MOD_ID
    );

    // 注册useful_bookshelf
    public static final DeferredHolder<Item, BlockItem> USEFUL_BOOKSHELF = ITEM_REGISTER.registerSimpleBlockItem(
            "useful_bookshelf",
            ModBlocks.USEFUL_BOOKSHELF,
            new Item.Properties()
    );
}
