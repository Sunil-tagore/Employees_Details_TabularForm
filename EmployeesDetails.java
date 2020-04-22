 class EmployeesDetails
{
  String Name;
  int Yoj;
  String Address;
 EmployeesDetails(String Name,int Yoj,String Address)
{
  this.Name=Name;
 this.Yoj=Yoj;
  this.Address=Address;
 }
public void display()
{
if((this.Name).contains("WallsStreet"))
{
 if((this.Name).contains("RobertWallsStreet"))
  {
 System.out.print(Name.substring(0,6)+"\n"+Name.substring(6,17)+" "); 
 System.out.print(this.Yoj+"\t");
 System.out.print(this.Address);
 System.out.println();
    }
 else if((this.Name).contains("SamWallsStreet"))
  {
 System.out.print(Name.substring(0,3)+"\n"+Name.substring(3,14)+" "); 
 System.out.print(this.Yoj+"\t");
 System.out.print(this.Address);
 System.out.println();
    }
 else
{
 System.out.print(Name.substring(0,4)+"\n"+Name.substring(4,15)+" "); 
 System.out.print(this.Yoj+"\t");
 System.out.print(this.Address);
 System.out.println();
    }
}
}
public static void main(String[] args)
  {
System.out.print("Name"+"\t"+"YearOfJoining"+"\t"+"Address"+"\n");
   EmployeesDetails e1=new EmployeesDetails("RobertWallsStreet",1994,"64C-");
     EmployeesDetails e2=new EmployeesDetails("SamWallsStreet",2000,"68D-");
      EmployeesDetails e3=new EmployeesDetails("JohnWallsStreet",1999,"26B-");
      e1.display();
       e2.display();
       e3.display();
}
  }  
