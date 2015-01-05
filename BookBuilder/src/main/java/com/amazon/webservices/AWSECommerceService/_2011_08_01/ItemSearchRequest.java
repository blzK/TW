/**
 * ItemSearchRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class ItemSearchRequest  implements java.io.Serializable {
    private java.lang.String actor;

    private java.lang.String artist;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequestAvailability availability;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.AudienceRating[] audienceRating;

    private java.lang.String author;

    private java.lang.String brand;

    private java.lang.String browseNode;

    private java.lang.String composer;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Condition condition;

    private java.lang.String conductor;

    private java.lang.String director;

    private org.apache.axis.types.PositiveInteger itemPage;

    private java.lang.String keywords;

    private java.lang.String manufacturer;

    private org.apache.axis.types.NonNegativeInteger maximumPrice;

    private java.lang.String merchantId;

    private org.apache.axis.types.NonNegativeInteger minimumPrice;

    private org.apache.axis.types.NonNegativeInteger minPercentageOff;

    private java.lang.String musicLabel;

    private java.lang.String orchestra;

    private java.lang.String power;

    private java.lang.String publisher;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll relatedItemPage;

    private java.lang.String[] relationshipType;

    private java.lang.String[] responseGroup;

    private java.lang.String searchIndex;

    private java.lang.String sort;

    private java.lang.String title;

    private java.lang.String releaseDate;

    private java.lang.String includeReviewsSummary;

    private org.apache.axis.types.NonNegativeInteger truncateReviewsAt;

    public ItemSearchRequest() {
    }

    public ItemSearchRequest(
           java.lang.String actor,
           java.lang.String artist,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequestAvailability availability,
           com.amazon.webservices.AWSECommerceService._2011_08_01.AudienceRating[] audienceRating,
           java.lang.String author,
           java.lang.String brand,
           java.lang.String browseNode,
           java.lang.String composer,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Condition condition,
           java.lang.String conductor,
           java.lang.String director,
           org.apache.axis.types.PositiveInteger itemPage,
           java.lang.String keywords,
           java.lang.String manufacturer,
           org.apache.axis.types.NonNegativeInteger maximumPrice,
           java.lang.String merchantId,
           org.apache.axis.types.NonNegativeInteger minimumPrice,
           org.apache.axis.types.NonNegativeInteger minPercentageOff,
           java.lang.String musicLabel,
           java.lang.String orchestra,
           java.lang.String power,
           java.lang.String publisher,
           com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll relatedItemPage,
           java.lang.String[] relationshipType,
           java.lang.String[] responseGroup,
           java.lang.String searchIndex,
           java.lang.String sort,
           java.lang.String title,
           java.lang.String releaseDate,
           java.lang.String includeReviewsSummary,
           org.apache.axis.types.NonNegativeInteger truncateReviewsAt) {
           this.actor = actor;
           this.artist = artist;
           this.availability = availability;
           this.audienceRating = audienceRating;
           this.author = author;
           this.brand = brand;
           this.browseNode = browseNode;
           this.composer = composer;
           this.condition = condition;
           this.conductor = conductor;
           this.director = director;
           this.itemPage = itemPage;
           this.keywords = keywords;
           this.manufacturer = manufacturer;
           this.maximumPrice = maximumPrice;
           this.merchantId = merchantId;
           this.minimumPrice = minimumPrice;
           this.minPercentageOff = minPercentageOff;
           this.musicLabel = musicLabel;
           this.orchestra = orchestra;
           this.power = power;
           this.publisher = publisher;
           this.relatedItemPage = relatedItemPage;
           this.relationshipType = relationshipType;
           this.responseGroup = responseGroup;
           this.searchIndex = searchIndex;
           this.sort = sort;
           this.title = title;
           this.releaseDate = releaseDate;
           this.includeReviewsSummary = includeReviewsSummary;
           this.truncateReviewsAt = truncateReviewsAt;
    }


    /**
     * Gets the actor value for this ItemSearchRequest.
     * 
     * @return actor
     */
    public java.lang.String getActor() {
        return actor;
    }


    /**
     * Sets the actor value for this ItemSearchRequest.
     * 
     * @param actor
     */
    public void setActor(java.lang.String actor) {
        this.actor = actor;
    }


    /**
     * Gets the artist value for this ItemSearchRequest.
     * 
     * @return artist
     */
    public java.lang.String getArtist() {
        return artist;
    }


    /**
     * Sets the artist value for this ItemSearchRequest.
     * 
     * @param artist
     */
    public void setArtist(java.lang.String artist) {
        this.artist = artist;
    }


    /**
     * Gets the availability value for this ItemSearchRequest.
     * 
     * @return availability
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequestAvailability getAvailability() {
        return availability;
    }


    /**
     * Sets the availability value for this ItemSearchRequest.
     * 
     * @param availability
     */
    public void setAvailability(com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequestAvailability availability) {
        this.availability = availability;
    }


    /**
     * Gets the audienceRating value for this ItemSearchRequest.
     * 
     * @return audienceRating
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.AudienceRating[] getAudienceRating() {
        return audienceRating;
    }


    /**
     * Sets the audienceRating value for this ItemSearchRequest.
     * 
     * @param audienceRating
     */
    public void setAudienceRating(com.amazon.webservices.AWSECommerceService._2011_08_01.AudienceRating[] audienceRating) {
        this.audienceRating = audienceRating;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.AudienceRating getAudienceRating(int i) {
        return this.audienceRating[i];
    }

    public void setAudienceRating(int i, com.amazon.webservices.AWSECommerceService._2011_08_01.AudienceRating _value) {
        this.audienceRating[i] = _value;
    }


    /**
     * Gets the author value for this ItemSearchRequest.
     * 
     * @return author
     */
    public java.lang.String getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this ItemSearchRequest.
     * 
     * @param author
     */
    public void setAuthor(java.lang.String author) {
        this.author = author;
    }


    /**
     * Gets the brand value for this ItemSearchRequest.
     * 
     * @return brand
     */
    public java.lang.String getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this ItemSearchRequest.
     * 
     * @param brand
     */
    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }


    /**
     * Gets the browseNode value for this ItemSearchRequest.
     * 
     * @return browseNode
     */
    public java.lang.String getBrowseNode() {
        return browseNode;
    }


    /**
     * Sets the browseNode value for this ItemSearchRequest.
     * 
     * @param browseNode
     */
    public void setBrowseNode(java.lang.String browseNode) {
        this.browseNode = browseNode;
    }


    /**
     * Gets the composer value for this ItemSearchRequest.
     * 
     * @return composer
     */
    public java.lang.String getComposer() {
        return composer;
    }


    /**
     * Sets the composer value for this ItemSearchRequest.
     * 
     * @param composer
     */
    public void setComposer(java.lang.String composer) {
        this.composer = composer;
    }


    /**
     * Gets the condition value for this ItemSearchRequest.
     * 
     * @return condition
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Condition getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this ItemSearchRequest.
     * 
     * @param condition
     */
    public void setCondition(com.amazon.webservices.AWSECommerceService._2011_08_01.Condition condition) {
        this.condition = condition;
    }


    /**
     * Gets the conductor value for this ItemSearchRequest.
     * 
     * @return conductor
     */
    public java.lang.String getConductor() {
        return conductor;
    }


    /**
     * Sets the conductor value for this ItemSearchRequest.
     * 
     * @param conductor
     */
    public void setConductor(java.lang.String conductor) {
        this.conductor = conductor;
    }


    /**
     * Gets the director value for this ItemSearchRequest.
     * 
     * @return director
     */
    public java.lang.String getDirector() {
        return director;
    }


    /**
     * Sets the director value for this ItemSearchRequest.
     * 
     * @param director
     */
    public void setDirector(java.lang.String director) {
        this.director = director;
    }


    /**
     * Gets the itemPage value for this ItemSearchRequest.
     * 
     * @return itemPage
     */
    public org.apache.axis.types.PositiveInteger getItemPage() {
        return itemPage;
    }


    /**
     * Sets the itemPage value for this ItemSearchRequest.
     * 
     * @param itemPage
     */
    public void setItemPage(org.apache.axis.types.PositiveInteger itemPage) {
        this.itemPage = itemPage;
    }


    /**
     * Gets the keywords value for this ItemSearchRequest.
     * 
     * @return keywords
     */
    public java.lang.String getKeywords() {
        return keywords;
    }


    /**
     * Sets the keywords value for this ItemSearchRequest.
     * 
     * @param keywords
     */
    public void setKeywords(java.lang.String keywords) {
        this.keywords = keywords;
    }


    /**
     * Gets the manufacturer value for this ItemSearchRequest.
     * 
     * @return manufacturer
     */
    public java.lang.String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this ItemSearchRequest.
     * 
     * @param manufacturer
     */
    public void setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the maximumPrice value for this ItemSearchRequest.
     * 
     * @return maximumPrice
     */
    public org.apache.axis.types.NonNegativeInteger getMaximumPrice() {
        return maximumPrice;
    }


    /**
     * Sets the maximumPrice value for this ItemSearchRequest.
     * 
     * @param maximumPrice
     */
    public void setMaximumPrice(org.apache.axis.types.NonNegativeInteger maximumPrice) {
        this.maximumPrice = maximumPrice;
    }


    /**
     * Gets the merchantId value for this ItemSearchRequest.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this ItemSearchRequest.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the minimumPrice value for this ItemSearchRequest.
     * 
     * @return minimumPrice
     */
    public org.apache.axis.types.NonNegativeInteger getMinimumPrice() {
        return minimumPrice;
    }


    /**
     * Sets the minimumPrice value for this ItemSearchRequest.
     * 
     * @param minimumPrice
     */
    public void setMinimumPrice(org.apache.axis.types.NonNegativeInteger minimumPrice) {
        this.minimumPrice = minimumPrice;
    }


    /**
     * Gets the minPercentageOff value for this ItemSearchRequest.
     * 
     * @return minPercentageOff
     */
    public org.apache.axis.types.NonNegativeInteger getMinPercentageOff() {
        return minPercentageOff;
    }


    /**
     * Sets the minPercentageOff value for this ItemSearchRequest.
     * 
     * @param minPercentageOff
     */
    public void setMinPercentageOff(org.apache.axis.types.NonNegativeInteger minPercentageOff) {
        this.minPercentageOff = minPercentageOff;
    }


    /**
     * Gets the musicLabel value for this ItemSearchRequest.
     * 
     * @return musicLabel
     */
    public java.lang.String getMusicLabel() {
        return musicLabel;
    }


    /**
     * Sets the musicLabel value for this ItemSearchRequest.
     * 
     * @param musicLabel
     */
    public void setMusicLabel(java.lang.String musicLabel) {
        this.musicLabel = musicLabel;
    }


    /**
     * Gets the orchestra value for this ItemSearchRequest.
     * 
     * @return orchestra
     */
    public java.lang.String getOrchestra() {
        return orchestra;
    }


    /**
     * Sets the orchestra value for this ItemSearchRequest.
     * 
     * @param orchestra
     */
    public void setOrchestra(java.lang.String orchestra) {
        this.orchestra = orchestra;
    }


    /**
     * Gets the power value for this ItemSearchRequest.
     * 
     * @return power
     */
    public java.lang.String getPower() {
        return power;
    }


    /**
     * Sets the power value for this ItemSearchRequest.
     * 
     * @param power
     */
    public void setPower(java.lang.String power) {
        this.power = power;
    }


    /**
     * Gets the publisher value for this ItemSearchRequest.
     * 
     * @return publisher
     */
    public java.lang.String getPublisher() {
        return publisher;
    }


    /**
     * Sets the publisher value for this ItemSearchRequest.
     * 
     * @param publisher
     */
    public void setPublisher(java.lang.String publisher) {
        this.publisher = publisher;
    }


    /**
     * Gets the relatedItemPage value for this ItemSearchRequest.
     * 
     * @return relatedItemPage
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll getRelatedItemPage() {
        return relatedItemPage;
    }


    /**
     * Sets the relatedItemPage value for this ItemSearchRequest.
     * 
     * @param relatedItemPage
     */
    public void setRelatedItemPage(com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll relatedItemPage) {
        this.relatedItemPage = relatedItemPage;
    }


    /**
     * Gets the relationshipType value for this ItemSearchRequest.
     * 
     * @return relationshipType
     */
    public java.lang.String[] getRelationshipType() {
        return relationshipType;
    }


    /**
     * Sets the relationshipType value for this ItemSearchRequest.
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
     * Gets the responseGroup value for this ItemSearchRequest.
     * 
     * @return responseGroup
     */
    public java.lang.String[] getResponseGroup() {
        return responseGroup;
    }


    /**
     * Sets the responseGroup value for this ItemSearchRequest.
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
     * Gets the searchIndex value for this ItemSearchRequest.
     * 
     * @return searchIndex
     */
    public java.lang.String getSearchIndex() {
        return searchIndex;
    }


    /**
     * Sets the searchIndex value for this ItemSearchRequest.
     * 
     * @param searchIndex
     */
    public void setSearchIndex(java.lang.String searchIndex) {
        this.searchIndex = searchIndex;
    }


    /**
     * Gets the sort value for this ItemSearchRequest.
     * 
     * @return sort
     */
    public java.lang.String getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this ItemSearchRequest.
     * 
     * @param sort
     */
    public void setSort(java.lang.String sort) {
        this.sort = sort;
    }


    /**
     * Gets the title value for this ItemSearchRequest.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ItemSearchRequest.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the releaseDate value for this ItemSearchRequest.
     * 
     * @return releaseDate
     */
    public java.lang.String getReleaseDate() {
        return releaseDate;
    }


    /**
     * Sets the releaseDate value for this ItemSearchRequest.
     * 
     * @param releaseDate
     */
    public void setReleaseDate(java.lang.String releaseDate) {
        this.releaseDate = releaseDate;
    }


    /**
     * Gets the includeReviewsSummary value for this ItemSearchRequest.
     * 
     * @return includeReviewsSummary
     */
    public java.lang.String getIncludeReviewsSummary() {
        return includeReviewsSummary;
    }


    /**
     * Sets the includeReviewsSummary value for this ItemSearchRequest.
     * 
     * @param includeReviewsSummary
     */
    public void setIncludeReviewsSummary(java.lang.String includeReviewsSummary) {
        this.includeReviewsSummary = includeReviewsSummary;
    }


    /**
     * Gets the truncateReviewsAt value for this ItemSearchRequest.
     * 
     * @return truncateReviewsAt
     */
    public org.apache.axis.types.NonNegativeInteger getTruncateReviewsAt() {
        return truncateReviewsAt;
    }


    /**
     * Sets the truncateReviewsAt value for this ItemSearchRequest.
     * 
     * @param truncateReviewsAt
     */
    public void setTruncateReviewsAt(org.apache.axis.types.NonNegativeInteger truncateReviewsAt) {
        this.truncateReviewsAt = truncateReviewsAt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemSearchRequest)) return false;
        ItemSearchRequest other = (ItemSearchRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actor==null && other.getActor()==null) || 
             (this.actor!=null &&
              this.actor.equals(other.getActor()))) &&
            ((this.artist==null && other.getArtist()==null) || 
             (this.artist!=null &&
              this.artist.equals(other.getArtist()))) &&
            ((this.availability==null && other.getAvailability()==null) || 
             (this.availability!=null &&
              this.availability.equals(other.getAvailability()))) &&
            ((this.audienceRating==null && other.getAudienceRating()==null) || 
             (this.audienceRating!=null &&
              java.util.Arrays.equals(this.audienceRating, other.getAudienceRating()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              this.author.equals(other.getAuthor()))) &&
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.browseNode==null && other.getBrowseNode()==null) || 
             (this.browseNode!=null &&
              this.browseNode.equals(other.getBrowseNode()))) &&
            ((this.composer==null && other.getComposer()==null) || 
             (this.composer!=null &&
              this.composer.equals(other.getComposer()))) &&
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            ((this.conductor==null && other.getConductor()==null) || 
             (this.conductor!=null &&
              this.conductor.equals(other.getConductor()))) &&
            ((this.director==null && other.getDirector()==null) || 
             (this.director!=null &&
              this.director.equals(other.getDirector()))) &&
            ((this.itemPage==null && other.getItemPage()==null) || 
             (this.itemPage!=null &&
              this.itemPage.equals(other.getItemPage()))) &&
            ((this.keywords==null && other.getKeywords()==null) || 
             (this.keywords!=null &&
              this.keywords.equals(other.getKeywords()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.maximumPrice==null && other.getMaximumPrice()==null) || 
             (this.maximumPrice!=null &&
              this.maximumPrice.equals(other.getMaximumPrice()))) &&
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.minimumPrice==null && other.getMinimumPrice()==null) || 
             (this.minimumPrice!=null &&
              this.minimumPrice.equals(other.getMinimumPrice()))) &&
            ((this.minPercentageOff==null && other.getMinPercentageOff()==null) || 
             (this.minPercentageOff!=null &&
              this.minPercentageOff.equals(other.getMinPercentageOff()))) &&
            ((this.musicLabel==null && other.getMusicLabel()==null) || 
             (this.musicLabel!=null &&
              this.musicLabel.equals(other.getMusicLabel()))) &&
            ((this.orchestra==null && other.getOrchestra()==null) || 
             (this.orchestra!=null &&
              this.orchestra.equals(other.getOrchestra()))) &&
            ((this.power==null && other.getPower()==null) || 
             (this.power!=null &&
              this.power.equals(other.getPower()))) &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              this.publisher.equals(other.getPublisher()))) &&
            ((this.relatedItemPage==null && other.getRelatedItemPage()==null) || 
             (this.relatedItemPage!=null &&
              this.relatedItemPage.equals(other.getRelatedItemPage()))) &&
            ((this.relationshipType==null && other.getRelationshipType()==null) || 
             (this.relationshipType!=null &&
              java.util.Arrays.equals(this.relationshipType, other.getRelationshipType()))) &&
            ((this.responseGroup==null && other.getResponseGroup()==null) || 
             (this.responseGroup!=null &&
              java.util.Arrays.equals(this.responseGroup, other.getResponseGroup()))) &&
            ((this.searchIndex==null && other.getSearchIndex()==null) || 
             (this.searchIndex!=null &&
              this.searchIndex.equals(other.getSearchIndex()))) &&
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.releaseDate==null && other.getReleaseDate()==null) || 
             (this.releaseDate!=null &&
              this.releaseDate.equals(other.getReleaseDate()))) &&
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
        if (getActor() != null) {
            _hashCode += getActor().hashCode();
        }
        if (getArtist() != null) {
            _hashCode += getArtist().hashCode();
        }
        if (getAvailability() != null) {
            _hashCode += getAvailability().hashCode();
        }
        if (getAudienceRating() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudienceRating());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudienceRating(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthor() != null) {
            _hashCode += getAuthor().hashCode();
        }
        if (getBrand() != null) {
            _hashCode += getBrand().hashCode();
        }
        if (getBrowseNode() != null) {
            _hashCode += getBrowseNode().hashCode();
        }
        if (getComposer() != null) {
            _hashCode += getComposer().hashCode();
        }
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getConductor() != null) {
            _hashCode += getConductor().hashCode();
        }
        if (getDirector() != null) {
            _hashCode += getDirector().hashCode();
        }
        if (getItemPage() != null) {
            _hashCode += getItemPage().hashCode();
        }
        if (getKeywords() != null) {
            _hashCode += getKeywords().hashCode();
        }
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getMaximumPrice() != null) {
            _hashCode += getMaximumPrice().hashCode();
        }
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getMinimumPrice() != null) {
            _hashCode += getMinimumPrice().hashCode();
        }
        if (getMinPercentageOff() != null) {
            _hashCode += getMinPercentageOff().hashCode();
        }
        if (getMusicLabel() != null) {
            _hashCode += getMusicLabel().hashCode();
        }
        if (getOrchestra() != null) {
            _hashCode += getOrchestra().hashCode();
        }
        if (getPower() != null) {
            _hashCode += getPower().hashCode();
        }
        if (getPublisher() != null) {
            _hashCode += getPublisher().hashCode();
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
        if (getSort() != null) {
            _hashCode += getSort().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getReleaseDate() != null) {
            _hashCode += getReleaseDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(ItemSearchRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemSearchRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Actor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artist");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Artist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Availability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">ItemSearchRequest>Availability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audienceRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AudienceRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AudienceRating"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Author"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Brand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browseNode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "BrowseNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("composer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Composer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">Condition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conductor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Conductor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("director");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Director"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Keywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MaximumPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
        elemField.setFieldName("minimumPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MinimumPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minPercentageOff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MinPercentageOff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("musicLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MusicLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orchestra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Orchestra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("power");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Power"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisher");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Publisher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("sort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Sort"));
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
        elemField.setFieldName("releaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ReleaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
