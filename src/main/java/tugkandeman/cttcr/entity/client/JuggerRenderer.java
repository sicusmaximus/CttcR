package tugkandeman.cttcr.entity.client;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import tugkandeman.cttcr.Cttcr;
import tugkandeman.cttcr.entity.JuggerEntity;


public class JuggerRenderer extends GeoEntityRenderer<JuggerEntity> {
    public JuggerRenderer(EntityRendererManager renderManager, AnimatedGeoModel<JuggerEntity> modelProvider) {
        super(renderManager, new JuggerModel());
        this.shadowSize = 0.6f;
    }

    @Override
    public ResourceLocation getEntityTexture(JuggerEntity entity) {
        return null;
    }

    @Override
    public ResourceLocation getTextureLocation(JuggerEntity instance) {
        return new ResourceLocation(Cttcr.MOD_ID, "textures/entity/jugger.png");
    }

    @Override
    public RenderType getRenderType(JuggerEntity animatable, float partialTicks, MatrixStack stack,
                                    IRenderTypeBuffer bufferIn, IVertexBuilder vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale( 0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, bufferIn, vertexBuilder, packedLightIn, textureLocation);
    }
}
