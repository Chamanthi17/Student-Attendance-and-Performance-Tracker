package StudentAttPerTacker;
import java.util.*;
public class Student {
	private int studentid;
	private String studentname;
	private int age;
	private int attendanceCount;
	private List<Integer> markList;
	
	public Student(int id, String name, int age){
		this.studentid=id;
		this.studentname=name;
		this.age=age;
		this.attendanceCount=0;
		this.markList=new ArrayList<>();
	}
	public int getId() {
		return this.studentid;
	}
	public String getName() {
		return this.studentname;
	}
	public int getAttendance() {
		return this.attendanceCount;
	}
	public int getAge() {
		return this.age;
	}
	public List getMarkList() {
		return this.markList;
	}
	public void setName(String name) {
		this.studentname=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void markAttendance() {
		this.attendanceCount++;
	}
	public void addMarks(int mark) {
		this.markList.add(mark);
	}
	public double getAverage() {
		if(markList.isEmpty()) return 0.0;
		int sum=0;
		for(int i:markList) {
			sum+=i;
		}
		return (double)sum/markList.size();
	}
	@Override
	public String toString() {
		return "ID: "+ this.studentid + "\nStudent Name: "+this.studentname+"\nAge: "+this.age+"\nAttendance Count: "+this.attendanceCount+"\nMarks: "+this.markList.toString()+"\nAverage: "+this.getAverage();
	}

}
