package site.coderan.usefulbookshelf.gui.modmenus;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
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

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();

            if (index < 36) {  // 假设玩家背包有 36 个槽位
                if (!this.moveItemStackTo(itemstack1, 36, 45, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(itemstack1, 0, 36, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }

        return itemstack;
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
