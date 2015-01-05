/**
 * AWSECommerceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class AWSECommerceServiceLocator extends org.apache.axis.client.Service implements com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceService {

    public AWSECommerceServiceLocator() {
    }


    public AWSECommerceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AWSECommerceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AWSECommerceServicePortFR
    private java.lang.String AWSECommerceServicePortFR_address = "https://webservices.amazon.fr/onca/soap?Service=AWSECommerceService";

    public java.lang.String getAWSECommerceServicePortFRAddress() {
        return AWSECommerceServicePortFR_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWSECommerceServicePortFRWSDDServiceName = "AWSECommerceServicePortFR";

    public java.lang.String getAWSECommerceServicePortFRWSDDServiceName() {
        return AWSECommerceServicePortFRWSDDServiceName;
    }

    public void setAWSECommerceServicePortFRWSDDServiceName(java.lang.String name) {
        AWSECommerceServicePortFRWSDDServiceName = name;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortFR() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWSECommerceServicePortFR_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWSECommerceServicePortFR(endpoint);
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortFR(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(portAddress, this);
            _stub.setPortName(getAWSECommerceServicePortFRWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWSECommerceServicePortFREndpointAddress(java.lang.String address) {
        AWSECommerceServicePortFR_address = address;
    }


    // Use to get a proxy class for AWSECommerceServicePortUK
    private java.lang.String AWSECommerceServicePortUK_address = "https://webservices.amazon.co.uk/onca/soap?Service=AWSECommerceService";

    public java.lang.String getAWSECommerceServicePortUKAddress() {
        return AWSECommerceServicePortUK_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWSECommerceServicePortUKWSDDServiceName = "AWSECommerceServicePortUK";

    public java.lang.String getAWSECommerceServicePortUKWSDDServiceName() {
        return AWSECommerceServicePortUKWSDDServiceName;
    }

    public void setAWSECommerceServicePortUKWSDDServiceName(java.lang.String name) {
        AWSECommerceServicePortUKWSDDServiceName = name;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortUK() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWSECommerceServicePortUK_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWSECommerceServicePortUK(endpoint);
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortUK(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(portAddress, this);
            _stub.setPortName(getAWSECommerceServicePortUKWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWSECommerceServicePortUKEndpointAddress(java.lang.String address) {
        AWSECommerceServicePortUK_address = address;
    }


    // Use to get a proxy class for AWSECommerceServicePortCA
    private java.lang.String AWSECommerceServicePortCA_address = "https://webservices.amazon.ca/onca/soap?Service=AWSECommerceService";

    public java.lang.String getAWSECommerceServicePortCAAddress() {
        return AWSECommerceServicePortCA_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWSECommerceServicePortCAWSDDServiceName = "AWSECommerceServicePortCA";

    public java.lang.String getAWSECommerceServicePortCAWSDDServiceName() {
        return AWSECommerceServicePortCAWSDDServiceName;
    }

    public void setAWSECommerceServicePortCAWSDDServiceName(java.lang.String name) {
        AWSECommerceServicePortCAWSDDServiceName = name;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortCA() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWSECommerceServicePortCA_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWSECommerceServicePortCA(endpoint);
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortCA(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(portAddress, this);
            _stub.setPortName(getAWSECommerceServicePortCAWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWSECommerceServicePortCAEndpointAddress(java.lang.String address) {
        AWSECommerceServicePortCA_address = address;
    }


    // Use to get a proxy class for AWSECommerceServicePort
    private java.lang.String AWSECommerceServicePort_address = "https://webservices.amazon.com/onca/soap?Service=AWSECommerceService";

    public java.lang.String getAWSECommerceServicePortAddress() {
        return AWSECommerceServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWSECommerceServicePortWSDDServiceName = "AWSECommerceServicePort";

    public java.lang.String getAWSECommerceServicePortWSDDServiceName() {
        return AWSECommerceServicePortWSDDServiceName;
    }

    public void setAWSECommerceServicePortWSDDServiceName(java.lang.String name) {
        AWSECommerceServicePortWSDDServiceName = name;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWSECommerceServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWSECommerceServicePort(endpoint);
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(portAddress, this);
            _stub.setPortName(getAWSECommerceServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWSECommerceServicePortEndpointAddress(java.lang.String address) {
        AWSECommerceServicePort_address = address;
    }


    // Use to get a proxy class for AWSECommerceServicePortIN
    private java.lang.String AWSECommerceServicePortIN_address = "https://webservices.amazon.in/onca/soap?Service=AWSECommerceService";

    public java.lang.String getAWSECommerceServicePortINAddress() {
        return AWSECommerceServicePortIN_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWSECommerceServicePortINWSDDServiceName = "AWSECommerceServicePortIN";

    public java.lang.String getAWSECommerceServicePortINWSDDServiceName() {
        return AWSECommerceServicePortINWSDDServiceName;
    }

    public void setAWSECommerceServicePortINWSDDServiceName(java.lang.String name) {
        AWSECommerceServicePortINWSDDServiceName = name;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortIN() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWSECommerceServicePortIN_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWSECommerceServicePortIN(endpoint);
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortIN(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(portAddress, this);
            _stub.setPortName(getAWSECommerceServicePortINWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWSECommerceServicePortINEndpointAddress(java.lang.String address) {
        AWSECommerceServicePortIN_address = address;
    }


    // Use to get a proxy class for AWSECommerceServicePortCN
    private java.lang.String AWSECommerceServicePortCN_address = "https://webservices.amazon.cn/onca/soap?Service=AWSECommerceService";

    public java.lang.String getAWSECommerceServicePortCNAddress() {
        return AWSECommerceServicePortCN_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWSECommerceServicePortCNWSDDServiceName = "AWSECommerceServicePortCN";

    public java.lang.String getAWSECommerceServicePortCNWSDDServiceName() {
        return AWSECommerceServicePortCNWSDDServiceName;
    }

    public void setAWSECommerceServicePortCNWSDDServiceName(java.lang.String name) {
        AWSECommerceServicePortCNWSDDServiceName = name;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortCN() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWSECommerceServicePortCN_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWSECommerceServicePortCN(endpoint);
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortCN(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(portAddress, this);
            _stub.setPortName(getAWSECommerceServicePortCNWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWSECommerceServicePortCNEndpointAddress(java.lang.String address) {
        AWSECommerceServicePortCN_address = address;
    }


    // Use to get a proxy class for AWSECommerceServicePortJP
    private java.lang.String AWSECommerceServicePortJP_address = "https://webservices.amazon.co.jp/onca/soap?Service=AWSECommerceService";

    public java.lang.String getAWSECommerceServicePortJPAddress() {
        return AWSECommerceServicePortJP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWSECommerceServicePortJPWSDDServiceName = "AWSECommerceServicePortJP";

    public java.lang.String getAWSECommerceServicePortJPWSDDServiceName() {
        return AWSECommerceServicePortJPWSDDServiceName;
    }

    public void setAWSECommerceServicePortJPWSDDServiceName(java.lang.String name) {
        AWSECommerceServicePortJPWSDDServiceName = name;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortJP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWSECommerceServicePortJP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWSECommerceServicePortJP(endpoint);
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortJP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(portAddress, this);
            _stub.setPortName(getAWSECommerceServicePortJPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWSECommerceServicePortJPEndpointAddress(java.lang.String address) {
        AWSECommerceServicePortJP_address = address;
    }


    // Use to get a proxy class for AWSECommerceServicePortUS
    private java.lang.String AWSECommerceServicePortUS_address = "https://webservices.amazon.com/onca/soap?Service=AWSECommerceService";

    public java.lang.String getAWSECommerceServicePortUSAddress() {
        return AWSECommerceServicePortUS_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWSECommerceServicePortUSWSDDServiceName = "AWSECommerceServicePortUS";

    public java.lang.String getAWSECommerceServicePortUSWSDDServiceName() {
        return AWSECommerceServicePortUSWSDDServiceName;
    }

    public void setAWSECommerceServicePortUSWSDDServiceName(java.lang.String name) {
        AWSECommerceServicePortUSWSDDServiceName = name;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortUS() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWSECommerceServicePortUS_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWSECommerceServicePortUS(endpoint);
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortUS(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(portAddress, this);
            _stub.setPortName(getAWSECommerceServicePortUSWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWSECommerceServicePortUSEndpointAddress(java.lang.String address) {
        AWSECommerceServicePortUS_address = address;
    }


    // Use to get a proxy class for AWSECommerceServicePortIT
    private java.lang.String AWSECommerceServicePortIT_address = "https://webservices.amazon.it/onca/soap?Service=AWSECommerceService";

    public java.lang.String getAWSECommerceServicePortITAddress() {
        return AWSECommerceServicePortIT_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWSECommerceServicePortITWSDDServiceName = "AWSECommerceServicePortIT";

    public java.lang.String getAWSECommerceServicePortITWSDDServiceName() {
        return AWSECommerceServicePortITWSDDServiceName;
    }

    public void setAWSECommerceServicePortITWSDDServiceName(java.lang.String name) {
        AWSECommerceServicePortITWSDDServiceName = name;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortIT() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWSECommerceServicePortIT_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWSECommerceServicePortIT(endpoint);
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortIT(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(portAddress, this);
            _stub.setPortName(getAWSECommerceServicePortITWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWSECommerceServicePortITEndpointAddress(java.lang.String address) {
        AWSECommerceServicePortIT_address = address;
    }


    // Use to get a proxy class for AWSECommerceServicePortES
    private java.lang.String AWSECommerceServicePortES_address = "https://webservices.amazon.es/onca/soap?Service=AWSECommerceService";

    public java.lang.String getAWSECommerceServicePortESAddress() {
        return AWSECommerceServicePortES_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWSECommerceServicePortESWSDDServiceName = "AWSECommerceServicePortES";

    public java.lang.String getAWSECommerceServicePortESWSDDServiceName() {
        return AWSECommerceServicePortESWSDDServiceName;
    }

    public void setAWSECommerceServicePortESWSDDServiceName(java.lang.String name) {
        AWSECommerceServicePortESWSDDServiceName = name;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortES() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWSECommerceServicePortES_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWSECommerceServicePortES(endpoint);
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortES(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(portAddress, this);
            _stub.setPortName(getAWSECommerceServicePortESWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWSECommerceServicePortESEndpointAddress(java.lang.String address) {
        AWSECommerceServicePortES_address = address;
    }


    // Use to get a proxy class for AWSECommerceServicePortDE
    private java.lang.String AWSECommerceServicePortDE_address = "https://webservices.amazon.de/onca/soap?Service=AWSECommerceService";

    public java.lang.String getAWSECommerceServicePortDEAddress() {
        return AWSECommerceServicePortDE_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWSECommerceServicePortDEWSDDServiceName = "AWSECommerceServicePortDE";

    public java.lang.String getAWSECommerceServicePortDEWSDDServiceName() {
        return AWSECommerceServicePortDEWSDDServiceName;
    }

    public void setAWSECommerceServicePortDEWSDDServiceName(java.lang.String name) {
        AWSECommerceServicePortDEWSDDServiceName = name;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortDE() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWSECommerceServicePortDE_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWSECommerceServicePortDE(endpoint);
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType getAWSECommerceServicePortDE(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(portAddress, this);
            _stub.setPortName(getAWSECommerceServicePortDEWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWSECommerceServicePortDEEndpointAddress(java.lang.String address) {
        AWSECommerceServicePortDE_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(new java.net.URL(AWSECommerceServicePortFR_address), this);
                _stub.setPortName(getAWSECommerceServicePortFRWSDDServiceName());
                return _stub;
            }
            if (com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(new java.net.URL(AWSECommerceServicePortUK_address), this);
                _stub.setPortName(getAWSECommerceServicePortUKWSDDServiceName());
                return _stub;
            }
            if (com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(new java.net.URL(AWSECommerceServicePortCA_address), this);
                _stub.setPortName(getAWSECommerceServicePortCAWSDDServiceName());
                return _stub;
            }
            if (com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(new java.net.URL(AWSECommerceServicePort_address), this);
                _stub.setPortName(getAWSECommerceServicePortWSDDServiceName());
                return _stub;
            }
            if (com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(new java.net.URL(AWSECommerceServicePortIN_address), this);
                _stub.setPortName(getAWSECommerceServicePortINWSDDServiceName());
                return _stub;
            }
            if (com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(new java.net.URL(AWSECommerceServicePortCN_address), this);
                _stub.setPortName(getAWSECommerceServicePortCNWSDDServiceName());
                return _stub;
            }
            if (com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(new java.net.URL(AWSECommerceServicePortJP_address), this);
                _stub.setPortName(getAWSECommerceServicePortJPWSDDServiceName());
                return _stub;
            }
            if (com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(new java.net.URL(AWSECommerceServicePortUS_address), this);
                _stub.setPortName(getAWSECommerceServicePortUSWSDDServiceName());
                return _stub;
            }
            if (com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(new java.net.URL(AWSECommerceServicePortIT_address), this);
                _stub.setPortName(getAWSECommerceServicePortITWSDDServiceName());
                return _stub;
            }
            if (com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(new java.net.URL(AWSECommerceServicePortES_address), this);
                _stub.setPortName(getAWSECommerceServicePortESWSDDServiceName());
                return _stub;
            }
            if (com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub _stub = new com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceBindingStub(new java.net.URL(AWSECommerceServicePortDE_address), this);
                _stub.setPortName(getAWSECommerceServicePortDEWSDDServiceName());
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
        if ("AWSECommerceServicePortFR".equals(inputPortName)) {
            return getAWSECommerceServicePortFR();
        }
        else if ("AWSECommerceServicePortUK".equals(inputPortName)) {
            return getAWSECommerceServicePortUK();
        }
        else if ("AWSECommerceServicePortCA".equals(inputPortName)) {
            return getAWSECommerceServicePortCA();
        }
        else if ("AWSECommerceServicePort".equals(inputPortName)) {
            return getAWSECommerceServicePort();
        }
        else if ("AWSECommerceServicePortIN".equals(inputPortName)) {
            return getAWSECommerceServicePortIN();
        }
        else if ("AWSECommerceServicePortCN".equals(inputPortName)) {
            return getAWSECommerceServicePortCN();
        }
        else if ("AWSECommerceServicePortJP".equals(inputPortName)) {
            return getAWSECommerceServicePortJP();
        }
        else if ("AWSECommerceServicePortUS".equals(inputPortName)) {
            return getAWSECommerceServicePortUS();
        }
        else if ("AWSECommerceServicePortIT".equals(inputPortName)) {
            return getAWSECommerceServicePortIT();
        }
        else if ("AWSECommerceServicePortES".equals(inputPortName)) {
            return getAWSECommerceServicePortES();
        }
        else if ("AWSECommerceServicePortDE".equals(inputPortName)) {
            return getAWSECommerceServicePortDE();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSECommerceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSECommerceServicePortFR"));
            ports.add(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSECommerceServicePortUK"));
            ports.add(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSECommerceServicePortCA"));
            ports.add(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSECommerceServicePort"));
            ports.add(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSECommerceServicePortIN"));
            ports.add(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSECommerceServicePortCN"));
            ports.add(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSECommerceServicePortJP"));
            ports.add(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSECommerceServicePortUS"));
            ports.add(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSECommerceServicePortIT"));
            ports.add(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSECommerceServicePortES"));
            ports.add(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSECommerceServicePortDE"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AWSECommerceServicePortFR".equals(portName)) {
            setAWSECommerceServicePortFREndpointAddress(address);
        }
        else 
if ("AWSECommerceServicePortUK".equals(portName)) {
            setAWSECommerceServicePortUKEndpointAddress(address);
        }
        else 
if ("AWSECommerceServicePortCA".equals(portName)) {
            setAWSECommerceServicePortCAEndpointAddress(address);
        }
        else 
if ("AWSECommerceServicePort".equals(portName)) {
            setAWSECommerceServicePortEndpointAddress(address);
        }
        else 
if ("AWSECommerceServicePortIN".equals(portName)) {
            setAWSECommerceServicePortINEndpointAddress(address);
        }
        else 
if ("AWSECommerceServicePortCN".equals(portName)) {
            setAWSECommerceServicePortCNEndpointAddress(address);
        }
        else 
if ("AWSECommerceServicePortJP".equals(portName)) {
            setAWSECommerceServicePortJPEndpointAddress(address);
        }
        else 
if ("AWSECommerceServicePortUS".equals(portName)) {
            setAWSECommerceServicePortUSEndpointAddress(address);
        }
        else 
if ("AWSECommerceServicePortIT".equals(portName)) {
            setAWSECommerceServicePortITEndpointAddress(address);
        }
        else 
if ("AWSECommerceServicePortES".equals(portName)) {
            setAWSECommerceServicePortESEndpointAddress(address);
        }
        else 
if ("AWSECommerceServicePortDE".equals(portName)) {
            setAWSECommerceServicePortDEEndpointAddress(address);
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
