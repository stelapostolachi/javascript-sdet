
public class Student {
	public String name;
	public int age;
	public String gender;
	public int year;
	public String cours;
	public static String university="Cybertek";//static belongs to class,watever object we create from this class it will be automat in to the object.



public Student(String name, int age, String gender, int year, String cours) {
	
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.year = year;
	this.cours = cours;

 }
public void attendLecture() {
	System.out.println(name + " has been attended lecture."+university);
}
public void submitAssignment() {
	System.out.println(name+ " succesfuly submit assignments."+university);
}
public void attendLab() {
	System.out.println(name+" succesfully attend the Lab."+university);
}
}