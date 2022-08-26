package me.foksha.noplayernametags;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.option.StickyKeyBinding;
import org.lwjgl.glfw.GLFW;

public class NoPlayerNametags implements ModInitializer {
    public static KeyBinding playerNameTagToggle =
            KeyBindingHelper.registerKeyBinding(
                    new StickyKeyBinding(
                            "no-player-nametags.playertoggle",
                            GLFW.GLFW_KEY_UNKNOWN,
                            "key.categories.misc",
                            () -> true
                    )
            );

    public static KeyBinding mobNameTagToggle =
            KeyBindingHelper.registerKeyBinding(
                    new StickyKeyBinding(
                            "no-player-nametags.mobtoggle",
                            GLFW.GLFW_KEY_UNKNOWN,
                            "key.categories.misc",
                            () -> true
                    )
            );


    @Override
    public void onInitialize() {


}
}