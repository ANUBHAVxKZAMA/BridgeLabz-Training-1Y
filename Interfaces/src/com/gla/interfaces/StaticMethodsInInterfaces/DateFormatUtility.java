package com.gla.interfaces.StaticMethodsInInterfaces;
interface DateFormatterUtil {
    static String formatDate(String day, String month, String year) {
        return day + "-" + month + "-" + year;
    }
}
public class DateFormatUtility {
    public static void main(String[] args) {
        String formattedDate = DateFormatterUtil.formatDate("20", "02", "2026");
        System.out.println("Formatted Date: " + formattedDate);
    }
}