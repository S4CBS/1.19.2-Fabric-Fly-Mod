package ru.yanes.yanesfly;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;
import ru.yanes.yanesfly.init.FlyInitCommand;
import ru.yanes.yanesfly.init.FlyInitProcedure;

public class YanesflyMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "yanesfly";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing YanesflyMod");

		FlyInitProcedure.load();
		FlyInitCommand.load();
	}
}
