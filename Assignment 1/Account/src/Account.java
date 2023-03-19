import java.util.Date;
public class Account {
    private int id =0;
    private double balance =0;
    private double annualInterestRate =0;
    private Date dateCreated = new Date();
    public Account(){}
    public Account(int i, double b){
        this.id=i;
        this.balance=b;
    }
    public int accessor_id(){
        return this.id;
    }
    public void mutator_id(int i){
        this.id=i;
    }
    public double accessor_balance(){
        return this.balance;
    }
    public void mutator_balance(double b){
        this.balance=b;
    }
    public double accessor_annualInterestRate(){
        return this.annualInterestRate;
    }
    public void mutator_annualInterestRate(double a){
        this.annualInterestRate=a;
    }
    public Date accessor_dateCreated(){
        return this.dateCreated;
    }
    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12;
    }
    public double getMonthlyInterest(){
        return this.balance*((this.annualInterestRate / 12)/100);
    }
    public void withdraw(double x){
        this.balance-=x;
    }
    public void deposit(double y){
        this.balance+=y;
    }
}
