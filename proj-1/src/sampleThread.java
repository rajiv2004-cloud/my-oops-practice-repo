class sampleThread extends Thread {
    public void run(){
        System.out.println("Thread is under Running...");
        for(int i=1; i<=10;i++){
            System.out.println("i = "+i);
        }
    }
}

class My_Thread_Test{
    public static void main(String args []){
        sampleThread t1 = new sampleThread();
        System.out.println("Thread about to start...");
        t1.start();
    }
}
