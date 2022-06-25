package tugkandeman.cttcr.entity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tugkandeman.cttcr.Cttcr;

public class CttcrEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, Cttcr.MOD_ID);

    public static final RegistryObject<EntityType<JuggerEntity>> JUGGER =
            ENTITY_TYPES.register("jugger",
        () -> EntityType.Builder.create(JuggerEntity::new,
                    EntityClassification.MONSTER).size(1f, 3f)
            .build(new ResourceLocation("cttcr", "jugger").toString()));

    public static void register (IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
