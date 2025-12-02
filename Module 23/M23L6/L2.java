class Parent {
    public void sayHello() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    @Override
    public void sayHello() {
        System.out.println("Hello from Child");
    }
}

class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent(); // calls Parent's sayHello
        Parent p2 = new Child();  // calls Child's sayHello due to runtime polymorphism

        System.out.println("Calling Parent object:");
        p1.sayHello();

        System.out.println("Calling Child object via Parent reference:");
        p2.sayHello();
    }
}
