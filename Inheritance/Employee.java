class Employee{
	String name;
	int id;
	double basicSalary;
	Employee(String name,int id,double basicSalary){
		this.name=name;
		this.id=id;
		this.basicSalary=basicSalary;
	}
	void display(){
		System.out.println("Name: "+this.name);
		System.out.println("ID: "+this.id);
		System.out.println("Basic Salary: "+basicSalary);
	}
	double calculateSalry(){
		return basicSalary;
	}
}
