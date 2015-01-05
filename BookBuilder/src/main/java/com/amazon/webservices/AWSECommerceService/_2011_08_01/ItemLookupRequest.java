/**
 * ItemLookupRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class ItemLookupRequest  implements java.io.Serializable {
    private com.amazon.webservices.AWSECommerceService._2011_08_01.Condition condition;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequestIdType idType;

    private java.lang.String merchantId;

    private java.lang.String[] itemId;

    private java.lang.String[] responseGroup;

    private java.lang.String searchIndex;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll variationPage;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll relatedItemPage;

    private java.lang.String[] relationshipType;

    private java.lang.String includeReviewsSummary;

    private org.apache.axis.types.NonNegativeInteger truncateReviewsAt;

    public ItemLookupRequest() {
    }

    public ItemLookupRequest(
           com.amazon.webservices.AWSECommerceService._2011_08_01.Condition condition,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequestIdType idType,
           java.lang.String merchantId,
           java.lang.String[] itemId,
           java.lang.String[] responseGroup,
           java.lang.String searchIndex,
           com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll variationPage,
           com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll relatedItemPage,
           java.lang.String[] relationshipType,
           java.lang.String includeReviewsSummary,
           org.apache.axis.types.NonNegativeInteger truncateReviewsAt) {
           this.condition = condition;
           this.idType = idType;
           this.merchantId = merchantId;
           this.itemId = itemId;
           this.responseGroup = responseGroup;
           this.searchIndex = searchIndex;
           this.variationPage = variationPage;
           this.relatedItemPage = relatedItemPage;
           this.relationshipType = relationshipType;
           this.includeReviewsSummary = includeReviewsSummary;
           this.truncateReviewsAt = truncateReviewsAt;
    }


    /**
     * Gets the condition value for this ItemLookupRequest.
     * 
     * @return condition
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Condition getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this ItemLookupRequest.
     * 
     * @param condition
     */
    public void setCondition(com.amazon.webservices.AWSECommerceService._2011_08_01.Condition condition) {
        this.condition = condition;
    }


    /**
     * Gets the idType value for this ItemLookupRequest.
     * 
     * @return idType
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequestIdType getIdType() {
        return idType;
    }


    /**
     * Sets the idType value for this ItemLookupRequest.
     * 
     * @param idType
     */
    public void setIdType(com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequestIdType idType) {
        this.idType = idType;
    }


    /**
     * Gets the merchantId value for this ItemLookupRequest.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this ItemLookupRequest.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the itemId value for this ItemLookupRequest.
     * 
     * @return itemId
     */
    public java.lang.String[] getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ItemLookupRequest.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.String[] itemId) {
        this.itemId = itemId;
    }

    public java.lang.String getItemId(int i) {
        return this.itemId[i];
    }

    public void setItemId(int i, java.lang.String _value) {
        this.itemId[i] = _value;
    }


    /**
     * Gets the responseGroup value for this ItemLookupRequest.
     * 
     * @return responseGroup
     */
    public java.lang.String[] getResponseGroup() {
        return responseGroup;
    }


    /**
     * Sets the responseGroup value for this ItemLookupRequest.
     * 
     * @param responseGroup
     */
    public void setResponseGroup(java.lang.String[] responseGroup) {
        this.responseGroup = responseGroup;
    }

    public java.lang.String getResponseGroup(int i) {
        return this.responseGroup[i];
    }

    public void setResponseGroup(int i, java.lang.String _value) {
        this.responseGroup[i] = _value;
    }


    /**
     * Gets the searchIndex value for this ItemLookupRequest.
     * 
     * @return searchIndex
     */
    public java.lang.String getSearchIndex() {
        return searchIndex;
    }


    /**
     * Sets the searchIndex value for this ItemLookupRequest.
     * 
     * @param searchIndex
     */
    public void setSearchIndex(java.lang.String searchIndex) {
        this.searchIndex = searchIndex;
    }


    /**
     * Gets the variationPage value for this ItemLookupRequest.
     * 
     * @return variationPage
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll getVariationPage() {
        return variationPage;
    }


    /**
     * Sets the variationPage value for this ItemLookupRequest.
     * 
     * @param variationPage
     */
    public void setVariationPage(com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll variationPage) {
        this.variationPage = variationPage;
    }


    /**
     * Gets the relatedItemPage value for this ItemLookupRequest.
     * 
     * @return relatedItemPage
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll getRelatedItemPage() {
        return relatedItemPage;
    }


    /**
     * Sets the relatedItemPage value for this ItemLookupRequest.
     * 
     * @param relatedItemPage
     */
    public void setRelatedItemPage(com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll relatedItemPage) {
        this.relatedItemPage = relatedItemPage;
    }


    /**
     * Gets the relationshipType value for this ItemLookupRequest.
     * 
     * @return relationshipType
     */
    public java.lang.String[] getRelationshipType() {
        return relationshipType;
    }


    /**
     * Sets the relationshipType value for this ItemLookupRequest.
     * 
     * @param relationshipType
     */
    public void setRelationshipType(java.lang.String[] relationshipType) {
        this.relationshipType = relationshipType;
    }

    public java.lang.String getRelationshipType(int i) {
        return this.relationshipType[i];
    }

    public void setRelationshipType(int i, java.lang.String _value) {
        this.relationshipType[i] = _value;
    }


    /**
     * Gets the includeReviewsSummary value for this ItemLookupRequest.
     * 
     * @return includeReviewsSummary
     */
    public java.lang.String getIncludeReviewsSummary() {
        return includeReviewsSummary;
    }


    /**
     * Sets the includeReviewsSummary value for this ItemLookupRequest.
     * 
     * @param includeReviewsSummary
     */
    public void setIncludeReviewsSummary(java.lang.String includeReviewsSummary) {
        this.includeReviewsSummary = includeReviewsSummary;
    }


    /**
     * Gets the truncateReviewsAt value for this ItemLookupRequest.
     * 
     * @return truncateReviewsAt
     */
    public org.apache.axis.types.NonNegativeInteger getTruncateReviewsAt() {
        return truncateReviewsAt;
    }


    /**
     * Sets the truncateReviewsAt value for this ItemLookupRequest.
     * 
     * @param truncateReviewsAt
     */
    public void setTruncateReviewsAt(org.apache.axis.types.NonNegativeInteger truncateReviewsAt) {
        this.truncateReviewsAt = truncateReviewsAt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemLookupRequest)) return false;
        ItemLookupRequest other = (ItemLookupRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            ((this.idType==null && other.getIdType()==null) || 
             (this.idType!=null &&
              this.idType.equals(other.getIdType()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              java.util.Arrays.equals(this.itemId, other.getItemId()))) &&
            ((this.responseGroup==null && other.getResponseGroup()==null) || 
             (this.responseGroup!=null &&
              java.util.Arrays.equals(this.responseGroup, other.getResponseGroup()))) &&
            ((this.searchIndex==null && other.getSearchIndex()==null) || 
             (this.searchIndex!=null &&
              this.searchIndex.equals(other.getSearchIndex()))) &&
            ((this.variationPage==null && other.getVariationPage()==null) || 
             (this.variationPage!=null &&
              this.variationPage.equals(other.getVariationPage()))) &&
            ((this.relatedItemPage==null && other.getRelatedItemPage()==null) || 
             (this.relatedItemPage!=null &&
              this.relatedItemPage.equals(other.getRelatedItemPage()))) &&
            ((this.relationshipType==null && other.getRelationshipType()==null) || 
             (this.relationshipType!=null &&
              java.util.Arrays.equals(this.relationshipType, other.getRelationshipType()))) &&
            ((this.includeReviewsSummary==null && other.getIncludeReviewsSummary()==null) || 
             (this.includeReviewsSummary!=null &&
              this.includeReviewsSummary.equals(other.getIncludeReviewsSummary()))) &&
            ((this.truncateReviewsAt==null && other.getTruncateReviewsAt()==null) || 
             (this.truncateReviewsAt!=null &&
              this.truncateReviewsAt.equals(other.getTruncateReviewsAt())));
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
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getIdType() != null) {
            _hashCode += getIdType().hashCode();
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getItemId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchIndex() != null) {
            _hashCode += getSearchIndex().hashCode();
        }
        if (getVariationPage() != null) {
            _hashCode += getVariationPage().hashCode();
        }
        if (getRelatedItemPage() != null) {
            _hashCode += getRelatedItemPage().hashCode();
        }
        if (getRelationshipType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelationshipType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelationshipType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeReviewsSummary() != null) {
            _hashCode += getIncludeReviewsSummary().hashCode();
        }
        if (getTruncateReviewsAt() != null) {
            _hashCode += getTruncateReviewsAt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemLookupRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemLookupRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Condition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "IdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">ItemLookupRequest>IdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MerchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ResponseGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SearchIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variationPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "VariationPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "positiveIntegerOrAll"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItemPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "RelatedItemPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "positiveIntegerOrAll"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "RelationshipType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeReviewsSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "IncludeReviewsSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("truncateReviewsAt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TruncateReviewsAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
