package mini03.model;

import java.time.Year;

public class EducationQualification {
	private String universityName;
	private String degreeType;
	private String courseName;
	private Year edStartYear;
	private Year edEndYear;
	
	EducationQualification(String unviversityName, String degreeType, String courseName,
			Year edStartYear, Year edEndYear){
		this.setUniversityName(unviversityName);
		this.setDegreeType(degreeType);
		this.setCourseName(courseName);
		this.setEdStartYear(edStartYear);
		this.setEdEndYear(edEndYear);
	}
	
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getDegreeType() {
		return degreeType;
	}
	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Year getEdStartYear() {
		return edStartYear;
	}
	public void setEdStartYear(Year edStartYear) {
		this.edStartYear = edStartYear;
	}
	public Year getEdEndYear() {
		return edEndYear;
	}
	public void setEdEndYear(Year edEndYear) {
		this.edEndYear = edEndYear;
	}
	
}
