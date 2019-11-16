package com.hyperkinetic.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.hyperkinetic.game.core.LaserGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Laser Game";
		config.width = 1920;
		config.height = 1080;
		new LwjglApplication(new LaserGame(), config);
	}
}
