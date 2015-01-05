/**
 * Cart.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class Cart  implements java.io.Serializable {
    private com.amazon.webservices.AWSECommerceService._2011_08_01.Request request;

    private java.lang.String cartId;

    private java.lang.String HMAC;

    private java.lang.String URLEncodedHMAC;

    private java.lang.String purchaseURL;

    private java.lang.String mobileCartURL;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price subTotal;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.CartItems cartItems;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.SavedForLaterItems savedForLaterItems;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarProductsSimilarProduct[] similarProducts;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.TopSellersTopSeller[] topSellers;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.NewReleasesNewRelease[] newReleases;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarViewedProductsSimilarViewedProduct[] similarViewedProducts;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.OtherCategoriesSimilarProductsOtherCategoriesSimilarProduct[] otherCategoriesSimilarProducts;

    public Cart() {
    }

    public Cart(
           com.amazon.webservices.AWSECommerceService._2011_08_01.Request request,
           java.lang.String cartId,
           java.lang.String HMAC,
           java.lang.String URLEncodedHMAC,
           java.lang.String purchaseURL,
           java.lang.String mobileCartURL,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price subTotal,
           com.amazon.webservices.AWSECommerceService._2011_08_01.CartItems cartItems,
           com.amazon.webservices.AWSECommerceService._2011_08_01.SavedForLaterItems savedForLaterItems,
           com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarProductsSimilarProduct[] similarProducts,
           com.amazon.webservices.AWSECommerceService._2011_08_01.TopSellersTopSeller[] topSellers,
           com.amazon.webservices.AWSECommerceService._2011_08_01.NewReleasesNewRelease[] newReleases,
           com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarViewedProductsSimilarViewedProduct[] similarViewedProducts,
           com.amazon.webservices.AWSECommerceService._2011_08_01.OtherCategoriesSimilarProductsOtherCategoriesSimilarProduct[] otherCategoriesSimilarProducts) {
           this.request = request;
           this.cartId = cartId;
           this.HMAC = HMAC;
           this.URLEncodedHMAC = URLEncodedHMAC;
           this.purchaseURL = purchaseURL;
           this.mobileCartURL = mobileCartURL;
           this.subTotal = subTotal;
           this.cartItems = cartItems;
           this.savedForLaterItems = savedForLaterItems;
           this.similarProducts = similarProducts;
           this.topSellers = topSellers;
           this.newReleases = newReleases;
           this.similarViewedProducts = similarViewedProducts;
           this.otherCategoriesSimilarProducts = otherCategoriesSimilarProducts;
    }


    /**
     * Gets the request value for this Cart.
     * 
     * @return request
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this Cart.
     * 
     * @param request
     */
    public void setRequest(com.amazon.webservices.AWSECommerceService._2011_08_01.Request request) {
        this.request = request;
    }


    /**
     * Gets the cartId value for this Cart.
     * 
     * @return cartId
     */
    public java.lang.String getCartId() {
        return cartId;
    }


    /**
     * Sets the cartId value for this Cart.
     * 
     * @param cartId
     */
    public void setCartId(java.lang.String cartId) {
        this.cartId = cartId;
    }


    /**
     * Gets the HMAC value for this Cart.
     * 
     * @return HMAC
     */
    public java.lang.String getHMAC() {
        return HMAC;
    }


    /**
     * Sets the HMAC value for this Cart.
     * 
     * @param HMAC
     */
    public void setHMAC(java.lang.String HMAC) {
        this.HMAC = HMAC;
    }


    /**
     * Gets the URLEncodedHMAC value for this Cart.
     * 
     * @return URLEncodedHMAC
     */
    public java.lang.String getURLEncodedHMAC() {
        return URLEncodedHMAC;
    }


    /**
     * Sets the URLEncodedHMAC value for this Cart.
     * 
     * @param URLEncodedHMAC
     */
    public void setURLEncodedHMAC(java.lang.String URLEncodedHMAC) {
        this.URLEncodedHMAC = URLEncodedHMAC;
    }


    /**
     * Gets the purchaseURL value for this Cart.
     * 
     * @return purchaseURL
     */
    public java.lang.String getPurchaseURL() {
        return purchaseURL;
    }


    /**
     * Sets the purchaseURL value for this Cart.
     * 
     * @param purchaseURL
     */
    public void setPurchaseURL(java.lang.String purchaseURL) {
        this.purchaseURL = purchaseURL;
    }


    /**
     * Gets the mobileCartURL value for this Cart.
     * 
     * @return mobileCartURL
     */
    public java.lang.String getMobileCartURL() {
        return mobileCartURL;
    }


    /**
     * Sets the mobileCartURL value for this Cart.
     * 
     * @param mobileCartURL
     */
    public void setMobileCartURL(java.lang.String mobileCartURL) {
        this.mobileCartURL = mobileCartURL;
    }


    /**
     * Gets the subTotal value for this Cart.
     * 
     * @return subTotal
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getSubTotal() {
        return subTotal;
    }


    /**
     * Sets the subTotal value for this Cart.
     * 
     * @param subTotal
     */
    public void setSubTotal(com.amazon.webservices.AWSECommerceService._2011_08_01.Price subTotal) {
        this.subTotal = subTotal;
    }


    /**
     * Gets the cartItems value for this Cart.
     * 
     * @return cartItems
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.CartItems getCartItems() {
        return cartItems;
    }


    /**
     * Sets the cartItems value for this Cart.
     * 
     * @param cartItems
     */
    public void setCartItems(com.amazon.webservices.AWSECommerceService._2011_08_01.CartItems cartItems) {
        this.cartItems = cartItems;
    }


    /**
     * Gets the savedForLaterItems value for this Cart.
     * 
     * @return savedForLaterItems
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.SavedForLaterItems getSavedForLaterItems() {
        return savedForLaterItems;
    }


    /**
     * Sets the savedForLaterItems value for this Cart.
     * 
     * @param savedForLaterItems
     */
    public void setSavedForLaterItems(com.amazon.webservices.AWSECommerceService._2011_08_01.SavedForLaterItems savedForLaterItems) {
        this.savedForLaterItems = savedForLaterItems;
    }


    /**
     * Gets the similarProducts value for this Cart.
     * 
     * @return similarProducts
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarProductsSimilarProduct[] getSimilarProducts() {
        return similarProducts;
    }


    /**
     * Sets the similarProducts value for this Cart.
     * 
     * @param similarProducts
     */
    public void setSimilarProducts(com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarProductsSimilarProduct[] similarProducts) {
        this.similarProducts = similarProducts;
    }


    /**
     * Gets the topSellers value for this Cart.
     * 
     * @return topSellers
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.TopSellersTopSeller[] getTopSellers() {
        return topSellers;
    }


    /**
     * Sets the topSellers value for this Cart.
     * 
     * @param topSellers
     */
    public void setTopSellers(com.amazon.webservices.AWSECommerceService._2011_08_01.TopSellersTopSeller[] topSellers) {
        this.topSellers = topSellers;
    }


    /**
     * Gets the newReleases value for this Cart.
     * 
     * @return newReleases
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.NewReleasesNewRelease[] getNewReleases() {
        return newReleases;
    }


    /**
     * Sets the newReleases value for this Cart.
     * 
     * @param newReleases
     */
    public void setNewReleases(com.amazon.webservices.AWSECommerceService._2011_08_01.NewReleasesNewRelease[] newReleases) {
        this.newReleases = newReleases;
    }


    /**
     * Gets the similarViewedProducts value for this Cart.
     * 
     * @return similarViewedProducts
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarViewedProductsSimilarViewedProduct[] getSimilarViewedProducts() {
        return similarViewedProducts;
    }


    /**
     * Sets the similarViewedProducts value for this Cart.
     * 
     * @param similarViewedProducts
     */
    public void setSimilarViewedProducts(com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarViewedProductsSimilarViewedProduct[] similarViewedProducts) {
        this.similarViewedProducts = similarViewedProducts;
    }


    /**
     * Gets the otherCategoriesSimilarProducts value for this Cart.
     * 
     * @return otherCategoriesSimilarProducts
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.OtherCategoriesSimilarProductsOtherCategoriesSimilarProduct[] getOtherCategoriesSimilarProducts() {
        return otherCategoriesSimilarProducts;
    }


    /**
     * Sets the otherCategoriesSimilarProducts value for this Cart.
     * 
     * @param otherCategoriesSimilarProducts
     */
    public void setOtherCategoriesSimilarProducts(com.amazon.webservices.AWSECommerceService._2011_08_01.OtherCategoriesSimilarProductsOtherCategoriesSimilarProduct[] otherCategoriesSimilarProducts) {
        this.otherCategoriesSimilarProducts = otherCategoriesSimilarProducts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cart)) return false;
        Cart other = (Cart) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            ((this.cartId==null && other.getCartId()==null) || 
             (this.cartId!=null &&
              this.cartId.equals(other.getCartId()))) &&
            ((this.HMAC==null && other.getHMAC()==null) || 
             (this.HMAC!=null &&
              this.HMAC.equals(other.getHMAC()))) &&
            ((this.URLEncodedHMAC==null && other.getURLEncodedHMAC()==null) || 
             (this.URLEncodedHMAC!=null &&
              this.URLEncodedHMAC.equals(other.getURLEncodedHMAC()))) &&
            ((this.purchaseURL==null && other.getPurchaseURL()==null) || 
             (this.purchaseURL!=null &&
              this.purchaseURL.equals(other.getPurchaseURL()))) &&
            ((this.mobileCartURL==null && other.getMobileCartURL()==null) || 
             (this.mobileCartURL!=null &&
              this.mobileCartURL.equals(other.getMobileCartURL()))) &&
            ((this.subTotal==null && other.getSubTotal()==null) || 
             (this.subTotal!=null &&
              this.subTotal.equals(other.getSubTotal()))) &&
            ((this.cartItems==null && other.getCartItems()==null) || 
             (this.cartItems!=null &&
              this.cartItems.equals(other.getCartItems()))) &&
            ((this.savedForLaterItems==null && other.getSavedForLaterItems()==null) || 
             (this.savedForLaterItems!=null &&
              this.savedForLaterItems.equals(other.getSavedForLaterItems()))) &&
            ((this.similarProducts==null && other.getSimilarProducts()==null) || 
             (this.similarProducts!=null &&
              java.util.Arrays.equals(this.similarProducts, other.getSimilarProducts()))) &&
            ((this.topSellers==null && other.getTopSellers()==null) || 
             (this.topSellers!=null &&
              java.util.Arrays.equals(this.topSellers, other.getTopSellers()))) &&
            ((this.newReleases==null && other.getNewReleases()==null) || 
             (this.newReleases!=null &&
              java.util.Arrays.equals(this.newReleases, other.getNewReleases()))) &&
            ((this.similarViewedProducts==null && other.getSimilarViewedProducts()==null) || 
             (this.similarViewedProducts!=null &&
              java.util.Arrays.equals(this.similarViewedProducts, other.getSimilarViewedProducts()))) &&
            ((this.otherCategoriesSimilarProducts==null && other.getOtherCategoriesSimilarProducts()==null) || 
             (this.otherCategoriesSimilarProducts!=null &&
              java.util.Arrays.equals(this.otherCategoriesSimilarProducts, other.getOtherCategoriesSimilarProducts())));
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
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        if (getCartId() != null) {
            _hashCode += getCartId().hashCode();
        }
        if (getHMAC() != null) {
            _hashCode += getHMAC().hashCode();
        }
        if (getURLEncodedHMAC() != null) {
            _hashCode += getURLEncodedHMAC().hashCode();
        }
        if (getPurchaseURL() != null) {
            _hashCode += getPurchaseURL().hashCode();
        }
        if (getMobileCartURL() != null) {
            _hashCode += getMobileCartURL().hashCode();
        }
        if (getSubTotal() != null) {
            _hashCode += getSubTotal().hashCode();
        }
        if (getCartItems() != null) {
            _hashCode += getCartItems().hashCode();
        }
        if (getSavedForLaterItems() != null) {
            _hashCode += getSavedForLaterItems().hashCode();
        }
        if (getSimilarProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimilarProducts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimilarProducts(), i);
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
        if (getSimilarViewedProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimilarViewedProducts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimilarViewedProducts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtherCategoriesSimilarProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherCategoriesSimilarProducts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherCategoriesSimilarProducts(), i);
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
        new org.apache.axis.description.TypeDesc(Cart.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Cart"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Request"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HMAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "HMAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLEncodedHMAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "URLEncodedHMAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "PurchaseURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileCartURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MobileCartURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SubTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CartItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">CartItems"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savedForLaterItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SavedForLaterItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">SavedForLaterItems"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similarProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SimilarProducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">SimilarProducts"));
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
        elemField.setFieldName("similarViewedProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SimilarViewedProducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">SimilarViewedProducts"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherCategoriesSimilarProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OtherCategoriesSimilarProducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OtherCategoriesSimilarProducts"));
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
