// parent class
class Mammals {
    void mam() {
        System.out.println("Inside Mammals Class");
    }

    void breathe() {
        System.out.println("Mammals breathe air");
    }
}

// child class 1
class Lion extends Mammals {
    void roar() {
        System.out.println("Inside Lion class");
    }

    void hunt() {
        System.out.println("Lion hunts for food");
    }
}

// child class 2
class Human extends Mammals {
    void hum() {
        System.out.println("Inside Human class");
    }

    void think() {
        System.out.println("Human can think logically");
    }
}

class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();   // object of Lion
        lion.roar();
        lion.hunt();
        lion.mam();
        lion.breathe();

        System.out.println("----------------------------");

        Human human = new Human(); // object of Human
        human.hum();
        human.think();
        human.mam();
        human.breathe();
    }
}
