/**
 * Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class Request  implements java.io.Serializable {
    private java.lang.String isValid;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodeLookupRequest browseNodeLookupRequest;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequest itemSearchRequest;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequest itemLookupRequest;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarityLookupRequest similarityLookupRequest;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.CartGetRequest cartGetRequest;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.CartAddRequest cartAddRequest;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequest cartCreateRequest;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.CartModifyRequest cartModifyRequest;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.CartClearRequest cartClearRequest;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.ErrorsError[] errors;

    public Request() {
    }

    public Request(
           java.lang.String isValid,
           com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodeLookupRequest browseNodeLookupRequest,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequest itemSearchRequest,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequest itemLookupRequest,
           com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarityLookupRequest similarityLookupRequest,
           com.amazon.webservices.AWSECommerceService._2011_08_01.CartGetRequest cartGetRequest,
           com.amazon.webservices.AWSECommerceService._2011_08_01.CartAddRequest cartAddRequest,
           com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequest cartCreateRequest,
           com.amazon.webservices.AWSECommerceService._2011_08_01.CartModifyRequest cartModifyRequest,
           com.amazon.webservices.AWSECommerceService._2011_08_01.CartClearRequest cartClearRequest,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ErrorsError[] errors) {
           this.isValid = isValid;
           this.browseNodeLookupRequest = browseNodeLookupRequest;
           this.itemSearchRequest = itemSearchRequest;
           this.itemLookupRequest = itemLookupRequest;
           this.similarityLookupRequest = similarityLookupRequest;
           this.cartGetRequest = cartGetRequest;
           this.cartAddRequest = cartAddRequest;
           this.cartCreateRequest = cartCreateRequest;
           this.cartModifyRequest = cartModifyRequest;
           this.cartClearRequest = cartClearRequest;
           this.errors = errors;
    }


    /**
     * Gets the isValid value for this Request.
     * 
     * @return isValid
     */
    public java.lang.String getIsValid() {
        return isValid;
    }


    /**
     * Sets the isValid value for this Request.
     * 
     * @param isValid
     */
    public void setIsValid(java.lang.String isValid) {
        this.isValid = isValid;
    }


    /**
     * Gets the browseNodeLookupRequest value for this Request.
     * 
     * @return browseNodeLookupRequest
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodeLookupRequest getBrowseNodeLookupRequest() {
        return browseNodeLookupRequest;
    }


    /**
     * Sets the browseNodeLookupRequest value for this Request.
     * 
     * @param browseNodeLookupRequest
     */
    public void setBrowseNodeLookupRequest(com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodeLookupRequest browseNodeLookupRequest) {
        this.browseNodeLookupRequest = browseNodeLookupRequest;
    }


    /**
     * Gets the itemSearchRequest value for this Request.
     * 
     * @return itemSearchRequest
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequest getItemSearchRequest() {
        return itemSearchRequest;
    }


    /**
     * Sets the itemSearchRequest value for this Request.
     * 
     * @param itemSearchRequest
     */
    public void setItemSearchRequest(com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequest itemSearchRequest) {
        this.itemSearchRequest = itemSearchRequest;
    }


    /**
     * Gets the itemLookupRequest value for this Request.
     * 
     * @return itemLookupRequest
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequest getItemLookupRequest() {
        return itemLookupRequest;
    }


    /**
     * Sets the itemLookupRequest value for this Request.
     * 
     * @param itemLookupRequest
     */
    public void setItemLookupRequest(com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequest itemLookupRequest) {
        this.itemLookupRequest = itemLookupRequest;
    }


    /**
     * Gets the similarityLookupRequest value for this Request.
     * 
     * @return similarityLookupRequest
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarityLookupRequest getSimilarityLookupRequest() {
        return similarityLookupRequest;
    }


    /**
     * Sets the similarityLookupRequest value for this Request.
     * 
     * @param similarityLookupRequest
     */
    public void setSimilarityLookupRequest(com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarityLookupRequest similarityLookupRequest) {
        this.similarityLookupRequest = similarityLookupRequest;
    }


    /**
     * Gets the cartGetRequest value for this Request.
     * 
     * @return cartGetRequest
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.CartGetRequest getCartGetRequest() {
        return cartGetRequest;
    }


    /**
     * Sets the cartGetRequest value for this Request.
     * 
     * @param cartGetRequest
     */
    public void setCartGetRequest(com.amazon.webservices.AWSECommerceService._2011_08_01.CartGetRequest cartGetRequest) {
        this.cartGetRequest = cartGetRequest;
    }


    /**
     * Gets the cartAddRequest value for this Request.
     * 
     * @return cartAddRequest
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.CartAddRequest getCartAddRequest() {
        return cartAddRequest;
    }


    /**
     * Sets the cartAddRequest value for this Request.
     * 
     * @param cartAddRequest
     */
    public void setCartAddRequest(com.amazon.webservices.AWSECommerceService._2011_08_01.CartAddRequest cartAddRequest) {
        this.cartAddRequest = cartAddRequest;
    }


    /**
     * Gets the cartCreateRequest value for this Request.
     * 
     * @return cartCreateRequest
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequest getCartCreateRequest() {
        return cartCreateRequest;
    }


    /**
     * Sets the cartCreateRequest value for this Request.
     * 
     * @param cartCreateRequest
     */
    public void setCartCreateRequest(com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequest cartCreateRequest) {
        this.cartCreateRequest = cartCreateRequest;
    }


    /**
     * Gets the cartModifyRequest value for this Request.
     * 
     * @return cartModifyRequest
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.CartModifyRequest getCartModifyRequest() {
        return cartModifyRequest;
    }


    /**
     * Sets the cartModifyRequest value for this Request.
     * 
     * @param cartModifyRequest
     */
    public void setCartModifyRequest(com.amazon.webservices.AWSECommerceService._2011_08_01.CartModifyRequest cartModifyRequest) {
        this.cartModifyRequest = cartModifyRequest;
    }


    /**
     * Gets the cartClearRequest value for this Request.
     * 
     * @return cartClearRequest
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.CartClearRequest getCartClearRequest() {
        return cartClearRequest;
    }


    /**
     * Sets the cartClearRequest value for this Request.
     * 
     * @param cartClearRequest
     */
    public void setCartClearRequest(com.amazon.webservices.AWSECommerceService._2011_08_01.CartClearRequest cartClearRequest) {
        this.cartClearRequest = cartClearRequest;
    }


    /**
     * Gets the errors value for this Request.
     * 
     * @return errors
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.ErrorsError[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this Request.
     * 
     * @param errors
     */
    public void setErrors(com.amazon.webservices.AWSECommerceService._2011_08_01.ErrorsError[] errors) {
        this.errors = errors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Request)) return false;
        Request other = (Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isValid==null && other.getIsValid()==null) || 
             (this.isValid!=null &&
              this.isValid.equals(other.getIsValid()))) &&
            ((this.browseNodeLookupRequest==null && other.getBrowseNodeLookupRequest()==null) || 
             (this.browseNodeLookupRequest!=null &&
              this.browseNodeLookupRequest.equals(other.getBrowseNodeLookupRequest()))) &&
            ((this.itemSearchRequest==null && other.getItemSearchRequest()==null) || 
             (this.itemSearchRequest!=null &&
              this.itemSearchRequest.equals(other.getItemSearchRequest()))) &&
            ((this.itemLookupRequest==null && other.getItemLookupRequest()==null) || 
             (this.itemLookupRequest!=null &&
              this.itemLookupRequest.equals(other.getItemLookupRequest()))) &&
            ((this.similarityLookupRequest==null && other.getSimilarityLookupRequest()==null) || 
             (this.similarityLookupRequest!=null &&
              this.similarityLookupRequest.equals(other.getSimilarityLookupRequest()))) &&
            ((this.cartGetRequest==null && other.getCartGetRequest()==null) || 
             (this.cartGetRequest!=null &&
              this.cartGetRequest.equals(other.getCartGetRequest()))) &&
            ((this.cartAddRequest==null && other.getCartAddRequest()==null) || 
             (this.cartAddRequest!=null &&
              this.cartAddRequest.equals(other.getCartAddRequest()))) &&
            ((this.cartCreateRequest==null && other.getCartCreateRequest()==null) || 
             (this.cartCreateRequest!=null &&
              this.cartCreateRequest.equals(other.getCartCreateRequest()))) &&
            ((this.cartModifyRequest==null && other.getCartModifyRequest()==null) || 
             (this.cartModifyRequest!=null &&
              this.cartModifyRequest.equals(other.getCartModifyRequest()))) &&
            ((this.cartClearRequest==null && other.getCartClearRequest()==null) || 
             (this.cartClearRequest!=null &&
              this.cartClearRequest.equals(other.getCartClearRequest()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIsValid() != null) {
            _hashCode += getIsValid().hashCode();
        }
        if (getBrowseNodeLookupRequest() != null) {
            _hashCode += getBrowseNodeLookupRequest().hashCode();
        }
        if (getItemSearchRequest() != null) {
            _hashCode += getItemSearchRequest().hashCode();
        }
        if (getItemLookupRequest() != null) {
            _hashCode += getItemLookupRequest().hashCode();
        }
        if (getSimilarityLookupRequest() != null) {
            _hashCode += getSimilarityLookupRequest().hashCode();
        }
        if (getCartGetRequest() != null) {
            _hashCode += getCartGetRequest().hashCode();
        }
        if (getCartAddRequest() != null) {
            _hashCode += getCartAddRequest().hashCode();
        }
        if (getCartCreateRequest() != null) {
            _hashCode += getCartCreateRequest().hashCode();
        }
        if (getCartModifyRequest() != null) {
            _hashCode += getCartModifyRequest().hashCode();
        }
        if (getCartClearRequest() != null) {
            _hashCode += getCartClearRequest().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isValid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "IsValid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browseNodeLookupRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNodeLookupRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNodeLookupRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSearchRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemSearchRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemSearchRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemLookupRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemLookupRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemLookupRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similarityLookupRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SimilarityLookupRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SimilarityLookupRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartGetRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartGetRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartGetRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartAddRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartAddRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartAddRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartCreateRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartCreateRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartCreateRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartModifyRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartModifyRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartModifyRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartClearRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartClearRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartClearRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Errors"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
