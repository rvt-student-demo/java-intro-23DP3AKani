package lv.rvt;

public class Person {
    private String name;
    private int age;

    public Person(String initialName, int age) {
        this.age = age;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
}