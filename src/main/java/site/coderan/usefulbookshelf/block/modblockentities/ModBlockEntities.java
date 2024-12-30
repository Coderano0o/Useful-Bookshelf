package site.coderan.usefulbookshelf.block.modblockentities;

import com.google.common.collect.ImmutableSet;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import site.coderan.usefulbookshelf.ModMain;
import site.coderan.usefulbookshelf.block.modblocks.ModBlocks;

public class ModBlockEntities {
    // 方块实体注册器
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_REGISTER = DeferredRegister.create(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            ModMain.MOD_ID
    );
    // 注册useful_bookshelf的方块实体
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<UsefulBookshelfBlockEntity>> USEFUL_BOOKSHELF_ENTITY = BLOCK_ENTITY_REGISTER.register(
            "useful_bookshelf_entity",
            () -> new BlockEntityType<>(
                    UsefulBookshelfBlockEntity::new,
                    ImmutableSet.of(ModBlocks.USEFUL_BOOKSHELF.get()),
                    null
            )
    );
}
