class Employee
{
	private int id;
	private double salary;
	
	public int getId()
	{
		return id;
	}//end
	
	public double getSalary()
	{
		return salary;
	}//end 
	
	public void setId(int idNum)
	{
		id = idNum;
	}//end 
	
	public void setSalary(double sal)
	{
		salary = sal;
	}//end
}//end of class

class EmployeeWithTerritory extends Employee
{
	private int territory;
	
	public int getTerritory()
	{
		return territory;
	}//end 
	public void setTerritory(int terr)
	{
		territory = terr;
	}//end
}//end of class