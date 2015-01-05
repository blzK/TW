/**
 * SimilarityLookupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class SimilarityLookupRequest  implements java.io.Serializable {
    private com.amazon.webservices.AWSECommerceService._2011_08_01.Condition condition;

    private java.lang.String[] itemId;

    private java.lang.String merchantId;

    private java.lang.String[] responseGroup;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarityLookupRequestSimilarityType similarityType;

    public SimilarityLookupRequest() {
    }

    public SimilarityLookupRequest(
           com.amazon.webservices.AWSECommerceService._2011_08_01.Condition condition,
           java.lang.String[] itemId,
           java.lang.String merchantId,
           java.lang.String[] responseGroup,
           com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarityLookupRequestSimilarityType similarityType) {
           this.condition = condition;
           this.itemId = itemId;
           this.merchantId = merchantId;
           this.responseGroup = responseGroup;
           this.similarityType = similarityType;
    }


    /**
     * Gets the condition value for this SimilarityLookupRequest.
     * 
     * @return condition
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Condition getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this SimilarityLookupRequest.
     * 
     * @param condition
     */
    public void setCondition(com.amazon.webservices.AWSECommerceService._2011_08_01.Condition condition) {
        this.condition = condition;
    }


    /**
     * Gets the itemId value for this SimilarityLookupRequest.
     * 
     * @return itemId
     */
    public java.lang.String[] getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this SimilarityLookupRequest.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.String[] itemId) {
        this.itemId = itemId;
    }

    public java.lang.String getItemId(int i) {
        return this.itemId[i];
    }

    public void setItemId(int i, java.lang.String _value) {
        this.itemId[i] = _value;
    }


    /**
     * Gets the merchantId value for this SimilarityLookupRequest.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this SimilarityLookupRequest.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the responseGroup value for this SimilarityLookupRequest.
     * 
     * @return responseGroup
     */
    public java.lang.String[] getResponseGroup() {
        return responseGroup;
    }


    /**
     * Sets the responseGroup value for this SimilarityLookupRequest.
     * 
     * @param responseGroup
     */
    public void setResponseGroup(java.lang.String[] responseGroup) {
        this.responseGroup = responseGroup;
    }

    public java.lang.String getResponseGroup(int i) {
        return this.responseGroup[i];
    }

    public void setResponseGroup(int i, java.lang.String _value) {
        this.responseGroup[i] = _value;
    }


    /**
     * Gets the similarityType value for this SimilarityLookupRequest.
     * 
     * @return similarityType
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarityLookupRequestSimilarityType getSimilarityType() {
        return similarityType;
    }


    /**
     * Sets the similarityType value for this SimilarityLookupRequest.
     * 
     * @param similarityType
     */
    public void setSimilarityType(com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarityLookupRequestSimilarityType similarityType) {
        this.similarityType = similarityType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimilarityLookupRequest)) return false;
        SimilarityLookupRequest other = (SimilarityLookupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              java.util.Arrays.equals(this.itemId, other.getItemId()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.responseGroup==null && other.getResponseGroup()==null) || 
             (this.responseGroup!=null &&
              java.util.Arrays.equals(this.responseGroup, other.getResponseGroup()))) &&
            ((this.similarityType==null && other.getSimilarityType()==null) || 
             (this.similarityType!=null &&
              this.similarityType.equals(other.getSimilarityType())));
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
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getItemId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getResponseGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSimilarityType() != null) {
            _hashCode += getSimilarityType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SimilarityLookupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SimilarityLookupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Condition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MerchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ResponseGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similarityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SimilarityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">SimilarityLookupRequest>SimilarityType"));
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
