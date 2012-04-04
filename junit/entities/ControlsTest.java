package entities;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import tloc.entities.Command;
import tloc.entities.Controls;
import tloc.entities.Player;

public class ControlsTest {
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
	}
	
	
	
}
