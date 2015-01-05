/**
 * PromotionSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class PromotionSummary  implements java.io.Serializable {
    private java.lang.String promotionId;

    private java.lang.String category;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String eligibilityRequirementDescription;

    private java.lang.String benefitDescription;

    private java.lang.String termsAndConditions;

    public PromotionSummary() {
    }

    public PromotionSummary(
           java.lang.String promotionId,
           java.lang.String category,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String eligibilityRequirementDescription,
           java.lang.String benefitDescription,
           java.lang.String termsAndConditions) {
           this.promotionId = promotionId;
           this.category = category;
           this.startDate = startDate;
           this.endDate = endDate;
           this.eligibilityRequirementDescription = eligibilityRequirementDescription;
           this.benefitDescription = benefitDescription;
           this.termsAndConditions = termsAndConditions;
    }


    /**
     * Gets the promotionId value for this PromotionSummary.
     * 
     * @return promotionId
     */
    public java.lang.String getPromotionId() {
        return promotionId;
    }


    /**
     * Sets the promotionId value for this PromotionSummary.
     * 
     * @param promotionId
     */
    public void setPromotionId(java.lang.String promotionId) {
        this.promotionId = promotionId;
    }


    /**
     * Gets the category value for this PromotionSummary.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this PromotionSummary.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the startDate value for this PromotionSummary.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PromotionSummary.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this PromotionSummary.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PromotionSummary.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the eligibilityRequirementDescription value for this PromotionSummary.
     * 
     * @return eligibilityRequirementDescription
     */
    public java.lang.String getEligibilityRequirementDescription() {
        return eligibilityRequirementDescription;
    }


    /**
     * Sets the eligibilityRequirementDescription value for this PromotionSummary.
     * 
     * @param eligibilityRequirementDescription
     */
    public void setEligibilityRequirementDescription(java.lang.String eligibilityRequirementDescription) {
        this.eligibilityRequirementDescription = eligibilityRequirementDescription;
    }


    /**
     * Gets the benefitDescription value for this PromotionSummary.
     * 
     * @return benefitDescription
     */
    public java.lang.String getBenefitDescription() {
        return benefitDescription;
    }


    /**
     * Sets the benefitDescription value for this PromotionSummary.
     * 
     * @param benefitDescription
     */
    public void setBenefitDescription(java.lang.String benefitDescription) {
        this.benefitDescription = benefitDescription;
    }


    /**
     * Gets the termsAndConditions value for this PromotionSummary.
     * 
     * @return termsAndConditions
     */
    public java.lang.String getTermsAndConditions() {
        return termsAndConditions;
    }


    /**
     * Sets the termsAndConditions value for this PromotionSummary.
     * 
     * @param termsAndConditions
     */
    public void setTermsAndConditions(java.lang.String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotionSummary)) return false;
        PromotionSummary other = (PromotionSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.promotionId==null && other.getPromotionId()==null) || 
             (this.promotionId!=null &&
              this.promotionId.equals(other.getPromotionId()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.eligibilityRequirementDescription==null && other.getEligibilityRequirementDescription()==null) || 
             (this.eligibilityRequirementDescription!=null &&
              this.eligibilityRequirementDescription.equals(other.getEligibilityRequirementDescription()))) &&
            ((this.benefitDescription==null && other.getBenefitDescription()==null) || 
             (this.benefitDescription!=null &&
              this.benefitDescription.equals(other.getBenefitDescription()))) &&
            ((this.termsAndConditions==null && other.getTermsAndConditions()==null) || 
             (this.termsAndConditions!=null &&
              this.termsAndConditions.equals(other.getTermsAndConditions())));
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
        if (getPromotionId() != null) {
            _hashCode += getPromotionId().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEligibilityRequirementDescription() != null) {
            _hashCode += getEligibilityRequirementDescription().hashCode();
        }
        if (getBenefitDescription() != null) {
            _hashCode += getBenefitDescription().hashCode();
        }
        if (getTermsAndConditions() != null) {
            _hashCode += getTermsAndConditions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromotionSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Promotion>Summary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "PromotionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibilityRequirementDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "EligibilityRequirementDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BenefitDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termsAndConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TermsAndConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
