package ca.sheridancollege.beans;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@NamedQueries({
	
	//queries
	@NamedQuery(name="Student.editStudent", query = "from Student where id like :id" ),
	@NamedQuery(name="Student.byId", query="from Student where id = :id"),
	@NamedQuery(name="Student.al", query="from Student")
})


@Entity
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6894631393060843392L;
	
	@Id
	@GeneratedValue
	private int id;
	private String name;

	@Embedded
	private Music music;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", music=" + music + "]";
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
	}

	public Student(String name) {
		this.name = name;
	}

}
