public class Thread_Main extends Thread {
    public static void main(String argv[]){
        Thread cThread = Thread.currentThread();
        System.out.println(cThread.getId());
        System.out.println(cThread.getName());
        System.out.println(cThread.getPriority());   
        cThread.setName("Karma");
        cThread.setPriority(MAX_PRIORITY);
        System.out.println(cThread.getId());
        System.out.println(cThread.getName());
        System.out.println(cThread.getPriority()); 
    }
    
}
