/**
 * BankAccountService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bank;

public interface BankAccountService extends javax.xml.rpc.Service {
    public java.lang.String getBankAccountAddress();

    public bank.BankAccount getBankAccount() throws javax.xml.rpc.ServiceException;

    public bank.BankAccount getBankAccount(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
