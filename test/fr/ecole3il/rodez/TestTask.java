package fr.ecole3il.rodez;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

/**
 * Class for testing the task class
 */
class TestTask {
	// The default task
	private Task task;
	
	/**
	 * Set up the default task
	 */
	@BeforeEach
	void setUp() {
		@SuppressWarnings("deprecation")
		Date echeance = new Date(2024, 5, 4);
		task = new Task("TODO", 0, "test", "Tester les classes", 3, echeance);
	}

	/**
	 * Test if a basic task is well created
	 */
	@SuppressWarnings("deprecation")
	@Test
	void BasicCase() {
		Assertions.assertEquals("TODO", task.getStatus());
		Assertions.assertEquals(0, task.getId());
		Assertions.assertEquals(3, task.getPriority());
		Assertions.assertEquals("test", task.getTitre());
		Assertions.assertEquals("Tester les classes", task.getDescription());
		Assertions.assertEquals(new Date(2024, 5, 4), task.getDateEcheance());
		
	}
	
	/**
	 * Checks the method equals return true for same task
	 */
	@Test
	void SameTask() {
		@SuppressWarnings("deprecation")
		Date echeance = new Date(2024, 5, 4);
		Task sameTask = new Task("TODO", 0, "test", "Tester les classes", 3, echeance);
		Assertions.assertTrue(task.equals(sameTask));
	}
	
	/**
	 * Checks the method equals return false for same task but different id
	 */
	@Test
	void SameTaskDifferentId() {
		@SuppressWarnings("deprecation")
		Date echeance = new Date(2024, 5, 4);
		Task sameTask = new Task("TODO", 1, "test", "Tester les classes", 3, echeance);
		Assertions.assertTrue(task.equals(sameTask));
	}
	
	/**
	 * Checks the method equals return false for different task but same id
	 */
	@Test
	void DifferentTaskSameId() {
		@SuppressWarnings("deprecation")
		Date echeance = new Date(2024, 5, 5);
		Task sameTask = new Task("Doing", 0, "dormir", "Recharger les batteries", 1, echeance);
		Assertions.assertTrue(task.equals(sameTask));
	}

}
