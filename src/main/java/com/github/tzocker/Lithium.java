package com.github.tzocker;

import com.github.tzocker.common.Items;
import net.fabricmc.api.ModInitializer;

public class Lithium implements ModInitializer {
	@Override
	public void onInitialize() {
		System.out.println("Starting Lithium...");

		Items.init();
	}
}
