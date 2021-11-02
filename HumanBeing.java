public class HumanBeing
{
 static int salary = 25000;
    int empId; //non static ----> 0
 public static void main (String[] args)
 {
    HumanBeing hb1 = new HumanBeing();//local objects
     HumanBeing hb2 = new HumanBeing();
     hb1.empId = 123;
    hb1.purchase();
     //System.out.println("Amount for purchasing "+ amount);
     //System.out.println(salary);
     //System.out.println(hb1.empId);
     
     //System.out.println(hb1.empId);
     //System.out.println(hb2.empId);
     hb2.empId = 777;
    hb2.purchase();
     String name = hb2.tellMeYourName();//datatype container
     System.out.println(name);
     int rollno = hb2.tellMeYourRollNo();
     System.out.println(rollno);
 }
    public String tellMeYourName()
    {
        return "Monisha";
        System.out.println();
    }
    public int tellMeYourRollNo()
    {
        return 2019242013;
    }
    public void purchase()
    {
        System.out.println(this.empId);
        //System.out.println(this.empId);
        int amount = 300;//local variable
        //System.out.println("Amount for purchasing"+ amount);
        //System.out.println(salary);
    }
}
