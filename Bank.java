public class Bank
{
int accNo; 

public Bank(int accNo)
{
  this.accNo = accNo;
}
public static void main(String[] args)
{
Bank customer = new Bank(123); 
customer.deposit();
customer.withdraw(); 
customer.onlineshopping();
}

public void deposit()
{
System.out.println(accNo); 
}

public void withdraw()
{
System.out.println(accNo); 
}

public void onlineshopping()
{
System.out.println(accNo); 
}
  
}
