package customer;

import java.math.BigDecimal;
import java.util.*;
import transaction.*;


public class Customer  {


  private String name;
  private BigDecimal funds;
  private PaymentMethod preferredPaymentMethod;
  private HashMap<PaymentMethod, BigDecimal> myWallet;


  public Customer(String name, HashMap<PaymentMethod, BigDecimal> myWallet) {
    this.name = name;
    this.myWallet = myWallet;
    
  
  }


  public String getName(){
    return this.name;
  }

  public HashMap<PaymentMethod, BigDecimal> getFunds() {
    return this.myWallet;
  }

  public PaymentMethod getPaymentType() {
    return this.preferredPaymentMethod;
  }

  public void spendMoney(BigDecimal amount, PaymentMethod method) {
    BigDecimal currentBalance = this.myWallet.get(method);
    BigDecimal newBalance = currentBalance.subtract(amount);
    this.myWallet.put(method, newBalance);
      
  }

  public void refundMoney(BigDecimal amount, PaymentMethod method) {
    BigDecimal currentBalance = this.myWallet.get(method);
    BigDecimal newBalance = currentBalance.add(amount);
    this.myWallet.put(method, newBalance);
      
  }



  
}