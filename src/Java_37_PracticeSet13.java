//Question 1
class Practice13 extends Thread{
    @Override
    public void run() {
        super.run();
//        while (true){
            System.out.println("Good Morning");
//        }
    }
}

class Practice13b extends Thread{
    @Override
    public void run() {
        super.run();
//        while (true){
            //Question 2
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }

            System.out.println("Welcome");
//        }
    }
}


public class Java_37_PracticeSet13 {
    static void main(String[] args) {
        //Question 1
        Practice13 practice13 = new Practice13();
        Practice13b practice13b = new Practice13b();
        practice13.setPriority(6);
        practice13b.setPriority(9);
        System.out.println(practice13.getPriority());
        System.out.println(practice13b.getPriority());
        System.out.println(practice13b.getState());

        practice13.start();
        practice13b.start();
        System.out.println(practice13b.getState());
        System.out.println(Thread.currentThread().getState());


    }
}
