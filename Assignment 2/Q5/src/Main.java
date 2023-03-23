public class Main {
    public static void main(String[] args) {
        MyInteger i = new MyInteger(2);
        System.out.println(i.isEven());
        System.out.println(i.isOdd());
        System.out.println(i.isPrime());

        System.out.println(MyInteger.isEven(6));
        System.out.println(MyInteger.isOdd(6));
        System.out.println(MyInteger.isPrime(6));

        System.out.println(i.equals(3));

        MyInteger x = new MyInteger(5);
        System.out.println(i.equals(x));
    }
}