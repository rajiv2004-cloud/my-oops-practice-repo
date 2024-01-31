package MyPackage;
import MyPackage.Firstclass;
class Secoundclass extends Firstclass {
    void method(){
        System.out.println(i);
        System.out.println(j);
//        System.out.println(k);
    }
    public static void main(String args[]){
        Secoundclass obj = new Secoundclass();
        obj.method();
    }
}
