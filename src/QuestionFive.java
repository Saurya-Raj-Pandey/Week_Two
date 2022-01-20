import java.util.Scanner;

class Average {
    public static void main(String[] args) {
    Average avg=new Average();
    avg.Calculate();

    }
 public  void Calculate(){
     Scanner sc=new Scanner(System.in);
     int[] array=new int[10];
     float sum=0 ;
     float average = 0;
     System.out.println("Enter the 10 numbers: " );
     for (int i = 0; i <array.length; i++) {
         array[i] = sc.nextInt();
     }
         for(int j=0;j< array.length;j++){
             sum+=array[j];
         }
         average=sum/2;

     System.out.println("the average is : "+average);
 }

}