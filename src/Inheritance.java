//// it is derived class in the single base class
//
//// single inheritance
//class Gpa{
//    double currentgpa=8.3;
//}
//class  Inheritance extends Gpa {
//    double TotalCgpa = 8.6;
////    String EnnrolledCollege = "Vellore Institute Of Technology";
//}
//// multilevel inheritance
//class Student extends Inheritance {
//    public String EnrolledCollege="Vellore Institure of technology";
//}
//
//class DetailsStudent{
//    public static void main(String[] args) {
////    Gpa ob=new Gpa();
//    Student a=new Student();
//        System.out.println("The current gpa is : " + a.currentgpa);
//        System.out.println("The Cgpa is : " + a.TotalCgpa);
//        System.out.println("The College enrolled is :" + a.EnrolledCollege);
//
//
//
//    }
//}
//
//class Covid{
//    public  Covid(){
//        System.out.println("About the Virus Varient");
//        System.out.println("Omnicoron");
//    }
//}
//class Symptoms extends Covid{
//    public Symptoms() {
//        System.out.println("Symptoms:");
//        System.out.println("Headache,Bodypain,Dizzyness, Dry Cough");
//    }
//
//    public void RateOfTransmission(){
//        System.out.println("Transmission Rate:");
//        System.out.println("50 times faster than Normal covid so be more extra precaution");
//    }
//}
//class Precautions extends Symptoms {
//    public Precautions() {
//        System.out.println("Precautions of Omnicoron:");
//    }
//
//    public void Safety() {
//        System.out.println("Wear mask in a crowded place and  stay in a vantilated room where flow of air is there");
//
//    }
//
//}
//class DetailsAboutTheVirus{
//    public static void main(String[] args) {
//        Precautions pre=new Precautions();
//        pre.Safety();
//        pre.RateOfTransmission();
//
//    }
//}
//hierrachical inheritance

// Hierarchical Inheritance
class Developers{
    float salary=60000;
     float Salary=40000;
    void Salary(){
        System.out.println("The Basic salary for Junior Developers : " + Salary);

    }
    void salary(){
        System.out.println("The Basic salary for Seniors Developers : "+salary);
    }
}

class SeniorDeveloper extends Developers{
    double FestiveBonus=6.5;
    void FestiveBonus(){
        super.salary();
        System.out.println("The festive bonus for senior developers is :" + (FestiveBonus*salary));
    }
}

class JuniorDevelopers extends Developers{
    double FestiveBonus=3.65;
    void FestiveBonus(){
        super.Salary();
        System.out.println("The festive bonus for the Junior Dvelopers is : " +(FestiveBonus*Salary));
    }
}

class TotalBonus{
    public static void main(String[] args) {
        SeniorDeveloper Srd=new SeniorDeveloper();
        JuniorDevelopers Jrd=new JuniorDevelopers();
        Srd.FestiveBonus();
        Jrd.FestiveBonus();
    }
}