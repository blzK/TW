/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class Item  implements java.io.Serializable {
    private java.lang.String ASIN;

    private java.lang.String parentASIN;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.ErrorsError[] errors;

    private java.lang.String detailPageURL;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLink[] itemLinks;

    private java.lang.String salesRank;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Image smallImage;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Image mediumImage;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Image largeImage;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.ImageSet[][] imageSets;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributes itemAttributes;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.VariationAttribute[] variationAttributes;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItems[] relatedItems;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollection[] collections;

    private java.lang.String[] subjects;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.OfferSummary offerSummary;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Offers offers;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.VariationSummary variationSummary;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Variations variations;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.CustomerReviews customerReviews;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.EditorialReview[] editorialReviews;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarProductsSimilarProduct[] similarProducts;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.AccessoriesAccessory[] accessories;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.TracksDiscTrack[][] tracks;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodes browseNodes;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAlternateVersionsAlternateVersion[] alternateVersions;

    public Item() {
    }

    public Item(
           java.lang.String ASIN,
           java.lang.String parentASIN,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ErrorsError[] errors,
           java.lang.String detailPageURL,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLink[] itemLinks,
           java.lang.String salesRank,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Image smallImage,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Image mediumImage,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Image largeImage,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ImageSet[][] imageSets,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributes itemAttributes,
           com.amazon.webservices.AWSECommerceService._2011_08_01.VariationAttribute[] variationAttributes,
           com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItems[] relatedItems,
           com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollection[] collections,
           java.lang.String[] subjects,
           com.amazon.webservices.AWSECommerceService._2011_08_01.OfferSummary offerSummary,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Offers offers,
           com.amazon.webservices.AWSECommerceService._2011_08_01.VariationSummary variationSummary,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Variations variations,
           com.amazon.webservices.AWSECommerceService._2011_08_01.CustomerReviews customerReviews,
           com.amazon.webservices.AWSECommerceService._2011_08_01.EditorialReview[] editorialReviews,
           com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarProductsSimilarProduct[] similarProducts,
           com.amazon.webservices.AWSECommerceService._2011_08_01.AccessoriesAccessory[] accessories,
           com.amazon.webservices.AWSECommerceService._2011_08_01.TracksDiscTrack[][] tracks,
           com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodes browseNodes,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAlternateVersionsAlternateVersion[] alternateVersions) {
           this.ASIN = ASIN;
           this.parentASIN = parentASIN;
           this.errors = errors;
           this.detailPageURL = detailPageURL;
           this.itemLinks = itemLinks;
           this.salesRank = salesRank;
           this.smallImage = smallImage;
           this.mediumImage = mediumImage;
           this.largeImage = largeImage;
           this.imageSets = imageSets;
           this.itemAttributes = itemAttributes;
           this.variationAttributes = variationAttributes;
           this.relatedItems = relatedItems;
           this.collections = collections;
           this.subjects = subjects;
           this.offerSummary = offerSummary;
           this.offers = offers;
           this.variationSummary = variationSummary;
           this.variations = variations;
           this.customerReviews = customerReviews;
           this.editorialReviews = editorialReviews;
           this.similarProducts = similarProducts;
           this.accessories = accessories;
           this.tracks = tracks;
           this.browseNodes = browseNodes;
           this.alternateVersions = alternateVersions;
    }


    /**
     * Gets the ASIN value for this Item.
     * 
     * @return ASIN
     */
    public java.lang.String getASIN() {
        return ASIN;
    }


    /**
     * Sets the ASIN value for this Item.
     * 
     * @param ASIN
     */
    public void setASIN(java.lang.String ASIN) {
        this.ASIN = ASIN;
    }


    /**
     * Gets the parentASIN value for this Item.
     * 
     * @return parentASIN
     */
    public java.lang.String getParentASIN() {
        return parentASIN;
    }


    /**
     * Sets the parentASIN value for this Item.
     * 
     * @param parentASIN
     */
    public void setParentASIN(java.lang.String parentASIN) {
        this.parentASIN = parentASIN;
    }


    /**
     * Gets the errors value for this Item.
     * 
     * @return errors
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.ErrorsError[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this Item.
     * 
     * @param errors
     */
    public void setErrors(com.amazon.webservices.AWSECommerceService._2011_08_01.ErrorsError[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the detailPageURL value for this Item.
     * 
     * @return detailPageURL
     */
    public java.lang.String getDetailPageURL() {
        return detailPageURL;
    }


    /**
     * Sets the detailPageURL value for this Item.
     * 
     * @param detailPageURL
     */
    public void setDetailPageURL(java.lang.String detailPageURL) {
        this.detailPageURL = detailPageURL;
    }


    /**
     * Gets the itemLinks value for this Item.
     * 
     * @return itemLinks
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLink[] getItemLinks() {
        return itemLinks;
    }


    /**
     * Sets the itemLinks value for this Item.
     * 
     * @param itemLinks
     */
    public void setItemLinks(com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLink[] itemLinks) {
        this.itemLinks = itemLinks;
    }


    /**
     * Gets the salesRank value for this Item.
     * 
     * @return salesRank
     */
    public java.lang.String getSalesRank() {
        return salesRank;
    }


    /**
     * Sets the salesRank value for this Item.
     * 
     * @param salesRank
     */
    public void setSalesRank(java.lang.String salesRank) {
        this.salesRank = salesRank;
    }


    /**
     * Gets the smallImage value for this Item.
     * 
     * @return smallImage
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Image getSmallImage() {
        return smallImage;
    }


    /**
     * Sets the smallImage value for this Item.
     * 
     * @param smallImage
     */
    public void setSmallImage(com.amazon.webservices.AWSECommerceService._2011_08_01.Image smallImage) {
        this.smallImage = smallImage;
    }


    /**
     * Gets the mediumImage value for this Item.
     * 
     * @return mediumImage
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Image getMediumImage() {
        return mediumImage;
    }


    /**
     * Sets the mediumImage value for this Item.
     * 
     * @param mediumImage
     */
    public void setMediumImage(com.amazon.webservices.AWSECommerceService._2011_08_01.Image mediumImage) {
        this.mediumImage = mediumImage;
    }


    /**
     * Gets the largeImage value for this Item.
     * 
     * @return largeImage
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Image getLargeImage() {
        return largeImage;
    }


    /**
     * Sets the largeImage value for this Item.
     * 
     * @param largeImage
     */
    public void setLargeImage(com.amazon.webservices.AWSECommerceService._2011_08_01.Image largeImage) {
        this.largeImage = largeImage;
    }


    /**
     * Gets the imageSets value for this Item.
     * 
     * @return imageSets
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.ImageSet[][] getImageSets() {
        return imageSets;
    }


    /**
     * Sets the imageSets value for this Item.
     * 
     * @param imageSets
     */
    public void setImageSets(com.amazon.webservices.AWSECommerceService._2011_08_01.ImageSet[][] imageSets) {
        this.imageSets = imageSets;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.ImageSet[] getImageSets(int i) {
        return this.imageSets[i];
    }

    public void setImageSets(int i, com.amazon.webservices.AWSECommerceService._2011_08_01.ImageSet[] _value) {
        this.imageSets[i] = _value;
    }


    /**
     * Gets the itemAttributes value for this Item.
     * 
     * @return itemAttributes
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributes getItemAttributes() {
        return itemAttributes;
    }


    /**
     * Sets the itemAttributes value for this Item.
     * 
     * @param itemAttributes
     */
    public void setItemAttributes(com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributes itemAttributes) {
        this.itemAttributes = itemAttributes;
    }


    /**
     * Gets the variationAttributes value for this Item.
     * 
     * @return variationAttributes
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.VariationAttribute[] getVariationAttributes() {
        return variationAttributes;
    }


    /**
     * Sets the variationAttributes value for this Item.
     * 
     * @param variationAttributes
     */
    public void setVariationAttributes(com.amazon.webservices.AWSECommerceService._2011_08_01.VariationAttribute[] variationAttributes) {
        this.variationAttributes = variationAttributes;
    }


    /**
     * Gets the relatedItems value for this Item.
     * 
     * @return relatedItems
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItems[] getRelatedItems() {
        return relatedItems;
    }


    /**
     * Sets the relatedItems value for this Item.
     * 
     * @param relatedItems
     */
    public void setRelatedItems(com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItems[] relatedItems) {
        this.relatedItems = relatedItems;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItems getRelatedItems(int i) {
        return this.relatedItems[i];
    }

    public void setRelatedItems(int i, com.amazon.webservices.AWSECommerceService._2011_08_01.RelatedItems _value) {
        this.relatedItems[i] = _value;
    }


    /**
     * Gets the collections value for this Item.
     * 
     * @return collections
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollection[] getCollections() {
        return collections;
    }


    /**
     * Sets the collections value for this Item.
     * 
     * @param collections
     */
    public void setCollections(com.amazon.webservices.AWSECommerceService._2011_08_01.CollectionsCollection[] collections) {
        this.collections = collections;
    }


    /**
     * Gets the subjects value for this Item.
     * 
     * @return subjects
     */
    public java.lang.String[] getSubjects() {
        return subjects;
    }


    /**
     * Sets the subjects value for this Item.
     * 
     * @param subjects
     */
    public void setSubjects(java.lang.String[] subjects) {
        this.subjects = subjects;
    }


    /**
     * Gets the offerSummary value for this Item.
     * 
     * @return offerSummary
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.OfferSummary getOfferSummary() {
        return offerSummary;
    }


    /**
     * Sets the offerSummary value for this Item.
     * 
     * @param offerSummary
     */
    public void setOfferSummary(com.amazon.webservices.AWSECommerceService._2011_08_01.OfferSummary offerSummary) {
        this.offerSummary = offerSummary;
    }


    /**
     * Gets the offers value for this Item.
     * 
     * @return offers
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Offers getOffers() {
        return offers;
    }


    /**
     * Sets the offers value for this Item.
     * 
     * @param offers
     */
    public void setOffers(com.amazon.webservices.AWSECommerceService._2011_08_01.Offers offers) {
        this.offers = offers;
    }


    /**
     * Gets the variationSummary value for this Item.
     * 
     * @return variationSummary
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.VariationSummary getVariationSummary() {
        return variationSummary;
    }


    /**
     * Sets the variationSummary value for this Item.
     * 
     * @param variationSummary
     */
    public void setVariationSummary(com.amazon.webservices.AWSECommerceService._2011_08_01.VariationSummary variationSummary) {
        this.variationSummary = variationSummary;
    }


    /**
     * Gets the variations value for this Item.
     * 
     * @return variations
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Variations getVariations() {
        return variations;
    }


    /**
     * Sets the variations value for this Item.
     * 
     * @param variations
     */
    public void setVariations(com.amazon.webservices.AWSECommerceService._2011_08_01.Variations variations) {
        this.variations = variations;
    }


    /**
     * Gets the customerReviews value for this Item.
     * 
     * @return customerReviews
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.CustomerReviews getCustomerReviews() {
        return customerReviews;
    }


    /**
     * Sets the customerReviews value for this Item.
     * 
     * @param customerReviews
     */
    public void setCustomerReviews(com.amazon.webservices.AWSECommerceService._2011_08_01.CustomerReviews customerReviews) {
        this.customerReviews = customerReviews;
    }


    /**
     * Gets the editorialReviews value for this Item.
     * 
     * @return editorialReviews
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.EditorialReview[] getEditorialReviews() {
        return editorialReviews;
    }


    /**
     * Sets the editorialReviews value for this Item.
     * 
     * @param editorialReviews
     */
    public void setEditorialReviews(com.amazon.webservices.AWSECommerceService._2011_08_01.EditorialReview[] editorialReviews) {
        this.editorialReviews = editorialReviews;
    }


    /**
     * Gets the similarProducts value for this Item.
     * 
     * @return similarProducts
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarProductsSimilarProduct[] getSimilarProducts() {
        return similarProducts;
    }


    /**
     * Sets the similarProducts value for this Item.
     * 
     * @param similarProducts
     */
    public void setSimilarProducts(com.amazon.webservices.AWSECommerceService._2011_08_01.SimilarProductsSimilarProduct[] similarProducts) {
        this.similarProducts = similarProducts;
    }


    /**
     * Gets the accessories value for this Item.
     * 
     * @return accessories
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.AccessoriesAccessory[] getAccessories() {
        return accessories;
    }


    /**
     * Sets the accessories value for this Item.
     * 
     * @param accessories
     */
    public void setAccessories(com.amazon.webservices.AWSECommerceService._2011_08_01.AccessoriesAccessory[] accessories) {
        this.accessories = accessories;
    }


    /**
     * Gets the tracks value for this Item.
     * 
     * @return tracks
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.TracksDiscTrack[][] getTracks() {
        return tracks;
    }


    /**
     * Sets the tracks value for this Item.
     * 
     * @param tracks
     */
    public void setTracks(com.amazon.webservices.AWSECommerceService._2011_08_01.TracksDiscTrack[][] tracks) {
        this.tracks = tracks;
    }


    /**
     * Gets the browseNodes value for this Item.
     * 
     * @return browseNodes
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodes getBrowseNodes() {
        return browseNodes;
    }


    /**
     * Sets the browseNodes value for this Item.
     * 
     * @param browseNodes
     */
    public void setBrowseNodes(com.amazon.webservices.AWSECommerceService._2011_08_01.BrowseNodes browseNodes) {
        this.browseNodes = browseNodes;
    }


    /**
     * Gets the alternateVersions value for this Item.
     * 
     * @return alternateVersions
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAlternateVersionsAlternateVersion[] getAlternateVersions() {
        return alternateVersions;
    }


    /**
     * Sets the alternateVersions value for this Item.
     * 
     * @param alternateVersions
     */
    public void setAlternateVersions(com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAlternateVersionsAlternateVersion[] alternateVersions) {
        this.alternateVersions = alternateVersions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Item)) return false;
        Item other = (Item) obj;
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
            ((this.parentASIN==null && other.getParentASIN()==null) || 
             (this.parentASIN!=null &&
              this.parentASIN.equals(other.getParentASIN()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.detailPageURL==null && other.getDetailPageURL()==null) || 
             (this.detailPageURL!=null &&
              this.detailPageURL.equals(other.getDetailPageURL()))) &&
            ((this.itemLinks==null && other.getItemLinks()==null) || 
             (this.itemLinks!=null &&
              java.util.Arrays.equals(this.itemLinks, other.getItemLinks()))) &&
            ((this.salesRank==null && other.getSalesRank()==null) || 
             (this.salesRank!=null &&
              this.salesRank.equals(other.getSalesRank()))) &&
            ((this.smallImage==null && other.getSmallImage()==null) || 
             (this.smallImage!=null &&
              this.smallImage.equals(other.getSmallImage()))) &&
            ((this.mediumImage==null && other.getMediumImage()==null) || 
             (this.mediumImage!=null &&
              this.mediumImage.equals(other.getMediumImage()))) &&
            ((this.largeImage==null && other.getLargeImage()==null) || 
             (this.largeImage!=null &&
              this.largeImage.equals(other.getLargeImage()))) &&
            ((this.imageSets==null && other.getImageSets()==null) || 
             (this.imageSets!=null &&
              java.util.Arrays.equals(this.imageSets, other.getImageSets()))) &&
            ((this.itemAttributes==null && other.getItemAttributes()==null) || 
             (this.itemAttributes!=null &&
              this.itemAttributes.equals(other.getItemAttributes()))) &&
            ((this.variationAttributes==null && other.getVariationAttributes()==null) || 
             (this.variationAttributes!=null &&
              java.util.Arrays.equals(this.variationAttributes, other.getVariationAttributes()))) &&
            ((this.relatedItems==null && other.getRelatedItems()==null) || 
             (this.relatedItems!=null &&
              java.util.Arrays.equals(this.relatedItems, other.getRelatedItems()))) &&
            ((this.collections==null && other.getCollections()==null) || 
             (this.collections!=null &&
              java.util.Arrays.equals(this.collections, other.getCollections()))) &&
            ((this.subjects==null && other.getSubjects()==null) || 
             (this.subjects!=null &&
              java.util.Arrays.equals(this.subjects, other.getSubjects()))) &&
            ((this.offerSummary==null && other.getOfferSummary()==null) || 
             (this.offerSummary!=null &&
              this.offerSummary.equals(other.getOfferSummary()))) &&
            ((this.offers==null && other.getOffers()==null) || 
             (this.offers!=null &&
              this.offers.equals(other.getOffers()))) &&
            ((this.variationSummary==null && other.getVariationSummary()==null) || 
             (this.variationSummary!=null &&
              this.variationSummary.equals(other.getVariationSummary()))) &&
            ((this.variations==null && other.getVariations()==null) || 
             (this.variations!=null &&
              this.variations.equals(other.getVariations()))) &&
            ((this.customerReviews==null && other.getCustomerReviews()==null) || 
             (this.customerReviews!=null &&
              this.customerReviews.equals(other.getCustomerReviews()))) &&
            ((this.editorialReviews==null && other.getEditorialReviews()==null) || 
             (this.editorialReviews!=null &&
              java.util.Arrays.equals(this.editorialReviews, other.getEditorialReviews()))) &&
            ((this.similarProducts==null && other.getSimilarProducts()==null) || 
             (this.similarProducts!=null &&
              java.util.Arrays.equals(this.similarProducts, other.getSimilarProducts()))) &&
            ((this.accessories==null && other.getAccessories()==null) || 
             (this.accessories!=null &&
              java.util.Arrays.equals(this.accessories, other.getAccessories()))) &&
            ((this.tracks==null && other.getTracks()==null) || 
             (this.tracks!=null &&
              java.util.Arrays.equals(this.tracks, other.getTracks()))) &&
            ((this.browseNodes==null && other.getBrowseNodes()==null) || 
             (this.browseNodes!=null &&
              this.browseNodes.equals(other.getBrowseNodes()))) &&
            ((this.alternateVersions==null && other.getAlternateVersions()==null) || 
             (this.alternateVersions!=null &&
              java.util.Arrays.equals(this.alternateVersions, other.getAlternateVersions())));
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
        if (getParentASIN() != null) {
            _hashCode += getParentASIN().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDetailPageURL() != null) {
            _hashCode += getDetailPageURL().hashCode();
        }
        if (getItemLinks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemLinks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemLinks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesRank() != null) {
            _hashCode += getSalesRank().hashCode();
        }
        if (getSmallImage() != null) {
            _hashCode += getSmallImage().hashCode();
        }
        if (getMediumImage() != null) {
            _hashCode += getMediumImage().hashCode();
        }
        if (getLargeImage() != null) {
            _hashCode += getLargeImage().hashCode();
        }
        if (getImageSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageSets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemAttributes() != null) {
            _hashCode += getItemAttributes().hashCode();
        }
        if (getVariationAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariationAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariationAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRelatedItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelatedItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelatedItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCollections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCollections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCollections(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubjects(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOfferSummary() != null) {
            _hashCode += getOfferSummary().hashCode();
        }
        if (getOffers() != null) {
            _hashCode += getOffers().hashCode();
        }
        if (getVariationSummary() != null) {
            _hashCode += getVariationSummary().hashCode();
        }
        if (getVariations() != null) {
            _hashCode += getVariations().hashCode();
        }
        if (getCustomerReviews() != null) {
            _hashCode += getCustomerReviews().hashCode();
        }
        if (getEditorialReviews() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEditorialReviews());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEditorialReviews(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getAccessories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTracks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTracks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTracks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBrowseNodes() != null) {
            _hashCode += getBrowseNodes().hashCode();
        }
        if (getAlternateVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternateVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternateVersions(), i);
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
        new org.apache.axis.description.TypeDesc(Item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ASIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentASIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ParentASIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Errors"));
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
        elemField.setFieldName("itemLinks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemLinks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">ItemLinks"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SalesRank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ImageSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>Item>ImageSets"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">ItemAttributes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variationAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "VariationAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "VariationAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "RelatedItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "RelatedItems"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Collections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Collections"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjects");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Subjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Subject"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OfferSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">OfferSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Offers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Offers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variationSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "VariationSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">VariationSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Variations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Variations"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerReviews");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CustomerReviews"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">CustomerReviews"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorialReviews");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "EditorialReviews"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">EditorialReviews"));
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
        elemField.setFieldName("accessories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Accessories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Accessories"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Tracks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Tracks"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browseNodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">BrowseNodes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AlternateVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>Item>AlternateVersions>AlternateVersion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AlternateVersion"));
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
