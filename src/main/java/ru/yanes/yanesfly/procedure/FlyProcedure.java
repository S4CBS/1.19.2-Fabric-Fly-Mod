package ru.yanes.yanesfly.procedure;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.social.PlayerEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import ru.yanes.yanesfly.YanesflyMod;

import java.util.Map;

public class FlyProcedure {
    public static void execute(Map<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            if (!dependencies.containsKey("entity"))
                YanesflyMod.LOGGER.warn("Failed to load dependency entity for procedure FlyCommand!");
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        if (entity instanceof Player player) {
            player.getAbilities().mayfly = !player.getAbilities().mayfly;
            if (player.getAbilities().mayfly == false){
                player.getAbilities().flying = false;
            }
            player.onUpdateAbilities();
            player.displayClientMessage(Component.literal("Fly " + (player.getAbilities().mayfly ? "On" : "Off")), true);
        }
    }
}
