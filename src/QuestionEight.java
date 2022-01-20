class EmployeeInformation {
    private String Empname,Empaddress;
    private int YearOfjoining,EmpSalary;

    public EmployeeInformation(String Empname, int YearOfJoining, String Empaddress) {
        this.Empname=Empname;
        this.YearOfjoining=YearOfJoining;
        this.Empaddress=Empaddress;
    }

    public String getEmpname() {
        return Empname;
    }
    public int getYearOfjoining() {
        return YearOfjoining;
    }
    public int getEmpSalary() {
        return EmpSalary;
    }
    public String getEmpaddress() {
        return Empaddress;
    }
}
class EmployeeDetails{
    public static void main(String[] args) {
        EmployeeInformation emp1=new EmployeeInformation("Robert",1994,"64C-Wall Street");
        EmployeeInformation emp2=new EmployeeInformation("Sam",2000,"68D-Wall Street");
        EmployeeInformation emp3=new EmployeeInformation("John",1999,"26B-Wall Street");
        System.out.println("Name  Year of joining \t Address");
        System.out.println(emp1.getEmpname()+"\t"+emp1.getYearOfjoining()+"\t\t\t"+emp1.getEmpaddress());
        System.out.println(emp2.getEmpname()+"\t\t"+emp2.getYearOfjoining()+"\t\t\t"+emp2.getEmpaddress());
        System.out.println(emp3.getEmpname()+"\t"+emp3.getYearOfjoining()+"\t\t\t"+emp3.getEmpaddress());
    }
}
