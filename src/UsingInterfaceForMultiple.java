interface  animal{
    void cow();
}

interface animal2{
    void Dog();
}

class newclass implements animal,animal2{

    @Override
    public void cow() {
        System.out.println("Mooo");
    }

    @Override
    public void Dog() {
        System.out.println("Bowwboww");
    }
}

class Person extends newclass{
    public Person(){
        System.out.println("Hi my name is Saurya raj pandey");
    }
}

class Elonmusk extends Person {
    public Elonmusk() {
        System.out.println("I'm Not a human being I'm beyond the humanbeing");
    }
}

class AnimalDetails {
    public static void main(String[] args) {
        Person a = new Person()   ;
        a.cow();
        a.Dog();

    }
}
