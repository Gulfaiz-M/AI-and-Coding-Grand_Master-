// Superclass
class Superclass {
    int number = 56;
}

// Child class or subclass
class Subclass extends Superclass {
    int number = 96; // shadows the superclass variable

    void printNumber() {
        System.out.println("Subclass number: " + number);
        System.out.println("Superclass number: " + super.number);
    }
}

class Main {
    public static void main(String[] args) {
        Subclass sub = new Subclass();
        sub.printNumber();
    }
}
