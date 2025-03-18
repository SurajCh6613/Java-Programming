public class Polymorphism {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    double add(double a,double b,double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Polymorphism sum = new Polymorphism();
        System.out.println(sum.add(2.3, 2.7));
        System.out.println(sum.add(2, 2));
        System.out.println(sum.add(2, 2.7,2));
        System.out.println(sum.add(2, 2,6));
    }
}
