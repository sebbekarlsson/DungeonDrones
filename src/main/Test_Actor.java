package DungeonDrones.src.main;

import org.lwjgl.input.Keyboard;

import seaviver.main.Entity;
import seaviver.main.TextureBank;

public class Test_Actor extends Entity {

	public Test_Actor(float x, float y) {
		super(x, y);
		
	}

	@Override
	protected void draw(float delta) {
		this.drawDefault(delta);
		
	}

	@Override
	protected void tick(float delta) {
		if(Keyboard.isKeyDown(Keyboard.KEY_UP)){
			dx += Math.cos(Math.toRadians(getRotation() - 180f)) * 3;
			dy += Math.sin(Math.toRadians(getRotation() - 180f)) * 3;
		}
		
		if(Keyboard.isKeyDown(Keyboard.KEY_LEFT)){
			setRotation(getRotation() - 3f);
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT)){
			setRotation(getRotation() + 3f);
		}
	}

	@Override
	protected void init(float delta) {
		this.friction = 0.5f;
		this.sprite.setTextures(TextureBank.getTexture("drone.png"));
		
	}

}
