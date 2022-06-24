package tugkandeman.cttcr.events;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import tugkandeman.cttcr.entity.CttcrEntityTypes;
import tugkandeman.cttcr.entity.JuggerEntity;

public class CttcrEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(CttcrEntityTypes.JUGGER.get(), JuggerEntity.setCustomAttributes().create());
    }
}
