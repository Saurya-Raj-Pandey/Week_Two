
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        sb.append("this is a program");
        System.out.println(sb);
        StringBuilder sb1=new StringBuilder("java  ");
        sb1.append(sb+"for StringBuilder");
        System.out.println(sb1);
        StringBuilder sb3=new StringBuilder();
        System.out.println("the total amount of letters is :"+ sb.capacity());
        //usinf the method for the constructor
        StringBuilder sb4=new StringBuilder(sb);
        System.out.println("What was in the stb : " + sb);

        StringBuilder a= new StringBuilder("Info Dev");
        a.insert(8,"lopers");

        System.out.println("This is used for inserting the value :");
        System.out.println(a);

        StringBuilder b= new StringBuilder("info Devlopers");
        System.out.println("This is used for replacing : ");
        b.replace(5,7,"java");
        System.out.println(b);

        StringBuilder c= new StringBuilder("Welcome to the interns");
        System.out.println("This is used for deletion:");
        c.delete(7,10);
        System.out.println(c);

        StringBuilder d= new StringBuilder("Info developers");
        System.out.println("this is used for the replacing :");
        d.reverse();
        System.out.println(d);

        StringBuilder f = new StringBuilder();
        System.out.println("this is used for finding the capacity  :");
        f.append("Info");
        System.out.println("capacity is : " + f.capacity());
        f.append(" devlopers ltd");
        System.out.println(f);
        System.out.println("capacity is : " + f.capacity());

        StringBuilder g= new StringBuilder();
        System.out.println("This provides the position of the letter");
        g.append("SauryaRajPandey");
        System.out.println(g);
        System.out.println(g.charAt(5));
    }


}
