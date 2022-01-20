class Triangle {
    int Side1=12,Side2=15,Side3=16;
    int Perimeters=Side1+Side2+Side3;
    int A=(Perimeters)/2;
    float Area=(int)Math.sqrt(A*(A-Side1)*(A-Side2)*(A- Side3));
     public static void main(String[] args) {
         Triangle tr=new Triangle();
         System.out.println("The perimeter of the the traingle is :" +tr.Perimeters);
         System.out.println("The calculation of the Area is not possible so we should Find A firstly : " +tr.A);
         System.out.println("After S is found the Area needs to be calculated so : "+tr.Area);
     }
}
