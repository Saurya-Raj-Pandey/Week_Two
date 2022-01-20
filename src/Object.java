//// Class
//public class object {
//    String name;
//    String role;
//    int age;
//    String location;
//
////Object
//    public String getInfo() {
//        return ("Name: "+name+" Role:"+role+" Age is:"+age+" location: "+location);
//    }
//
//
//    public static void main(String[] args) {
//        object maltese = new object();
//        maltese.name="Saurya Raj Pandey";
//        maltese.role="Intern";
//        maltese.age=22;
//        maltese.location="Budanilkantha,kathmandu,Nepal";
//        System.out.println(maltese.getInfo());
//    }
//}

// Class
public class Object {
    String name;
    String role;
    int age;
    String location;

    //Object
    public String getInfo() {
        return ("Name: " + name + " Role:" + role + " Age is:" + age + " location: " + location);
    }
}

class Details {
    public static void main(String[] args) {
        Object maltese = new Object();
        maltese.name = "Saurya Raj Pandey";
        maltese.role = "Intern";
        maltese.age = 22;
        maltese.location = "Budanilkantha,kathmandu,Nepal";
        System.out.println("The Desired output is : ");
        System.out.println(maltese.getInfo());
    }
}
