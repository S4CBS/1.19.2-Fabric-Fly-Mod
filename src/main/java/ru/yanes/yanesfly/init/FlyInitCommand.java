package ru.yanes.yanesfly.init;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import ru.yanes.yanesfly.command.FlyCommand;

public class FlyInitCommand {
    public static void load() {
        CommandRegistrationCallback.EVENT.register(((dispatcher, registryAccess, environment) -> {
            FlyCommand.register(dispatcher, registryAccess);
        }));
    }
}
