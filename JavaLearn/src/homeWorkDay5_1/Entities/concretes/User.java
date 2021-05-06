package homeWorkDay5_1.Entities.concretes;

import nLayeredDemo.entities.abstracts.IEntity;

public class User implements IEntity{
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String mail;
	
	public User() {
	}

	public User(int id, String firstName, String lastName, String password ,String mail) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.mail = mail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mail=" + mail + "]";
	}
	
	
	
	
	
	

}
