//Rectangle area

class Rectangle{
    int a1=4,b1=5;
    int a2=5,b2=8;
public  int Area(int Length,int Breadth){
    return Length*Breadth;
}
    public static void main(String[] args) {
        Rectangle rt=new Rectangle();
        System.out.println("The Area of the first rectangle :" +rt.Area(rt.a1, rt.b1) );
        System.out.println("The Area of the Second rectangle : "+rt.Area(rt.a2, rt.b2));
    }
}
