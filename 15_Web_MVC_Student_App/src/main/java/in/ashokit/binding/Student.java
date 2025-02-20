package in.ashokit.binding;

import java.util.Arrays;

public class Student {
	private String name;
	private String email;
	private String gender;
	private String course;
	private String[]timings;
	public Student(String name, String email, String gender, String course, String[] timings) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.course = course;
		this.timings = timings;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String[] getTimings() {
		return timings;
	}
	public void setTimings(String[] timings) {
		this.timings = timings;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", gender=" + gender + ", course=" + course + ", timings="
				+ Arrays.toString(timings) + "]";
	}

}
