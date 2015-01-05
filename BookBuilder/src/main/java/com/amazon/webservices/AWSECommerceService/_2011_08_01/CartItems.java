/**
 * CartItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class CartItems  implements java.io.Serializable {
    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price subTotal;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.CartItem[] cartItem;

    public CartItems() {
    }

    public CartItems(
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price subTotal,
           com.amazon.webservices.AWSECommerceService._2011_08_01.CartItem[] cartItem) {
           this.subTotal = subTotal;
           this.cartItem = cartItem;
    }


    /**
     * Gets the subTotal value for this CartItems.
     * 
     * @return subTotal
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getSubTotal() {
        return subTotal;
    }


    /**
     * Sets the subTotal value for this CartItems.
     * 
     * @param subTotal
     */
    public void setSubTotal(com.amazon.webservices.AWSECommerceService._2011_08_01.Price subTotal) {
        this.subTotal = subTotal;
    }


    /**
     * Gets the cartItem value for this CartItems.
     * 
     * @return cartItem
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.CartItem[] getCartItem() {
        return cartItem;
    }


    /**
     * Sets the cartItem value for this CartItems.
     * 
     * @param cartItem
     */
    public void setCartItem(com.amazon.webservices.AWSECommerceService._2011_08_01.CartItem[] cartItem) {
        this.cartItem = cartItem;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.CartItem getCartItem(int i) {
        return this.cartItem[i];
    }

    public void setCartItem(int i, com.amazon.webservices.AWSECommerceService._2011_08_01.CartItem _value) {
        this.cartItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CartItems)) return false;
        CartItems other = (CartItems) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subTotal==null && other.getSubTotal()==null) || 
             (this.subTotal!=null &&
              this.subTotal.equals(other.getSubTotal()))) &&
            ((this.cartItem==null && other.getCartItem()==null) || 
             (this.cartItem!=null &&
              java.util.Arrays.equals(this.cartItem, other.getCartItem())));
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
        if (getSubTotal() != null) {
            _hashCode += getSubTotal().hashCode();
        }
        if (getCartItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCartItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCartItem(), i);
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
        new org.apache.axis.description.TypeDesc(CartItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">CartItems"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SubTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartItem"));
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
