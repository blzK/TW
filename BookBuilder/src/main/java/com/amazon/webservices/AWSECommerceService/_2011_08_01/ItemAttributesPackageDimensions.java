/**
 * ItemAttributesPackageDimensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class ItemAttributesPackageDimensions  implements java.io.Serializable {
    private com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits height;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits length;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits weight;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits width;

    public ItemAttributesPackageDimensions() {
    }

    public ItemAttributesPackageDimensions(
           com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits height,
           com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits length,
           com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits weight,
           com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits width) {
           this.height = height;
           this.length = length;
           this.weight = weight;
           this.width = width;
    }


    /**
     * Gets the height value for this ItemAttributesPackageDimensions.
     * 
     * @return height
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits getHeight() {
        return height;
    }


    /**
     * Sets the height value for this ItemAttributesPackageDimensions.
     * 
     * @param height
     */
    public void setHeight(com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits height) {
        this.height = height;
    }


    /**
     * Gets the length value for this ItemAttributesPackageDimensions.
     * 
     * @return length
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits getLength() {
        return length;
    }


    /**
     * Sets the length value for this ItemAttributesPackageDimensions.
     * 
     * @param length
     */
    public void setLength(com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits length) {
        this.length = length;
    }


    /**
     * Gets the weight value for this ItemAttributesPackageDimensions.
     * 
     * @return weight
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this ItemAttributesPackageDimensions.
     * 
     * @param weight
     */
    public void setWeight(com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits weight) {
        this.weight = weight;
    }


    /**
     * Gets the width value for this ItemAttributesPackageDimensions.
     * 
     * @return width
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits getWidth() {
        return width;
    }


    /**
     * Sets the width value for this ItemAttributesPackageDimensions.
     * 
     * @param width
     */
    public void setWidth(com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemAttributesPackageDimensions)) return false;
        ItemAttributesPackageDimensions other = (ItemAttributesPackageDimensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemAttributesPackageDimensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>ItemAttributes>PackageDimensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "DecimalWithUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "DecimalWithUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "DecimalWithUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "DecimalWithUnits"));
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
