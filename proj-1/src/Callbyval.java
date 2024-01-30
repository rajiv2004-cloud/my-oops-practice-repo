public class Callbyval {
    void Inc(int count){
        count+=10;
    }
}
class CallbyvalDemo{
    public static void main(String args[]){
        Callbyval  obj1 = new Callbyval();
        int count = 1000;
        System.out.println("Value of count berore call = "+count);
        //after call
        obj1.Inc(count);
        System.out.println("Value of count after call = "+count);
    }
}
