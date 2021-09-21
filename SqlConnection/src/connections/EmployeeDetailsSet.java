package connections;


public class EmployeeDetailsSet {
	String name;
	int id;
	int salary;
	String Designation;
	public EmployeeDetailsSet(int salary,String name,String Designation) throws NameContainOnlyAlphabest
	{
		this.salary=salary;
		this.Designation=Designation;
			this.name=name;
		
	}
	public String getname()
	{
		return name;
	}
	public int getsalary()
	{
		return salary;
	}
	//public void Setage(int id) throws  IdException
	//{
		//if(id<1000)
		//{
			//System.out.println("Id is verified");
			//this.id=id;
		//}
		//else
		//{
			//throw new IdException("Enther the Id in the specified limits");
		//}
		
//	}
	public String getDesignation()
	{
		return Designation;
	}
//public void PrintDetails()
//{
	//System.out.println("Name of the Employee is --"+name+"--Id of the Employee is--"+id+"--Desiganation of the Employee is--"+Designation+"--Salary of the Employee is--"+salary );
//}
//}

}