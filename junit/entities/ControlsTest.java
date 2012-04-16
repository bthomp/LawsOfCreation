package entities;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.newdawn.slick.Input;

import tloc.entities.Command;
import tloc.entities.Controls;
import tloc.entities.Player;

public class ControlsTest {
	private int s, w, a, d, space;
	
	@Before
	public void setUp() {
		Controls.newControls();
		s = Input.KEY_S;
		w = Input.KEY_W;
		a = Input.KEY_A;
		d = Input.KEY_D;
		space = Input.KEY_SPACE;
	}
	
	@Test
	public void testControls() {
		assertEquals(Command.MOVEDOWN, Controls.getCommand(s));
		assertEquals(Command.MOVEUP, Controls.getCommand(w));
		assertEquals(Command.MOVERIGHT, Controls.getCommand(d));
		assertEquals(Command.MOVELEFT, Controls.getCommand(a));
		assertEquals(Command.JUMP, Controls.getCommand(space));
		/*
=======
	private Controls testControl;
	
	
	
	
	@Before
	public void setUp() {
		testControl.setMoveRight('d');
		testControl.setMoveLeft('a');
		testControl.setMoveUp('w');
		testControl.setMoveDown('s');
		testControl.setJump(32);
	}
	
	@Test
	public void testControls() throws Exception {
		assertEquals(Command.MOVERIGHT, Controls.getCommand(testControl.getMoveRight()));
		assertEquals(Command.MOVELEFT, Controls.getCommand(testControl.getMoveLeft()));
		assertEquals(Command.MOVEUP, Controls.getCommand(testControl.getMoveUp()));
		assertEquals(Command.MOVEDOWN, Controls.getCommand(testControl.getMoveDown()));
		assertEquals(Command.JUMP, Controls.getCommand(testControl.getJump()));
		assertEquals(null, Controls.getCommand(2));
>>>>>>> 1b591c13052967a5372c8b78342ea48679d04eb0
*/
	}
	
	
	
}
