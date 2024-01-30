class Testinnerclass {
    private int data = 100;
    class Inner{
        void msg(){
            System.out.println("data is "+data);
        }
    }

    public static void main(String args[]){
    Testinnerclass obj = new Testinnerclass();
    Testinnerclass.Inner in = obj.new Inner();
    in.msg();
    }
}
