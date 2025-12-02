// parent class
class Animal {
    void eat() {
        System.out.println("Eating... Animal class... eat method");
    }

    void sleep() {
        System.out.println("Sleeping... Animal class... sleep method");
    }
}

// child class
class Lion extends Animal {
    void roar() {
        System.out.println("Roaring... Lion class... roar method");
    }

    void hunt() {
        System.out.println("Hunting... Lion class... hunt method");
    }
}

// child of child
class BabyLion extends Lion {
    void weep() {
        System.out.println("Weeping... BabyLion class... weep method");
    }

    void play() {
        System.out.println("Playing... BabyLion class... play method");
    }
}

class Main {
    public static void main(String[] args) {
        BabyLion obj = new BabyLion(); // object of child of child class
        obj.weep();
        obj.play();
        obj.roar();
        obj.hunt();
        obj.eat();
        obj.sleep();
    }
}
