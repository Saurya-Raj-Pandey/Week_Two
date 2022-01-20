//class hello{
//    public void greetings() {
//        System.out.println("Some of the greetings around the world");
//    }
//}
//
//class French extends hello {
//    public void greetings() {
//        System.out.println("The French says: Bonjouer");
//    }
//}
//
//class Spanish extends hello {
//    public void greetings() {
//        System.out.println("The Spanish says:Hola");
//    }
//}

abstract class hello{
    //abstract method
    public abstract void greetings();
}

class Nepalese extends hello{

    public void greetings(){
        System.out.println("Nepalese say :Namaste");
    }
    public static void main(String[] args){
        hello obj = new Nepalese();
        obj.greetings();
    }
}