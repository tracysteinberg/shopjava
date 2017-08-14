package transaction;

public enum PaymentMethod {
	VISA, 
	MASTERCARD,
	STORECARD,
	DEBITCARD,
	CASH,
	GIFTCARD,
	CHEQUE;

// public String toString() {
//    switch(this) {

//     case VISA: return "Visa";
   
//    } 

//     return "It's the default";          

//  }

}


// package transaction;
// import java.util.stream;
// public enum PaymentMethod {

// VISA("Credit"), 
// MASTERCARD("Credit"),
// STORECARD("Credit"),
// DEBITCARD("Cash"),
// CASH("Cash"),
// GIFTCARD("Cash"),
// CHEQUE("Cash");

// public String toString() {
//    switch(this) {

//     case VISA: 
   
//    } 

//  EnumSet.allOf(PaymentMethod.class)
//   .forEach(type -> System.out.println(type));

//   Stream.of(PaymentMethod.values());

//   private String typeOfTransaction;
 
//     PaymentMethod (String typeOfTransaction) {
//         this.typeOfTransaction = typeOfTransaction;
//     }


//    // return "It's the default";          

//  }

// }

  