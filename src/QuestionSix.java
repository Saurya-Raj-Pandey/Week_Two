import java.util.Scanner;

class AddDistance{
    int feet,read;

    public void ConversionOfTheGivenNumber(int a,int b,int c,int d)
    {
        int count=0;
        read=a+b;
        while (read>12){
            read=read-12;
            count++;
        }
        feet=c+d+count;
    }
    public int feet(){
        return feet;
    }
    public  int Inches(){
        return read;
    }

    public static void main(String[] args) {
        AddDistance addDis=new AddDistance();
        int feet1 ,inches1 ,feet2,inches2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First distance in Feet : " );
        feet1=scanner.nextInt();
        System.out.println(" Enter First distance in Inches  :");
        inches1=scanner.nextInt();
        System.out.println("Enter the Second distance in Feet : ");
        feet2=scanner.nextInt();
        System.out.println("Enter the Second distance in Inches: ");
        inches2=scanner.nextInt();
        addDis.ConversionOfTheGivenNumber(feet1,feet2,inches1,inches2);
        System.out.println("The Obtain Value in Feet is : "+ addDis.feet());
        System.out.println("The Obtain Value in Inches is : " +addDis.Inches());
    }
}