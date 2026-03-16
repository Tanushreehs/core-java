class StudentRunner{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.name="thushar";
		s1.age=22;
		
		Student s2 = new Student(s1);
		s2.getDetails();
	}
}