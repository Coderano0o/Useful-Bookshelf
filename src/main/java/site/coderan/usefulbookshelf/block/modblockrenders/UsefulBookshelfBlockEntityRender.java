package site.coderan.usefulbookshelf.block.modblockrenders;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import site.coderan.usefulbookshelf.ModMain;
import site.coderan.usefulbookshelf.block.modblockentities.UsefulBookshelfBlockEntity;
import site.coderan.usefulbookshelf.block.modblocks.UsefulBookshelfBlock;

public class UsefulBookshelfBlockEntityRender implements BlockEntityRenderer<UsefulBookshelfBlockEntity> {
    private static final BakedModel BOOK01_F1_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book01_f1_n"))
    );
    private static final BakedModel BOOK02_F1_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book02_f1_n"))
    );
    private static final BakedModel BOOK03_F1_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book03_f1_n"))
    );
    private static final BakedModel BOOK04_F1_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book04_f1_n"))
    );
    private static final BakedModel BOOK05_F1_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book05_f1_n"))
    );
    private static final BakedModel BOOK06_F1_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book06_f1_n"))
    );
    private static final BakedModel BOOK07_F1_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book07_f1_n"))
    );
    private static final BakedModel BOOK08_F1_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book08_f1_n"))
    );
    private static final BakedModel BOOK09_F1_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book09_f1_n"))
    );

    private static final BakedModel BOOK01_F2_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book01_f2_n"))
    );
    private static final BakedModel BOOK02_F2_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book02_f2_n"))
    );
    private static final BakedModel BOOK03_F2_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book03_f2_n"))
    );
    private static final BakedModel BOOK04_F2_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book04_f2_n"))
    );
    private static final BakedModel BOOK05_F2_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book05_f2_n"))
    );
    private static final BakedModel BOOK06_F2_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book06_f2_n"))
    );
    private static final BakedModel BOOK07_F2_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book07_f2_n"))
    );
    private static final BakedModel BOOK08_F2_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book08_f2_n"))
    );
    private static final BakedModel BOOK09_F2_N = Minecraft.getInstance().getModelManager().getModel(
            ModelResourceLocation.standalone(ResourceLocation.fromNamespaceAndPath(ModMain.MOD_ID, "block/book09_f2_n"))
    );

    public UsefulBookshelfBlockEntityRender(BlockEntityRendererProvider.Context context) {
    }

    @Override
    public void render(UsefulBookshelfBlockEntity usefulBookshelfBlockEntity, float v, PoseStack poseStack, MultiBufferSource multiBufferSource, int i, int i1) {
        // 拿到modelRenderer
        BlockRenderDispatcher blockRenderDispatcher = Minecraft.getInstance().getBlockRenderer();
        ModelBlockRenderer modelRenderer = blockRenderDispatcher.getModelRenderer();
        // 拿到block的facing
        Direction facing = usefulBookshelfBlockEntity.getBlockState().getValue(UsefulBookshelfBlock.FACING);

        // 渲染书架正面模型
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(0).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK01_F2_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(1).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK02_F2_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(2).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK03_F2_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(3).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK04_F2_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(4).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK05_F2_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(5).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK06_F2_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(6).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK07_F2_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(7).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK08_F2_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(8).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK09_F2_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(9).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK01_F1_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(10).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK02_F1_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(11).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK03_F1_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(12).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK04_F1_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(13).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK05_F1_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(14).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK06_F1_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(15).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK07_F1_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(16).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK08_F1_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventoryNorth().getStackInSlot(17).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK09_F1_N,
                    false,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        // 渲染书架背面模型
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(0).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK01_F2_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(1).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK02_F2_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(2).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK03_F2_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(3).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK04_F2_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(4).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK05_F2_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(5).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK06_F2_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(6).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK07_F2_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(7).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK08_F2_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(8).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK09_F2_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(9).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK01_F1_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(10).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK02_F1_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(11).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK03_F1_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(12).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK04_F1_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(13).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK05_F1_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(14).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK06_F1_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(15).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK07_F1_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(16).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK08_F1_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
        if (!usefulBookshelfBlockEntity.getBookshelfInventorySouth().getStackInSlot(17).isEmpty()) {
            renderModelWithFacing(
                    usefulBookshelfBlockEntity,
                    BOOK09_F1_N,
                    true,
                    modelRenderer, poseStack, multiBufferSource, i, i1,
                    facing
            );
        }
    }
    public void renderModelWithFacing(UsefulBookshelfBlockEntity usefulBookshelfBlockEntity, BakedModel model, boolean isBack , ModelBlockRenderer modelRenderer, PoseStack poseStack, MultiBufferSource multiBufferSource, int i, int i1, Direction facing){
        float degreeFix = 0;
        if (isBack) degreeFix = 180;
        if (facing == Direction.NORTH){
            renderModel(
                    usefulBookshelfBlockEntity,
                    model,
                    0, 0 + degreeFix, 0,
                    modelRenderer, poseStack, multiBufferSource, i, i1
            );
        }
        if (facing == Direction.EAST){
            renderModel(
                    usefulBookshelfBlockEntity,
                    model,
                    0, -90 + degreeFix, 0,
                    modelRenderer, poseStack, multiBufferSource, i, i1
            );
        }
        if (facing == Direction.SOUTH){
            renderModel(
                    usefulBookshelfBlockEntity,
                    model,
                    0, -180 + degreeFix, 0,
                    modelRenderer, poseStack, multiBufferSource, i, i1
            );
        }
        if (facing == Direction.WEST){
            renderModel(
                    usefulBookshelfBlockEntity,
                    model,
                    0, -270 + degreeFix, 0,
                    modelRenderer, poseStack, multiBufferSource, i, i1
            );
        }
    }
    /**
     * 渲染模型
     * @param usefulBookshelfBlockEntity
     * @param model
     * @param xRotation 沿x轴，中心旋转角度
     * @param yRotation 沿y轴，中心旋转角度
     * @param zRotation 沿z轴，中心旋转角度
     * @param modelRenderer
     * @param poseStack
     * @param multiBufferSource
     * @param i
     * @param i1
     */
    public void renderModel(UsefulBookshelfBlockEntity usefulBookshelfBlockEntity, BakedModel model, float xRotation, float yRotation, float zRotation, ModelBlockRenderer modelRenderer, PoseStack poseStack, MultiBufferSource multiBufferSource, int i, int i1){
        poseStack.pushPose();
        poseStack.translate(0,0,0);
        poseStack.rotateAround(Axis.XP.rotationDegrees(xRotation), 0.5f, 0.5f, 0.5f);
        poseStack.rotateAround(Axis.YP.rotationDegrees(yRotation), 0.5f, 0.5f, 0.5f);
        poseStack.rotateAround(Axis.ZP.rotationDegrees(zRotation), 0.5f, 0.5f, 0.5f);
        modelRenderer.renderModel(
                poseStack.last(),
                multiBufferSource.getBuffer(RenderType.SOLID),
                usefulBookshelfBlockEntity.getBlockState(),
                model,
                1, 1, 1,
                i, i1
        );
        poseStack.popPose();
    }
}
