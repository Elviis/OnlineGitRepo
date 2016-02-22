package ca.sheridancollege.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.SelectBeforeUpdate;

@NamedQueries({
	
	//query for total polled
	@NamedQuery(name="Users.totalUsers", query = "select email from Users" ),
	//queries for song votes to be used per artist
	@NamedQuery(name="Users.votesSong1", query = "select song1 from Users where song1 like :song1" ),
	@NamedQuery(name="Users.votesSong2", query = "select song2 from Users where song2 like :song2" ),
	@NamedQuery(name="Users.votesSong3", query = "select song3 from Users where song3 like :song3" )

})


@SelectBeforeUpdate
@DynamicUpdate
@Entity
public class Users implements Serializable {

	
//properties? is that what id call these? Im terrible at terminology
@Id
private String email;
private String song1;
private String song2;
private String song3;

//get and set things
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSong1() {
	return song1;
}
public void setSong1(String song1) {
	this.song1 = song1;
}
public String getSong2() {
	return song2;
}
public void setSong2(String song2) {
	this.song2 = song2;
}
public String getSong3() {
	return song3;
}
public void setSong3(String song3) {
	this.song3 = song3;
}


//the constructacons again... now i know how the dinobots would have felt if they werent cartoons
public Users() {
}

public Users(String email, String song1, String song2, String song3) {
	this.email = email;
	this.song1 = song1;
	this.song2 = song2;
	this.song3 = song3;
}
	

	
}
