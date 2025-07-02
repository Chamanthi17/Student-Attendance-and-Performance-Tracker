package StudentAttPerTacker;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StudentManager manager=new StudentManager();
		while(true) {
			System.out.println("\n-----Student Attendance & Performance Tracking ---");
			System.out.println("1. Add Student");
			System.out.println("2. View All Students");
			System.out.println("3. Mark Attendance");
			System.out.println("4. Update Student");
			System.out.println("5. Add Marks");
			System.out.println("6. Delete Student");
			System.out.println("7. Exit");
			System.out.println("Choose an option: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter ID: ");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name: ");
				String name=sc.nextLine();
				System.out.print("Enter Age: ");
				int age=sc.nextInt();
				Student s=manager.findStudentById(id);
				if(s!=null) {
					System.out.println("Student with id already exists");
					break;
				}
				manager.addStudent(new Student(id,name,age));
				break;
			case 2:
				manager.viewAllStudents();
				break;
			case 3:
				System.out.print("Enter ID to mark attendance: ");
				int at=sc.nextInt();
				manager.markAttendance(at);
				break;
			case 4:
				System.out.print("Enter ID to uptade: ");
				int uid=sc.nextInt();
				sc.nextLine();
				System.out.print("New Name: ");
				String newName= sc.nextLine();
				System.out.print("New Age: ");
				int newAge=sc.nextInt();
				manager.updateStudent(uid, newName, newAge);
				break;
			case 5:
				System.out.print("Enter ID to add mark: ");
                int mid = sc.nextInt();
                System.out.print("Enter mark: ");
                int mark = sc.nextInt();
                manager.addMark(mid, mark);
                break;
			case 6:
				System.out.print("Enter ID to delete: ");
                int did = sc.nextInt();
                manager.deleteStudent(did);
                break;
			case 7:
				System.out.println("Exiting...");
                sc.close();
                return;
            default:
            	System.out.println("Invalid Choice");
                	
			}
		}
	}

}
