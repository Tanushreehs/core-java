class Manager extends Employee{
	double bonus;
	Manager(String name,int id,double basicSalary,double bonus){
		super(name,id,basicSalary);
		this.bonus=bonus;
	}
	 double calculateSalary(){
		 return basicSalary+bonus;
	 }
	 void show(){
		 double total=calculateSalary();
		 System.out.println("Total salary: "+total);
	 }
}