package DungeonDrones.src.main;

import java.awt.Color;
import java.util.Random;

import org.lwjgl.opengl.Display;

import seaviver.main.Scene;
import seaviver.main.graphics.LightEngine;

public class Test_Scene extends Scene{
	
	public TestLight light = new TestLight(0, 0, this);
	public TestLight light2 = new TestLight(256, 256, this);
	public Test_Actor actor = new Test_Actor(600, 600, this);
	Random random = new Random();

	@Override
	protected void tick(float delta) {
		light.setX(actor.getX());
		light.setY(actor.getY());
		
		if(random.nextInt(16) == 0){
			light2.setBrightness(light2.getBrightness()+4f);
		}
	}

	@Override
	protected void draw(float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void init(float delta) {
		setBackgroundColor(Color.white);
		
		instantiateActor(actor);
		
		createLightEngine(new LightEngine(Display.getWidth(), Display.getHeight(), 24, 1f,this));
		getLightEngine().setEnabled(true);
		
		light2.setColor(Color.yellow);
		light2.setX(Display.getWidth()/2);
		light2.setY(Display.getHeight()/2);
		
		getLightEngine().addLight(light2);
		getLightEngine().addLight(light);
		
		
		
	}

	@Override
	protected void gui(float delta) {
		getLightEngine().update(delta);
		
	}

}
