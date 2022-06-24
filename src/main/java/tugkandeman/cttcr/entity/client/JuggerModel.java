package tugkandeman.cttcr.entity.client;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import tugkandeman.cttcr.Cttcr;
import tugkandeman.cttcr.entity.JuggerEntity;

public class JuggerModel extends AnimatedGeoModel<JuggerEntity> {
    @Override
    public ResourceLocation getModelLocation(JuggerEntity object) {
        return new ResourceLocation(Cttcr.MOD_ID, "geo/jugger.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(JuggerEntity object) {
        return new ResourceLocation(Cttcr.MOD_ID, "textures/entity/jugger.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(JuggerEntity animatable) {
        return new ResourceLocation(Cttcr.MOD_ID, "animations/jugger.animation.json");
    }
}
