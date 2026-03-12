package threads;

public class ReminderThread extends Thread{
    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(10000000);

                System.out.println("\n[Reminder] Please return the issued books on time!!!!");
            }catch(InterruptedException e){
                System.out.println("Thread Interuppted");

            }
        }
    }
}
