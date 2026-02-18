public class ConstructorChainingExample{
	int id;
	String  name;
	
	public ConstructorChainingExample(){
		this(27, "Abc");
		System.out.println("Default Constructor Called");
	}
	public ConstructorChainingExample(int id, String name){
		this.id=id;
		this.name=name;
		System.out.println("Parameterized Constructor Called");
	}
	void display(){
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
	}
	public static void main(String args []){
		ConstructorChainingExample sc=new ConstructorChainingExample();
		sc.display();
	}
}
		