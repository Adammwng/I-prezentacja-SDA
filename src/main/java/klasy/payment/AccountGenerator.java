package klasy.payment;

public class AccountGenerator {
    private static int staticnumber = 1111111;
    public static Account createnewAccount(){
      return new Account(staticnumber++);
    }

}
