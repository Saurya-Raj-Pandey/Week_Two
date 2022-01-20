////
////// this is used to concate the strings which is of two or more strings
//// class Concat {
////    public static void main(String[] args) {
////        String a = "Intern students are :";
////        String b="Saurya Raj Pandey";
////        String c= a.concat(b);
////        System.out.println(c);
////    }
////}
//// "+" it is used to add the two strings
////class PlusSign {
////    public static void main(String[] args) {
////        String a = "Hello";
////        String b = "  This is saurya raj pandey";
////        String c = a + b;
////        String d = "Age is " + 21;
////        System.out.println(c);
////        System.out.println(d);
////
////    }
////}
//class Equals{
//    public static void main(String[] args) {
//        String a = "Hello";
//        String b = "  This is saurya raj pandey";
//        String e=" Saurya raj pandey";
//        boolean StringCheckForEquals=b.equals(e); // this checks the true value
//        System.out.println( "This is for the  .equals() : "+StringCheckForEquals);
//        StringCheckForEquals=b.equals(e); //this checks the false value
//
//        String g= new String("Hello");
//        boolean v= (a==g);
//        System.out.println(v);
//        v=(a==e);
//        System.out.println("This is for the  == :" + v);
//
//
//        String c = a + b;
//        String d = "Age is " + 21;
//        System.out.println(c);
//        System.out.println(d);
//    }
// compare to is used to return an integer value which tells the string compared to is less than , equals to or grater than the other string
// it compares to the string based on natural ordering
class StringLiterals {
    public static void main(String[] args) {
        String s1= " Info dev";
        String s2 = " Info developers";
        String s3= " Info dev";
        int a = s1.compareTo(s2); // this will return -7 cause s1<s2
        System.out.println(a);
        int b = s2.compareTo(s1);// this will return 7 because  s1>s2
        System.out.println(b);
        int c = s3.compareTo(s1);// this will return 0 cause s1==s2
        System.out.println(c);
    }
}