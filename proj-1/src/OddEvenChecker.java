public class OddEvenChecker {
    private int number;

    //Consructor
    public OddEvenChecker(int number) {
        this.number = number;
    }

    public String check() {
        //condition for checking
        return (number % 2 == 0) ? "even" : "odd";
    }

    public static void main(String[] args) {
        OddEvenChecker number1 = new OddEvenChecker(7);
        System.out.println("Number 7 is " + number1.check());

        OddEvenChecker number2 = new OddEvenChecker(12);
        System.out.println("Number 12 is " + number2.check());
    }
}
