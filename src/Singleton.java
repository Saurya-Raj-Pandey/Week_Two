class Singleton {
    private static Singleton a;
// the private singleton prevents the creation of the object of the class
    private Singleton() {
    }

    public static Singleton getInstance() {

        // create object if it's not already created
        if(a == null) {
            a = new Singleton();
        }

        // returns the singleton object
        return a;
    }

    public void gettheoutput() {
        System.out.println("The output is printed when the gettheoutput is passed");
    }
}

class Main {
    public static void main(String[] args) {
        Singleton output;

        // refers to the only object of Database
        output= Singleton.getInstance();

        output.gettheoutput();
    }
}
