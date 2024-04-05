package fr.ecole3il.rodez;

import java.util.Date;
import java.util.Objects;

/**
 * Class for representing a Task
 */
public class Task {

	private int id;
	private String titre;
	private String description;
	private int priority;
	private Date dateEcheance;
	private String status;
	
	/**
	 * Constructor for a task
	 * @param status the status of the task
	 * @param id the id of the task
	 * @param titre the title of the task
	 * @param description the description of the task
	 * @param priority the priority of the task
	 * @param date the deadline for the task
	 */
	public Task(String status, int id, String titre, String description, int priority, Date dateEcheance)
	{
		this.status = status;
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.priority = priority;
		this.dateEcheance = dateEcheance;
	}

	/**
	 * Getter for id
	 * @return the id of the task
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter the id of the task
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter of the title of the task
	 * @return the title of the task
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * Setter for the title of the class
	 * @param titre the new title of the task
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * Getter of the description
	 * @return the description of the task
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter of the description of the task
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Getter of the priority of the task
	 * @return the priority of the task
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * Setter of the priority of the task
	 * @param priority the new priority
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * Getter of the deadline of the task
	 * @return the deadline of the task
	 */
	public Date getDateEcheance() {
		return dateEcheance;
	}

	/**
	 * Setter of the deadline of the task
	 * @param dateEcheance the deadline of the task
	 */
	public void setDateEcheance(Date dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	
	/**
	 * Getter of the status
	 * @return the status of the task
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Setter of the status of the task
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * HashCode method
	 * @return the hash code of the task
	 */
	@Override
	public int hashCode() {
		return Objects.hash(dateEcheance, description, id, priority, status, titre);
	}

	/**
	 * Equals method
	 * @return true if all attributes are the same value, false elsewhere
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(dateEcheance, other.dateEcheance) && Objects.equals(description, other.description)
				&& id == other.id && priority == other.priority && Objects.equals(status, other.status)
				&& Objects.equals(titre, other.titre);
	}
	
	
	
}
