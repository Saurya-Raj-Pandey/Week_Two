import java.util.Scanner;

class Employee{
    double Salary;
    double HoursOfWork;
    public void getInfo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        Salary=scanner.nextInt();
        System.out.println("Enter your Hours of Work:");
        HoursOfWork=scanner.nextInt();
    }
    public void AddSal(){
        if (Salary<500){
            Salary+=10;
            System.out.println("As you salary is less than 500, 10 $ is added....");
            System.out.println("Your new salary after adding 10 is: "+Salary);
        }
        else {
            System.out.println("You have salary greater than or equals to 500 so no addition...");
            System.out.println("Your salary is: "+Salary);
        }
    }
    public void AddWork(){
        if (HoursOfWork>6){
            Salary+=5;
            System.out.println("Work hour greater than 6 , so 5 is added to your salary....");
            System.out.println("Your new salary after adding 5 is: "+Salary);
        }
        else {
            System.out.println("Work hour less than 6 so salary not increased...");
            System.out.println("Your salary is: "+Salary);
        }
    }

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.getInfo();
        employee.AddSal();
        employee.AddWork();
    }
}