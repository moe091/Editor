package com.moe.leveleditor;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "LevelEditor";
		cfg.width = (int) (20 * GdxApp.METERS_TO_PIXELS);
		cfg.height = (int) (15 * GdxApp.METERS_TO_PIXELS);
		
		new LwjglApplication(new GdxApp(), cfg);
	}
}
