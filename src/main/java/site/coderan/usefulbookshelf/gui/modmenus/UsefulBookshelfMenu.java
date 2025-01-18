package site.coderan.usefulbookshelf.gui.modmenus;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.SlotItemHandler;

public class UsefulBookshelfMenu extends AbstractContainerMenu {
    private static final int SLOT_PER_ROW = 9;
    private static final int ROW_COUNT = 2;

    protected UsefulBookshelfMenu(int containerId, Inventory playerInventory) {
        this(containerId, playerInventory, new ItemStackHandler(ROW_COUNT * SLOT_PER_ROW));
    }

    public UsefulBookshelfMenu(int containerId, Inventory playerInventory, ItemStackHandler bookshelfInventory){
        super(ModMenus.USEFUL_BOOKSHELF_MENU.get(), containerId);
        this.layoutPlayerInventorySlots(playerInventory);
        this.layoutBookshelfInventorySlots(bookshelfInventory);
    }

    /***
     * 定义shift + RMB 一个物品时的快速移动行为
     * @param player
     * @param index 玩家点击一个物品时，该物品的槽位下标
     * @return 移动失败返回ItemStack.EMPTY
     */
    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        Slot clickedSlot = this.slots.get(index);
        ItemStack clickedStack = clickedSlot.getItem();
        if (clickedStack.getItem() == Items.BOOK || clickedStack.getItem() == Items.WRITTEN_BOOK || clickedStack.getItem() == Items.ENCHANTED_BOOK || clickedStack.getItem() == Items.WRITABLE_BOOK || clickedStack.getItem() == Items.KNOWLEDGE_BOOK){
            // 当下标小于36时，说明点击的物品是玩家背包物品，需要快速放置到书架仓库
            // 当下标大于等于36时，说明点击的物品是书架仓库物品，需要快速放置到玩家背包
            // 玩家和书架仓库的槽位下标不是固定的，需要看addSlot操作
            if (index < 36) {
                // quickMoveStack的关键在moveItemStackTo(ItemStack clickedStack, int x, int y, bool sort)
                // 当x大于0时，此方法将0-（x-1）下标的槽位中的itemStack快速移动到x-(y-1)下标的槽位中
                // 当x等于0时，此方法将任何点击的槽位中的itemStack快速移动到0-（y-1）下标的槽位中
                // sort为false时表示要正序快速移动，true时表示要倒序快速移动
                if (!this.moveItemStackTo(clickedStack, 36, 54, false)) {
                    return ItemStack.EMPTY;
                }
            } else {
                if (!this.moveItemStackTo(clickedStack, 0, 36, false)) {
                    return ItemStack.EMPTY;
                }
            }
        }
        if (clickedStack.isEmpty()) {
            clickedSlot.set(ItemStack.EMPTY);
        } else {
            clickedSlot.setChanged();
        }
        return clickedStack.copy();
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    private void layoutPlayerInventorySlots(Inventory playerInventory) {
        // Player inventory
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 68 + i * 18));
                // 9 - 17
                // 18 - 26
                // 27 - 35
            }
        }

        // Hotbar
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 126));
            // 0 - 8
        }
    }

    private void layoutBookshelfInventorySlots(ItemStackHandler inventer) {
        for (int i = 0; i < ROW_COUNT; ++i) {
            for (int j = 0; j < SLOT_PER_ROW; ++j) {
                this.addSlot(new SlotItemHandler(inventer, j + i * 9, 8 + j * 18, 18 + i * 18));
            }
        }
    }
}
