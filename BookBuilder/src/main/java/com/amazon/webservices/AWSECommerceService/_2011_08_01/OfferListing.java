/**
 * OfferListing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class OfferListing  implements java.io.Serializable {
    private java.lang.String offerListingId;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price price;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price salePrice;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price amountSaved;

    private org.apache.axis.types.NonNegativeInteger percentageSaved;

    private java.lang.String availability;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.OfferListingAvailabilityAttributes availabilityAttributes;

    private java.lang.Boolean isEligibleForSuperSaverShipping;

    private java.lang.Boolean isEligibleForPrime;

    public OfferListing() {
    }

    public OfferListing(
           java.lang.String offerListingId,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price price,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price salePrice,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price amountSaved,
           org.apache.axis.types.NonNegativeInteger percentageSaved,
           java.lang.String availability,
           com.amazon.webservices.AWSECommerceService._2011_08_01.OfferListingAvailabilityAttributes availabilityAttributes,
           java.lang.Boolean isEligibleForSuperSaverShipping,
           java.lang.Boolean isEligibleForPrime) {
           this.offerListingId = offerListingId;
           this.price = price;
           this.salePrice = salePrice;
           this.amountSaved = amountSaved;
           this.percentageSaved = percentageSaved;
           this.availability = availability;
           this.availabilityAttributes = availabilityAttributes;
           this.isEligibleForSuperSaverShipping = isEligibleForSuperSaverShipping;
           this.isEligibleForPrime = isEligibleForPrime;
    }


    /**
     * Gets the offerListingId value for this OfferListing.
     * 
     * @return offerListingId
     */
    public java.lang.String getOfferListingId() {
        return offerListingId;
    }


    /**
     * Sets the offerListingId value for this OfferListing.
     * 
     * @param offerListingId
     */
    public void setOfferListingId(java.lang.String offerListingId) {
        this.offerListingId = offerListingId;
    }


    /**
     * Gets the price value for this OfferListing.
     * 
     * @return price
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getPrice() {
        return price;
    }


    /**
     * Sets the price value for this OfferListing.
     * 
     * @param price
     */
    public void setPrice(com.amazon.webservices.AWSECommerceService._2011_08_01.Price price) {
        this.price = price;
    }


    /**
     * Gets the salePrice value for this OfferListing.
     * 
     * @return salePrice
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getSalePrice() {
        return salePrice;
    }


    /**
     * Sets the salePrice value for this OfferListing.
     * 
     * @param salePrice
     */
    public void setSalePrice(com.amazon.webservices.AWSECommerceService._2011_08_01.Price salePrice) {
        this.salePrice = salePrice;
    }


    /**
     * Gets the amountSaved value for this OfferListing.
     * 
     * @return amountSaved
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getAmountSaved() {
        return amountSaved;
    }


    /**
     * Sets the amountSaved value for this OfferListing.
     * 
     * @param amountSaved
     */
    public void setAmountSaved(com.amazon.webservices.AWSECommerceService._2011_08_01.Price amountSaved) {
        this.amountSaved = amountSaved;
    }


    /**
     * Gets the percentageSaved value for this OfferListing.
     * 
     * @return percentageSaved
     */
    public org.apache.axis.types.NonNegativeInteger getPercentageSaved() {
        return percentageSaved;
    }


    /**
     * Sets the percentageSaved value for this OfferListing.
     * 
     * @param percentageSaved
     */
    public void setPercentageSaved(org.apache.axis.types.NonNegativeInteger percentageSaved) {
        this.percentageSaved = percentageSaved;
    }


    /**
     * Gets the availability value for this OfferListing.
     * 
     * @return availability
     */
    public java.lang.String getAvailability() {
        return availability;
    }


    /**
     * Sets the availability value for this OfferListing.
     * 
     * @param availability
     */
    public void setAvailability(java.lang.String availability) {
        this.availability = availability;
    }


    /**
     * Gets the availabilityAttributes value for this OfferListing.
     * 
     * @return availabilityAttributes
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.OfferListingAvailabilityAttributes getAvailabilityAttributes() {
        return availabilityAttributes;
    }


    /**
     * Sets the availabilityAttributes value for this OfferListing.
     * 
     * @param availabilityAttributes
     */
    public void setAvailabilityAttributes(com.amazon.webservices.AWSECommerceService._2011_08_01.OfferListingAvailabilityAttributes availabilityAttributes) {
        this.availabilityAttributes = availabilityAttributes;
    }


    /**
     * Gets the isEligibleForSuperSaverShipping value for this OfferListing.
     * 
     * @return isEligibleForSuperSaverShipping
     */
    public java.lang.Boolean getIsEligibleForSuperSaverShipping() {
        return isEligibleForSuperSaverShipping;
    }


    /**
     * Sets the isEligibleForSuperSaverShipping value for this OfferListing.
     * 
     * @param isEligibleForSuperSaverShipping
     */
    public void setIsEligibleForSuperSaverShipping(java.lang.Boolean isEligibleForSuperSaverShipping) {
        this.isEligibleForSuperSaverShipping = isEligibleForSuperSaverShipping;
    }


    /**
     * Gets the isEligibleForPrime value for this OfferListing.
     * 
     * @return isEligibleForPrime
     */
    public java.lang.Boolean getIsEligibleForPrime() {
        return isEligibleForPrime;
    }


    /**
     * Sets the isEligibleForPrime value for this OfferListing.
     * 
     * @param isEligibleForPrime
     */
    public void setIsEligibleForPrime(java.lang.Boolean isEligibleForPrime) {
        this.isEligibleForPrime = isEligibleForPrime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfferListing)) return false;
        OfferListing other = (OfferListing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerListingId==null && other.getOfferListingId()==null) || 
             (this.offerListingId!=null &&
              this.offerListingId.equals(other.getOfferListingId()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.salePrice==null && other.getSalePrice()==null) || 
             (this.salePrice!=null &&
              this.salePrice.equals(other.getSalePrice()))) &&
            ((this.amountSaved==null && other.getAmountSaved()==null) || 
             (this.amountSaved!=null &&
              this.amountSaved.equals(other.getAmountSaved()))) &&
            ((this.percentageSaved==null && other.getPercentageSaved()==null) || 
             (this.percentageSaved!=null &&
              this.percentageSaved.equals(other.getPercentageSaved()))) &&
            ((this.availability==null && other.getAvailability()==null) || 
             (this.availability!=null &&
              this.availability.equals(other.getAvailability()))) &&
            ((this.availabilityAttributes==null && other.getAvailabilityAttributes()==null) || 
             (this.availabilityAttributes!=null &&
              this.availabilityAttributes.equals(other.getAvailabilityAttributes()))) &&
            ((this.isEligibleForSuperSaverShipping==null && other.getIsEligibleForSuperSaverShipping()==null) || 
             (this.isEligibleForSuperSaverShipping!=null &&
              this.isEligibleForSuperSaverShipping.equals(other.getIsEligibleForSuperSaverShipping()))) &&
            ((this.isEligibleForPrime==null && other.getIsEligibleForPrime()==null) || 
             (this.isEligibleForPrime!=null &&
              this.isEligibleForPrime.equals(other.getIsEligibleForPrime())));
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
        if (getOfferListingId() != null) {
            _hashCode += getOfferListingId().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getSalePrice() != null) {
            _hashCode += getSalePrice().hashCode();
        }
        if (getAmountSaved() != null) {
            _hashCode += getAmountSaved().hashCode();
        }
        if (getPercentageSaved() != null) {
            _hashCode += getPercentageSaved().hashCode();
        }
        if (getAvailability() != null) {
            _hashCode += getAvailability().hashCode();
        }
        if (getAvailabilityAttributes() != null) {
            _hashCode += getAvailabilityAttributes().hashCode();
        }
        if (getIsEligibleForSuperSaverShipping() != null) {
            _hashCode += getIsEligibleForSuperSaverShipping().hashCode();
        }
        if (getIsEligibleForPrime() != null) {
            _hashCode += getIsEligibleForPrime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferListing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OfferListing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerListingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OfferListingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SalePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountSaved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AmountSaved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentageSaved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "PercentageSaved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Availability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availabilityAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AvailabilityAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>OfferListing>AvailabilityAttributes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEligibleForSuperSaverShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "IsEligibleForSuperSaverShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEligibleForPrime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "IsEligibleForPrime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
