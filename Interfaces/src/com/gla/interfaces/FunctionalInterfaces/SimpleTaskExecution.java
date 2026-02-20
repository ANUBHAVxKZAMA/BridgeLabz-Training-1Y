package com.gla.interfaces.FunctionalInterfaces;
@FunctionalInterface
interface Task {
    void perform();
}
public class SimpleTaskExecution {
    public static void main(String[] args) {
        Task task = () -> System.out.println("Task Executed Successfully.");
        task.perform();
    }
}