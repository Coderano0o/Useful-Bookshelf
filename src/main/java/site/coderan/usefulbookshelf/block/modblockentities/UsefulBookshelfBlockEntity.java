package site.coderan.usefulbookshelf.block.modblockentities;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.jetbrains.annotations.Nullable;

public class UsefulBookshelfBlockEntity extends BlockEntity {
    private ItemStackHandler bookshelfInventoryNorth = new ItemStackHandler(18){
        @Override
        protected void onContentsChanged(int slot) {
            super.onContentsChanged(slot);
            setChanged();
            getLevel().sendBlockUpdated(getBlockPos(),getLevel().getBlockState(getBlockPos()),getLevel().getBlockState(getBlockPos()),3);
        }

        @Override
        public boolean isItemValid(int slot, ItemStack stack) {
            if (stack.getItem() == Items.BOOK || stack.getItem() == Items.WRITTEN_BOOK || stack.getItem() == Items.ENCHANTED_BOOK || stack.getItem() == Items.WRITABLE_BOOK || stack.getItem() == Items.KNOWLEDGE_BOOK){
                return true;
            } else {
                return false;
            }
        }
    };
    private ItemStackHandler bookshelfInventorySouth = new ItemStackHandler(18){
        @Override
        protected void onContentsChanged(int slot) {
            super.onContentsChanged(slot);
            setChanged();
            getLevel().sendBlockUpdated(getBlockPos(),getLevel().getBlockState(getBlockPos()),getLevel().getBlockState(getBlockPos()),3);
        }

        @Override
        public boolean isItemValid(int slot, ItemStack stack) {
            if (stack.getItem() == Items.BOOK || stack.getItem() == Items.WRITTEN_BOOK || stack.getItem() == Items.ENCHANTED_BOOK || stack.getItem() == Items.WRITABLE_BOOK || stack.getItem() == Items.KNOWLEDGE_BOOK){
                return true;
            } else {
                return false;
            }
        }
    };

    public UsefulBookshelfBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntities.USEFUL_BOOKSHELF_ENTITY.get(), blockPos, blockState);
    }


    // 数据持久化
    @Override
    protected void saveAdditional(CompoundTag compoundTag, HolderLookup.Provider provider) {
        super.saveAdditional(compoundTag, provider);
        compoundTag.put("useful_bookshelf_inventory_north", getBookshelfInventoryNorth().serializeNBT(provider));
        compoundTag.put("useful_bookshelf_inventory_south", getBookshelfInventorySouth().serializeNBT(provider));
    }

    @Override
    protected void loadAdditional(CompoundTag compoundTag, HolderLookup.Provider provider) {
        super.loadAdditional(compoundTag, provider);
        getBookshelfInventoryNorth().deserializeNBT(provider, compoundTag.getCompound("useful_bookshelf_inventory_north"));
        getBookshelfInventorySouth().deserializeNBT(provider, compoundTag.getCompound("useful_bookshelf_inventory_south"));
    }
    // 双端数据同步

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }
    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider provider) {
        CompoundTag compoundTag = new CompoundTag();
        compoundTag.put("useful_bookshelf_inventory_north", getBookshelfInventoryNorth().serializeNBT(provider));
        compoundTag.put("useful_bookshelf_inventory_south", getBookshelfInventorySouth().serializeNBT(provider));
        return compoundTag;
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt, HolderLookup.Provider lookupProvider) {
        super.onDataPacket(net, pkt, lookupProvider);
        this.bookshelfInventoryNorth.deserializeNBT(lookupProvider, pkt.getTag().getCompound("useful_bookshelf_inventory_north"));
        this.bookshelfInventorySouth.deserializeNBT(lookupProvider, pkt.getTag().getCompound("useful_bookshelf_inventory_south"));
    }

    // 仓库的获取
    public ItemStackHandler getBookshelfInventory(Direction hitDirection, String blockFacing) {
        if (blockFacing.equals("north")) {
            if (hitDirection == Direction.NORTH){
                return bookshelfInventoryNorth;
            } else if (hitDirection == Direction.SOUTH){
                return bookshelfInventorySouth;
            } else {
                return null;
            }
        } else if (blockFacing.equals("east")) {
            if (hitDirection == Direction.EAST){
                return bookshelfInventoryNorth;
            } else if (hitDirection == Direction.WEST){
                return bookshelfInventorySouth;
            } else {
                return null;
            }
        } else if (blockFacing.equals("south")) {
            if (hitDirection == Direction.SOUTH){
                return bookshelfInventoryNorth;
            } else if (hitDirection == Direction.NORTH){
                return bookshelfInventorySouth;
            } else {
                return null;
            }
        } else {
            if (hitDirection == Direction.WEST){
                return bookshelfInventoryNorth;
            } else if (hitDirection == Direction.EAST){
                return bookshelfInventorySouth;
            } else {
                return null;
            }
        }
    }

    public ItemStackHandler getBookshelfInventoryNorth() {
        return this.bookshelfInventoryNorth;
    }
    public ItemStackHandler getBookshelfInventorySouth() {
        return bookshelfInventorySouth;
    }
}
