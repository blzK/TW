/**
 * OfferListingAvailabilityAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class OfferListingAvailabilityAttributes  implements java.io.Serializable {
    private java.lang.String availabilityType;

    private java.lang.Boolean isPreorder;

    private java.math.BigInteger minimumHours;

    private java.math.BigInteger maximumHours;

    public OfferListingAvailabilityAttributes() {
    }

    public OfferListingAvailabilityAttributes(
           java.lang.String availabilityType,
           java.lang.Boolean isPreorder,
           java.math.BigInteger minimumHours,
           java.math.BigInteger maximumHours) {
           this.availabilityType = availabilityType;
           this.isPreorder = isPreorder;
           this.minimumHours = minimumHours;
           this.maximumHours = maximumHours;
    }


    /**
     * Gets the availabilityType value for this OfferListingAvailabilityAttributes.
     * 
     * @return availabilityType
     */
    public java.lang.String getAvailabilityType() {
        return availabilityType;
    }


    /**
     * Sets the availabilityType value for this OfferListingAvailabilityAttributes.
     * 
     * @param availabilityType
     */
    public void setAvailabilityType(java.lang.String availabilityType) {
        this.availabilityType = availabilityType;
    }


    /**
     * Gets the isPreorder value for this OfferListingAvailabilityAttributes.
     * 
     * @return isPreorder
     */
    public java.lang.Boolean getIsPreorder() {
        return isPreorder;
    }


    /**
     * Sets the isPreorder value for this OfferListingAvailabilityAttributes.
     * 
     * @param isPreorder
     */
    public void setIsPreorder(java.lang.Boolean isPreorder) {
        this.isPreorder = isPreorder;
    }


    /**
     * Gets the minimumHours value for this OfferListingAvailabilityAttributes.
     * 
     * @return minimumHours
     */
    public java.math.BigInteger getMinimumHours() {
        return minimumHours;
    }


    /**
     * Sets the minimumHours value for this OfferListingAvailabilityAttributes.
     * 
     * @param minimumHours
     */
    public void setMinimumHours(java.math.BigInteger minimumHours) {
        this.minimumHours = minimumHours;
    }


    /**
     * Gets the maximumHours value for this OfferListingAvailabilityAttributes.
     * 
     * @return maximumHours
     */
    public java.math.BigInteger getMaximumHours() {
        return maximumHours;
    }


    /**
     * Sets the maximumHours value for this OfferListingAvailabilityAttributes.
     * 
     * @param maximumHours
     */
    public void setMaximumHours(java.math.BigInteger maximumHours) {
        this.maximumHours = maximumHours;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfferListingAvailabilityAttributes)) return false;
        OfferListingAvailabilityAttributes other = (OfferListingAvailabilityAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availabilityType==null && other.getAvailabilityType()==null) || 
             (this.availabilityType!=null &&
              this.availabilityType.equals(other.getAvailabilityType()))) &&
            ((this.isPreorder==null && other.getIsPreorder()==null) || 
             (this.isPreorder!=null &&
              this.isPreorder.equals(other.getIsPreorder()))) &&
            ((this.minimumHours==null && other.getMinimumHours()==null) || 
             (this.minimumHours!=null &&
              this.minimumHours.equals(other.getMinimumHours()))) &&
            ((this.maximumHours==null && other.getMaximumHours()==null) || 
             (this.maximumHours!=null &&
              this.maximumHours.equals(other.getMaximumHours())));
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
        if (getAvailabilityType() != null) {
            _hashCode += getAvailabilityType().hashCode();
        }
        if (getIsPreorder() != null) {
            _hashCode += getIsPreorder().hashCode();
        }
        if (getMinimumHours() != null) {
            _hashCode += getMinimumHours().hashCode();
        }
        if (getMaximumHours() != null) {
            _hashCode += getMaximumHours().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferListingAvailabilityAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>OfferListing>AvailabilityAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availabilityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AvailabilityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPreorder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "IsPreorder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MinimumHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MaximumHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
