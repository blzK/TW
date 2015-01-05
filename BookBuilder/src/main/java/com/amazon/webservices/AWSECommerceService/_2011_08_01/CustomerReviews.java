/**
 * CustomerReviews.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class CustomerReviews  implements java.io.Serializable {
    private java.lang.String IFrameURL;

    private java.lang.Boolean hasReviews;

    public CustomerReviews() {
    }

    public CustomerReviews(
           java.lang.String IFrameURL,
           java.lang.Boolean hasReviews) {
           this.IFrameURL = IFrameURL;
           this.hasReviews = hasReviews;
    }


    /**
     * Gets the IFrameURL value for this CustomerReviews.
     * 
     * @return IFrameURL
     */
    public java.lang.String getIFrameURL() {
        return IFrameURL;
    }


    /**
     * Sets the IFrameURL value for this CustomerReviews.
     * 
     * @param IFrameURL
     */
    public void setIFrameURL(java.lang.String IFrameURL) {
        this.IFrameURL = IFrameURL;
    }


    /**
     * Gets the hasReviews value for this CustomerReviews.
     * 
     * @return hasReviews
     */
    public java.lang.Boolean getHasReviews() {
        return hasReviews;
    }


    /**
     * Sets the hasReviews value for this CustomerReviews.
     * 
     * @param hasReviews
     */
    public void setHasReviews(java.lang.Boolean hasReviews) {
        this.hasReviews = hasReviews;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerReviews)) return false;
        CustomerReviews other = (CustomerReviews) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IFrameURL==null && other.getIFrameURL()==null) || 
             (this.IFrameURL!=null &&
              this.IFrameURL.equals(other.getIFrameURL()))) &&
            ((this.hasReviews==null && other.getHasReviews()==null) || 
             (this.hasReviews!=null &&
              this.hasReviews.equals(other.getHasReviews())));
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
        if (getIFrameURL() != null) {
            _hashCode += getIFrameURL().hashCode();
        }
        if (getHasReviews() != null) {
            _hashCode += getHasReviews().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerReviews.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">CustomerReviews"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IFrameURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "IFrameURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasReviews");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "HasReviews"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
