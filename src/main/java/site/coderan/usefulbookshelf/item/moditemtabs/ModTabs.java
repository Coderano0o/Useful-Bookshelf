package site.coderan.usefulbookshelf.item.moditemtabs;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import site.coderan.usefulbookshelf.ModMain;
import site.coderan.usefulbookshelf.item.ModItems;

@EventBusSubscriber(modid = ModMain.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModTabs {
    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        // Is this the tab we want to add to?
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.insertAfter(new ItemStack(Items.CHISELED_BOOKSHELF), new ItemStack(ModItems.USEFUL_BOOKSHELF), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}