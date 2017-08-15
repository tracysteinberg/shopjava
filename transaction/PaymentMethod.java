
package transaction;
import java.util.EnumSet;
import java.util.*;

public enum PaymentMethod {

	VISA("Credit"), 
	MASTERCARD("Credit"),
	STORECARD("Credit"),
	DEBITCARD("Cash"),
	CASH("Cash"),
	GIFTCARD("Cash"),
	CHEQUE("Cash");


     private String typeOfPayment;
 
     PaymentMethod(String typeOfPayment) {
     this.typeOfPayment = typeOfPayment;


    }


   }
       




  