package mini03.model;

import java.time.Year;

public class JobExperience {
	private String companyName;
	private String jobTitle;
	private Year jobStartYear;
	private Year jobEndYear;
	
	JobExperience (String companyName, String jobTitle, Year jobStartYear, Year jobEndYear){
		this.setCompanyName(companyName);
		this.setJobTitle(jobTitle);
		this.setJobStartYear(jobStartYear);
		this.setJobEndYear(jobEndYear);
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Year getJobStartYear() {
		return jobStartYear;
	}
	public void setJobStartYear(Year jobStartYear) {
		this.jobStartYear = jobStartYear;
	}
	public Year getJobEndYear() {
		return jobEndYear;
	}
	public void setJobEndYear(Year jobEndYear) {
		this.jobEndYear = jobEndYear;
	}
	
	
}
