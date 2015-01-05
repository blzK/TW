/**
 * CartCreateRequestItemsItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class CartCreateRequestItemsItem  implements java.io.Serializable {
    private java.lang.String ASIN;

    private java.lang.String offerListingId;

    private org.apache.axis.types.PositiveInteger quantity;

    private java.lang.String associateTag;

    private java.lang.String listItemId;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequestItemsItemMetaData[] metaData;

    public CartCreateRequestItemsItem() {
    }

    public CartCreateRequestItemsItem(
           java.lang.String ASIN,
           java.lang.String offerListingId,
           org.apache.axis.types.PositiveInteger quantity,
           java.lang.String associateTag,
           java.lang.String listItemId,
           com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequestItemsItemMetaData[] metaData) {
           this.ASIN = ASIN;
           this.offerListingId = offerListingId;
           this.quantity = quantity;
           this.associateTag = associateTag;
           this.listItemId = listItemId;
           this.metaData = metaData;
    }


    /**
     * Gets the ASIN value for this CartCreateRequestItemsItem.
     * 
     * @return ASIN
     */
    public java.lang.String getASIN() {
        return ASIN;
    }


    /**
     * Sets the ASIN value for this CartCreateRequestItemsItem.
     * 
     * @param ASIN
     */
    public void setASIN(java.lang.String ASIN) {
        this.ASIN = ASIN;
    }


    /**
     * Gets the offerListingId value for this CartCreateRequestItemsItem.
     * 
     * @return offerListingId
     */
    public java.lang.String getOfferListingId() {
        return offerListingId;
    }


    /**
     * Sets the offerListingId value for this CartCreateRequestItemsItem.
     * 
     * @param offerListingId
     */
    public void setOfferListingId(java.lang.String offerListingId) {
        this.offerListingId = offerListingId;
    }


    /**
     * Gets the quantity value for this CartCreateRequestItemsItem.
     * 
     * @return quantity
     */
    public org.apache.axis.types.PositiveInteger getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this CartCreateRequestItemsItem.
     * 
     * @param quantity
     */
    public void setQuantity(org.apache.axis.types.PositiveInteger quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the associateTag value for this CartCreateRequestItemsItem.
     * 
     * @return associateTag
     */
    public java.lang.String getAssociateTag() {
        return associateTag;
    }


    /**
     * Sets the associateTag value for this CartCreateRequestItemsItem.
     * 
     * @param associateTag
     */
    public void setAssociateTag(java.lang.String associateTag) {
        this.associateTag = associateTag;
    }


    /**
     * Gets the listItemId value for this CartCreateRequestItemsItem.
     * 
     * @return listItemId
     */
    public java.lang.String getListItemId() {
        return listItemId;
    }


    /**
     * Sets the listItemId value for this CartCreateRequestItemsItem.
     * 
     * @param listItemId
     */
    public void setListItemId(java.lang.String listItemId) {
        this.listItemId = listItemId;
    }


    /**
     * Gets the metaData value for this CartCreateRequestItemsItem.
     * 
     * @return metaData
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequestItemsItemMetaData[] getMetaData() {
        return metaData;
    }


    /**
     * Sets the metaData value for this CartCreateRequestItemsItem.
     * 
     * @param metaData
     */
    public void setMetaData(com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequestItemsItemMetaData[] metaData) {
        this.metaData = metaData;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequestItemsItemMetaData getMetaData(int i) {
        return this.metaData[i];
    }

    public void setMetaData(int i, com.amazon.webservices.AWSECommerceService._2011_08_01.CartCreateRequestItemsItemMetaData _value) {
        this.metaData[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CartCreateRequestItemsItem)) return false;
        CartCreateRequestItemsItem other = (CartCreateRequestItemsItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ASIN==null && other.getASIN()==null) || 
             (this.ASIN!=null &&
              this.ASIN.equals(other.getASIN()))) &&
            ((this.offerListingId==null && other.getOfferListingId()==null) || 
             (this.offerListingId!=null &&
              this.offerListingId.equals(other.getOfferListingId()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.associateTag==null && other.getAssociateTag()==null) || 
             (this.associateTag!=null &&
              this.associateTag.equals(other.getAssociateTag()))) &&
            ((this.listItemId==null && other.getListItemId()==null) || 
             (this.listItemId!=null &&
              this.listItemId.equals(other.getListItemId()))) &&
            ((this.metaData==null && other.getMetaData()==null) || 
             (this.metaData!=null &&
              java.util.Arrays.equals(this.metaData, other.getMetaData())));
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
        if (getASIN() != null) {
            _hashCode += getASIN().hashCode();
        }
        if (getOfferListingId() != null) {
            _hashCode += getOfferListingId().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getAssociateTag() != null) {
            _hashCode += getAssociateTag().hashCode();
        }
        if (getListItemId() != null) {
            _hashCode += getListItemId().hashCode();
        }
        if (getMetaData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetaData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetaData(), i);
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
        new org.apache.axis.description.TypeDesc(CartCreateRequestItemsItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>CartCreateRequest>Items>Item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ASIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerListingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OfferListingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associateTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AssociateTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ListItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MetaData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>CartCreateRequest>Items>Item>MetaData"));
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
