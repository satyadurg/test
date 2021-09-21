package connections;
import java.sql.*;
import java.util.*;

public class JdbcConnectionChecking {
	static String databasename="employeetable";
	public static void main(String[] args) throws NameContainOnlyAlphabest{
		// TODO Auto-generated method stub
		
		System.out.println("enter the employee details");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.nextLine();
		//System.out.println("enter the id");
		//int id =sc.nextInt();sc.nextLine();
		System.out.println("enter the Designation");
		String Designation=sc.nextLine();
		System.out.println("enter the Salary");
		int salary = sc.nextInt();
		sc.close();
	
			EmployeeDetailsSet es = new EmployeeDetailsSet(salary,name,Designation);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+databasename,"root","UDAYkumar@0734");
			Statement s = c.createStatement();
	String src = " INSERT INTO employeetable.employee (name, gender, designation, Salary, DateOfJoining)" +" VALUES ('"+es.getname()+"','M','"+es.getDesignation()+"','"+es.getsalary()+"','1998-03-15')";
		 s.executeUpdate(src);
		System.out.println("record inserted ");
}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Updated database Records");
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+databasename,"root","UDAYkumar@0734");
			Statement ss = c.createStatement();
		ResultSet rs = ss.executeQuery("SELECT * FROM employeetable.employee;");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"---- "+rs.getString(2)+"---- "+rs.getString(3)+"---- "+rs.getString(4)+"---- "+rs.getInt(5)+"---- "+rs.getDate(6));
		}

}
catch(Exception e) {
System.out.println(e.getMessage());
}


			
		}

}
	


