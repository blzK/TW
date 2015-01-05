/**
 * CartItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class CartItem  implements java.io.Serializable {
    private java.lang.String cartItemId;

    private java.lang.String ASIN;

    private java.lang.String sellerNickname;

    private java.lang.String quantity;

    private java.lang.String title;

    private java.lang.String productGroup;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.CartItemMetaDataKeyValuePair[] metaData;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price price;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price itemTotal;

    public CartItem() {
    }

    public CartItem(
           java.lang.String cartItemId,
           java.lang.String ASIN,
           java.lang.String sellerNickname,
           java.lang.String quantity,
           java.lang.String title,
           java.lang.String productGroup,
           com.amazon.webservices.AWSECommerceService._2011_08_01.CartItemMetaDataKeyValuePair[] metaData,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price price,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price itemTotal) {
           this.cartItemId = cartItemId;
           this.ASIN = ASIN;
           this.sellerNickname = sellerNickname;
           this.quantity = quantity;
           this.title = title;
           this.productGroup = productGroup;
           this.metaData = metaData;
           this.price = price;
           this.itemTotal = itemTotal;
    }


    /**
     * Gets the cartItemId value for this CartItem.
     * 
     * @return cartItemId
     */
    public java.lang.String getCartItemId() {
        return cartItemId;
    }


    /**
     * Sets the cartItemId value for this CartItem.
     * 
     * @param cartItemId
     */
    public void setCartItemId(java.lang.String cartItemId) {
        this.cartItemId = cartItemId;
    }


    /**
     * Gets the ASIN value for this CartItem.
     * 
     * @return ASIN
     */
    public java.lang.String getASIN() {
        return ASIN;
    }


    /**
     * Sets the ASIN value for this CartItem.
     * 
     * @param ASIN
     */
    public void setASIN(java.lang.String ASIN) {
        this.ASIN = ASIN;
    }


    /**
     * Gets the sellerNickname value for this CartItem.
     * 
     * @return sellerNickname
     */
    public java.lang.String getSellerNickname() {
        return sellerNickname;
    }


    /**
     * Sets the sellerNickname value for this CartItem.
     * 
     * @param sellerNickname
     */
    public void setSellerNickname(java.lang.String sellerNickname) {
        this.sellerNickname = sellerNickname;
    }


    /**
     * Gets the quantity value for this CartItem.
     * 
     * @return quantity
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this CartItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the title value for this CartItem.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CartItem.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the productGroup value for this CartItem.
     * 
     * @return productGroup
     */
    public java.lang.String getProductGroup() {
        return productGroup;
    }


    /**
     * Sets the productGroup value for this CartItem.
     * 
     * @param productGroup
     */
    public void setProductGroup(java.lang.String productGroup) {
        this.productGroup = productGroup;
    }


    /**
     * Gets the metaData value for this CartItem.
     * 
     * @return metaData
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.CartItemMetaDataKeyValuePair[] getMetaData() {
        return metaData;
    }


    /**
     * Sets the metaData value for this CartItem.
     * 
     * @param metaData
     */
    public void setMetaData(com.amazon.webservices.AWSECommerceService._2011_08_01.CartItemMetaDataKeyValuePair[] metaData) {
        this.metaData = metaData;
    }


    /**
     * Gets the price value for this CartItem.
     * 
     * @return price
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getPrice() {
        return price;
    }


    /**
     * Sets the price value for this CartItem.
     * 
     * @param price
     */
    public void setPrice(com.amazon.webservices.AWSECommerceService._2011_08_01.Price price) {
        this.price = price;
    }


    /**
     * Gets the itemTotal value for this CartItem.
     * 
     * @return itemTotal
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getItemTotal() {
        return itemTotal;
    }


    /**
     * Sets the itemTotal value for this CartItem.
     * 
     * @param itemTotal
     */
    public void setItemTotal(com.amazon.webservices.AWSECommerceService._2011_08_01.Price itemTotal) {
        this.itemTotal = itemTotal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CartItem)) return false;
        CartItem other = (CartItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cartItemId==null && other.getCartItemId()==null) || 
             (this.cartItemId!=null &&
              this.cartItemId.equals(other.getCartItemId()))) &&
            ((this.ASIN==null && other.getASIN()==null) || 
             (this.ASIN!=null &&
              this.ASIN.equals(other.getASIN()))) &&
            ((this.sellerNickname==null && other.getSellerNickname()==null) || 
             (this.sellerNickname!=null &&
              this.sellerNickname.equals(other.getSellerNickname()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.productGroup==null && other.getProductGroup()==null) || 
             (this.productGroup!=null &&
              this.productGroup.equals(other.getProductGroup()))) &&
            ((this.metaData==null && other.getMetaData()==null) || 
             (this.metaData!=null &&
              java.util.Arrays.equals(this.metaData, other.getMetaData()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.itemTotal==null && other.getItemTotal()==null) || 
             (this.itemTotal!=null &&
              this.itemTotal.equals(other.getItemTotal())));
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
        if (getCartItemId() != null) {
            _hashCode += getCartItemId().hashCode();
        }
        if (getASIN() != null) {
            _hashCode += getASIN().hashCode();
        }
        if (getSellerNickname() != null) {
            _hashCode += getSellerNickname().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getProductGroup() != null) {
            _hashCode += getProductGroup().hashCode();
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
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getItemTotal() != null) {
            _hashCode += getItemTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ASIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerNickname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SellerNickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ProductGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MetaData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>CartItem>MetaData>KeyValuePair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "KeyValuePair"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemTotal"));
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
