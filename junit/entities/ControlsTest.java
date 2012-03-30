package entities;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import tloc.entities.Command;
import tloc.entities.Controls;
import tloc.entities.Player;

public class ControlsTest {
	private int moveRight = 'd';
	private int moveLeft = 'a';
	private int moveUp = 'w';
	private int moveDown = 's';
	private int jump = 32;
	
	@Before
	public void setUp() {
		
	}
	
	@Test
	public void testControls() {
		assertEquals(Command.MOVERIGHT, Controls.getCommand(moveRight));
		assertEquals(Command.MOVELEFT, Controls.getCommand(moveLeft));
		assertEquals(Command.MOVEUP, Controls.getCommand(moveUp));
		assertEquals(Command.MOVEDOWN, Controls.getCommand(moveDown));
		assertEquals(Command.JUMP, Controls.getCommand(jump));
		assertEquals(null, Controls.getCommand(2));
	}
	
}
