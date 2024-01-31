class interfaceThread implements Runnable {
    public void run(){
        System.out.println("Thread is under Running...");
        for(int i=1;i<=20;i++){
            System.out.println("i = "+i);
        }
    }
}

class My_therad{
    public static void main(String args[]){
        interfaceThread obj=new interfaceThread();
        Thread thread = new Thread(obj);
        System.out.println("Thread about to start...");
        thread.start();
    }
}