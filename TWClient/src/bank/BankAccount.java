/**
 * BankAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bank;

public interface BankAccount extends java.rmi.Remote {
    public double convert(double amount, java.lang.String currencyIn, java.lang.String currencyOut) throws java.rmi.RemoteException;
    public boolean pay(double amount, java.lang.String currencyName) throws java.rmi.RemoteException;
    public void credit(double amount, java.lang.String currencyName) throws java.rmi.RemoteException;
    public double getBalance() throws java.rmi.RemoteException;
}
