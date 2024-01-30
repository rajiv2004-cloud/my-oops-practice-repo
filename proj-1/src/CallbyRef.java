public class CallbyRef {
    int count = 0;

    CallbyRef(int c) {
        count = c;
    }

    static void Inc(CallbyRef obj) {
        obj.count = obj.count + 10;
    }

    public static void main(String args[]) {
        CallbyRef obj1 = new CallbyRef(10);
        System.out.println("val before calling  = " +obj1.count);
        Inc(obj1);
        System.out.println("val after calling  = " +obj1.count);
    }
}
