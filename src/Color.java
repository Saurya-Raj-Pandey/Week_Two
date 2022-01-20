//enum Size {
//    SMALL, MEDIUM, LARGE, EXTRALARGE
//}
//
//class Test {
//    Size pizzaSize;
//    public Test(Size pizzaSize) {
//        this.pizzaSize = pizzaSize;
//    }
//    public void orderPizza() {
//        switch(pizzaSize) {
//            case SMALL:
//                System.out.println("I ordered a small size pizza.");
//                break;
//            case MEDIUM:
//                System.out.println("I ordered a medium size pizza.");
//                break;
//            default:
//                System.out.println("I don't know which one to order.");
//                break;
//        }
//    }
//}
//
//class Enums{
//    public static void main(String[] args) {
//        Test t1 = new Test(Size.MEDIUM);
//        t1.orderPizza();
//    }
//}
enum Color {
    BLUE,BLACK,RED,GREEN;

    public String getSize() {

        // this object show the COLOR
        switch(this) {
            case BLUE:
                return "blue";

            case BLACK:
                return "black";

            case RED:
                return "red";

            case GREEN:
                return "GREEN";

            default:
                return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("The color is :  " + Color.GREEN.getSize());
    }
}