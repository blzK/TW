/**
 * Offer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class Offer  implements java.io.Serializable {
    private com.amazon.webservices.AWSECommerceService._2011_08_01.Merchant merchant;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.OfferAttributes offerAttributes;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.OfferListing[] offerListing;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.LoyaltyPoints loyaltyPoints;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Promotion[] promotions;

    public Offer() {
    }

    public Offer(
           com.amazon.webservices.AWSECommerceService._2011_08_01.Merchant merchant,
           com.amazon.webservices.AWSECommerceService._2011_08_01.OfferAttributes offerAttributes,
           com.amazon.webservices.AWSECommerceService._2011_08_01.OfferListing[] offerListing,
           com.amazon.webservices.AWSECommerceService._2011_08_01.LoyaltyPoints loyaltyPoints,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Promotion[] promotions) {
           this.merchant = merchant;
           this.offerAttributes = offerAttributes;
           this.offerListing = offerListing;
           this.loyaltyPoints = loyaltyPoints;
           this.promotions = promotions;
    }


    /**
     * Gets the merchant value for this Offer.
     * 
     * @return merchant
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Merchant getMerchant() {
        return merchant;
    }


    /**
     * Sets the merchant value for this Offer.
     * 
     * @param merchant
     */
    public void setMerchant(com.amazon.webservices.AWSECommerceService._2011_08_01.Merchant merchant) {
        this.merchant = merchant;
    }


    /**
     * Gets the offerAttributes value for this Offer.
     * 
     * @return offerAttributes
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.OfferAttributes getOfferAttributes() {
        return offerAttributes;
    }


    /**
     * Sets the offerAttributes value for this Offer.
     * 
     * @param offerAttributes
     */
    public void setOfferAttributes(com.amazon.webservices.AWSECommerceService._2011_08_01.OfferAttributes offerAttributes) {
        this.offerAttributes = offerAttributes;
    }


    /**
     * Gets the offerListing value for this Offer.
     * 
     * @return offerListing
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.OfferListing[] getOfferListing() {
        return offerListing;
    }


    /**
     * Sets the offerListing value for this Offer.
     * 
     * @param offerListing
     */
    public void setOfferListing(com.amazon.webservices.AWSECommerceService._2011_08_01.OfferListing[] offerListing) {
        this.offerListing = offerListing;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.OfferListing getOfferListing(int i) {
        return this.offerListing[i];
    }

    public void setOfferListing(int i, com.amazon.webservices.AWSECommerceService._2011_08_01.OfferListing _value) {
        this.offerListing[i] = _value;
    }


    /**
     * Gets the loyaltyPoints value for this Offer.
     * 
     * @return loyaltyPoints
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.LoyaltyPoints getLoyaltyPoints() {
        return loyaltyPoints;
    }


    /**
     * Sets the loyaltyPoints value for this Offer.
     * 
     * @param loyaltyPoints
     */
    public void setLoyaltyPoints(com.amazon.webservices.AWSECommerceService._2011_08_01.LoyaltyPoints loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }


    /**
     * Gets the promotions value for this Offer.
     * 
     * @return promotions
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Promotion[] getPromotions() {
        return promotions;
    }


    /**
     * Sets the promotions value for this Offer.
     * 
     * @param promotions
     */
    public void setPromotions(com.amazon.webservices.AWSECommerceService._2011_08_01.Promotion[] promotions) {
        this.promotions = promotions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Offer)) return false;
        Offer other = (Offer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchant==null && other.getMerchant()==null) || 
             (this.merchant!=null &&
              this.merchant.equals(other.getMerchant()))) &&
            ((this.offerAttributes==null && other.getOfferAttributes()==null) || 
             (this.offerAttributes!=null &&
              this.offerAttributes.equals(other.getOfferAttributes()))) &&
            ((this.offerListing==null && other.getOfferListing()==null) || 
             (this.offerListing!=null &&
              java.util.Arrays.equals(this.offerListing, other.getOfferListing()))) &&
            ((this.loyaltyPoints==null && other.getLoyaltyPoints()==null) || 
             (this.loyaltyPoints!=null &&
              this.loyaltyPoints.equals(other.getLoyaltyPoints()))) &&
            ((this.promotions==null && other.getPromotions()==null) || 
             (this.promotions!=null &&
              java.util.Arrays.equals(this.promotions, other.getPromotions())));
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
        if (getMerchant() != null) {
            _hashCode += getMerchant().hashCode();
        }
        if (getOfferAttributes() != null) {
            _hashCode += getOfferAttributes().hashCode();
        }
        if (getOfferListing() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferListing());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferListing(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoyaltyPoints() != null) {
            _hashCode += getLoyaltyPoints().hashCode();
        }
        if (getPromotions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotions(), i);
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
        new org.apache.axis.description.TypeDesc(Offer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Offer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Merchant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Merchant"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OfferAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OfferAttributes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerListing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OfferListing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OfferListing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loyaltyPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "LoyaltyPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">LoyaltyPoints"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Promotions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Promotions"));
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
