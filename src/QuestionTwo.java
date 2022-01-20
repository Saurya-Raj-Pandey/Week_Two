class Student1{
int JohnRollNumber=1;
int SamRollNumber=2;
long JohnPhoneNumber=9803213212l;
long SamPhoneNumber=9841564645l;
String JohnAddress="Sanepa";
String SamAddress="Golfutar";
    public static void main(String[] args) {
        Student1 John= new Student1();
        Student1 Sam= new Student1();
        System.out.println("John's Details :"+ "\nAddress : "+ John.JohnAddress+ "\nPhone Number :"+John.JohnPhoneNumber+"\nRollnumber :"+John.JohnRollNumber);
        System.out.println("               ");
        System.out.println("Sam's Details :"+ "\nAddress : "+ Sam.SamAddress+ "\nPhone Number :"+Sam.SamPhoneNumber+"\nRollnumber :"+Sam.SamRollNumber);

    }
}
