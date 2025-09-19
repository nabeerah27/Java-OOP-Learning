package _05_Inheritance;

class Parent {
    int value = 10;
}

class Child extends Parent {
    int value = 20;
}

public class _10_Field_Hiding {
    public static void main(String[] args) {

        Parent parent = new Parent(); // Parent reference, parent object
        Child child = new Child();    // Child reference, child object
        Parent obj = new Child();     // Parent reference, Child object

        System.out.println("Parent reference, Parent object: " + parent.value); // 10
        System.out.println("Child reference, Child object: " + child.value);    // 20
        System.out.println("Parent reference, Child object: " + obj.value);     // 10

    }
}
