public class Duck extends Bird implements Flyable{
    public Duck(double height, double weight, double wingspan) {
        super(height, weight, wingspan);
    }

    @Override
    public void fly() {
        System.out.println(" The duck flaps its wings and flies! ");
    }
}
