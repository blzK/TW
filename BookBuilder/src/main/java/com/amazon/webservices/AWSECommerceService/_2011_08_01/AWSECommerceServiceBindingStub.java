/**
 * AWSECommerceServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class AWSECommerceServiceBindingStub extends org.apache.axis.client.Stub implements com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ItemSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MarketplaceDomain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSAccessKeyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AssociateTag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "XMLEscaping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Validate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Shared"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemSearchRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemSearchRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OperationRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Items"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Items"), com.amazon.webservices.AWSECommerceService._2011_08_01.Items[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ItemLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MarketplaceDomain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSAccessKeyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AssociateTag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Validate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "XMLEscaping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Shared"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemLookupRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemLookupRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OperationRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Items"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Items"), com.amazon.webservices.AWSECommerceService._2011_08_01.Items[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BrowseNodeLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MarketplaceDomain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSAccessKeyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AssociateTag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Validate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "XMLEscaping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Shared"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNodeLookupRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodeLookupRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNodeLookupRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodeLookupRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OperationRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNodes"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNodes"), com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodes[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SimilarityLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MarketplaceDomain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSAccessKeyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AssociateTag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Validate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "XMLEscaping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Shared"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SimilarityLookupRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarityLookupRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SimilarityLookupRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarityLookupRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OperationRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Items"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Items"), com.amazon.webservices.AWSECommerceService._2011_08_01.Items[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CartGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MarketplaceDomain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSAccessKeyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AssociateTag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Validate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "XMLEscaping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Shared"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartGetRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.CartGetRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartGetRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.CartGetRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OperationRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"), com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CartCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MarketplaceDomain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSAccessKeyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AssociateTag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Validate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "XMLEscaping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Shared"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartCreateRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartCreateRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OperationRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"), com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CartAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MarketplaceDomain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSAccessKeyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AssociateTag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Validate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "XMLEscaping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Shared"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartAddRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.CartAddRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartAddRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.CartAddRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OperationRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"), com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CartModify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MarketplaceDomain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSAccessKeyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AssociateTag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Validate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "XMLEscaping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Shared"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartModifyRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.CartModifyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartModifyRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.CartModifyRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OperationRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"), com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CartClear");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MarketplaceDomain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AWSAccessKeyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AssociateTag"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Validate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "XMLEscaping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Shared"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartClearRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.CartClearRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartClearRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.CartClearRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OperationRequest"), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"), com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

    }

    public AWSECommerceServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AWSECommerceServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AWSECommerceServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>CartCreateRequest>Items>Item>MetaData");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequestItemsItemMetaData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>CartModifyRequest>Items>Item>Action");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartModifyRequestItemsItemAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>Collections>Collection>CollectionItem");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>Collections>Collection>CollectionParent");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionParent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>Collections>Collection>CollectionSummary");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>Item>AlternateVersions>AlternateVersion");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAlternateVersionsAlternateVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>ItemAttributes>Languages>Language");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesLanguagesLanguage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>Tracks>Disc>Track");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.TracksDiscTrack.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Accessories>Accessory");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.AccessoriesAccessory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Arguments>Argument");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ArgumentsArgument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Bin>BinParameter");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.BinBinParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>BrowseNode>Ancestors");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>BrowseNode>Children");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>BrowseNode>Properties");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Property[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Property");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>CartAddRequest>Items>Item");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartAddRequestItemsItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>CartCreateRequest>Items>Item");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequestItemsItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>CartItem>MetaData>KeyValuePair");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartItemMetaDataKeyValuePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>CartModifyRequest>Items>Item");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartModifyRequestItemsItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Collections>Collection");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Errors>Error");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ErrorsError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>HTTPHeaders>Header");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.HTTPHeadersHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Item>AlternateVersions");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAlternateVersionsAlternateVersion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>Item>AlternateVersions>AlternateVersion");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AlternateVersion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Item>ImageSets");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ImageSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ImageSet");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Item>Subjects");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Subject");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Item>VariationAttributes");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.VariationAttribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "VariationAttribute");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>ItemAttributes>CatalogNumberList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CatalogNumberListElement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>ItemAttributes>Creator");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesCreator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>ItemAttributes>EANList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "EANListElement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>ItemAttributes>ItemDimensions");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesItemDimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>ItemAttributes>Languages");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesLanguagesLanguage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>ItemAttributes>Languages>Language");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Language");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>ItemAttributes>PackageDimensions");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesPackageDimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>ItemAttributes>UPCList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "UPCListElement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>NewReleases>NewRelease");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.NewReleasesNewRelease.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>OfferListing>AvailabilityAttributes");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.OfferListingAvailabilityAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>OtherCategoriesSimilarProducts>OtherCategoriesSimilarProduct");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.OtherCategoriesSimilarProductsOtherCategoriesSimilarProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Promotion>Summary");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.PromotionSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>RelatedItems>Relationship");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItemsRelationship.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>SearchResultsMap>SearchIndex");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.SearchResultsMapSearchIndex.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>SimilarProducts>SimilarProduct");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarProductsSimilarProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>SimilarViewedProducts>SimilarViewedProduct");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarViewedProductsSimilarViewedProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>TopItemSet>TopItem");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.TopItemSetTopItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>TopSellers>TopSeller");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.TopSellersTopSeller.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Tracks>Disc");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.TracksDiscTrack[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>Tracks>Disc>Track");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Track");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Accessories");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.AccessoriesAccessory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Accessories>Accessory");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Accessory");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Arguments");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ArgumentsArgument[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Arguments>Argument");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Argument");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">AudienceRating");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.AudienceRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Bin");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Bin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">BrowseNode");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">BrowseNodes");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Cart");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Cart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">CartAddRequest>Items");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartAddRequestItemsItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>CartAddRequest>Items>Item");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">CartCreateRequest>Items");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequestItemsItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>CartCreateRequest>Items>Item");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">CartItem>MetaData");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartItemMetaDataKeyValuePair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>CartItem>MetaData>KeyValuePair");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "KeyValuePair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">CartItems");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">CartModifyRequest>Items");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartModifyRequestItemsItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>CartModifyRequest>Items>Item");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Collections");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollection[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Collections>Collection");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Collection");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Condition");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Condition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">CorrectedQuery");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CorrectedQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">CustomerReviews");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CustomerReviews.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">EditorialReview");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.EditorialReview.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">EditorialReviews");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.EditorialReview[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "EditorialReview");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Errors");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ErrorsError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Errors>Error");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Error");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">HTTPHeaders");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.HTTPHeadersHeader[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>HTTPHeaders>Header");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Header");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">ImageSet");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ImageSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Item");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">ItemAttributes");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">ItemLink");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">ItemLinks");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLink[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemLink");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">ItemLookupRequest>IdType");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequestIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Items");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Items.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">ItemSearchRequest>Availability");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequestAvailability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">LoyaltyPoints");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.LoyaltyPoints.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Merchant");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Merchant.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">NewReleases");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.NewReleasesNewRelease[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>NewReleases>NewRelease");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "NewRelease");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Offer");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Offer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OfferAttributes");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.OfferAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OfferListing");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.OfferListing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Offers");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Offers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OfferSummary");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.OfferSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OperationRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OtherCategoriesSimilarProducts");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.OtherCategoriesSimilarProductsOtherCategoriesSimilarProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>OtherCategoriesSimilarProducts>OtherCategoriesSimilarProduct");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OtherCategoriesSimilarProduct");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Promotion");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Promotion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Promotions");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Promotion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Promotion");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Property");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Property.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">RelatedItem");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">RelatedItems");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Request");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">SavedForLaterItems");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.SavedForLaterItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">SearchBinSet");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Bin[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Bin");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">SearchBinSets");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Bin[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SearchBinSet");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">SearchResultsMap");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.SearchResultsMapSearchIndex[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>SearchResultsMap>SearchIndex");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SearchIndex");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">SimilarityLookupRequest>SimilarityType");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarityLookupRequestSimilarityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">SimilarProducts");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarProductsSimilarProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>SimilarProducts>SimilarProduct");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SimilarProduct");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">SimilarViewedProducts");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarViewedProductsSimilarViewedProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>SimilarViewedProducts>SimilarViewedProduct");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SimilarViewedProduct");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">TopItemSet");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.TopItemSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">TopSellers");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.TopSellersTopSeller[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>TopSellers>TopSeller");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TopSeller");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Tracks");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.TracksDiscTrack[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Tracks>Disc");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Disc");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">VariationAttribute");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.VariationAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">VariationDimensions");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "VariationDimension");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Variations");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Variations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">VariationSummary");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.VariationSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNodeLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodeLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartAddRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartAddRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartClearRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartClearRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartCreateRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartGetRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartGetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartItem");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartModifyRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.CartModifyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "DecimalWithUnits");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Image");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Image.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemSearchRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "NonNegativeIntegerWithUnits");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.NonNegativeIntegerWithUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "positiveIntegerOrAll");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.Price.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SimilarityLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarityLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void itemSearch(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String XMLEscaping, java.lang.String validate, com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequest shared, com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.ItemsArrayHolder items) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com/ItemSearch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {marketplaceDomain, AWSAccessKeyId, associateTag, XMLEscaping, validate, shared, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"));
            } catch (java.lang.Exception _exception) {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest")), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class);
            }
            try {
                items.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Items[]) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Items"));
            } catch (java.lang.Exception _exception) {
                items.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Items[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Items")), com.amazon.webservices.AWSECommerceService._2011_08_01.Items[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void itemLookup(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequest shared, com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.ItemsArrayHolder items) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com/ItemLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"));
            } catch (java.lang.Exception _exception) {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest")), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class);
            }
            try {
                items.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Items[]) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Items"));
            } catch (java.lang.Exception _exception) {
                items.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Items[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Items")), com.amazon.webservices.AWSECommerceService._2011_08_01.Items[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void browseNodeLookup(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodeLookupRequest shared, com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodeLookupRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.BrowseNodesArrayHolder browseNodes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com/BrowseNodeLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNodeLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"));
            } catch (java.lang.Exception _exception) {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest")), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class);
            }
            try {
                browseNodes.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodes[]) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNodes"));
            } catch (java.lang.Exception _exception) {
                browseNodes.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodes[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNodes")), com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodes[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void similarityLookup(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarityLookupRequest shared, com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarityLookupRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.ItemsArrayHolder items) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com/SimilarityLookup");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SimilarityLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"));
            } catch (java.lang.Exception _exception) {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest")), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class);
            }
            try {
                items.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Items[]) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Items"));
            } catch (java.lang.Exception _exception) {
                items.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Items[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Items")), com.amazon.webservices.AWSECommerceService._2011_08_01.Items[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void cartGet(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService._2011_08_01.CartGetRequest shared, com.amazon.webservices.AWSECommerceService._2011_08_01.CartGetRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.CartArrayHolder cart) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com/CartGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"));
            } catch (java.lang.Exception _exception) {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest")), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class);
            }
            try {
                cart.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[]) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"));
            } catch (java.lang.Exception _exception) {
                cart.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart")), com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void cartCreate(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequest shared, com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.CartArrayHolder cart) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com/CartCreate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"));
            } catch (java.lang.Exception _exception) {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest")), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class);
            }
            try {
                cart.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[]) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"));
            } catch (java.lang.Exception _exception) {
                cart.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart")), com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void cartAdd(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService._2011_08_01.CartAddRequest shared, com.amazon.webservices.AWSECommerceService._2011_08_01.CartAddRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.CartArrayHolder cart) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com/CartAdd");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"));
            } catch (java.lang.Exception _exception) {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest")), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class);
            }
            try {
                cart.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[]) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"));
            } catch (java.lang.Exception _exception) {
                cart.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart")), com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void cartModify(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService._2011_08_01.CartModifyRequest shared, com.amazon.webservices.AWSECommerceService._2011_08_01.CartModifyRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.CartArrayHolder cart) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com/CartModify");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartModify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"));
            } catch (java.lang.Exception _exception) {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest")), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class);
            }
            try {
                cart.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[]) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"));
            } catch (java.lang.Exception _exception) {
                cart.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart")), com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void cartClear(java.lang.String marketplaceDomain, java.lang.String AWSAccessKeyId, java.lang.String associateTag, java.lang.String validate, java.lang.String XMLEscaping, com.amazon.webservices.AWSECommerceService._2011_08_01.CartClearRequest shared, com.amazon.webservices.AWSECommerceService._2011_08_01.CartClearRequest[] request, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder operationRequest, com.amazon.webservices.AWSECommerceService._2011_08_01.holders.CartArrayHolder cart) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com/CartClear");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartClear"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest"));
            } catch (java.lang.Exception _exception) {
                operationRequest.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperationRequest")), com.amazon.webservices.AWSECommerceService._2011_08_01.OperationRequest.class);
            }
            try {
                cart.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[]) _output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart"));
            } catch (java.lang.Exception _exception) {
                cart.value = (com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Cart")), com.amazon.webservices.AWSECommerceService._2011_08_01.Cart[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
