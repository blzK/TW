import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceService;
import com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServiceLocator;
import com.amazon.webservices.AWSECommerceService._2011_08_01.AWSECommerceServicePortType;
import com.amazon.webservices.AWSECommerceService._2011_08_01.Item;
import com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequest;
import com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequestIdType;
import com.amazon.webservices.AWSECommerceService._2011_08_01.ItemSearchRequest;
import com.amazon.webservices.AWSECommerceService._2011_08_01.Items;
import com.amazon.webservices.AWSECommerceService._2011_08_01.holders.ItemsArrayHolder;
import com.amazon.webservices.AWSECommerceService._2011_08_01.holders.OperationRequestHolder;
import com.amazon.webservices.AWSECommerceService.*;

public class Main {

	public static void main(String[] args) throws RemoteException, ServiceException {
	/*	
ItemLookupRequest service = new ItemLookupRequest(
		
	       /*com.amazon.webservices.AWSECommerceService._2011_08_01.Condition condition,
           com.amazon.webservices.AWSECommerceService._2011_08_01.ItemLookupRequestIdType idType,
           java.lang.String merchantId,
           java.lang.String[] itemId,
           java.lang.String[] responseGroup,
           java.lang.String searchIndex,
           com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll variationPage,
           com.amazon.webservices.AWSECommerceService._2011_08_01.PositiveIntegerOrAll relatedItemPage,
           java.lang.String[] relationshipType,
           java.lang.String includeReviewsSummary,
           org.apache.axis.types.NonNegativeInteger truncateReviewsAt) {*/
    /*       this.condition = condition,
           ,ItemLookupRequestIdType.ISBN,
           "Large",
           "",
           "",
           this.searchIndex = searchIndex,
           this.variationPage = variationPage,
           this.relatedItemPage = relatedItemPage,
           this.relationshipType = relationshipType,
           this.includeReviewsSummary = includeReviewsSummary,
           this.truncateReviewsAt = truncateReviewsAt
           );
/*
Service=AWSECommerceService
&Operation=ItemLookup
&ResponseGroup=Large
&SearchIndex=All
&IdType=ISBN
&ItemId=076243631X
&AWSAccessKeyId=[Your_AWSAccessKeyID]
&AssociateTag=[Your_AssociateTag]
&Timestamp=[YYYY-MM-DDThh:mm:ssZ]
&Signature=[Request_Signature]
*/
		ItemLookupRequest service = new ItemLookupRequest();

		  AWSECommerceServicePortType amazonWS = new AWSECommerceServiceLocator().getAWSECommerceServicePort();
		  
		    //ItemLookup itemLookup = new ItemLookup();
		    ItemLookupRequest itemLookupRequest = new ItemLookupRequest();

		    // My Subscription ID was here, please note that you will have to provide your own
		    //itemLookupRequest.SubscriptionId = "— Subsription ID goes here—"; 
		    
		    // I want to use the ASIN to find the book
		    itemLookupRequest.setIdType(ItemLookupRequestIdType.ISBN); 
		   
		    // Use the ISBN number to identify the book
		    String[] s= new String[1];
		    System.out.print(s);
		    s[0]="0226452387";
		    itemLookupRequest.setItemId(s);
		    itemLookupRequest.setItemId(0,"0226452387"); 
		    // It is enough if I get the basic book information and the pictures back
		    //ItemLookupRequest ResponseGroup = new String[] { "Images", "Small" };

		    ItemLookupRequest reponse= new ItemLookupRequest();
		    // Set up the request
		    //itemLookup.Request = new ItemLookupRequest[] { itemLookupRequest };

		    String marketplaceDomain="www.javari.co.uk"; //OK
		    String AWSAccessKeyId=" AKIAJYVNAEPR6UVIDJ4Q";//Access Key ID OK
		    String associateTag="720912733825";//"7209-1273-3825";//associate ID OK AWS Account ID ?
		    String validate="False";//OK
		    String XMLEscaping="Single";//OK
		    ItemLookupRequest shared =itemLookupRequest;//new ItemLookupRequest();//?
		    ItemLookupRequest[] request= new ItemLookupRequest[1];//?
		    request[0]=shared;//?
		    OperationRequestHolder    operationRequest=new OperationRequestHolder();//?
		    System.out.println(operationRequest.toString());//?
		    
		    
		    Items[] itemsArray=new Items[1];
		    Items items= new Items();
		    //items.setItem(0, new Item());
		    itemsArray[0]=items;
		    ItemsArrayHolder itemsArrayHolder= new ItemsArrayHolder(itemsArray);//?
		    
		    // Call the Web Service
		    amazonWS.itemLookup(marketplaceDomain, AWSAccessKeyId, associateTag, validate, XMLEscaping, shared, request, operationRequest, itemsArrayHolder);
		    System.out.print(amazonWS.toString());
		    //ItemLookup(itemLookupRequest);
	    
	}

}
