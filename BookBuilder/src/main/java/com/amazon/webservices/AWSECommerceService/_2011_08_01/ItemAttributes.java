/**
 * ItemAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.webservices.AWSECommerceService._2011_08_01;

public class ItemAttributes  implements java.io.Serializable {
    private java.lang.String[] actor;

    private java.lang.String[] artist;

    private java.lang.String aspectRatio;

    private java.lang.String audienceRating;

    private java.lang.String[] audioFormat;

    private java.lang.String[] author;

    private java.lang.String binding;

    private java.lang.String brand;

    private java.lang.String[] catalogNumberList;

    private java.lang.String[] category;

    private java.lang.String CEROAgeRating;

    private java.lang.String clothingSize;

    private java.lang.String color;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesCreator[] creator;

    private java.lang.String department;

    private java.lang.String[] director;

    private java.lang.String EAN;

    private java.lang.String[] EANList;

    private java.lang.String edition;

    private java.lang.String[] EISBN;

    private java.lang.String episodeSequence;

    private java.lang.String ESRBAgeRating;

    private java.lang.String[] feature;

    private java.lang.String[] format;

    private java.lang.String genre;

    private java.lang.String hardwarePlatform;

    private java.lang.String hazardousMaterialType;

    private java.lang.Boolean isAdultProduct;

    private java.lang.Boolean isAutographed;

    private java.lang.String ISBN;

    private java.lang.Boolean isEligibleForTradeIn;

    private java.lang.Boolean isMemorabilia;

    private java.lang.String issuesPerYear;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesItemDimensions itemDimensions;

    private java.lang.String itemPartNumber;

    private java.lang.String label;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesLanguagesLanguage[] languages;

    private java.lang.String legalDisclaimer;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price listPrice;

    private java.lang.String magazineType;

    private java.lang.String manufacturer;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits manufacturerMaximumAge;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits manufacturerMinimumAge;

    private java.lang.String manufacturerPartsWarrantyDescription;

    private java.lang.String mediaType;

    private java.lang.String model;

    private org.apache.axis.types.NonNegativeInteger modelYear;

    private java.lang.String MPN;

    private org.apache.axis.types.NonNegativeInteger numberOfDiscs;

    private org.apache.axis.types.NonNegativeInteger numberOfIssues;

    private org.apache.axis.types.NonNegativeInteger numberOfItems;

    private org.apache.axis.types.NonNegativeInteger numberOfPages;

    private org.apache.axis.types.NonNegativeInteger numberOfTracks;

    private java.lang.String operatingSystem;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesPackageDimensions packageDimensions;

    private org.apache.axis.types.NonNegativeInteger packageQuantity;

    private java.lang.String partNumber;

    private java.lang.String[] pictureFormat;

    private java.lang.String[] platform;

    private java.lang.String productGroup;

    private java.lang.String productTypeName;

    private java.lang.String productTypeSubcategory;

    private java.lang.String publicationDate;

    private java.lang.String publisher;

    private java.lang.String regionCode;

    private java.lang.String releaseDate;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits runningTime;

    private java.lang.String seikodoProductCode;

    private java.lang.String size;

    private java.lang.String SKU;

    private java.lang.String studio;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.NonNegativeIntegerWithUnits subscriptionLength;

    private java.lang.String title;

    private java.lang.String trackSequence;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price tradeInValue;

    private java.lang.String UPC;

    private java.lang.String[] UPCList;

    private java.lang.String warranty;

    private com.amazon.webservices.AWSECommerceService._2011_08_01.Price WEEETaxValue;

    public ItemAttributes() {
    }

    public ItemAttributes(
           java.lang.String[] actor,
           java.lang.String[] artist,
           java.lang.String aspectRatio,
           java.lang.String audienceRating,
           java.lang.String[] audioFormat,
           java.lang.String[] author,
           java.lang.String binding,
           java.lang.String brand,
           java.lang.String[] catalogNumberList,
           java.lang.String[] category,
           java.lang.String CEROAgeRating,
           java.lang.String clothingSize,
           java.lang.String color,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesCreator[] creator,
           java.lang.String department,
           java.lang.String[] director,
           java.lang.String EAN,
           java.lang.String[] EANList,
           java.lang.String edition,
           java.lang.String[] EISBN,
           java.lang.String episodeSequence,
           java.lang.String ESRBAgeRating,
           java.lang.String[] feature,
           java.lang.String[] format,
           java.lang.String genre,
           java.lang.String hardwarePlatform,
           java.lang.String hazardousMaterialType,
           java.lang.Boolean isAdultProduct,
           java.lang.Boolean isAutographed,
           java.lang.String ISBN,
           java.lang.Boolean isEligibleForTradeIn,
           java.lang.Boolean isMemorabilia,
           java.lang.String issuesPerYear,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesItemDimensions itemDimensions,
           java.lang.String itemPartNumber,
           java.lang.String label,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesLanguagesLanguage[] languages,
           java.lang.String legalDisclaimer,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price listPrice,
           java.lang.String magazineType,
           java.lang.String manufacturer,
           com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits manufacturerMaximumAge,
           com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits manufacturerMinimumAge,
           java.lang.String manufacturerPartsWarrantyDescription,
           java.lang.String mediaType,
           java.lang.String model,
           org.apache.axis.types.NonNegativeInteger modelYear,
           java.lang.String MPN,
           org.apache.axis.types.NonNegativeInteger numberOfDiscs,
           org.apache.axis.types.NonNegativeInteger numberOfIssues,
           org.apache.axis.types.NonNegativeInteger numberOfItems,
           org.apache.axis.types.NonNegativeInteger numberOfPages,
           org.apache.axis.types.NonNegativeInteger numberOfTracks,
           java.lang.String operatingSystem,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesPackageDimensions packageDimensions,
           org.apache.axis.types.NonNegativeInteger packageQuantity,
           java.lang.String partNumber,
           java.lang.String[] pictureFormat,
           java.lang.String[] platform,
           java.lang.String productGroup,
           java.lang.String productTypeName,
           java.lang.String productTypeSubcategory,
           java.lang.String publicationDate,
           java.lang.String publisher,
           java.lang.String regionCode,
           java.lang.String releaseDate,
           com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits runningTime,
           java.lang.String seikodoProductCode,
           java.lang.String size,
           java.lang.String SKU,
           java.lang.String studio,
           com.amazon.webservices.AWSECommerceService._2011_08_01.NonNegativeIntegerWithUnits subscriptionLength,
           java.lang.String title,
           java.lang.String trackSequence,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price tradeInValue,
           java.lang.String UPC,
           java.lang.String[] UPCList,
           java.lang.String warranty,
           com.amazon.webservices.AWSECommerceService._2011_08_01.Price WEEETaxValue) {
           this.actor = actor;
           this.artist = artist;
           this.aspectRatio = aspectRatio;
           this.audienceRating = audienceRating;
           this.audioFormat = audioFormat;
           this.author = author;
           this.binding = binding;
           this.brand = brand;
           this.catalogNumberList = catalogNumberList;
           this.category = category;
           this.CEROAgeRating = CEROAgeRating;
           this.clothingSize = clothingSize;
           this.color = color;
           this.creator = creator;
           this.department = department;
           this.director = director;
           this.EAN = EAN;
           this.EANList = EANList;
           this.edition = edition;
           this.EISBN = EISBN;
           this.episodeSequence = episodeSequence;
           this.ESRBAgeRating = ESRBAgeRating;
           this.feature = feature;
           this.format = format;
           this.genre = genre;
           this.hardwarePlatform = hardwarePlatform;
           this.hazardousMaterialType = hazardousMaterialType;
           this.isAdultProduct = isAdultProduct;
           this.isAutographed = isAutographed;
           this.ISBN = ISBN;
           this.isEligibleForTradeIn = isEligibleForTradeIn;
           this.isMemorabilia = isMemorabilia;
           this.issuesPerYear = issuesPerYear;
           this.itemDimensions = itemDimensions;
           this.itemPartNumber = itemPartNumber;
           this.label = label;
           this.languages = languages;
           this.legalDisclaimer = legalDisclaimer;
           this.listPrice = listPrice;
           this.magazineType = magazineType;
           this.manufacturer = manufacturer;
           this.manufacturerMaximumAge = manufacturerMaximumAge;
           this.manufacturerMinimumAge = manufacturerMinimumAge;
           this.manufacturerPartsWarrantyDescription = manufacturerPartsWarrantyDescription;
           this.mediaType = mediaType;
           this.model = model;
           this.modelYear = modelYear;
           this.MPN = MPN;
           this.numberOfDiscs = numberOfDiscs;
           this.numberOfIssues = numberOfIssues;
           this.numberOfItems = numberOfItems;
           this.numberOfPages = numberOfPages;
           this.numberOfTracks = numberOfTracks;
           this.operatingSystem = operatingSystem;
           this.packageDimensions = packageDimensions;
           this.packageQuantity = packageQuantity;
           this.partNumber = partNumber;
           this.pictureFormat = pictureFormat;
           this.platform = platform;
           this.productGroup = productGroup;
           this.productTypeName = productTypeName;
           this.productTypeSubcategory = productTypeSubcategory;
           this.publicationDate = publicationDate;
           this.publisher = publisher;
           this.regionCode = regionCode;
           this.releaseDate = releaseDate;
           this.runningTime = runningTime;
           this.seikodoProductCode = seikodoProductCode;
           this.size = size;
           this.SKU = SKU;
           this.studio = studio;
           this.subscriptionLength = subscriptionLength;
           this.title = title;
           this.trackSequence = trackSequence;
           this.tradeInValue = tradeInValue;
           this.UPC = UPC;
           this.UPCList = UPCList;
           this.warranty = warranty;
           this.WEEETaxValue = WEEETaxValue;
    }


    /**
     * Gets the actor value for this ItemAttributes.
     * 
     * @return actor
     */
    public java.lang.String[] getActor() {
        return actor;
    }


    /**
     * Sets the actor value for this ItemAttributes.
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


    /**
     * Gets the artist value for this ItemAttributes.
     * 
     * @return artist
     */
    public java.lang.String[] getArtist() {
        return artist;
    }


    /**
     * Sets the artist value for this ItemAttributes.
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
     * Gets the aspectRatio value for this ItemAttributes.
     * 
     * @return aspectRatio
     */
    public java.lang.String getAspectRatio() {
        return aspectRatio;
    }


    /**
     * Sets the aspectRatio value for this ItemAttributes.
     * 
     * @param aspectRatio
     */
    public void setAspectRatio(java.lang.String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }


    /**
     * Gets the audienceRating value for this ItemAttributes.
     * 
     * @return audienceRating
     */
    public java.lang.String getAudienceRating() {
        return audienceRating;
    }


    /**
     * Sets the audienceRating value for this ItemAttributes.
     * 
     * @param audienceRating
     */
    public void setAudienceRating(java.lang.String audienceRating) {
        this.audienceRating = audienceRating;
    }


    /**
     * Gets the audioFormat value for this ItemAttributes.
     * 
     * @return audioFormat
     */
    public java.lang.String[] getAudioFormat() {
        return audioFormat;
    }


    /**
     * Sets the audioFormat value for this ItemAttributes.
     * 
     * @param audioFormat
     */
    public void setAudioFormat(java.lang.String[] audioFormat) {
        this.audioFormat = audioFormat;
    }

    public java.lang.String getAudioFormat(int i) {
        return this.audioFormat[i];
    }

    public void setAudioFormat(int i, java.lang.String _value) {
        this.audioFormat[i] = _value;
    }


    /**
     * Gets the author value for this ItemAttributes.
     * 
     * @return author
     */
    public java.lang.String[] getAuthor() {
        return author;
    }


    /**
     * Sets the author value for this ItemAttributes.
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
     * Gets the binding value for this ItemAttributes.
     * 
     * @return binding
     */
    public java.lang.String getBinding() {
        return binding;
    }


    /**
     * Sets the binding value for this ItemAttributes.
     * 
     * @param binding
     */
    public void setBinding(java.lang.String binding) {
        this.binding = binding;
    }


    /**
     * Gets the brand value for this ItemAttributes.
     * 
     * @return brand
     */
    public java.lang.String getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this ItemAttributes.
     * 
     * @param brand
     */
    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }


    /**
     * Gets the catalogNumberList value for this ItemAttributes.
     * 
     * @return catalogNumberList
     */
    public java.lang.String[] getCatalogNumberList() {
        return catalogNumberList;
    }


    /**
     * Sets the catalogNumberList value for this ItemAttributes.
     * 
     * @param catalogNumberList
     */
    public void setCatalogNumberList(java.lang.String[] catalogNumberList) {
        this.catalogNumberList = catalogNumberList;
    }


    /**
     * Gets the category value for this ItemAttributes.
     * 
     * @return category
     */
    public java.lang.String[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ItemAttributes.
     * 
     * @param category
     */
    public void setCategory(java.lang.String[] category) {
        this.category = category;
    }

    public java.lang.String getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, java.lang.String _value) {
        this.category[i] = _value;
    }


    /**
     * Gets the CEROAgeRating value for this ItemAttributes.
     * 
     * @return CEROAgeRating
     */
    public java.lang.String getCEROAgeRating() {
        return CEROAgeRating;
    }


    /**
     * Sets the CEROAgeRating value for this ItemAttributes.
     * 
     * @param CEROAgeRating
     */
    public void setCEROAgeRating(java.lang.String CEROAgeRating) {
        this.CEROAgeRating = CEROAgeRating;
    }


    /**
     * Gets the clothingSize value for this ItemAttributes.
     * 
     * @return clothingSize
     */
    public java.lang.String getClothingSize() {
        return clothingSize;
    }


    /**
     * Sets the clothingSize value for this ItemAttributes.
     * 
     * @param clothingSize
     */
    public void setClothingSize(java.lang.String clothingSize) {
        this.clothingSize = clothingSize;
    }


    /**
     * Gets the color value for this ItemAttributes.
     * 
     * @return color
     */
    public java.lang.String getColor() {
        return color;
    }


    /**
     * Sets the color value for this ItemAttributes.
     * 
     * @param color
     */
    public void setColor(java.lang.String color) {
        this.color = color;
    }


    /**
     * Gets the creator value for this ItemAttributes.
     * 
     * @return creator
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesCreator[] getCreator() {
        return creator;
    }


    /**
     * Sets the creator value for this ItemAttributes.
     * 
     * @param creator
     */
    public void setCreator(com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesCreator[] creator) {
        this.creator = creator;
    }

    public com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesCreator getCreator(int i) {
        return this.creator[i];
    }

    public void setCreator(int i, com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesCreator _value) {
        this.creator[i] = _value;
    }


    /**
     * Gets the department value for this ItemAttributes.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ItemAttributes.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the director value for this ItemAttributes.
     * 
     * @return director
     */
    public java.lang.String[] getDirector() {
        return director;
    }


    /**
     * Sets the director value for this ItemAttributes.
     * 
     * @param director
     */
    public void setDirector(java.lang.String[] director) {
        this.director = director;
    }

    public java.lang.String getDirector(int i) {
        return this.director[i];
    }

    public void setDirector(int i, java.lang.String _value) {
        this.director[i] = _value;
    }


    /**
     * Gets the EAN value for this ItemAttributes.
     * 
     * @return EAN
     */
    public java.lang.String getEAN() {
        return EAN;
    }


    /**
     * Sets the EAN value for this ItemAttributes.
     * 
     * @param EAN
     */
    public void setEAN(java.lang.String EAN) {
        this.EAN = EAN;
    }


    /**
     * Gets the EANList value for this ItemAttributes.
     * 
     * @return EANList
     */
    public java.lang.String[] getEANList() {
        return EANList;
    }


    /**
     * Sets the EANList value for this ItemAttributes.
     * 
     * @param EANList
     */
    public void setEANList(java.lang.String[] EANList) {
        this.EANList = EANList;
    }


    /**
     * Gets the edition value for this ItemAttributes.
     * 
     * @return edition
     */
    public java.lang.String getEdition() {
        return edition;
    }


    /**
     * Sets the edition value for this ItemAttributes.
     * 
     * @param edition
     */
    public void setEdition(java.lang.String edition) {
        this.edition = edition;
    }


    /**
     * Gets the EISBN value for this ItemAttributes.
     * 
     * @return EISBN
     */
    public java.lang.String[] getEISBN() {
        return EISBN;
    }


    /**
     * Sets the EISBN value for this ItemAttributes.
     * 
     * @param EISBN
     */
    public void setEISBN(java.lang.String[] EISBN) {
        this.EISBN = EISBN;
    }

    public java.lang.String getEISBN(int i) {
        return this.EISBN[i];
    }

    public void setEISBN(int i, java.lang.String _value) {
        this.EISBN[i] = _value;
    }


    /**
     * Gets the episodeSequence value for this ItemAttributes.
     * 
     * @return episodeSequence
     */
    public java.lang.String getEpisodeSequence() {
        return episodeSequence;
    }


    /**
     * Sets the episodeSequence value for this ItemAttributes.
     * 
     * @param episodeSequence
     */
    public void setEpisodeSequence(java.lang.String episodeSequence) {
        this.episodeSequence = episodeSequence;
    }


    /**
     * Gets the ESRBAgeRating value for this ItemAttributes.
     * 
     * @return ESRBAgeRating
     */
    public java.lang.String getESRBAgeRating() {
        return ESRBAgeRating;
    }


    /**
     * Sets the ESRBAgeRating value for this ItemAttributes.
     * 
     * @param ESRBAgeRating
     */
    public void setESRBAgeRating(java.lang.String ESRBAgeRating) {
        this.ESRBAgeRating = ESRBAgeRating;
    }


    /**
     * Gets the feature value for this ItemAttributes.
     * 
     * @return feature
     */
    public java.lang.String[] getFeature() {
        return feature;
    }


    /**
     * Sets the feature value for this ItemAttributes.
     * 
     * @param feature
     */
    public void setFeature(java.lang.String[] feature) {
        this.feature = feature;
    }

    public java.lang.String getFeature(int i) {
        return this.feature[i];
    }

    public void setFeature(int i, java.lang.String _value) {
        this.feature[i] = _value;
    }


    /**
     * Gets the format value for this ItemAttributes.
     * 
     * @return format
     */
    public java.lang.String[] getFormat() {
        return format;
    }


    /**
     * Sets the format value for this ItemAttributes.
     * 
     * @param format
     */
    public void setFormat(java.lang.String[] format) {
        this.format = format;
    }

    public java.lang.String getFormat(int i) {
        return this.format[i];
    }

    public void setFormat(int i, java.lang.String _value) {
        this.format[i] = _value;
    }


    /**
     * Gets the genre value for this ItemAttributes.
     * 
     * @return genre
     */
    public java.lang.String getGenre() {
        return genre;
    }


    /**
     * Sets the genre value for this ItemAttributes.
     * 
     * @param genre
     */
    public void setGenre(java.lang.String genre) {
        this.genre = genre;
    }


    /**
     * Gets the hardwarePlatform value for this ItemAttributes.
     * 
     * @return hardwarePlatform
     */
    public java.lang.String getHardwarePlatform() {
        return hardwarePlatform;
    }


    /**
     * Sets the hardwarePlatform value for this ItemAttributes.
     * 
     * @param hardwarePlatform
     */
    public void setHardwarePlatform(java.lang.String hardwarePlatform) {
        this.hardwarePlatform = hardwarePlatform;
    }


    /**
     * Gets the hazardousMaterialType value for this ItemAttributes.
     * 
     * @return hazardousMaterialType
     */
    public java.lang.String getHazardousMaterialType() {
        return hazardousMaterialType;
    }


    /**
     * Sets the hazardousMaterialType value for this ItemAttributes.
     * 
     * @param hazardousMaterialType
     */
    public void setHazardousMaterialType(java.lang.String hazardousMaterialType) {
        this.hazardousMaterialType = hazardousMaterialType;
    }


    /**
     * Gets the isAdultProduct value for this ItemAttributes.
     * 
     * @return isAdultProduct
     */
    public java.lang.Boolean getIsAdultProduct() {
        return isAdultProduct;
    }


    /**
     * Sets the isAdultProduct value for this ItemAttributes.
     * 
     * @param isAdultProduct
     */
    public void setIsAdultProduct(java.lang.Boolean isAdultProduct) {
        this.isAdultProduct = isAdultProduct;
    }


    /**
     * Gets the isAutographed value for this ItemAttributes.
     * 
     * @return isAutographed
     */
    public java.lang.Boolean getIsAutographed() {
        return isAutographed;
    }


    /**
     * Sets the isAutographed value for this ItemAttributes.
     * 
     * @param isAutographed
     */
    public void setIsAutographed(java.lang.Boolean isAutographed) {
        this.isAutographed = isAutographed;
    }


    /**
     * Gets the ISBN value for this ItemAttributes.
     * 
     * @return ISBN
     */
    public java.lang.String getISBN() {
        return ISBN;
    }


    /**
     * Sets the ISBN value for this ItemAttributes.
     * 
     * @param ISBN
     */
    public void setISBN(java.lang.String ISBN) {
        this.ISBN = ISBN;
    }


    /**
     * Gets the isEligibleForTradeIn value for this ItemAttributes.
     * 
     * @return isEligibleForTradeIn
     */
    public java.lang.Boolean getIsEligibleForTradeIn() {
        return isEligibleForTradeIn;
    }


    /**
     * Sets the isEligibleForTradeIn value for this ItemAttributes.
     * 
     * @param isEligibleForTradeIn
     */
    public void setIsEligibleForTradeIn(java.lang.Boolean isEligibleForTradeIn) {
        this.isEligibleForTradeIn = isEligibleForTradeIn;
    }


    /**
     * Gets the isMemorabilia value for this ItemAttributes.
     * 
     * @return isMemorabilia
     */
    public java.lang.Boolean getIsMemorabilia() {
        return isMemorabilia;
    }


    /**
     * Sets the isMemorabilia value for this ItemAttributes.
     * 
     * @param isMemorabilia
     */
    public void setIsMemorabilia(java.lang.Boolean isMemorabilia) {
        this.isMemorabilia = isMemorabilia;
    }


    /**
     * Gets the issuesPerYear value for this ItemAttributes.
     * 
     * @return issuesPerYear
     */
    public java.lang.String getIssuesPerYear() {
        return issuesPerYear;
    }


    /**
     * Sets the issuesPerYear value for this ItemAttributes.
     * 
     * @param issuesPerYear
     */
    public void setIssuesPerYear(java.lang.String issuesPerYear) {
        this.issuesPerYear = issuesPerYear;
    }


    /**
     * Gets the itemDimensions value for this ItemAttributes.
     * 
     * @return itemDimensions
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesItemDimensions getItemDimensions() {
        return itemDimensions;
    }


    /**
     * Sets the itemDimensions value for this ItemAttributes.
     * 
     * @param itemDimensions
     */
    public void setItemDimensions(com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesItemDimensions itemDimensions) {
        this.itemDimensions = itemDimensions;
    }


    /**
     * Gets the itemPartNumber value for this ItemAttributes.
     * 
     * @return itemPartNumber
     */
    public java.lang.String getItemPartNumber() {
        return itemPartNumber;
    }


    /**
     * Sets the itemPartNumber value for this ItemAttributes.
     * 
     * @param itemPartNumber
     */
    public void setItemPartNumber(java.lang.String itemPartNumber) {
        this.itemPartNumber = itemPartNumber;
    }


    /**
     * Gets the label value for this ItemAttributes.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ItemAttributes.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the languages value for this ItemAttributes.
     * 
     * @return languages
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesLanguagesLanguage[] getLanguages() {
        return languages;
    }


    /**
     * Sets the languages value for this ItemAttributes.
     * 
     * @param languages
     */
    public void setLanguages(com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesLanguagesLanguage[] languages) {
        this.languages = languages;
    }


    /**
     * Gets the legalDisclaimer value for this ItemAttributes.
     * 
     * @return legalDisclaimer
     */
    public java.lang.String getLegalDisclaimer() {
        return legalDisclaimer;
    }


    /**
     * Sets the legalDisclaimer value for this ItemAttributes.
     * 
     * @param legalDisclaimer
     */
    public void setLegalDisclaimer(java.lang.String legalDisclaimer) {
        this.legalDisclaimer = legalDisclaimer;
    }


    /**
     * Gets the listPrice value for this ItemAttributes.
     * 
     * @return listPrice
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getListPrice() {
        return listPrice;
    }


    /**
     * Sets the listPrice value for this ItemAttributes.
     * 
     * @param listPrice
     */
    public void setListPrice(com.amazon.webservices.AWSECommerceService._2011_08_01.Price listPrice) {
        this.listPrice = listPrice;
    }


    /**
     * Gets the magazineType value for this ItemAttributes.
     * 
     * @return magazineType
     */
    public java.lang.String getMagazineType() {
        return magazineType;
    }


    /**
     * Sets the magazineType value for this ItemAttributes.
     * 
     * @param magazineType
     */
    public void setMagazineType(java.lang.String magazineType) {
        this.magazineType = magazineType;
    }


    /**
     * Gets the manufacturer value for this ItemAttributes.
     * 
     * @return manufacturer
     */
    public java.lang.String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this ItemAttributes.
     * 
     * @param manufacturer
     */
    public void setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the manufacturerMaximumAge value for this ItemAttributes.
     * 
     * @return manufacturerMaximumAge
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits getManufacturerMaximumAge() {
        return manufacturerMaximumAge;
    }


    /**
     * Sets the manufacturerMaximumAge value for this ItemAttributes.
     * 
     * @param manufacturerMaximumAge
     */
    public void setManufacturerMaximumAge(com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits manufacturerMaximumAge) {
        this.manufacturerMaximumAge = manufacturerMaximumAge;
    }


    /**
     * Gets the manufacturerMinimumAge value for this ItemAttributes.
     * 
     * @return manufacturerMinimumAge
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits getManufacturerMinimumAge() {
        return manufacturerMinimumAge;
    }


    /**
     * Sets the manufacturerMinimumAge value for this ItemAttributes.
     * 
     * @param manufacturerMinimumAge
     */
    public void setManufacturerMinimumAge(com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits manufacturerMinimumAge) {
        this.manufacturerMinimumAge = manufacturerMinimumAge;
    }


    /**
     * Gets the manufacturerPartsWarrantyDescription value for this ItemAttributes.
     * 
     * @return manufacturerPartsWarrantyDescription
     */
    public java.lang.String getManufacturerPartsWarrantyDescription() {
        return manufacturerPartsWarrantyDescription;
    }


    /**
     * Sets the manufacturerPartsWarrantyDescription value for this ItemAttributes.
     * 
     * @param manufacturerPartsWarrantyDescription
     */
    public void setManufacturerPartsWarrantyDescription(java.lang.String manufacturerPartsWarrantyDescription) {
        this.manufacturerPartsWarrantyDescription = manufacturerPartsWarrantyDescription;
    }


    /**
     * Gets the mediaType value for this ItemAttributes.
     * 
     * @return mediaType
     */
    public java.lang.String getMediaType() {
        return mediaType;
    }


    /**
     * Sets the mediaType value for this ItemAttributes.
     * 
     * @param mediaType
     */
    public void setMediaType(java.lang.String mediaType) {
        this.mediaType = mediaType;
    }


    /**
     * Gets the model value for this ItemAttributes.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this ItemAttributes.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the modelYear value for this ItemAttributes.
     * 
     * @return modelYear
     */
    public org.apache.axis.types.NonNegativeInteger getModelYear() {
        return modelYear;
    }


    /**
     * Sets the modelYear value for this ItemAttributes.
     * 
     * @param modelYear
     */
    public void setModelYear(org.apache.axis.types.NonNegativeInteger modelYear) {
        this.modelYear = modelYear;
    }


    /**
     * Gets the MPN value for this ItemAttributes.
     * 
     * @return MPN
     */
    public java.lang.String getMPN() {
        return MPN;
    }


    /**
     * Sets the MPN value for this ItemAttributes.
     * 
     * @param MPN
     */
    public void setMPN(java.lang.String MPN) {
        this.MPN = MPN;
    }


    /**
     * Gets the numberOfDiscs value for this ItemAttributes.
     * 
     * @return numberOfDiscs
     */
    public org.apache.axis.types.NonNegativeInteger getNumberOfDiscs() {
        return numberOfDiscs;
    }


    /**
     * Sets the numberOfDiscs value for this ItemAttributes.
     * 
     * @param numberOfDiscs
     */
    public void setNumberOfDiscs(org.apache.axis.types.NonNegativeInteger numberOfDiscs) {
        this.numberOfDiscs = numberOfDiscs;
    }


    /**
     * Gets the numberOfIssues value for this ItemAttributes.
     * 
     * @return numberOfIssues
     */
    public org.apache.axis.types.NonNegativeInteger getNumberOfIssues() {
        return numberOfIssues;
    }


    /**
     * Sets the numberOfIssues value for this ItemAttributes.
     * 
     * @param numberOfIssues
     */
    public void setNumberOfIssues(org.apache.axis.types.NonNegativeInteger numberOfIssues) {
        this.numberOfIssues = numberOfIssues;
    }


    /**
     * Gets the numberOfItems value for this ItemAttributes.
     * 
     * @return numberOfItems
     */
    public org.apache.axis.types.NonNegativeInteger getNumberOfItems() {
        return numberOfItems;
    }


    /**
     * Sets the numberOfItems value for this ItemAttributes.
     * 
     * @param numberOfItems
     */
    public void setNumberOfItems(org.apache.axis.types.NonNegativeInteger numberOfItems) {
        this.numberOfItems = numberOfItems;
    }


    /**
     * Gets the numberOfPages value for this ItemAttributes.
     * 
     * @return numberOfPages
     */
    public org.apache.axis.types.NonNegativeInteger getNumberOfPages() {
        return numberOfPages;
    }


    /**
     * Sets the numberOfPages value for this ItemAttributes.
     * 
     * @param numberOfPages
     */
    public void setNumberOfPages(org.apache.axis.types.NonNegativeInteger numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    /**
     * Gets the numberOfTracks value for this ItemAttributes.
     * 
     * @return numberOfTracks
     */
    public org.apache.axis.types.NonNegativeInteger getNumberOfTracks() {
        return numberOfTracks;
    }


    /**
     * Sets the numberOfTracks value for this ItemAttributes.
     * 
     * @param numberOfTracks
     */
    public void setNumberOfTracks(org.apache.axis.types.NonNegativeInteger numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }


    /**
     * Gets the operatingSystem value for this ItemAttributes.
     * 
     * @return operatingSystem
     */
    public java.lang.String getOperatingSystem() {
        return operatingSystem;
    }


    /**
     * Sets the operatingSystem value for this ItemAttributes.
     * 
     * @param operatingSystem
     */
    public void setOperatingSystem(java.lang.String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }


    /**
     * Gets the packageDimensions value for this ItemAttributes.
     * 
     * @return packageDimensions
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesPackageDimensions getPackageDimensions() {
        return packageDimensions;
    }


    /**
     * Sets the packageDimensions value for this ItemAttributes.
     * 
     * @param packageDimensions
     */
    public void setPackageDimensions(com.amazon.webservices.AWSECommerceService._2011_08_01.ItemAttributesPackageDimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }


    /**
     * Gets the packageQuantity value for this ItemAttributes.
     * 
     * @return packageQuantity
     */
    public org.apache.axis.types.NonNegativeInteger getPackageQuantity() {
        return packageQuantity;
    }


    /**
     * Sets the packageQuantity value for this ItemAttributes.
     * 
     * @param packageQuantity
     */
    public void setPackageQuantity(org.apache.axis.types.NonNegativeInteger packageQuantity) {
        this.packageQuantity = packageQuantity;
    }


    /**
     * Gets the partNumber value for this ItemAttributes.
     * 
     * @return partNumber
     */
    public java.lang.String getPartNumber() {
        return partNumber;
    }


    /**
     * Sets the partNumber value for this ItemAttributes.
     * 
     * @param partNumber
     */
    public void setPartNumber(java.lang.String partNumber) {
        this.partNumber = partNumber;
    }


    /**
     * Gets the pictureFormat value for this ItemAttributes.
     * 
     * @return pictureFormat
     */
    public java.lang.String[] getPictureFormat() {
        return pictureFormat;
    }


    /**
     * Sets the pictureFormat value for this ItemAttributes.
     * 
     * @param pictureFormat
     */
    public void setPictureFormat(java.lang.String[] pictureFormat) {
        this.pictureFormat = pictureFormat;
    }

    public java.lang.String getPictureFormat(int i) {
        return this.pictureFormat[i];
    }

    public void setPictureFormat(int i, java.lang.String _value) {
        this.pictureFormat[i] = _value;
    }


    /**
     * Gets the platform value for this ItemAttributes.
     * 
     * @return platform
     */
    public java.lang.String[] getPlatform() {
        return platform;
    }


    /**
     * Sets the platform value for this ItemAttributes.
     * 
     * @param platform
     */
    public void setPlatform(java.lang.String[] platform) {
        this.platform = platform;
    }

    public java.lang.String getPlatform(int i) {
        return this.platform[i];
    }

    public void setPlatform(int i, java.lang.String _value) {
        this.platform[i] = _value;
    }


    /**
     * Gets the productGroup value for this ItemAttributes.
     * 
     * @return productGroup
     */
    public java.lang.String getProductGroup() {
        return productGroup;
    }


    /**
     * Sets the productGroup value for this ItemAttributes.
     * 
     * @param productGroup
     */
    public void setProductGroup(java.lang.String productGroup) {
        this.productGroup = productGroup;
    }


    /**
     * Gets the productTypeName value for this ItemAttributes.
     * 
     * @return productTypeName
     */
    public java.lang.String getProductTypeName() {
        return productTypeName;
    }


    /**
     * Sets the productTypeName value for this ItemAttributes.
     * 
     * @param productTypeName
     */
    public void setProductTypeName(java.lang.String productTypeName) {
        this.productTypeName = productTypeName;
    }


    /**
     * Gets the productTypeSubcategory value for this ItemAttributes.
     * 
     * @return productTypeSubcategory
     */
    public java.lang.String getProductTypeSubcategory() {
        return productTypeSubcategory;
    }


    /**
     * Sets the productTypeSubcategory value for this ItemAttributes.
     * 
     * @param productTypeSubcategory
     */
    public void setProductTypeSubcategory(java.lang.String productTypeSubcategory) {
        this.productTypeSubcategory = productTypeSubcategory;
    }


    /**
     * Gets the publicationDate value for this ItemAttributes.
     * 
     * @return publicationDate
     */
    public java.lang.String getPublicationDate() {
        return publicationDate;
    }


    /**
     * Sets the publicationDate value for this ItemAttributes.
     * 
     * @param publicationDate
     */
    public void setPublicationDate(java.lang.String publicationDate) {
        this.publicationDate = publicationDate;
    }


    /**
     * Gets the publisher value for this ItemAttributes.
     * 
     * @return publisher
     */
    public java.lang.String getPublisher() {
        return publisher;
    }


    /**
     * Sets the publisher value for this ItemAttributes.
     * 
     * @param publisher
     */
    public void setPublisher(java.lang.String publisher) {
        this.publisher = publisher;
    }


    /**
     * Gets the regionCode value for this ItemAttributes.
     * 
     * @return regionCode
     */
    public java.lang.String getRegionCode() {
        return regionCode;
    }


    /**
     * Sets the regionCode value for this ItemAttributes.
     * 
     * @param regionCode
     */
    public void setRegionCode(java.lang.String regionCode) {
        this.regionCode = regionCode;
    }


    /**
     * Gets the releaseDate value for this ItemAttributes.
     * 
     * @return releaseDate
     */
    public java.lang.String getReleaseDate() {
        return releaseDate;
    }


    /**
     * Sets the releaseDate value for this ItemAttributes.
     * 
     * @param releaseDate
     */
    public void setReleaseDate(java.lang.String releaseDate) {
        this.releaseDate = releaseDate;
    }


    /**
     * Gets the runningTime value for this ItemAttributes.
     * 
     * @return runningTime
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits getRunningTime() {
        return runningTime;
    }


    /**
     * Sets the runningTime value for this ItemAttributes.
     * 
     * @param runningTime
     */
    public void setRunningTime(com.amazon.webservices.AWSECommerceService._2011_08_01.DecimalWithUnits runningTime) {
        this.runningTime = runningTime;
    }


    /**
     * Gets the seikodoProductCode value for this ItemAttributes.
     * 
     * @return seikodoProductCode
     */
    public java.lang.String getSeikodoProductCode() {
        return seikodoProductCode;
    }


    /**
     * Sets the seikodoProductCode value for this ItemAttributes.
     * 
     * @param seikodoProductCode
     */
    public void setSeikodoProductCode(java.lang.String seikodoProductCode) {
        this.seikodoProductCode = seikodoProductCode;
    }


    /**
     * Gets the size value for this ItemAttributes.
     * 
     * @return size
     */
    public java.lang.String getSize() {
        return size;
    }


    /**
     * Sets the size value for this ItemAttributes.
     * 
     * @param size
     */
    public void setSize(java.lang.String size) {
        this.size = size;
    }


    /**
     * Gets the SKU value for this ItemAttributes.
     * 
     * @return SKU
     */
    public java.lang.String getSKU() {
        return SKU;
    }


    /**
     * Sets the SKU value for this ItemAttributes.
     * 
     * @param SKU
     */
    public void setSKU(java.lang.String SKU) {
        this.SKU = SKU;
    }


    /**
     * Gets the studio value for this ItemAttributes.
     * 
     * @return studio
     */
    public java.lang.String getStudio() {
        return studio;
    }


    /**
     * Sets the studio value for this ItemAttributes.
     * 
     * @param studio
     */
    public void setStudio(java.lang.String studio) {
        this.studio = studio;
    }


    /**
     * Gets the subscriptionLength value for this ItemAttributes.
     * 
     * @return subscriptionLength
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.NonNegativeIntegerWithUnits getSubscriptionLength() {
        return subscriptionLength;
    }


    /**
     * Sets the subscriptionLength value for this ItemAttributes.
     * 
     * @param subscriptionLength
     */
    public void setSubscriptionLength(com.amazon.webservices.AWSECommerceService._2011_08_01.NonNegativeIntegerWithUnits subscriptionLength) {
        this.subscriptionLength = subscriptionLength;
    }


    /**
     * Gets the title value for this ItemAttributes.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ItemAttributes.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the trackSequence value for this ItemAttributes.
     * 
     * @return trackSequence
     */
    public java.lang.String getTrackSequence() {
        return trackSequence;
    }


    /**
     * Sets the trackSequence value for this ItemAttributes.
     * 
     * @param trackSequence
     */
    public void setTrackSequence(java.lang.String trackSequence) {
        this.trackSequence = trackSequence;
    }


    /**
     * Gets the tradeInValue value for this ItemAttributes.
     * 
     * @return tradeInValue
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getTradeInValue() {
        return tradeInValue;
    }


    /**
     * Sets the tradeInValue value for this ItemAttributes.
     * 
     * @param tradeInValue
     */
    public void setTradeInValue(com.amazon.webservices.AWSECommerceService._2011_08_01.Price tradeInValue) {
        this.tradeInValue = tradeInValue;
    }


    /**
     * Gets the UPC value for this ItemAttributes.
     * 
     * @return UPC
     */
    public java.lang.String getUPC() {
        return UPC;
    }


    /**
     * Sets the UPC value for this ItemAttributes.
     * 
     * @param UPC
     */
    public void setUPC(java.lang.String UPC) {
        this.UPC = UPC;
    }


    /**
     * Gets the UPCList value for this ItemAttributes.
     * 
     * @return UPCList
     */
    public java.lang.String[] getUPCList() {
        return UPCList;
    }


    /**
     * Sets the UPCList value for this ItemAttributes.
     * 
     * @param UPCList
     */
    public void setUPCList(java.lang.String[] UPCList) {
        this.UPCList = UPCList;
    }


    /**
     * Gets the warranty value for this ItemAttributes.
     * 
     * @return warranty
     */
    public java.lang.String getWarranty() {
        return warranty;
    }


    /**
     * Sets the warranty value for this ItemAttributes.
     * 
     * @param warranty
     */
    public void setWarranty(java.lang.String warranty) {
        this.warranty = warranty;
    }


    /**
     * Gets the WEEETaxValue value for this ItemAttributes.
     * 
     * @return WEEETaxValue
     */
    public com.amazon.webservices.AWSECommerceService._2011_08_01.Price getWEEETaxValue() {
        return WEEETaxValue;
    }


    /**
     * Sets the WEEETaxValue value for this ItemAttributes.
     * 
     * @param WEEETaxValue
     */
    public void setWEEETaxValue(com.amazon.webservices.AWSECommerceService._2011_08_01.Price WEEETaxValue) {
        this.WEEETaxValue = WEEETaxValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemAttributes)) return false;
        ItemAttributes other = (ItemAttributes) obj;
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
              java.util.Arrays.equals(this.actor, other.getActor()))) &&
            ((this.artist==null && other.getArtist()==null) || 
             (this.artist!=null &&
              java.util.Arrays.equals(this.artist, other.getArtist()))) &&
            ((this.aspectRatio==null && other.getAspectRatio()==null) || 
             (this.aspectRatio!=null &&
              this.aspectRatio.equals(other.getAspectRatio()))) &&
            ((this.audienceRating==null && other.getAudienceRating()==null) || 
             (this.audienceRating!=null &&
              this.audienceRating.equals(other.getAudienceRating()))) &&
            ((this.audioFormat==null && other.getAudioFormat()==null) || 
             (this.audioFormat!=null &&
              java.util.Arrays.equals(this.audioFormat, other.getAudioFormat()))) &&
            ((this.author==null && other.getAuthor()==null) || 
             (this.author!=null &&
              java.util.Arrays.equals(this.author, other.getAuthor()))) &&
            ((this.binding==null && other.getBinding()==null) || 
             (this.binding!=null &&
              this.binding.equals(other.getBinding()))) &&
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.catalogNumberList==null && other.getCatalogNumberList()==null) || 
             (this.catalogNumberList!=null &&
              java.util.Arrays.equals(this.catalogNumberList, other.getCatalogNumberList()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this.CEROAgeRating==null && other.getCEROAgeRating()==null) || 
             (this.CEROAgeRating!=null &&
              this.CEROAgeRating.equals(other.getCEROAgeRating()))) &&
            ((this.clothingSize==null && other.getClothingSize()==null) || 
             (this.clothingSize!=null &&
              this.clothingSize.equals(other.getClothingSize()))) &&
            ((this.color==null && other.getColor()==null) || 
             (this.color!=null &&
              this.color.equals(other.getColor()))) &&
            ((this.creator==null && other.getCreator()==null) || 
             (this.creator!=null &&
              java.util.Arrays.equals(this.creator, other.getCreator()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.director==null && other.getDirector()==null) || 
             (this.director!=null &&
              java.util.Arrays.equals(this.director, other.getDirector()))) &&
            ((this.EAN==null && other.getEAN()==null) || 
             (this.EAN!=null &&
              this.EAN.equals(other.getEAN()))) &&
            ((this.EANList==null && other.getEANList()==null) || 
             (this.EANList!=null &&
              java.util.Arrays.equals(this.EANList, other.getEANList()))) &&
            ((this.edition==null && other.getEdition()==null) || 
             (this.edition!=null &&
              this.edition.equals(other.getEdition()))) &&
            ((this.EISBN==null && other.getEISBN()==null) || 
             (this.EISBN!=null &&
              java.util.Arrays.equals(this.EISBN, other.getEISBN()))) &&
            ((this.episodeSequence==null && other.getEpisodeSequence()==null) || 
             (this.episodeSequence!=null &&
              this.episodeSequence.equals(other.getEpisodeSequence()))) &&
            ((this.ESRBAgeRating==null && other.getESRBAgeRating()==null) || 
             (this.ESRBAgeRating!=null &&
              this.ESRBAgeRating.equals(other.getESRBAgeRating()))) &&
            ((this.feature==null && other.getFeature()==null) || 
             (this.feature!=null &&
              java.util.Arrays.equals(this.feature, other.getFeature()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              java.util.Arrays.equals(this.format, other.getFormat()))) &&
            ((this.genre==null && other.getGenre()==null) || 
             (this.genre!=null &&
              this.genre.equals(other.getGenre()))) &&
            ((this.hardwarePlatform==null && other.getHardwarePlatform()==null) || 
             (this.hardwarePlatform!=null &&
              this.hardwarePlatform.equals(other.getHardwarePlatform()))) &&
            ((this.hazardousMaterialType==null && other.getHazardousMaterialType()==null) || 
             (this.hazardousMaterialType!=null &&
              this.hazardousMaterialType.equals(other.getHazardousMaterialType()))) &&
            ((this.isAdultProduct==null && other.getIsAdultProduct()==null) || 
             (this.isAdultProduct!=null &&
              this.isAdultProduct.equals(other.getIsAdultProduct()))) &&
            ((this.isAutographed==null && other.getIsAutographed()==null) || 
             (this.isAutographed!=null &&
              this.isAutographed.equals(other.getIsAutographed()))) &&
            ((this.ISBN==null && other.getISBN()==null) || 
             (this.ISBN!=null &&
              this.ISBN.equals(other.getISBN()))) &&
            ((this.isEligibleForTradeIn==null && other.getIsEligibleForTradeIn()==null) || 
             (this.isEligibleForTradeIn!=null &&
              this.isEligibleForTradeIn.equals(other.getIsEligibleForTradeIn()))) &&
            ((this.isMemorabilia==null && other.getIsMemorabilia()==null) || 
             (this.isMemorabilia!=null &&
              this.isMemorabilia.equals(other.getIsMemorabilia()))) &&
            ((this.issuesPerYear==null && other.getIssuesPerYear()==null) || 
             (this.issuesPerYear!=null &&
              this.issuesPerYear.equals(other.getIssuesPerYear()))) &&
            ((this.itemDimensions==null && other.getItemDimensions()==null) || 
             (this.itemDimensions!=null &&
              this.itemDimensions.equals(other.getItemDimensions()))) &&
            ((this.itemPartNumber==null && other.getItemPartNumber()==null) || 
             (this.itemPartNumber!=null &&
              this.itemPartNumber.equals(other.getItemPartNumber()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.languages==null && other.getLanguages()==null) || 
             (this.languages!=null &&
              java.util.Arrays.equals(this.languages, other.getLanguages()))) &&
            ((this.legalDisclaimer==null && other.getLegalDisclaimer()==null) || 
             (this.legalDisclaimer!=null &&
              this.legalDisclaimer.equals(other.getLegalDisclaimer()))) &&
            ((this.listPrice==null && other.getListPrice()==null) || 
             (this.listPrice!=null &&
              this.listPrice.equals(other.getListPrice()))) &&
            ((this.magazineType==null && other.getMagazineType()==null) || 
             (this.magazineType!=null &&
              this.magazineType.equals(other.getMagazineType()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.manufacturerMaximumAge==null && other.getManufacturerMaximumAge()==null) || 
             (this.manufacturerMaximumAge!=null &&
              this.manufacturerMaximumAge.equals(other.getManufacturerMaximumAge()))) &&
            ((this.manufacturerMinimumAge==null && other.getManufacturerMinimumAge()==null) || 
             (this.manufacturerMinimumAge!=null &&
              this.manufacturerMinimumAge.equals(other.getManufacturerMinimumAge()))) &&
            ((this.manufacturerPartsWarrantyDescription==null && other.getManufacturerPartsWarrantyDescription()==null) || 
             (this.manufacturerPartsWarrantyDescription!=null &&
              this.manufacturerPartsWarrantyDescription.equals(other.getManufacturerPartsWarrantyDescription()))) &&
            ((this.mediaType==null && other.getMediaType()==null) || 
             (this.mediaType!=null &&
              this.mediaType.equals(other.getMediaType()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.modelYear==null && other.getModelYear()==null) || 
             (this.modelYear!=null &&
              this.modelYear.equals(other.getModelYear()))) &&
            ((this.MPN==null && other.getMPN()==null) || 
             (this.MPN!=null &&
              this.MPN.equals(other.getMPN()))) &&
            ((this.numberOfDiscs==null && other.getNumberOfDiscs()==null) || 
             (this.numberOfDiscs!=null &&
              this.numberOfDiscs.equals(other.getNumberOfDiscs()))) &&
            ((this.numberOfIssues==null && other.getNumberOfIssues()==null) || 
             (this.numberOfIssues!=null &&
              this.numberOfIssues.equals(other.getNumberOfIssues()))) &&
            ((this.numberOfItems==null && other.getNumberOfItems()==null) || 
             (this.numberOfItems!=null &&
              this.numberOfItems.equals(other.getNumberOfItems()))) &&
            ((this.numberOfPages==null && other.getNumberOfPages()==null) || 
             (this.numberOfPages!=null &&
              this.numberOfPages.equals(other.getNumberOfPages()))) &&
            ((this.numberOfTracks==null && other.getNumberOfTracks()==null) || 
             (this.numberOfTracks!=null &&
              this.numberOfTracks.equals(other.getNumberOfTracks()))) &&
            ((this.operatingSystem==null && other.getOperatingSystem()==null) || 
             (this.operatingSystem!=null &&
              this.operatingSystem.equals(other.getOperatingSystem()))) &&
            ((this.packageDimensions==null && other.getPackageDimensions()==null) || 
             (this.packageDimensions!=null &&
              this.packageDimensions.equals(other.getPackageDimensions()))) &&
            ((this.packageQuantity==null && other.getPackageQuantity()==null) || 
             (this.packageQuantity!=null &&
              this.packageQuantity.equals(other.getPackageQuantity()))) &&
            ((this.partNumber==null && other.getPartNumber()==null) || 
             (this.partNumber!=null &&
              this.partNumber.equals(other.getPartNumber()))) &&
            ((this.pictureFormat==null && other.getPictureFormat()==null) || 
             (this.pictureFormat!=null &&
              java.util.Arrays.equals(this.pictureFormat, other.getPictureFormat()))) &&
            ((this.platform==null && other.getPlatform()==null) || 
             (this.platform!=null &&
              java.util.Arrays.equals(this.platform, other.getPlatform()))) &&
            ((this.productGroup==null && other.getProductGroup()==null) || 
             (this.productGroup!=null &&
              this.productGroup.equals(other.getProductGroup()))) &&
            ((this.productTypeName==null && other.getProductTypeName()==null) || 
             (this.productTypeName!=null &&
              this.productTypeName.equals(other.getProductTypeName()))) &&
            ((this.productTypeSubcategory==null && other.getProductTypeSubcategory()==null) || 
             (this.productTypeSubcategory!=null &&
              this.productTypeSubcategory.equals(other.getProductTypeSubcategory()))) &&
            ((this.publicationDate==null && other.getPublicationDate()==null) || 
             (this.publicationDate!=null &&
              this.publicationDate.equals(other.getPublicationDate()))) &&
            ((this.publisher==null && other.getPublisher()==null) || 
             (this.publisher!=null &&
              this.publisher.equals(other.getPublisher()))) &&
            ((this.regionCode==null && other.getRegionCode()==null) || 
             (this.regionCode!=null &&
              this.regionCode.equals(other.getRegionCode()))) &&
            ((this.releaseDate==null && other.getReleaseDate()==null) || 
             (this.releaseDate!=null &&
              this.releaseDate.equals(other.getReleaseDate()))) &&
            ((this.runningTime==null && other.getRunningTime()==null) || 
             (this.runningTime!=null &&
              this.runningTime.equals(other.getRunningTime()))) &&
            ((this.seikodoProductCode==null && other.getSeikodoProductCode()==null) || 
             (this.seikodoProductCode!=null &&
              this.seikodoProductCode.equals(other.getSeikodoProductCode()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.SKU==null && other.getSKU()==null) || 
             (this.SKU!=null &&
              this.SKU.equals(other.getSKU()))) &&
            ((this.studio==null && other.getStudio()==null) || 
             (this.studio!=null &&
              this.studio.equals(other.getStudio()))) &&
            ((this.subscriptionLength==null && other.getSubscriptionLength()==null) || 
             (this.subscriptionLength!=null &&
              this.subscriptionLength.equals(other.getSubscriptionLength()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.trackSequence==null && other.getTrackSequence()==null) || 
             (this.trackSequence!=null &&
              this.trackSequence.equals(other.getTrackSequence()))) &&
            ((this.tradeInValue==null && other.getTradeInValue()==null) || 
             (this.tradeInValue!=null &&
              this.tradeInValue.equals(other.getTradeInValue()))) &&
            ((this.UPC==null && other.getUPC()==null) || 
             (this.UPC!=null &&
              this.UPC.equals(other.getUPC()))) &&
            ((this.UPCList==null && other.getUPCList()==null) || 
             (this.UPCList!=null &&
              java.util.Arrays.equals(this.UPCList, other.getUPCList()))) &&
            ((this.warranty==null && other.getWarranty()==null) || 
             (this.warranty!=null &&
              this.warranty.equals(other.getWarranty()))) &&
            ((this.WEEETaxValue==null && other.getWEEETaxValue()==null) || 
             (this.WEEETaxValue!=null &&
              this.WEEETaxValue.equals(other.getWEEETaxValue())));
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
        if (getAspectRatio() != null) {
            _hashCode += getAspectRatio().hashCode();
        }
        if (getAudienceRating() != null) {
            _hashCode += getAudienceRating().hashCode();
        }
        if (getAudioFormat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudioFormat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudioFormat(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getBinding() != null) {
            _hashCode += getBinding().hashCode();
        }
        if (getBrand() != null) {
            _hashCode += getBrand().hashCode();
        }
        if (getCatalogNumberList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCatalogNumberList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCatalogNumberList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCEROAgeRating() != null) {
            _hashCode += getCEROAgeRating().hashCode();
        }
        if (getClothingSize() != null) {
            _hashCode += getClothingSize().hashCode();
        }
        if (getColor() != null) {
            _hashCode += getColor().hashCode();
        }
        if (getCreator() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreator());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreator(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDirector() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDirector());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDirector(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEAN() != null) {
            _hashCode += getEAN().hashCode();
        }
        if (getEANList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEANList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEANList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEdition() != null) {
            _hashCode += getEdition().hashCode();
        }
        if (getEISBN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEISBN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEISBN(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEpisodeSequence() != null) {
            _hashCode += getEpisodeSequence().hashCode();
        }
        if (getESRBAgeRating() != null) {
            _hashCode += getESRBAgeRating().hashCode();
        }
        if (getFeature() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeature());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeature(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFormat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFormat(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGenre() != null) {
            _hashCode += getGenre().hashCode();
        }
        if (getHardwarePlatform() != null) {
            _hashCode += getHardwarePlatform().hashCode();
        }
        if (getHazardousMaterialType() != null) {
            _hashCode += getHazardousMaterialType().hashCode();
        }
        if (getIsAdultProduct() != null) {
            _hashCode += getIsAdultProduct().hashCode();
        }
        if (getIsAutographed() != null) {
            _hashCode += getIsAutographed().hashCode();
        }
        if (getISBN() != null) {
            _hashCode += getISBN().hashCode();
        }
        if (getIsEligibleForTradeIn() != null) {
            _hashCode += getIsEligibleForTradeIn().hashCode();
        }
        if (getIsMemorabilia() != null) {
            _hashCode += getIsMemorabilia().hashCode();
        }
        if (getIssuesPerYear() != null) {
            _hashCode += getIssuesPerYear().hashCode();
        }
        if (getItemDimensions() != null) {
            _hashCode += getItemDimensions().hashCode();
        }
        if (getItemPartNumber() != null) {
            _hashCode += getItemPartNumber().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLanguages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLegalDisclaimer() != null) {
            _hashCode += getLegalDisclaimer().hashCode();
        }
        if (getListPrice() != null) {
            _hashCode += getListPrice().hashCode();
        }
        if (getMagazineType() != null) {
            _hashCode += getMagazineType().hashCode();
        }
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getManufacturerMaximumAge() != null) {
            _hashCode += getManufacturerMaximumAge().hashCode();
        }
        if (getManufacturerMinimumAge() != null) {
            _hashCode += getManufacturerMinimumAge().hashCode();
        }
        if (getManufacturerPartsWarrantyDescription() != null) {
            _hashCode += getManufacturerPartsWarrantyDescription().hashCode();
        }
        if (getMediaType() != null) {
            _hashCode += getMediaType().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getModelYear() != null) {
            _hashCode += getModelYear().hashCode();
        }
        if (getMPN() != null) {
            _hashCode += getMPN().hashCode();
        }
        if (getNumberOfDiscs() != null) {
            _hashCode += getNumberOfDiscs().hashCode();
        }
        if (getNumberOfIssues() != null) {
            _hashCode += getNumberOfIssues().hashCode();
        }
        if (getNumberOfItems() != null) {
            _hashCode += getNumberOfItems().hashCode();
        }
        if (getNumberOfPages() != null) {
            _hashCode += getNumberOfPages().hashCode();
        }
        if (getNumberOfTracks() != null) {
            _hashCode += getNumberOfTracks().hashCode();
        }
        if (getOperatingSystem() != null) {
            _hashCode += getOperatingSystem().hashCode();
        }
        if (getPackageDimensions() != null) {
            _hashCode += getPackageDimensions().hashCode();
        }
        if (getPackageQuantity() != null) {
            _hashCode += getPackageQuantity().hashCode();
        }
        if (getPartNumber() != null) {
            _hashCode += getPartNumber().hashCode();
        }
        if (getPictureFormat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPictureFormat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPictureFormat(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPlatform() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlatform());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlatform(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductGroup() != null) {
            _hashCode += getProductGroup().hashCode();
        }
        if (getProductTypeName() != null) {
            _hashCode += getProductTypeName().hashCode();
        }
        if (getProductTypeSubcategory() != null) {
            _hashCode += getProductTypeSubcategory().hashCode();
        }
        if (getPublicationDate() != null) {
            _hashCode += getPublicationDate().hashCode();
        }
        if (getPublisher() != null) {
            _hashCode += getPublisher().hashCode();
        }
        if (getRegionCode() != null) {
            _hashCode += getRegionCode().hashCode();
        }
        if (getReleaseDate() != null) {
            _hashCode += getReleaseDate().hashCode();
        }
        if (getRunningTime() != null) {
            _hashCode += getRunningTime().hashCode();
        }
        if (getSeikodoProductCode() != null) {
            _hashCode += getSeikodoProductCode().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getSKU() != null) {
            _hashCode += getSKU().hashCode();
        }
        if (getStudio() != null) {
            _hashCode += getStudio().hashCode();
        }
        if (getSubscriptionLength() != null) {
            _hashCode += getSubscriptionLength().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTrackSequence() != null) {
            _hashCode += getTrackSequence().hashCode();
        }
        if (getTradeInValue() != null) {
            _hashCode += getTradeInValue().hashCode();
        }
        if (getUPC() != null) {
            _hashCode += getUPC().hashCode();
        }
        if (getUPCList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUPCList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUPCList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWarranty() != null) {
            _hashCode += getWarranty().hashCode();
        }
        if (getWEEETaxValue() != null) {
            _hashCode += getWEEETaxValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">ItemAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Actor"));
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
        elemField.setFieldName("aspectRatio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AspectRatio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audienceRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AudienceRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "AudioFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Binding"));
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
        elemField.setFieldName("catalogNumberList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CatalogNumberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CatalogNumberListElement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CEROAgeRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "CEROAgeRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clothingSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ClothingSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("color");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Creator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>ItemAttributes>Creator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Department"));
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
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "EAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EANList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "EANList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "EANListElement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Edition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EISBN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "EISBN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("episodeSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "EpisodeSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESRBAgeRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ESRBAgeRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Feature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Genre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardwarePlatform");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "HardwarePlatform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazardousMaterialType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "HazardousMaterialType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAdultProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "IsAdultProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAutographed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "IsAutographed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISBN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ISBN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEligibleForTradeIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "IsEligibleForTradeIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMemorabilia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "IsMemorabilia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuesPerYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "IssuesPerYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemDimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>ItemAttributes>ItemDimensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPartNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ItemPartNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Languages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>>ItemAttributes>Languages>Language"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Language"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalDisclaimer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "LegalDisclaimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ListPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("magazineType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MagazineType"));
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
        elemField.setFieldName("manufacturerMaximumAge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ManufacturerMaximumAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "DecimalWithUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerMinimumAge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ManufacturerMinimumAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "DecimalWithUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerPartsWarrantyDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ManufacturerPartsWarrantyDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MediaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ModelYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MPN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "MPN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfDiscs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "NumberOfDiscs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfIssues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "NumberOfIssues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "NumberOfItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "NumberOfPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfTracks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "NumberOfTracks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "OperatingSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageDimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "PackageDimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", ">>ItemAttributes>PackageDimensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "PackageQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "PartNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pictureFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "PictureFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platform");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Platform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ProductGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ProductTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTypeSubcategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "ProductTypeSubcategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "PublicationDate"));
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
        elemField.setFieldName("regionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "RegionCode"));
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
        elemField.setFieldName("runningTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "RunningTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "DecimalWithUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seikodoProductCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SeikodoProductCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SKU");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Studio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "SubscriptionLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "NonNegativeIntegerWithUnits"));
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
        elemField.setFieldName("trackSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TrackSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tradeInValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "TradeInValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UPC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "UPC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UPCList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "UPCList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "UPCListElement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warranty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Warranty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WEEETaxValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "WEEETaxValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2011-08-01", "Price"));
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
