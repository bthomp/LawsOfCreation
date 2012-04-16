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
	public void testGetWeaponDamage() {
		assertEquals(damage, w.getWeaponDamage());
	}
	
	@Test
	public void testGetWeaponRange() {
		assertEquals(range, w.getRange());
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
	
	@Test
	public void testSetters() {
		assertEquals(damage, w.getWeaponDamage());
		assertEquals(range, w.getRange());
	}

}
