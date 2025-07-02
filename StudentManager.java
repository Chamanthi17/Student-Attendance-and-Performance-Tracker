package StudentAttPerTacker;
import java.util.*;
public class StudentManager {
	private List<Student> studentList=new ArrayList<>();
	public void addStudent(Student student) {
		studentList.add(student);
		System.out.println("Student added.");
	}
	public void viewAllStudents() {
		if(studentList.isEmpty()) {
			System.out.println("No students found.");
			return;
		}
		for(Student s:studentList) {
			System.out.println(s);
		}
	}
	public Student findStudentById(int id) {
		for(Student s:studentList){
			if(s.getId()==id) return s;
		}
		return null;
	}
	public void updateStudent(int id,String name,int age) {
		Student s=findStudentById(id);
		if(s!=null) {
			s.setName(name);
			s.setAge(age);
			System.out.println("Student record updated");
		}else {
			System.out.println("Student not found");
		}
	}
	public void deleteStudent(int id) {
		Student s=findStudentById(id);
		if(s!=null) {
			studentList.remove(s);
			System.out.println("Student record deleted");
		} else {
			System.out.println("Student record not found");
		}
	}
	public void markAttendance(int id) {
		Student s=findStudentById(id);
		if(s!=null) {
			s.markAttendance();
			System.out.println("Attendance marked");
		}else { 
			System.out.println("Student not found");
		}
	}
	public void addMark(int id,int mark) {
		Student s=findStudentById(id);
		if(s!=null) {
			s.addMarks(mark);
			System.out.println("Marks added");
		}else {
			System.out.println("Student not found");
		}
	}
}
