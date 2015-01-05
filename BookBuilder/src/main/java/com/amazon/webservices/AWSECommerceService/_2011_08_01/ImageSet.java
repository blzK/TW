/**
 * ImageSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class ImageSet  implements java.io.Serializable {
    private com.amazon.webservices.AWSECommerceService._2011_08_01.Image swatchImage;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Image smallImage;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Image thumbnailImage;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Image tinyImage;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Image mediumImage;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Image largeImage;

    private java.lang.String category;  // attribute

    public ImageSet() {
    }

    public ImageSet(
           com.amazon.webservices.AWSECommerceService._2011_08_01.Image swatchImage,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Image smallImage,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Image thumbnailImage,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Image tinyImage,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Image mediumImage,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Image largeImage,
           java.lang.String category) {
           this.swatchImage = swatchImage;
           this.smallImage = smallImage;
           this.thumbnailImage = thumbnailImage;
           this.tinyImage = tinyImage;
           this.mediumImage = mediumImage;
           this.largeImage = largeImage;
           this.category = category;
    }


    /**
     * Gets the swatchImage value for this ImageSet.
     * 
     * @return swatchImage
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Image getSwatchImage() {
        return swatchImage;
    }


    /**
     * Sets the swatchImage value for this ImageSet.
     * 
     * @param swatchImage
     */
    public void setSwatchImage(com.amazon.webservices.AWSECommerceService._2011_08_01.Image swatchImage) {
        this.swatchImage = swatchImage;
    }


    /**
     * Gets the smallImage value for this ImageSet.
     * 
     * @return smallImage
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Image getSmallImage() {
        return smallImage;
    }


    /**
     * Sets the smallImage value for this ImageSet.
     * 
     * @param smallImage
     */
    public void setSmallImage(com.amazon.webservices.AWSECommerceService._2011_08_01.Image smallImage) {
        this.smallImage = smallImage;
    }


    /**
     * Gets the thumbnailImage value for this ImageSet.
     * 
     * @return thumbnailImage
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Image getThumbnailImage() {
        return thumbnailImage;
    }


    /**
     * Sets the thumbnailImage value for this ImageSet.
     * 
     * @param thumbnailImage
     */
    public void setThumbnailImage(com.amazon.webservices.AWSECommerceService._2011_08_01.Image thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }


    /**
     * Gets the tinyImage value for this ImageSet.
     * 
     * @return tinyImage
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Image getTinyImage() {
        return tinyImage;
    }


    /**
     * Sets the tinyImage value for this ImageSet.
     * 
     * @param tinyImage
     */
    public void setTinyImage(com.amazon.webservices.AWSECommerceService._2011_08_01.Image tinyImage) {
        this.tinyImage = tinyImage;
    }


    /**
     * Gets the mediumImage value for this ImageSet.
     * 
     * @return mediumImage
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Image getMediumImage() {
        return mediumImage;
    }


    /**
     * Sets the mediumImage value for this ImageSet.
     * 
     * @param mediumImage
     */
    public void setMediumImage(com.amazon.webservices.AWSECommerceService._2011_08_01.Image mediumImage) {
        this.mediumImage = mediumImage;
    }


    /**
     * Gets the largeImage value for this ImageSet.
     * 
     * @return largeImage
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Image getLargeImage() {
        return largeImage;
    }


    /**
     * Sets the largeImage value for this ImageSet.
     * 
     * @param largeImage
     */
    public void setLargeImage(com.amazon.webservices.AWSECommerceService._2011_08_01.Image largeImage) {
        this.largeImage = largeImage;
    }


    /**
     * Gets the category value for this ImageSet.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ImageSet.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImageSet)) return false;
        ImageSet other = (ImageSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.swatchImage==null && other.getSwatchImage()==null) || 
             (this.swatchImage!=null &&
              this.swatchImage.equals(other.getSwatchImage()))) &&
            ((this.smallImage==null && other.getSmallImage()==null) || 
             (this.smallImage!=null &&
              this.smallImage.equals(other.getSmallImage()))) &&
            ((this.thumbnailImage==null && other.getThumbnailImage()==null) || 
             (this.thumbnailImage!=null &&
              this.thumbnailImage.equals(other.getThumbnailImage()))) &&
            ((this.tinyImage==null && other.getTinyImage()==null) || 
             (this.tinyImage!=null &&
              this.tinyImage.equals(other.getTinyImage()))) &&
            ((this.mediumImage==null && other.getMediumImage()==null) || 
             (this.mediumImage!=null &&
              this.mediumImage.equals(other.getMediumImage()))) &&
            ((this.largeImage==null && other.getLargeImage()==null) || 
             (this.largeImage!=null &&
              this.largeImage.equals(other.getLargeImage()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory())));
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
        if (getSwatchImage() != null) {
            _hashCode += getSwatchImage().hashCode();
        }
        if (getSmallImage() != null) {
            _hashCode += getSmallImage().hashCode();
        }
        if (getThumbnailImage() != null) {
            _hashCode += getThumbnailImage().hashCode();
        }
        if (getTinyImage() != null) {
            _hashCode += getTinyImage().hashCode();
        }
        if (getMediumImage() != null) {
            _hashCode += getMediumImage().hashCode();
        }
        if (getLargeImage() != null) {
            _hashCode += getLargeImage().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImageSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">ImageSet"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("category");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Category"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swatchImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SwatchImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smallImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SmallImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thumbnailImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ThumbnailImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tinyImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TinyImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediumImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MediumImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largeImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "LargeImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Image"));
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
