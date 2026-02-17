public class ConstructorExample2{
	int id;
	String  name;
	int age;
	public ConstructorExample2(){
		System.out.println("Default Constructor");
	}
	public ConstructorExample2(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	void display(){
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	public static void main(String args []){
		ConstructorExample2 sc=new ConstructorExample2();
		ConstructorExample2 cd=new ConstructorExample2(27, "Abc", 19);
		cd.display();
	}
}
		