import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        var list = new ArrayList<PaymentService>();

        var sebPaymentService1 = new SebPaymentService();
        list.add(sebPaymentService1);
        sebPaymentService1.currency = "$";

        var sebPaymentService2 = new SebPaymentService();
        list.add(sebPaymentService2);
        sebPaymentService2.currency = "€";

        var swedPaymentService1 = new SwedPaymentService();
        list.add(swedPaymentService1);
        swedPaymentService1.currency = "$";

        var swedPaymentService2 = new SwedPaymentService();
        list.add(swedPaymentService2);
        swedPaymentService2.currency = "€";

        for(var paymentService : list){
            System.out.println(paymentService.currency);
            if(paymentService instanceof SebPaymentService){
                SebPaymentService sebService = (SebPaymentService)paymentService;
                sebService.sendPaymentToSeb();
            } else if(paymentService instanceof SwedPaymentService){
                SwedPaymentService swedService = (SwedPaymentService) paymentService;
                swedService.sendPaymentToSwed();
            }
        }
    }
}

public class PaymentService{
  public String clientAddress;//IBAN
  public int amount;
  public String description;
  public String currency;
}

public class SebPaymentService extends PaymentService{

  public void sendPaymentToSeb(){
    System.out.println("This is a payment to SEB service");
  }
  
}

public class SwedPaymentService extends PaymentService{

  public void sendPaymentToSwed(){
    System.out.println("This is a payment to Swedbank service");
  }

}
