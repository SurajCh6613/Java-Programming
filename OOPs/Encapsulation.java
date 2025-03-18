// Encapsulation
    // Encapsulation buldles the data and code working on these data into a single unit
    // It is also known as DATA-HIDING

public class Encapsulation {
    // Creating a class for Encapsulation
    public static class Dog {
        String color;
        private int id = 102;

        void setColor(String color){
            this.color = color;
        }
        public void setId(int id) {
            this.id = id;
        }
        int getId(){
            return id;
        }
        String getColor(){
            return color;
        }
    }

    public static void main(String[] args) {
        // Creating Dog Object
        Dog d1 = new Dog();
        d1.setColor("black");
        System.out.println(d1.getColor());
        d1.setColor("blue");
        System.out.println(d1.getColor());
        d1.setId(103);
        System.out.println(d1.getId());
    }
}
