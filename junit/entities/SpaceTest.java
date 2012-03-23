package entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SpaceTest {
	private Space space1, space2, wall;
	private Character p;
	private int phealth = 30;
	private int pdamage = 2;
	private int pdefense = 1;
	private int pspeed = 1;
	private int pheight = 1;
	private int pwidth = 1;
	private int pjumpHeight = 5;
	private Location playerLocation = new Location(0, 0);

	@Before
	public void setUp() {
		space1 = new Space(new Location(1, 1), 4, 4);
		space2 = new Space(new Location(3, 3), 4, 4);
		wall = new Space(new Location(20, 20), 20, 20);
		p = new Player(phealth, pdamage, pdefense, pspeed, pheight, pwidth,
				pjumpHeight);
		p.setCharacterLocation(playerLocation);
	}

	// same space test
	@Test
	public void sameSpaceTest() throws Exception {
		assertTrue(space1.sameSpace(new Space(new Location(1, 1), 4, 4)));
		assertTrue(space2.sameSpace(new Space(new Location(3, 3), 4, 4)));
	}

	// overlap test
	@Test
	public void overlapTest() throws Exception {
		assertTrue(Space.checkOverlap(space1, space2));
		assertFalse(Space.checkOverlap(space1, wall));
	}

	// collision test 1 direction
	@Test
	public void testCollision1Direction() throws Exception {
		int steps = 100;

		// collision right
		p.setCharacterLocation(new Location(0, 30));
		p.setxDirection(1);
		p.setyDirection(0);
		for (int i = 0; i < steps; i++) {
			Space.checkCollision(p, wall);
			p.move();
		}
		assertTrue(Location.sameLocation(p.getCharacterLocation(),
				new Location(18, 30)));

		// collision left
		p.setCharacterLocation(new Location(50, 30));
		p.setxDirection(-1);
		p.setyDirection(0);
		for (int i = 0; i < steps; i++) {
			Space.checkCollision(p, wall);
			p.move();
		}
		assertTrue(Location.sameLocation(p.getCharacterLocation(),
				new Location(41, 30)));

		// collision up
		p.setCharacterLocation(new Location(30, 0));
		p.setxDirection(0);
		p.setyDirection(1);
		for (int i = 0; i < steps; i++) {
			Space.checkCollision(p, wall);
			p.move();
		}
		assertTrue(Location.sameLocation(p.getCharacterLocation(),
				new Location(30, 18)));

		// collision down
		p.setCharacterLocation(new Location(30, 50));
		p.setxDirection(0);
		p.setyDirection(-1);
		for (int i = 0; i < steps; i++) {
			Space.checkCollision(p, wall);
			p.move();
		}
		assertTrue(Location.sameLocation(p.getCharacterLocation(),
				new Location(30, 41)));
	}
}
