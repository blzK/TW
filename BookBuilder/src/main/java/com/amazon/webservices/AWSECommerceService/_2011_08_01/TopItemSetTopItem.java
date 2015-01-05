/**
 * TopItemSetTopItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class TopItemSetTopItem  implements java.io.Serializable {
    private java.lang.String ASIN;

    private java.lang.String title;

    private java.lang.String detailPageURL;

    private java.lang.String productGroup;

    private java.lang.String[] author;

    private java.lang.String[] artist;

    private java.lang.String[] actor;

    public TopItemSetTopItem() {
    }

    public TopItemSetTopItem(
           java.lang.String ASIN,
           java.lang.String title,
           java.lang.String detailPageURL,
           java.lang.String productGroup,
           java.lang.String[] author,
           java.lang.String[] artist,
           java.lang.String[] actor) {
           this.ASIN = ASIN;
           this.title = title;
           this.detailPageURL = detailPageURL;
           this.productGroup = productGroup;
           this.author = author;
           this.artist = artist;
           this.actor = actor;
    }


    /**
     * Gets the ASIN value for this TopItemSetTopItem.
     * 
     * @return ASIN
     */
    public java.lang.String getASIN() {
        return ASIN;
    }


    /**
     * Sets the ASIN value for this TopItemSetTopItem.
     * 
     * @param ASIN
     */
    public void setASIN(java.lang.String ASIN) {
        this.ASIN = ASIN;
    }


    /**
     * Gets the title value for this TopItemSetTopItem.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this TopItemSetTopItem.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the detailPageURL value for this TopItemSetTopItem.
     * 
     * @return detailPageURL
     */
    public java.lang.String getDetailPageURL() {
        return detailPageURL;
    }


    /**
     * Sets the detailPageURL value for this TopItemSetTopItem.
     * 
     * @param detailPageURL
     */
    public void setDetailPageURL(java.lang.String detailPageURL) {
        this.detailPageURL = detailPageURL;
    }


    /**
     * Gets the productGroup value for this TopItemSetTopItem.
     * 
     * @return productGroup
     */
    public java.lang.String getProductGroup() {
        return productGroup;
    }


    /**
     * Sets the productGroup value for this TopItemSetTopItem.
     * 
     * @param productGroup
     */
    public void setProductGroup(java.lang.String productGroup) {
        this.productGroup = productGroup;
    }


    /**
     * Gets the author value for this TopItemSetTopItem.
     * 
     * @return author
     */
    public java.lang.String[] getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this TopItemSetTopItem.
     * 
     * @param author
     */
    public void setAuthor(java.lang.String[] author) {
        this.author = author;
    }

    public java.lang.String getAuthor(int i) {
        return this.author[i];
    }

    public void setAuthor(int i, java.lang.String _value) {
        this.author[i] = _value;
    }


    /**
     * Gets the artist value for this TopItemSetTopItem.
     * 
     * @return artist
     */
    public java.lang.String[] getArtist() {
        return artist;
    }


    /**
     * Sets the artist value for this TopItemSetTopItem.
     * 
     * @param artist
     */
    public void setArtist(java.lang.String[] artist) {
        this.artist = artist;
    }

    public java.lang.String getArtist(int i) {
        return this.artist[i];
    }

    public void setArtist(int i, java.lang.String _value) {
        this.artist[i] = _value;
    }


    /**
     * Gets the actor value for this TopItemSetTopItem.
     * 
     * @return actor
     */
    public java.lang.String[] getActor() {
        return actor;
    }


    /**
     * Sets the actor value for this TopItemSetTopItem.
     * 
     * @param actor
     */
    public void setActor(java.lang.String[] actor) {
        this.actor = actor;
    }

    public java.lang.String getActor(int i) {
        return this.actor[i];
    }

    public void setActor(int i, java.lang.String _value) {
        this.actor[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TopItemSetTopItem)) return false;
        TopItemSetTopItem other = (TopItemSetTopItem) obj;
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
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.detailPageURL==null && other.getDetailPageURL()==null) || 
             (this.detailPageURL!=null &&
              this.detailPageURL.equals(other.getDetailPageURL()))) &&
            ((this.productGroup==null && other.getProductGroup()==null) || 
             (this.productGroup!=null &&
              this.productGroup.equals(other.getProductGroup()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              java.util.Arrays.equals(this.author, other.getAuthor()))) &&
            ((this.artist==null && other.getArtist()==null) || 
             (this.artist!=null &&
              java.util.Arrays.equals(this.artist, other.getArtist()))) &&
            ((this.actor==null && other.getActor()==null) || 
             (this.actor!=null &&
              java.util.Arrays.equals(this.actor, other.getActor())));
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getDetailPageURL() != null) {
            _hashCode += getDetailPageURL().hashCode();
        }
        if (getProductGroup() != null) {
            _hashCode += getProductGroup().hashCode();
        }
        if (getAuthor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArtist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArtist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArtist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActor(), i);
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
        new org.apache.axis.description.TypeDesc(TopItemSetTopItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>TopItemSet>TopItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ASIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("detailPageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "DetailPageURL"));
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
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Artist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Actor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
