/**
 * LoyaltyPoints.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class LoyaltyPoints  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger points;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price typicalRedemptionValue;

    public LoyaltyPoints() {
    }

    public LoyaltyPoints(
           org.apache.axis.types.NonNegativeInteger points,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price typicalRedemptionValue) {
           this.points = points;
           this.typicalRedemptionValue = typicalRedemptionValue;
    }


    /**
     * Gets the points value for this LoyaltyPoints.
     * 
     * @return points
     */
    public org.apache.axis.types.NonNegativeInteger getPoints() {
        return points;
    }


    /**
     * Sets the points value for this LoyaltyPoints.
     * 
     * @param points
     */
    public void setPoints(org.apache.axis.types.NonNegativeInteger points) {
        this.points = points;
    }


    /**
     * Gets the typicalRedemptionValue value for this LoyaltyPoints.
     * 
     * @return typicalRedemptionValue
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getTypicalRedemptionValue() {
        return typicalRedemptionValue;
    }


    /**
     * Sets the typicalRedemptionValue value for this LoyaltyPoints.
     * 
     * @param typicalRedemptionValue
     */
    public void setTypicalRedemptionValue(com.amazon.webservices.AWSECommerceService._2011_08_01.Price typicalRedemptionValue) {
        this.typicalRedemptionValue = typicalRedemptionValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoyaltyPoints)) return false;
        LoyaltyPoints other = (LoyaltyPoints) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.points==null && other.getPoints()==null) || 
             (this.points!=null &&
              this.points.equals(other.getPoints()))) &&
            ((this.typicalRedemptionValue==null && other.getTypicalRedemptionValue()==null) || 
             (this.typicalRedemptionValue!=null &&
              this.typicalRedemptionValue.equals(other.getTypicalRedemptionValue())));
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
        if (getPoints() != null) {
            _hashCode += getPoints().hashCode();
        }
        if (getTypicalRedemptionValue() != null) {
            _hashCode += getTypicalRedemptionValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoyaltyPoints.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">LoyaltyPoints"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("points");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Points"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typicalRedemptionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TypicalRedemptionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
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
