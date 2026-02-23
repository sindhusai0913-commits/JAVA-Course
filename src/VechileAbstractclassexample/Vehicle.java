package VechileAbstractclassexample;

public abstract class Vehicle {
    int fuel = 100;

   public void stop(){
       System.out.println("Vehicle stopped by removing the keys");
   }
   abstract void start();
   // here abstract method

    public static void main(String[] args) {
        Vehicle B = new Car();
        B.start();

        Vehicle B1 = new Bike();
        B1.start();
        B1.stop();

    }

}
