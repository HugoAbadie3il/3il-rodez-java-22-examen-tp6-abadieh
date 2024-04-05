package fr.ecole3il.rodez;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.*;

/**
 * Class for testing demo
 */
class TestDemo {

	Demo demo;
	Task defaultTask;
	
	/**
	 * Set up method for testing demo, adding default task to demo
	 */
	@BeforeEach
	void setUp() {
		demo = new Demo();
		@SuppressWarnings("deprecation")
		Date echeance = new Date(2024, 5, 4);
		defaultTask = new Task("TODO", 0, "test", "Tester les classes", 3, echeance);
		demo.ajouterTache(defaultTask);
	}
	
	/**
	 * Test add task
	 */
	@Test
	void testAddTask() {
		Assertions.assertTrue(demo.getTaches().contains(defaultTask));
	}
	
	/**
	 * Test remove task
	 */
	@Test
	void testRemoveTask() {
		demo.supprimerTache(defaultTask);
		Assertions.assertTrue(!demo.getTaches().contains(defaultTask));
	}

}
