package entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeaponTest {
	
	private Weapon w;
	
	@Before
	public void setUp() {
		w = new Weapon();
		w.setWeaponDamage(5);
		w.setRange(3);
		
	}
	
	@Test
	public void testGetWeaponDamage() {
		assertEquals(5, w.getWeaponDamage());
	}
	
	@Test
	public void testGetWeaponRange() {
		assertEquals(3, w.getRange());
	}
	
	@Test
	public void testSetWeaponDamage() {
		w.setWeaponDamage(7);
		assertEquals(7, w.getWeaponDamage());
	}
	
	@Test
	public void testSetWeaponRange() {
		w.setRange(4);
		assertEquals(4, w.getRange());
	}

}
