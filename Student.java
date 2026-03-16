class Student{
	String name;
	int age;
	public void getDetails(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Student(Student s2){
	this.name=s2.name;
	this.age=s2.age;
}
    Student(){
		
	}
}

