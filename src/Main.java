import java.util.List;

public class Main {
    public static void main(String[] args) {
  Duck duck1 = new Duck(3.0,1.5,0.8);
  Duck duck2 = new Duck(2.7,2.0,1.2);
  Aircraft aircraft = new Aircraft();
  Aerostat aerostat = new Aerostat();


List<Flyable> flyables = List.of(
        new Duck(0.7,2.8,1.4),
        new Aircraft(),
        new Aerostat()
);
   for (Flyable flyable : flyables){
       flyable.fly();
   }

    }
}