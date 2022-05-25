
public class StudentRecord {
	
	private String name;
	private String section;
	private int id;
	
	public void setStudentName(String studentName) {
		name = studentName;
	}
	
	public void setStudentSection(String studentSection) {
		section = studentSection;
	}
	
	public void setStudentId(int studentId) {
		id = studentId;
	}
	
	public String getStudentName() {

		return name;
	}
	
	public String getStudentSection() {
		return section;
	}
	
	public int getStudentId() {
		return id;
	}
}
