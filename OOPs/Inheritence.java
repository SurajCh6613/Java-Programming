public class Inheritence {
    public static class Vehicle {
        boolean isEngine;
        boolean getEngine(){
            return isEngine;
        }
        public void setEngine(boolean isEngine) {
            this.isEngine = isEngine;
        }
    }

    // class Car Inherits the class Vehicle
    public static class Car extends Vehicle {
        String color;
        public void setColor(String color) {
            this.color = color;
        }
        public String getColor() {
            return color;
        }
    }

    public static void main(String[] args) {
        Car bmwCar = new Car();
        bmwCar.setEngine(true);
        System.out.println(bmwCar.getEngine());
        bmwCar.setColor("Black");
        System.out.println(bmwCar.getColor());
    }
}
