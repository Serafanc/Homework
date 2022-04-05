package online_tusur.unit_online_tusur;
import online_tusur.unit_online_tusur.Student;

import java.util.Arrays;


public class Main {

	//главный метод класса
		public static void main(String[] args) {
			// s1, s2, s3 - объекты класса Student
						Student s1 = new Student();
						s1.setFirstName("Ivan");
						s1.setLastName("SIDORov");
						s1.setAge(25);
									
						Student s2 = new Student("Ivan", "nIkulin", 10);
						
						Student s3 = new Student("kONStantin","petrov", 33);
						
						System.out.println(s1.getFullName() + ", " + s1.getAge());
						System.out.println(s2.getFullName() + ", " + s2.getAge());
						System.out.println(s3.getFullName() + ", " + s3.getAge());
						
						
						Student[] students = { s1,s2,s3};
						  Student[] students2 = {new Student("Alexandr", "Ivanov", 20), new Student("Vladimir", "Petrov", 18),
									new Student("Aleksey", "Alekseev", 35)};
						
						System.out.println("AVG= "+Student.avgAge(students2));
						System.out.println("MAX= "+Student.maxAge(students));
						System.out.println("MIN= "+Student.minAge(students));
			
			TestCase();
		}
		//Метод для проверки тест-кейсов
		
		public static void TestCase () {
		Student student1 = new Student("ivan", "radi", 17);
		Student student2 = new Student("ivan", "radio", 18);
		Student student3 = new Student("ivan", "radion", 32);
		Student student4 = new Student("Ivan", "Radiono", 50);
		Student student5 = new Student("Ivan", "Radionov", 51);
		
		Student[] array = new Student[] {student1,student2,student3,student4,student5};
		
		for(int i=0;i<5;i++) {
		System.out.println(array[i].getFullName()+" "+ array[i].getAge());
		}
			
		}

}
