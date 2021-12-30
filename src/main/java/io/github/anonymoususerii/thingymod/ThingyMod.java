package io.github.anonymoususerii.thingymod;

import io.github.anonymoususerii.thingymod.util.Register;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ThingyMod implements ModInitializer {
	public static final String MOD_ID = "thingymod";
	public static final Logger LOGGER = LogManager.getLogger("thingymod");

	@Override
	public void onInitialize() {
		Register.registerModStuff();

		LOGGER.info("ThingyMod Main Loaded!");
	}
}
