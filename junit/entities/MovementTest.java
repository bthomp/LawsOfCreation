package entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tloc.entities.Character;
import tloc.entities.CharacterSpace;
import tloc.entities.Enemy;
import tloc.entities.Location;
import tloc.entities.Structure;

public class MovementTest {
	
	private Character e, p;
	private int ehealth = 30;
	private int edamage = 2;
	private int edefense = 1;
	private int espeed = 2;
	private int eheight = 2;
	private int ewidth = 2;
	private int ejumpHeight = 5;
	private Location enemyLocation = new Location(1, 1);
	private CharacterSpace espace = new CharacterSpace(new Location(1, 1), 2, 2);
	
	private int phealth = 30;
	private int pdamage = 2;
	private int pdefense = 1;
	private int pspeed = 2;
	private int pheight = 2;
	private int pwidth = 2;
	private int pjumpHeight = 5;
	private Location playerLocation = new Location(10, 10);
	
	private Location wallLocation = new Location(20, 20);
	private int wallHeight = 20;
	private int wallWidth = 20;
	private Structure wall;
	
	Location rightOrLeft = new Location(1, 0);
	Location upOrDown = new Location(0, 1);
	Location rightLeftUpDown = new Location(1, 1);
	
	@Before
	public void setUp() {
		e = new Enemy(ehealth, edamage, edefense, espeed, eheight, ewidth, ejumpHeight);
		e.setCharacterLocation(enemyLocation);
		p = new Enemy(phealth, pdamage, pdefense, pspeed, pheight, pwidth, pjumpHeight);
	}

	// movement test
	@Test
	public void testMove() throws Exception {
		e.setCharacterLocation(enemyLocation);
		e.setSpeed(3);
		e.setxDirection(1);
		e.setyDirection(1);
		e.move();
		
		assertTrue(e.isMoving());
		assertTrue(Location.sameLocation(new Location(4, 4),
				e.getCharacterLocation()));
		assertTrue(e.getSpaceTaken().sameSpace(
				new CharacterSpace(new Location(4, 4), 2, 2)));
	}

	// jump test
	@Test
	public void testJump() throws Exception {
		// standing still
		e.jump();
		assertTrue(e.getSpaceTaken().sameSpace(espace));
		assertFalse(e.isMoving());

		// moving right
		e.setxDirection(1);
		e.jump();
		assertTrue(e.getSpaceTaken().sameSpace(
				new CharacterSpace(new Location(21, 1), 2, 2)));
		assertTrue(e.isMoving());

		// moving left
		e.setCharacterLocation(new Location(30, 3));
		e.setxDirection(-1);
		e.jump();
		assertTrue(e.getSpaceTaken().sameSpace(
				new CharacterSpace(new Location(10, 3), 2, 2)));
		assertTrue(e.isMoving());
	}
}
