public class Main {
    public static void main(String[] args){
        Bank bank =new BK();
        System.out. println("BK"+bank.interestRate());
        bank =new KCB();
        System.out. println("KBC"+bank.interestRate());
        bank =new Cogebank();
        System.out. println("Cogebank"+bank.interestRate());



    }
}