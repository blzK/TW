/**
 * BankAccountServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bank;

public class BankAccountServiceLocator extends org.apache.axis.client.Service implements bank.BankAccountService {

    public BankAccountServiceLocator() {
    }


    public BankAccountServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BankAccountServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BankAccount
    private java.lang.String BankAccount_address = "http://localhost:7080/BankService/services/BankAccount";

    public java.lang.String getBankAccountAddress() {
        return BankAccount_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BankAccountWSDDServiceName = "BankAccount";

    public java.lang.String getBankAccountWSDDServiceName() {
        return BankAccountWSDDServiceName;
    }

    public void setBankAccountWSDDServiceName(java.lang.String name) {
        BankAccountWSDDServiceName = name;
    }

    public bank.BankAccount getBankAccount() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BankAccount_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBankAccount(endpoint);
    }

    public bank.BankAccount getBankAccount(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            bank.BankAccountSoapBindingStub _stub = new bank.BankAccountSoapBindingStub(portAddress, this);
            _stub.setPortName(getBankAccountWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBankAccountEndpointAddress(java.lang.String address) {
        BankAccount_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (bank.BankAccount.class.isAssignableFrom(serviceEndpointInterface)) {
                bank.BankAccountSoapBindingStub _stub = new bank.BankAccountSoapBindingStub(new java.net.URL(BankAccount_address), this);
                _stub.setPortName(getBankAccountWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BankAccount".equals(inputPortName)) {
            return getBankAccount();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://bank", "BankAccountService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://bank", "BankAccount"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BankAccount".equals(portName)) {
            setBankAccountEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
