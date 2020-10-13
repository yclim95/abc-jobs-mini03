package mini03.model;

public class User {
	private String firstName;
	private String lastName;
	private String contactNo;
	private String currentCompany;
	private String currentJob;
	private String skills;
	private String biography;
	private String city;
	private String country;
	
	public User(){
		
	}
	
	User(String firstName, String lastName){
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
	
	User(String firstName, String lastName, String contactNo, String currentCompany,
			String currentJob, String skills, String biography, String city, String country){
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setContactNo(contactNo);
		this.setCurrentCompany(currentCompany);
		this.setCurrentJob(currentJob);
		this.setSkills(skills);
		this.setBiography(biography);
		this.setCity(city);
		this.setCountry(country);
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
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getCurrentCompany() {
		return currentCompany;
	}
	public void setCurrentCompany(String currentCompany) {
		this.currentCompany = currentCompany;
	}
	public String getCurrentJob() {
		return currentJob;
	}
	public void setCurrentJob(String currentJob) {
		this.currentJob = currentJob;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
