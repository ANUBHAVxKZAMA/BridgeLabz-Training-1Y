public class StringBufferExample{
	public static void main(String args[]){
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" World");
		System.out.println("Append= " +sb);
		sb.insert(5,",");
		System.out.println("Insert= " +sb);
		sb.replace(6,12," Java");
		System.out.println("Replace= " +sb);
		sb.delete(5,6);
		System.out.println("Delete= " +sb);
		sb.reverse();
		System.out.println("Reverse= " +sb);
		System.out.println("Length= " +sb.length());
		System.out.println("CharAt(2)= "+sb.charAt(2));
		sb.setCharAt(2,'X');
		System.out.println("setCharAt 2= "+sb);
		System.out.println("Substring= " +sb.substring(1,4));
	}
}
