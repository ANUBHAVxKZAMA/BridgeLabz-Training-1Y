class Parent {
    int x = 27;
    Parent() {
        System.out.println("PARENT CONSTRUCTOR CALLED");
    }
    void display() {
        System.out.println("PARENT METHOD CALLED");
    }
}
class Child extends Parent {
    int x = 10;
    Child() {
        super();
        System.out.println("PARENT VARIABLE x = " + super.x);
        super.display(); 
        System.out.println("CHILD CONSTRUCTOR CALLED");
    }
    void display() {
        System.out.println("CHILD METHOD CALLED");
    }
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
