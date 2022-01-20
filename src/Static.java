// static block
public class Static {
    //static variable
    static int j=10;
    static int n;
    static int b=n();
    //static block
    static {
        System.out.println("Static block Initialized ");
       n=j*10;
    }
    //static method
static int n(){
    System.out.println("form n ");
    return 70;
}
    public static void main(String[] args) {
        System.out.println("Inside main method ");
        System.out.println("Value of j : " +j);
        System.out.println("value of n : "+n);
        System.out.println("value of b : "+b);
    }}


// for static method nested class should be created
//public class Static {
//    private static String str = "Saurya";
//
//    //Static class
//    static class MyNestedClass {
//        //non-static method
//        public void disp() {
//            System.out.println(str);
//        }
//    }
//
//    public static void main(String args[]) {
//        Static.MyNestedClass obj = new Static.MyNestedClass();
//        obj.disp();
//
//    }
//}
//