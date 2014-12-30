package bank;

public class BankAccountProxy implements bank.BankAccount {
  private String _endpoint = null;
  private bank.BankAccount bankAccount = null;
  
  public BankAccountProxy() {
    _initBankAccountProxy();
  }
  
  public BankAccountProxy(String endpoint) {
    _endpoint = endpoint;
    _initBankAccountProxy();
  }
  
  private void _initBankAccountProxy() {
    try {
      bankAccount = (new bank.BankAccountServiceLocator()).getBankAccount();
      if (bankAccount != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bankAccount)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bankAccount)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bankAccount != null)
      ((javax.xml.rpc.Stub)bankAccount)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public bank.BankAccount getBankAccount() {
    if (bankAccount == null)
      _initBankAccountProxy();
    return bankAccount;
  }
  
  public double convert(double amount, java.lang.String currencyIn, java.lang.String currencyOut) throws java.rmi.RemoteException{
    if (bankAccount == null)
      _initBankAccountProxy();
    return bankAccount.convert(amount, currencyIn, currencyOut);
  }
  
  public boolean pay(double amount, java.lang.String currencyName) throws java.rmi.RemoteException{
    if (bankAccount == null)
      _initBankAccountProxy();
    return bankAccount.pay(amount, currencyName);
  }
  
  public void credit(double amount, java.lang.String currencyName) throws java.rmi.RemoteException{
    if (bankAccount == null)
      _initBankAccountProxy();
    bankAccount.credit(amount, currencyName);
  }
  
  public double getBalance() throws java.rmi.RemoteException{
    if (bankAccount == null)
      _initBankAccountProxy();
    return bankAccount.getBalance();
  }
  
  
}