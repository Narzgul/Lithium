package com.github.tzocker;

import com.github.tzocker.blocks.Blocks;
import com.github.tzocker.items.Items;
import net.fabricmc.api.ModInitializer;

public class Lithium implements ModInitializer {
	@Override
	public void onInitialize() {
		System.out.println("Starting Lithium...");

		Items.init();
		Blocks.init();
	}
}
