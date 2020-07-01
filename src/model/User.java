package model;

import java.time.LocalDate;

//Type your code here
public class User{
	private String name;
	private String email;
	private LocalDate dob;
	private String gender;
	
	public String getName() {
	      return name;
	   }
    public void setName(String name) {
	      this.name = name;
	   }
	   
    public String getEmail() {
		      return email;
		   }
	public void setEmail(String email) {
		      this.email = email;
		   }
    public LocalDate getDOB() {
			      return dob;
			   }
	public void setDOB(LocalDate dob) {
			      this.dob = dob;
			   }
	public String getGender() {
				      return gender;
				   }
	public void setGender(String gender) {
				      this.gender = gender;
				   }
	public User(String name, String email, LocalDate dob, String gender) {
		this.name = name;
		 this.email = email;
		 this.dob = dob;
		 this.gender = gender;
	}
}