package com.gla.interfaces.StaticMethodsInInterfaces;
interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length()>=8;
    }
}
public class PasswordStrengthValidator{
    public static void main(String[] args){
        String password = "abc12345";
        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}