package net.thenoshoeprince.newuniverse;

import net.fabricmc.api.ModInitializer;

import net.thenoshoeprince.newuniverse.item.Items;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewUniverse implements ModInitializer {
	public static final String MOD_ID = "new-universe";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Items.registerItems();
	}
}