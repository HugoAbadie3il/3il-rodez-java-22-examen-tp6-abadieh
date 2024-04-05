package fr.ecole3il.rodez;

import java.util.Objects;

public class Task {

	private int id;
	private String titre;
	private String description;
	private int priority;
	private String dateEcheance;
	private String status;
	
	public Task(String status, int id, String titre, String description, int priority, String date)
	{
		this.status = status;
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.priority = priority;
		this.dateEcheance = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getDateEcheance() {
		return dateEcheance;
	}

	public void setDateEcheance(String dateEcheance) {
		this.dateEcheance = dateEcheance;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateEcheance, description, id, priority, status, titre);
	}

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
