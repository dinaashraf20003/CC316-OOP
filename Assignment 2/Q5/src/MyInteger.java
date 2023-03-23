public class MyInteger {
    private int value;
    public MyInteger(){}
    public MyInteger(int v){
        this.value=v;
    }
    public boolean isEven(){
        return value%2==0;
    }
    public boolean isOdd(){
        return value%2!=0;
    }
    public boolean isPrime(){
        if(value == 2)
            return true;
        else {
            for (int i = 2; i < value; i++) {
                if (value%i==0)
                    return false;
            }
        }
        return true;
    }
    public static boolean isEven(int a){
        return a%2==0;
    }
    public static boolean isOdd(int a){
        return a%2!=0;
    }
    public static boolean isPrime(int a){
        if(a == 2)
            return true;
        else {
            for (int i = 2; i < a; i++) {
                if (a%i==0)
                    return false;
            }
        }
        return true;
    }
    public boolean equals(int a){
        return value== a;
    }
    public boolean equals(MyInteger m){
        return value==m.value;
    }
}
