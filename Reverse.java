class Reverse{
	static void reverse(String word){
		String reversed="";
		for(int i= word.length()-1;i>=0;i--){
			reversed=reversed+word.charAt(i);
		}
		System.out.println("Reversed string is:"+reversed);
		}
}