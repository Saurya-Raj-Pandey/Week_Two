 class Student {
    //     static class Student {
//        static int roll_no;
//        static String name ;
//        static {
//            roll_no=2;
//            name="John";
//        }
        int roll_no=2;
        String name="John";

        public static void main(String[] args) {
            Student a = new Student();
            System.out.println("The Roll no is: " + a.roll_no);
            System.out.println("The name is : " + a.name);
        }
    }

