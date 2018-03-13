package lab6DataStructure;

public class BadTransactionException extends Exception {

	  public int transAmount;  // The invalid transaction amount.

	  /**
	   *  Creates an exception object for invalid transaction amount "badTransAmt".
	   **/
	  public BadTransactionException(int badTransAmt) {
	    super("Invalid transaction amount: " + badTransAmt);

	    transAmount = badTransAmt;
	  }
	}