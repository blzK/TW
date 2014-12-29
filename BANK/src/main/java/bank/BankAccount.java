/* BankAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Bank;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import NET.webserviceX.www.Currency;
import NET.webserviceX.www.CurrencyConvertorLocator;
import NET.webserviceX.www.CurrencyConvertorSoap;

public class BankAccount {
	/**
	 * Balance is in Euro.
	 */
	private double balance;

	public BankAccount() {
		this.balance = 1000;
	}

	/**
	 * returns the balance of the bank account in euro.
	 * 
	 * @return amount of money on the bank account, in euro.
	 */
	public double getBalance() {
		return balance;
	}
	
	
	/**
	 * 
	 * @param amount
	 * @param currencyName
	 * @return true if operation is authorized.
	 * @throws ServiceException
	 * @throws RemoteException
	 */
	public boolean pay(double amount, String currencyName)throws ServiceException, RemoteException {
		
		double amountEuro = convert(amount, currencyName, "EUR");
		if (isOperationAuthorized(amountEuro)) {
			this.balance -= amountEuro;
			return true;
		} else {
			return false;
		}

	}
	
	public void credit(double amount, String currencyName)throws ServiceException, RemoteException {
		if(amount <=0){throw new IllegalArgumentException();}
		this.balance+=convert(amount, currencyName, "EUR");
	}

	/**
	 * Converts the amount in specific currency
	 * 
	 * @param amount
	 * @param currencyIn
	 * @param currencyOut
	 * @return the amount in converted currency
	 * @throws RemoteException
	 * @throws IllegalArgumentException
	 * @throws ServiceException
	 */
	public static double convert(double amount, String currencyIn,String currencyOut) throws RemoteException,IllegalArgumentException, ServiceException {
		CurrencyConvertorSoap service = new CurrencyConvertorLocator().getCurrencyConvertorSoap();
		return service.conversionRate(Currency.fromString(currencyIn),Currency.fromString(currencyOut))* amount;
	}

	
	/**
	 * Checks if the bank account has sufficient funds to authorize the money withdrawal.
	 * The operation is in euro.  
	 * Bank overdraft is fixed to a level of 500 €.
	 * @param amount in euro.
	 * @return
	 */
	private boolean isOperationAuthorized(double amount) {
		return balance - amount > -500;
	}

}