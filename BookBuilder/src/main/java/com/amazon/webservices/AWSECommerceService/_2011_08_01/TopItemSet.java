/**
 * TopItemSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class TopItemSet  implements java.io.Serializable {
    private java.lang.String type;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.TopItemSetTopItem[] topItem;

    public TopItemSet() {
    }

    public TopItemSet(
           java.lang.String type,
           com.amazon.webservices.AWSECommerceService._2011_08_01.TopItemSetTopItem[] topItem) {
           this.type = type;
           this.topItem = topItem;
    }


    /**
     * Gets the type value for this TopItemSet.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TopItemSet.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the topItem value for this TopItemSet.
     * 
     * @return topItem
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.TopItemSetTopItem[] getTopItem() {
        return topItem;
    }


    /**
     * Sets the topItem value for this TopItemSet.
     * 
     * @param topItem
     */
    public void setTopItem(com.amazon.webservices.AWSECommerceService._2011_08_01.TopItemSetTopItem[] topItem) {
        this.topItem = topItem;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.TopItemSetTopItem getTopItem(int i) {
        return this.topItem[i];
    }

    public void setTopItem(int i, com.amazon.webservices.AWSECommerceService._2011_08_01.TopItemSetTopItem _value) {
        this.topItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopItemSet)) return false;
        TopItemSet other = (TopItemSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.topItem==null && other.getTopItem()==null) || 
             (this.topItem!=null &&
              java.util.Arrays.equals(this.topItem, other.getTopItem())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTopItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTopItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTopItem(), i);
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
        new org.apache.axis.description.TypeDesc(TopItemSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">TopItemSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TopItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>TopItemSet>TopItem"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
