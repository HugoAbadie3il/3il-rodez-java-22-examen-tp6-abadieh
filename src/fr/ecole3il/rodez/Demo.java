package fr.ecole3il.rodez;

import java.util.List;
import java.util.LinkedList;

/**
 * Class to show how handling tasks would work.
 */
public class Demo implements HandleTask{
	
	private List<Task> tasks;
	
	/**
	 * Constructor of Demo, create a list of tasks.
	 */
	public Demo() {
		tasks = new LinkedList<Task>();
	}

	/**
	 * Add task to the list of tasks
	 * @param tache the task to add
	 */
	@Override
	public void ajouterTache(Task tache) {
		tasks.add(tache);
		System.out.println("Tache ajoutee");
		
	}

	/**
	 * TODO
	 */
	@Override
	public void modifierTache(Task tache) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Delete a task from the list of tasks
	 * @param tache the task to remove
	 */
	@Override
	public void supprimerTache(Task tache) {
		if (tasks.contains(tache)) {
			tasks.remove(tache);
			System.out.println("Task removed successfully");
		}
		else {
			System.out.println("Task not in tasks");
		}
		
	}

	/**
	 * Getter of the list of tasks
	 * @return the list of tasks
	 */
	@Override
	public List<Task> getTaches() {
		return tasks;
	}
	
	public static void main() {
		System.out.println("Hello World!");
		System.out.println("Pas le temps d'ecrire le main.");
	}

}
