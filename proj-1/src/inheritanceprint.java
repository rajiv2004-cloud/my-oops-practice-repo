//for Multiple interface
interface inheritanceprint {
    void print();
}
interface show {
    void show1();
}
class A implements inheritanceprint, show{
    @Override
    public void print() {
        System.out.println("Hii");
    }

    @Override
    public void show1() {
        System.out.println("Guys");
    }
    public static void main(String args[]){
        A obj = new A();
        obj.print();
        obj.show1();
    }
}
