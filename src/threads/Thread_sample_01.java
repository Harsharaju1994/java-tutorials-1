package threads;

class T1 extends Thread{
    public void run(){
        for(int i = 1;i<10;i++){
            System.out.println(i+" Hello...");

        }
    }
}
public class Thread_sample_01 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.start();
    }
}
