class Student {
    int id;
    String name;
    float stipend;
    String course;

    Student() {}

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, float stipend) {
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }

    Student(int id, String name, float stipend, String course) {
        this.id = id;
        this.name = name;
        this.stipend = stipend;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("ID: " + id + " | Name: " + name + " | Stipend: " + stipend + " | Course: " + course);
    }
} // Student

class Main {
    public static void main(String[] args) {
        Student st1 = new Student(); // default constructor
        Student st2 = new Student(45, "Aashish"); // 2 parameters
        Student st3 = new Student(234, "Cody", 10000); // 3 parameters
        Student st4 = new Student(567, "Maya", 15000, "Computer Science"); // 4 parameters

        st1.displayDetails();
        st2.displayDetails();
        st3.displayDetails();
        st4.displayDetails();
    }
}
