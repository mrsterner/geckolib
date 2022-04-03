package software.bernie.geckolib3.util;

import net.minecraft.client.MinecraftClient;
import org.quiltmc.qsl.lifecycle.api.client.event.ClientTickEvents;
import software.bernie.geckolib3.core.manager.AnimationData;

public class AnimationTicker {

    private AnimationData manager;

    public AnimationTicker(AnimationData manager) {
        this.manager = manager;
        ClientTickEvents.START.register(this::onTick);
    }

    private void onTick(MinecraftClient minecraftClient) {
        manager.tick++;
    }
}
