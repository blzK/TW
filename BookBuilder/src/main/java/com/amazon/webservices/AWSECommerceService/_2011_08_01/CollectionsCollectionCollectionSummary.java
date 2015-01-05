/**
 * CollectionsCollectionCollectionSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class CollectionsCollectionCollectionSummary  implements java.io.Serializable {
    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price lowestListPrice;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price highestListPrice;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price lowestSalePrice;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price highestSalePrice;

    public CollectionsCollectionCollectionSummary() {
    }

    public CollectionsCollectionCollectionSummary(
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price lowestListPrice,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price highestListPrice,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price lowestSalePrice,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price highestSalePrice) {
           this.lowestListPrice = lowestListPrice;
           this.highestListPrice = highestListPrice;
           this.lowestSalePrice = lowestSalePrice;
           this.highestSalePrice = highestSalePrice;
    }


    /**
     * Gets the lowestListPrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @return lowestListPrice
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getLowestListPrice() {
        return lowestListPrice;
    }


    /**
     * Sets the lowestListPrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @param lowestListPrice
     */
    public void setLowestListPrice(com.amazon.webservices.AWSECommerceService._2011_08_01.Price lowestListPrice) {
        this.lowestListPrice = lowestListPrice;
    }


    /**
     * Gets the highestListPrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @return highestListPrice
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getHighestListPrice() {
        return highestListPrice;
    }


    /**
     * Sets the highestListPrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @param highestListPrice
     */
    public void setHighestListPrice(com.amazon.webservices.AWSECommerceService._2011_08_01.Price highestListPrice) {
        this.highestListPrice = highestListPrice;
    }


    /**
     * Gets the lowestSalePrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @return lowestSalePrice
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getLowestSalePrice() {
        return lowestSalePrice;
    }


    /**
     * Sets the lowestSalePrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @param lowestSalePrice
     */
    public void setLowestSalePrice(com.amazon.webservices.AWSECommerceService._2011_08_01.Price lowestSalePrice) {
        this.lowestSalePrice = lowestSalePrice;
    }


    /**
     * Gets the highestSalePrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @return highestSalePrice
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getHighestSalePrice() {
        return highestSalePrice;
    }


    /**
     * Sets the highestSalePrice value for this CollectionsCollectionCollectionSummary.
     * 
     * @param highestSalePrice
     */
    public void setHighestSalePrice(com.amazon.webservices.AWSECommerceService._2011_08_01.Price highestSalePrice) {
        this.highestSalePrice = highestSalePrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CollectionsCollectionCollectionSummary)) return false;
        CollectionsCollectionCollectionSummary other = (CollectionsCollectionCollectionSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lowestListPrice==null && other.getLowestListPrice()==null) || 
             (this.lowestListPrice!=null &&
              this.lowestListPrice.equals(other.getLowestListPrice()))) &&
            ((this.highestListPrice==null && other.getHighestListPrice()==null) || 
             (this.highestListPrice!=null &&
              this.highestListPrice.equals(other.getHighestListPrice()))) &&
            ((this.lowestSalePrice==null && other.getLowestSalePrice()==null) || 
             (this.lowestSalePrice!=null &&
              this.lowestSalePrice.equals(other.getLowestSalePrice()))) &&
            ((this.highestSalePrice==null && other.getHighestSalePrice()==null) || 
             (this.highestSalePrice!=null &&
              this.highestSalePrice.equals(other.getHighestSalePrice())));
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
        if (getLowestListPrice() != null) {
            _hashCode += getLowestListPrice().hashCode();
        }
        if (getHighestListPrice() != null) {
            _hashCode += getHighestListPrice().hashCode();
        }
        if (getLowestSalePrice() != null) {
            _hashCode += getLowestSalePrice().hashCode();
        }
        if (getHighestSalePrice() != null) {
            _hashCode += getHighestSalePrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CollectionsCollectionCollectionSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>Collections>Collection>CollectionSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowestListPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "LowestListPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestListPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "HighestListPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowestSalePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "LowestSalePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSalePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "HighestSalePrice"));
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
