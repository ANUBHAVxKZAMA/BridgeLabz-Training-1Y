package com.gla.ArrayList;
import java.util.ArrayList;

class Employee{
    private int id;
    private String name;
    private String mail;
    public Employee(int id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
public class EmployeeManagement {
    public static void main(String[] args){
        Employee e1 = new Employee(1,"Ashu","ashutosh.chaubey@123");
        Employee e2 = new Employee(2,"Amit","amit.abc@123");
        Employee e3 = new Employee(3,"Ayush","ayush.xyz@123");
        ArrayList<Employee> al=new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        System.out.println(al);
        for(Employee e : al) {
            System.out.println(e);
        }
        Employee updatedEmp=new Employee(2,"Hello Yaawr", "hello.yaawr.abc");
        al.set(1,updatedEmp);
        for(Employee e : al) {
            System.out.println(e);
        }
    }
}
