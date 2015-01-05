/**
 * BrowseNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class BrowseNode  implements java.io.Serializable {
    private java.lang.String browseNodeId;

    private java.lang.String name;

    private java.lang.Boolean isCategoryRoot;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Property[] properties;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNode[] children;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNode[] ancestors;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.TopSellersTopSeller[] topSellers;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.NewReleasesNewRelease[] newReleases;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.TopItemSet[] topItemSet;

    public BrowseNode() {
    }

    public BrowseNode(
           java.lang.String browseNodeId,
           java.lang.String name,
           java.lang.Boolean isCategoryRoot,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Property[] properties,
           com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNode[] children,
           com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNode[] ancestors,
           com.amazon.webservices.AWSECommerceService._2011_08_01.TopSellersTopSeller[] topSellers,
           com.amazon.webservices.AWSECommerceService._2011_08_01.NewReleasesNewRelease[] newReleases,
           com.amazon.webservices.AWSECommerceService._2011_08_01.TopItemSet[] topItemSet) {
           this.browseNodeId = browseNodeId;
           this.name = name;
           this.isCategoryRoot = isCategoryRoot;
           this.properties = properties;
           this.children = children;
           this.ancestors = ancestors;
           this.topSellers = topSellers;
           this.newReleases = newReleases;
           this.topItemSet = topItemSet;
    }


    /**
     * Gets the browseNodeId value for this BrowseNode.
     * 
     * @return browseNodeId
     */
    public java.lang.String getBrowseNodeId() {
        return browseNodeId;
    }


    /**
     * Sets the browseNodeId value for this BrowseNode.
     * 
     * @param browseNodeId
     */
    public void setBrowseNodeId(java.lang.String browseNodeId) {
        this.browseNodeId = browseNodeId;
    }


    /**
     * Gets the name value for this BrowseNode.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BrowseNode.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the isCategoryRoot value for this BrowseNode.
     * 
     * @return isCategoryRoot
     */
    public java.lang.Boolean getIsCategoryRoot() {
        return isCategoryRoot;
    }


    /**
     * Sets the isCategoryRoot value for this BrowseNode.
     * 
     * @param isCategoryRoot
     */
    public void setIsCategoryRoot(java.lang.Boolean isCategoryRoot) {
        this.isCategoryRoot = isCategoryRoot;
    }


    /**
     * Gets the properties value for this BrowseNode.
     * 
     * @return properties
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Property[] getProperties() {
        return properties;
    }


    /**
     * Sets the properties value for this BrowseNode.
     * 
     * @param properties
     */
    public void setProperties(com.amazon.webservices.AWSECommerceService._2011_08_01.Property[] properties) {
        this.properties = properties;
    }


    /**
     * Gets the children value for this BrowseNode.
     * 
     * @return children
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNode[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this BrowseNode.
     * 
     * @param children
     */
    public void setChildren(com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNode[] children) {
        this.children = children;
    }


    /**
     * Gets the ancestors value for this BrowseNode.
     * 
     * @return ancestors
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNode[] getAncestors() {
        return ancestors;
    }


    /**
     * Sets the ancestors value for this BrowseNode.
     * 
     * @param ancestors
     */
    public void setAncestors(com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNode[] ancestors) {
        this.ancestors = ancestors;
    }


    /**
     * Gets the topSellers value for this BrowseNode.
     * 
     * @return topSellers
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.TopSellersTopSeller[] getTopSellers() {
        return topSellers;
    }


    /**
     * Sets the topSellers value for this BrowseNode.
     * 
     * @param topSellers
     */
    public void setTopSellers(com.amazon.webservices.AWSECommerceService._2011_08_01.TopSellersTopSeller[] topSellers) {
        this.topSellers = topSellers;
    }


    /**
     * Gets the newReleases value for this BrowseNode.
     * 
     * @return newReleases
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.NewReleasesNewRelease[] getNewReleases() {
        return newReleases;
    }


    /**
     * Sets the newReleases value for this BrowseNode.
     * 
     * @param newReleases
     */
    public void setNewReleases(com.amazon.webservices.AWSECommerceService._2011_08_01.NewReleasesNewRelease[] newReleases) {
        this.newReleases = newReleases;
    }


    /**
     * Gets the topItemSet value for this BrowseNode.
     * 
     * @return topItemSet
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.TopItemSet[] getTopItemSet() {
        return topItemSet;
    }


    /**
     * Sets the topItemSet value for this BrowseNode.
     * 
     * @param topItemSet
     */
    public void setTopItemSet(com.amazon.webservices.AWSECommerceService._2011_08_01.TopItemSet[] topItemSet) {
        this.topItemSet = topItemSet;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.TopItemSet getTopItemSet(int i) {
        return this.topItemSet[i];
    }

    public void setTopItemSet(int i, com.amazon.webservices.AWSECommerceService._2011_08_01.TopItemSet _value) {
        this.topItemSet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrowseNode)) return false;
        BrowseNode other = (BrowseNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.browseNodeId==null && other.getBrowseNodeId()==null) || 
             (this.browseNodeId!=null &&
              this.browseNodeId.equals(other.getBrowseNodeId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.isCategoryRoot==null && other.getIsCategoryRoot()==null) || 
             (this.isCategoryRoot!=null &&
              this.isCategoryRoot.equals(other.getIsCategoryRoot()))) &&
            ((this.properties==null && other.getProperties()==null) || 
             (this.properties!=null &&
              java.util.Arrays.equals(this.properties, other.getProperties()))) &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            ((this.ancestors==null && other.getAncestors()==null) || 
             (this.ancestors!=null &&
              java.util.Arrays.equals(this.ancestors, other.getAncestors()))) &&
            ((this.topSellers==null && other.getTopSellers()==null) || 
             (this.topSellers!=null &&
              java.util.Arrays.equals(this.topSellers, other.getTopSellers()))) &&
            ((this.newReleases==null && other.getNewReleases()==null) || 
             (this.newReleases!=null &&
              java.util.Arrays.equals(this.newReleases, other.getNewReleases()))) &&
            ((this.topItemSet==null && other.getTopItemSet()==null) || 
             (this.topItemSet!=null &&
              java.util.Arrays.equals(this.topItemSet, other.getTopItemSet())));
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
        if (getBrowseNodeId() != null) {
            _hashCode += getBrowseNodeId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIsCategoryRoot() != null) {
            _hashCode += getIsCategoryRoot().hashCode();
        }
        if (getProperties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProperties(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAncestors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAncestors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAncestors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTopSellers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTopSellers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTopSellers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNewReleases() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNewReleases());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNewReleases(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTopItemSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTopItemSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTopItemSet(), i);
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
        new org.apache.axis.description.TypeDesc(BrowseNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">BrowseNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browseNodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNodeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCategoryRoot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "IsCategoryRoot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Properties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Property"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancestors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Ancestors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topSellers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TopSellers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">TopSellers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newReleases");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "NewReleases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">NewReleases"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topItemSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TopItemSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TopItemSet"));
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
