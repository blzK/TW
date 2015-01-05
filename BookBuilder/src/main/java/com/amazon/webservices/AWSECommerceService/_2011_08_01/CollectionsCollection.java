/**
 * CollectionsCollection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class CollectionsCollection  implements java.io.Serializable {
    private com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionSummary collectionSummary;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionParent collectionParent;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionItem[] collectionItem;

    public CollectionsCollection() {
    }

    public CollectionsCollection(
           com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionSummary collectionSummary,
           com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionParent collectionParent,
           com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionItem[] collectionItem) {
           this.collectionSummary = collectionSummary;
           this.collectionParent = collectionParent;
           this.collectionItem = collectionItem;
    }


    /**
     * Gets the collectionSummary value for this CollectionsCollection.
     * 
     * @return collectionSummary
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionSummary getCollectionSummary() {
        return collectionSummary;
    }


    /**
     * Sets the collectionSummary value for this CollectionsCollection.
     * 
     * @param collectionSummary
     */
    public void setCollectionSummary(com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionSummary collectionSummary) {
        this.collectionSummary = collectionSummary;
    }


    /**
     * Gets the collectionParent value for this CollectionsCollection.
     * 
     * @return collectionParent
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionParent getCollectionParent() {
        return collectionParent;
    }


    /**
     * Sets the collectionParent value for this CollectionsCollection.
     * 
     * @param collectionParent
     */
    public void setCollectionParent(com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionParent collectionParent) {
        this.collectionParent = collectionParent;
    }


    /**
     * Gets the collectionItem value for this CollectionsCollection.
     * 
     * @return collectionItem
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionItem[] getCollectionItem() {
        return collectionItem;
    }


    /**
     * Sets the collectionItem value for this CollectionsCollection.
     * 
     * @param collectionItem
     */
    public void setCollectionItem(com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionItem[] collectionItem) {
        this.collectionItem = collectionItem;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionItem getCollectionItem(int i) {
        return this.collectionItem[i];
    }

    public void setCollectionItem(int i, com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollectionCollectionItem _value) {
        this.collectionItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CollectionsCollection)) return false;
        CollectionsCollection other = (CollectionsCollection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.collectionSummary==null && other.getCollectionSummary()==null) || 
             (this.collectionSummary!=null &&
              this.collectionSummary.equals(other.getCollectionSummary()))) &&
            ((this.collectionParent==null && other.getCollectionParent()==null) || 
             (this.collectionParent!=null &&
              this.collectionParent.equals(other.getCollectionParent()))) &&
            ((this.collectionItem==null && other.getCollectionItem()==null) || 
             (this.collectionItem!=null &&
              java.util.Arrays.equals(this.collectionItem, other.getCollectionItem())));
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
        if (getCollectionSummary() != null) {
            _hashCode += getCollectionSummary().hashCode();
        }
        if (getCollectionParent() != null) {
            _hashCode += getCollectionParent().hashCode();
        }
        if (getCollectionItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCollectionItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCollectionItem(), i);
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
        new org.apache.axis.description.TypeDesc(CollectionsCollection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Collections>Collection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CollectionSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>Collections>Collection>CollectionSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionParent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CollectionParent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>Collections>Collection>CollectionParent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CollectionItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>Collections>Collection>CollectionItem"));
        elemField.setMinOccurs(0);
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
