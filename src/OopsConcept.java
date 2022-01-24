//import java.util.Scanner;
//
//class Encapsulation{
//private int salary=0;
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    public int getSalary() {
//        return salary;
//    }
//}
//class DetailsOfTheWorkPlace{
//    private String Company ;
//    private String Location;
//
//    public void setCompany(String company) {
//        Company = company;
//    }
//
//    public String getCompany() {
//        return Company;
//    }
//
//    public void setLocation(String location) {
//        Location = location;
//    }
//
//    public String getLocation() {
//        return Location;
//    }
//}
//class DetailsAboutTheSalary{
//    public static void main(String[] args) {
//        Encapsulation ecap=new Encapsulation();
//        DetailsOfTheWorkPlace detailsOfTheWorkPlace=new DetailsOfTheWorkPlace();
//        detailsOfTheWorkPlace.setCompany("Info Developers Ltd");
//        detailsOfTheWorkPlace.setLocation("Sanepa,Kathmandu,Nepal");
//        ecap.setSalary(5000);
//        System.out.println("The work place you are currently working : " + detailsOfTheWorkPlace.getCompany());
//        System.out.println("The location is : " + detailsOfTheWorkPlace.getLocation());
//        System.out.println("The salary for the intern is : "+ecap.getSalary());
//    }
//}
// --------------------------------------------------------------------------------------------
// runtime or dynamic polymorphism or late binding
//import java.util.Scanner;
//
//class DonationProgram{
//    public void show(){
//        System.out.println("Welcome To The Blood Donation Program Held By Info Developers");
//    }
//}
//class BloodGroup extends DonationProgram{
//    public BloodGroup(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your blood group : ");
//        String bg=sc.nextLine();
//        if(bg.equals("O+ve")){
//            System.out.println("You are a universal donor you can donate to everyone");
//        }
//        else{
//            System.out.println("You have to donate to the particular blood group");
//        }
//    }
//}
//class Anydefects extends DonationProgram{
//    public Anydefects(){
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Any Defects Found : ");
//        String ad=sc.nextLine();
//        if (ad.equals("Yes")){
//            System.out.println("You have defects so we will safely dispance it ");
//        }
//        else if(ad.equals("No")){
//            System.out.println("You can continue to give blood to the person you are healthy");
//        }
//        else return;
//    }
//}
//class Bloodpatient extends DonationProgram{
//    public Bloodpatient(){
//        System.out.println("welcome to the hospital");
//        System.out.println("If you cant find you respective donor then O+ve can be used");
//    }
//}
//class BloodDetails {
//    public static void main(String[] args) {
//        DonationProgram a, b, c, d, e;
//        a = new DonationProgram();
//        b = new BloodGroup();
//        c = new Anydefects();
//        d = new Bloodpatient();
//
//    }
//}
//
//
//
//
//
////another example of it
//import java.util.Scanner;
//
//class BloodDonationProgram{
//    public void show(){
//        System.out.println("This a Blood Donation Program conducted by the Info Developers   ");
//    }
//}
//class BloodGroup extends BloodDonationProgram {
//    public void show(){
//        System.out.println("Blood Group Details");
//    }
//}
//class BloodDetails extends  BloodDonationProgram{
//    public void show(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your blood group in (eg:O+ve,A+ve)");
//        String bloodgroup=sc.nextLine();
//        if(bloodgroup.equals("O+ve")){
//            System.out.println("You can donate to the Every group of blood");
//        }
//        else{
//            System.out.println("You can only go for the respective blood group");
//        }
//    }
//}
//class Anydefects extends BloodDonationProgram{
//    public void show(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Only for official use");
//        System.out.println("Enter the defects(y/n) employee name and id ");
//        String defects=sc.nextLine();
//        String ename=sc.nextLine();
//        int id=sc.nextInt();
//        if(defects=="y"){
//            System.out.println("Sorry employee "+ename+" with id "+id+" cannot deposit the blood");
//        }
//        else {
//            System.out.println("Employee "+ename+" with id "+id+" deposited the blood safely");
//        }
//
//    }
//}
//class BloodHistory{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        BloodGroup b= new BloodGroup();
//        BloodDonationProgram bg= new BloodDetails(); // here bg is the object so
//        BloodDonationProgram bdp=new BloodDonationProgram ();
//        BloodDonationProgram b1=new Anydefects();
//        System.out.println("If you are donor press 1,if you are admin press 2");
//        int press=sc.nextInt();
//        if(press==1){
//            b.show();
//            bg.show(); // we called the bg above over here
//        }
//        if(press==2){
//            bdp.show();
//            b1.show();
//        }
//
//    }
//}
//
//------------------------------------------------------------
// static polymorphism or compile polymorphism or early Binding
//class CalculatTheValue {  // this is the Overload
//    void disp(int a)
//    {
//        System.out.println ("a: " + a);
//    }
//    void show (int a, int b)
//    {
//        System.out.println ("a and b: " + a + "," + b);
//    }
//    double demo(double a) {
//        System.out.println("double a: " + a);
//        return a*a;
//    }
//
//}
//class Mathematics{ // this is the methodoverloading
//    public static void main(String[] args) {
//        CalculatTheValue find=new CalculatTheValue();
//        double result;
//        find.disp(6);
//        find.show(6,994);
//        result= find.demo(23);
//
//
//    }
//}

// another example
//class Calculate{
//    int add(int a,int b){
//        return a+b;
//    }
//    int add(int a ,int b , int c ){
//        return a+b+c;
//    }
//}
// class Total{
//    public static void main(String[] args) {
//        Calculate c= new Calculate();
//        System.out.println(c.add(3,9));
//        System.out.println(c.add(993,5,2));
//    }
//}
abstract class NewClass{
    public NewClass(){
        System.out.println("This is called an constructor ");
    }
    public  void SayHello(){
        System.out.println("hello this is a SayHello");

    }
    abstract public boolean greet();

}

class NewClass1 extends  NewClass{
    @Override
    public boolean greet(){
        System.out.println("GoodMorninggg");
        return false;
    }

}

abstract class Newclass2 extends NewClass{
   public void th(){
       System.out.println("i Am a good class");
   }
}
 class TheClassToBeCalled{
    public static void main(String[] args) {
        NewClass1 a = new NewClass1();
        System.out.println(a.greet());


    }
}

