package DungeonDrones;

import org.lwjgl.LWJGLException;

import seaviver.main.Scene;
import seaviver.main.Seaviver;

public class DungeonDrones {
	
	public DungeonDrones() throws LWJGLException{
		new Seaviver(new Scene[]{
				new Test_Scene()
		});
	}
	
	public static void main(String[] args) throws LWJGLException{
		new DungeonDrones();
	}
}
