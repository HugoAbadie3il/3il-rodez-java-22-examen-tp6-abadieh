package fr.ecole3il.rodez;

import java.util.*;

/**
 * Interface for the logic of handling tasks
 */
public interface HandleTask {

	// Method to add task.
	public void ajouterTache(Task tache);
	
	// Method to modify task
	public void modifierTache(Task tache);
	
	// Method to delete task
	public void supprimerTache(Task tache);
	
	// Method to get a list of tasks
	public List<Task> getTaches();
}
