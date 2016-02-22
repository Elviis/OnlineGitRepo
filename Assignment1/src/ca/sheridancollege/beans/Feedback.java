package ca.sheridancollege.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.SelectBeforeUpdate;


@NamedQueries({
	@NamedQuery(name="Feedback.month", query = "from Feedback where date like :date and department like :department")	
})

@SelectBeforeUpdate
@DynamicUpdate
@Entity
public class Feedback implements Serializable{

	@Id
	private String date;
	private String department;
	private String feedback;
	
	//get and set
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	//constructacons TERRORIZE!
	public Feedback() {
	}
	
	public Feedback(String department, String feedback, String date) {
		this.department = department;
		this.feedback = feedback;
		this.date = date;
	}
	
}
