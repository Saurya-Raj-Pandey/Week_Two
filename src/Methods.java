//////
//////
////////class methods {
////////
////////    public static int add(int num) {
////////
////////
////////        return num + num;
////////    }
////////
////////    public static void main(String[] args) {
////////        int result;
////////
////////
////////        result = add(100);
////////
////////        System.out.println("Summed value of 10 is: " + result);
////////    }
//////////}
////////class methods{
////////    public void d(){
////////        System.out.println("no value will come because no parameter is given");
////////    }
////////    public void c(int a){
////////        System.out.println("The parameter is given so the value will come is :");
////////
////////    }
////////
////////    public static void main(String[] args) {
////////        methods obj = new methods();
////////        obj.c(336);
////////        obj.d();
////////    }
////////}
//////public class methods {
//////    private static int getsum(int x){
//////        return x + x;
//////    }
//////    public static void main(String[] args) {
//////        for (int i = 1; i <= 5; i++) {
//////            int result = getsum(i);
//////            System.out.println("sum of " + i + " is: " + result);
//////        }
//////    }
//////}
////class DisplayOverloading
////{
////    public void disp(char c)
////    {
////        System.out.println(c);
////    }
////    public void disp(char c, int num)
////    {
////        System.out.println(c + " "+num);
////    }
////}
////class Sample
////{
////    public static void main(String args[])
////    {
////        DisplayOverloading obj = new DisplayOverloading();
////        obj.disp('a');
////        obj.disp('a',10);
////    }
////}
//class methods{
//    static  int add(int a, int b){
//        return a+b;
//    }
//    static double add(double a , double b){
//        return a+b;
//    }
//    static class sum{
//        public static void main(String[] args) {
//            System.out.println(methods.add(11,11));
//            System.out.println(methods.add(11,11.11));
//        }
//    }
//}
// Recursive
//public class methods {
//    public static void main(String[] args) {
//        int result = sum(10); // here the k is given
//        System.out.println(result);
//    }
//    public static int sum(int k) {
//        if (k > 0) {
//            return k - sum(k -1);// here it calls k itself so it continues summing
//
//        } else {
//            return 0;
//        }
//    }
//}
//public class methods {
//    public static void main(String[] args) {
//        int result = sum(0
//                , 4);
//        System.out.println(result);
//    }
//    public static int sum(int start, int end) {
//        if (end > start) {
//            return end + sum(start, end - 1);
//        } else {
//            return end;
//        }
//    }
//}
public class Methods {
    static  int a1=0 ,  a2=1 ,  a3=0;
    static void fibonacci(int count){
        if(count>0){
            a3 = a1+a2;
            a1=a2;
            a2=a3;
            System.out.println( " " +a3);
            fibonacci(count-1);
        }
    }

    public static void main(String[] args) {
        int count=6;
        System.out.println(a1 + " "+a2); // here the value of the first 0 and 1 is printed
        fibonacci(count-2); //the count 2 is used cause 2 is already printed
    }
}
