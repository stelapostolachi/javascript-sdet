
public class Main2 {

	public static void main(String[] args) {
		
		Student student1=new Student("Stela",20,"Fem",1888,"JavaScript");
		student1.attendLecture();
		student1.submitAssignment();
		student1.attendLab();
		System.out.println(student1.name + ":" + student1.age + ":" + student1.gender + ":" + student1.year+"|"+student1.cours);
        
		
		System.out.println("-----------------------------------");
		
		
		Student student2 = new Student("Smith",18,"M",2016,"Java");
		student2.attendLecture();
		student2.submitAssignment();
		student2.attendLab();
		System.out.println(student2.name + ":" + student2.age + ":" + student2.gender + ":" + student2.year+"|"+student2.cours+"|"+ student2.university);
		
		System.out.println("-------------------");
		
		Student student3 = new Student ("Mike",22,"M",1998,"Selenium");
		
		student3.attendLecture();
		student3.submitAssignment();
		student3.attendLab();
		System.out.println(student3.name + ":" + student3.age + ":" + student3.gender + ":" + student3.year+"|"+student3.cours);
		
		
		

	}

}
