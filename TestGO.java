public class TestGO {

    public static void main(String[] args) {
        GO g1 = new GO();
        GO g2 = new GO("blue", true);
        System.out.println(g1);
        System.out.println("g2");

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4, 5);
        Rectangle r3 = new Rectangle(1, 2, "red", true);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        double d = 4; //impicit casting
        GO g = new Rectangle(); //polymorphism subclass to super class
        if (g instanceof Rectangle) {
            System.out.println(((Rectangle) g).getWidth());
        } else {
            System.out.println("This is not a Rectangle");
        }
        System.out.println(r1.equals(r2)); //adresses compared
    }
}
