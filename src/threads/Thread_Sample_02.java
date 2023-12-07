package threads;

class T2 implements Runnable{
    public void run(){
        System.out.println("Thread.....");
    }
}
public class Thread_Sample_02 {
    public static void main(String[] args) {
        Runnable r1 = new T2();
        Thread th1 = new Thread(r1,"My new thread");
        th1.start();
        String str = th1.getName();
        System.out.println(str);
    }
}
