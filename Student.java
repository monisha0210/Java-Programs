public class Student
{  
    int id,age;  
    String name;  
     
    //creating two arg constructor  
    public Student(int id,String name)
	{  
    this.id = id;  
    this.name = name;  
    }  
    //creating three arg constructor  
    public Student(int id,String name,int age)
	{  
    this.id = id;  
    this.name = name;  
    this.age=age;  
    }
	 public static void main(String[] args)
	 {
	 Student s1 = new Student(2021,"Moni");
	 Student s2 = new Student(2022,"Mohan",26);
	 System.out.println(s1.id+"" + s1.name+"");
	 System.out.println(s2.id+"" + s2.name+"" + s2.age+"");
	 }
	 }
   

	 
	 