class Parent {
    protected void protect() {
        System.out.println("I'm inside protected method of Parent");
    }
}

class Child extends Parent {
    private void privateMethod() {
        System.out.println("I'm inside private method of Child");
    }

    void callPrivateMethod() {
        privateMethod();
    }
}

class Main {
    public static void main(String[] args) {
        Child kid = new Child();
        kid.protect();
        kid.callPrivateMethod();
        System.out.println("Hello world!");
    }
}
