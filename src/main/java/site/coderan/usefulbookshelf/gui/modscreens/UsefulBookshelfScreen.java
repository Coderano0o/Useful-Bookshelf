package site.coderan.usefulbookshelf.gui.modscreens;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import site.coderan.usefulbookshelf.ModMain;
import site.coderan.usefulbookshelf.gui.modmenus.UsefulBookshelfMenu;

public class UsefulBookshelfScreen extends AbstractContainerScreen<UsefulBookshelfMenu> {
    private static final ResourceLocation BACKGROUND = ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "textures/gui/useful_bookshelf_inventory.png");

    public UsefulBookshelfScreen(UsefulBookshelfMenu p_97741_, Inventory p_97742_, Component p_97743_) {
        super(p_97741_, p_97742_, p_97743_);
        this.imageWidth = 176;
        this.imageHeight = 150;
        this.inventoryLabelY = this.imageHeight - 94;
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float v, int i, int i1) {
            int xPox = (this.width - this.imageWidth) / 2;
            int yPox = (this.height - this.imageHeight) / 2;
            guiGraphics.blit(BACKGROUND, xPox, yPox, 0, 0, this.imageWidth, this.imageHeight);
    }
}
