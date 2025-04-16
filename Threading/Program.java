//package Threading;
//
//public class Program {
//    public static void main(String[] args) {
//        Counter ObjC= new Counter();
//        Thread T1 = new Thread(new Runnable() {
//            @Override
//            public void run(){
//                for (int i = 1; i <=1000; i++) {
//                    ObjC.Increment();
//                }
//            }
//        });
//        Thread T2 = new Thread(new Runnable() {
//            @Override
//            public void run(){
//                for (int i = 1; i <=1000; i++) {
//                    ObjC.Increment();
//                }
//            }
//        });
//        T1.start();
//        T2.start();
//        try {
//            T1.join();
//            T2.join();
//        } catch (InterruptedException e) {
//            // TODO: handle exception
//            e.printStackTrace();
//        }
//        System.out.println("Counter Value :"+ ObjC.count);
//    }
//}
