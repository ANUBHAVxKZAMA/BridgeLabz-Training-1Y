public class StringExample{
	public static void main(String args[]){
		String str="Hello";
		System.out.println("Length= " +str.length());
		System.out.println("In upper case= " +str.toUpperCase());
		System.out.println("In lower case= " +str.toLowerCase());
		System.out.println("Char at index 2= " +str.charAt(2));
		System.out.println("Sub string from index 2= " +str.substring(2));
		System.out.println("Sub string till index 2= " +str.substring(0,3));
		System.out.println("Contains Hell? " +str.contains("Hell"));
		System.out.println("Equals 'hello'? " +str.equals("Hello"));
		System.out.println("Equals 'HeLlO'? " +str.equalsIgnoreCase("HeLlO"));
	}
}
