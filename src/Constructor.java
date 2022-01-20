//////  no-arg
////class employee {
////     String name;
////
////     public employee() {
////         name = "Saurya Raj Pandey";
////     }
////
//// }
//// class constructor{
////    public static void main(String[] args) {
////        employee obj = new employee();
////        System.out.println(" The name is : "+obj.name);
////    }
////}
////
////  paramatized
//// paramized
//class constructor {
//    String language;
//
//    constructor(String lang){
//        language=lang;
//        System.out.println(language + "  , which is greetings ");
//
//    }
//
//    public static void main(String[] args) {
//        constructor obj1=new constructor("Bonjuer , Comment ça va");
//        constructor obj2=new constructor("Namaste,K cha ");
//        constructor obj3=new constructor("Guten tag,wie gehts");
//        constructor obj4=new constructor("Namaste,kesey ho app");
//    }
//}
//

// default constructor
//class constructor{
//    int a ;
//    double b;
//
//    public static void main(String[] args) {
//        constructor obj=new constructor();
//        System.out.println("the default value we get is :");
//        System.out.println("the value of a we got is : "+obj.a);
//        System.out.println("the value of b we got is  : "+obj.b);
//    }
//}
class Constructor {

    String language;

    Constructor() {
        this.language = "Namaste";
    }

    // single prameter
    Constructor(String language) {
        this.language = language;
    }

    public void getName() {
        System.out.println("How do you greet in Nepal : " + this.language);



    }

    public static void main(String[] args) {

        // call cwith no parameter
        Constructor obj1 = new Constructor();

        // call  single parameter
         Constructor obj2 = new Constructor("k cha");

        obj1.getName();
        obj2.getName();
    }
}