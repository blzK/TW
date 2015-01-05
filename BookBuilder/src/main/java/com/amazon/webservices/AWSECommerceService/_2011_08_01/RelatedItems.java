/**
 * RelatedItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class RelatedItems  implements java.io.Serializable {
    private com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItemsRelationship relationship;

    private java.lang.String relationshipType;

    private org.apache.axis.types.NonNegativeInteger relatedItemCount;

    private org.apache.axis.types.NonNegativeInteger relatedItemPageCount;

    private org.apache.axis.types.NonNegativeInteger relatedItemPage;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItem[] relatedItem;

    public RelatedItems() {
    }

    public RelatedItems(
           com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItemsRelationship relationship,
           java.lang.String relationshipType,
           org.apache.axis.types.NonNegativeInteger relatedItemCount,
           org.apache.axis.types.NonNegativeInteger relatedItemPageCount,
           org.apache.axis.types.NonNegativeInteger relatedItemPage,
           com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItem[] relatedItem) {
           this.relationship = relationship;
           this.relationshipType = relationshipType;
           this.relatedItemCount = relatedItemCount;
           this.relatedItemPageCount = relatedItemPageCount;
           this.relatedItemPage = relatedItemPage;
           this.relatedItem = relatedItem;
    }


    /**
     * Gets the relationship value for this RelatedItems.
     * 
     * @return relationship
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItemsRelationship getRelationship() {
        return relationship;
    }


    /**
     * Sets the relationship value for this RelatedItems.
     * 
     * @param relationship
     */
    public void setRelationship(com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItemsRelationship relationship) {
        this.relationship = relationship;
    }


    /**
     * Gets the relationshipType value for this RelatedItems.
     * 
     * @return relationshipType
     */
    public java.lang.String getRelationshipType() {
        return relationshipType;
    }


    /**
     * Sets the relationshipType value for this RelatedItems.
     * 
     * @param relationshipType
     */
    public void setRelationshipType(java.lang.String relationshipType) {
        this.relationshipType = relationshipType;
    }


    /**
     * Gets the relatedItemCount value for this RelatedItems.
     * 
     * @return relatedItemCount
     */
    public org.apache.axis.types.NonNegativeInteger getRelatedItemCount() {
        return relatedItemCount;
    }


    /**
     * Sets the relatedItemCount value for this RelatedItems.
     * 
     * @param relatedItemCount
     */
    public void setRelatedItemCount(org.apache.axis.types.NonNegativeInteger relatedItemCount) {
        this.relatedItemCount = relatedItemCount;
    }


    /**
     * Gets the relatedItemPageCount value for this RelatedItems.
     * 
     * @return relatedItemPageCount
     */
    public org.apache.axis.types.NonNegativeInteger getRelatedItemPageCount() {
        return relatedItemPageCount;
    }


    /**
     * Sets the relatedItemPageCount value for this RelatedItems.
     * 
     * @param relatedItemPageCount
     */
    public void setRelatedItemPageCount(org.apache.axis.types.NonNegativeInteger relatedItemPageCount) {
        this.relatedItemPageCount = relatedItemPageCount;
    }


    /**
     * Gets the relatedItemPage value for this RelatedItems.
     * 
     * @return relatedItemPage
     */
    public org.apache.axis.types.NonNegativeInteger getRelatedItemPage() {
        return relatedItemPage;
    }


    /**
     * Sets the relatedItemPage value for this RelatedItems.
     * 
     * @param relatedItemPage
     */
    public void setRelatedItemPage(org.apache.axis.types.NonNegativeInteger relatedItemPage) {
        this.relatedItemPage = relatedItemPage;
    }


    /**
     * Gets the relatedItem value for this RelatedItems.
     * 
     * @return relatedItem
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItem[] getRelatedItem() {
        return relatedItem;
    }


    /**
     * Sets the relatedItem value for this RelatedItems.
     * 
     * @param relatedItem
     */
    public void setRelatedItem(com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItem[] relatedItem) {
        this.relatedItem = relatedItem;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItem getRelatedItem(int i) {
        return this.relatedItem[i];
    }

    public void setRelatedItem(int i, com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItem _value) {
        this.relatedItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RelatedItems)) return false;
        RelatedItems other = (RelatedItems) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.relationship==null && other.getRelationship()==null) || 
             (this.relationship!=null &&
              this.relationship.equals(other.getRelationship()))) &&
            ((this.relationshipType==null && other.getRelationshipType()==null) || 
             (this.relationshipType!=null &&
              this.relationshipType.equals(other.getRelationshipType()))) &&
            ((this.relatedItemCount==null && other.getRelatedItemCount()==null) || 
             (this.relatedItemCount!=null &&
              this.relatedItemCount.equals(other.getRelatedItemCount()))) &&
            ((this.relatedItemPageCount==null && other.getRelatedItemPageCount()==null) || 
             (this.relatedItemPageCount!=null &&
              this.relatedItemPageCount.equals(other.getRelatedItemPageCount()))) &&
            ((this.relatedItemPage==null && other.getRelatedItemPage()==null) || 
             (this.relatedItemPage!=null &&
              this.relatedItemPage.equals(other.getRelatedItemPage()))) &&
            ((this.relatedItem==null && other.getRelatedItem()==null) || 
             (this.relatedItem!=null &&
              java.util.Arrays.equals(this.relatedItem, other.getRelatedItem())));
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
        if (getRelationship() != null) {
            _hashCode += getRelationship().hashCode();
        }
        if (getRelationshipType() != null) {
            _hashCode += getRelationshipType().hashCode();
        }
        if (getRelatedItemCount() != null) {
            _hashCode += getRelatedItemCount().hashCode();
        }
        if (getRelatedItemPageCount() != null) {
            _hashCode += getRelatedItemPageCount().hashCode();
        }
        if (getRelatedItemPage() != null) {
            _hashCode += getRelatedItemPage().hashCode();
        }
        if (getRelatedItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelatedItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelatedItem(), i);
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
        new org.apache.axis.description.TypeDesc(RelatedItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">RelatedItems"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationship");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Relationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>RelatedItems>Relationship"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "RelationshipType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItemCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "RelatedItemCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItemPageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "RelatedItemPageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItemPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "RelatedItemPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "RelatedItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "RelatedItem"));
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
