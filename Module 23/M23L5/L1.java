// Parent Class
class Parent {
    int age, id;
    String name;

    void setName(String name) {
        this.name = name;
    }

    void setId(int id) {
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Child Class
class Child extends Parent {
    void setAge(int age) {
        this.age = age;
    }

    void displayAge() {
        System.out.println("Age of student is: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Child s = new Child(); // creating object of child class
        s.setName("Aashish");
        s.setId(101);
        s.setAge(14);

        s.displayInfo();
        s.displayAge();
    }
}
