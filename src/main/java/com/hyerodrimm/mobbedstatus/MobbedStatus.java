package com.hyerodrimm.mobbedstatus;

import com.hyerodrimm.mobbedstatus.config.ModConfigs;
import com.hyerodrimm.mobbedstatus.status_effect.BeeMobbedStatusEffect;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MobbedStatus implements ModInitializer {
	public static final String MOD_ID = "mobbed-status";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.debug("Initializing Mobbed Status");
		ModConfigs.registerConfigs();
		ModPotions.registerPotions();
	}
}