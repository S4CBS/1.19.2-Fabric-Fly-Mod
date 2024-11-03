package ru.yanes.yanesfly.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandBuildContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.world.entity.Entity;
import ru.yanes.yanesfly.procedure.FlyProcedure;

public class FlyCommand {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher, CommandBuildContext commandBuildContext) {
        dispatcher.register(Commands.literal("fly").executes(context -> {
            Entity entity = context.getSource().getEntity();
            FlyProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).build());
            return 0;
        }));
    }
}
