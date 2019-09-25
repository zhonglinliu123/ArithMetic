package test;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println(manager.getEditDistance("hello" , "hellottt"));
    }
}
