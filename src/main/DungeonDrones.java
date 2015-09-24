package DungeonDrones.src.main;

import org.lwjgl.LWJGLException;

import seaviver.main.Scene;
import seaviver.main.Seaviver;
import seaviver.main.test.Test_Scene;

public class DungeonDrones {
	Seaviver engine;

	public DungeonDrones() throws LWJGLException{
		engine = new Seaviver(new Scene[]{
				new Test_Scene()
		});
	}

	public static void main(String[] args) throws LWJGLException{
		new DungeonDrones();
	}
}
