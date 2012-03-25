package entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tloc.entities.Weapon;

public class WeaponTest {
	
	private Weapon w;
	private int damage = 10, range = 3;
	
	@Before
	public void setUp() {
		w = new Weapon();
		w.setWeaponDamage(damage);
		w.setRange(range);
	}
	
	@Test
	public void testSetters() {
		assertEquals(damage, w.getWeaponDamage());
		assertEquals(range, w.getRange());
	}

}
