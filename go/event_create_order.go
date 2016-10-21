package main

import (
	"github.com/0x19/sift-golang"
	"log"
)

func main() {
	sift := sift.New(getAPIKey())

	eventName := EVENT_CREATE_ORDER
	data := map[string]interface{}{
		// Required Fields
		FIELD_USER_ID: "billy_jones_301",
		// Supported Fields
		FIELD_SESSION_ID: "gigtleqddo84l8cm15qe4il",
		FIELD_ORDER_ID: "ORDER-28168441",
		FIELD_USER_EMAIL: "bill@gmail.com",
		FIELD_AMOUNT : 115940000, // $115.94
		FIELD_CURRENCY_CODE: "USD",
		FIELD_BILLING_ADDRESS: map[string]interface{}{
			FIELD_BILLING_ADDRESS_NAME: "Bill Jones",
			FIELD_BILLING_ADDRESS_PHONE: "1-415-555-6041",
			FIELD_BILLING_ADDRESS_ADDRESS_1: "2100 Main Street",
			FIELD_BILLING_ADDRESS_ADDRESS_2: "Apt 3B",
			FIELD_BILLING_ADDRESS_CITY: "New London",
			FIELD_BILLING_ADDRESS_REGION: "New Hampshire",
			FIELD_BILLING_ADDRESS_COUNTRY: "US",
			FIELD_BILLING_ADDRESS_ZIPCODE: "03257",
		},
//		FIELD_PAYMENT_METHODS: map[string]interface{}{
//			FIELD_PAYMENT_METHODS_PAYMENT_TYPE: "$credit_card",
//			FIELD_PAYMENT_METHODS_PAYMENT_GATEWAY: "$braintree",
//			FIELD_PAYMENT_METHODS_CARD_BIN: "542486",
//			FIELD_PAYMENT_METHODS_CARD_LAST4: "4444",
//		},
		FIELD_SHIPPING_ADDRESS: map[string]interface{}{
			FIELD_SHIPPING_ADDRESS_NAME: "Bill Jones",
			FIELD_SHIPPING_ADDRESS_PHONE: "1-415-555-6041",
			FIELD_SHIPPING_ADDRESS_ADDRESS_1: "2100 Main Street",
			FIELD_SHIPPING_ADDRESS_ADDRESS_2: "Apt 3B",
			FIELD_SHIPPING_ADDRESS_CITY: "New London",
			FIELD_SHIPPING_ADDRESS_REGION: "New Hampshire",
			FIELD_SHIPPING_ADDRESS_COUNTRY: "US",
			FIELD_SHIPPING_ADDRESS_ZIPCODE: "03257",
		},
		FIELD_EXPEDITED_SHIPPING: true,
		FIELD_SHIPPING_METHOD: "$physical",
//		FIELD_ITEMS: [...]map[string]interface{}{
//			FIELD_ITEMS_ITEM_ID: "12344321",
//			FIELD_ITEMS_PRODUCT_TITLE: "Microwavable Kettle Corn: Original Flavor",
//			FIELD_ITEMS_PRICE: 4990000,
//			FIELD_ITEMS_UPC: "097564307560",
//			FIELD_ITEMS_SKU: "03586005",
//			FIELD_ITEMS_BRAND: "Peters Kettle Corn",
//			FIELD_ITEMS_MANUFACTURER: "Peters Kettle Corn",
//			FIELD_ITEMS_CATEGORY: "Food and Grocery",
//			FIELD_ITEMS_TAGS: [...]string{"Popcorn", "Snacks", "On Sale"},
//			FIELD_ITEMS_QUANTITY: 4,
//		},
	}


		//	{
		//		"$item_id"        : "B004834GQO",
		//	"$product_title"  : "The Slanket Blanket-Texas Tea",
		//	"$price"          : 39990000, # $39.99
		//		"$upc"            : "67862114510011",
		//	"$sku"            : "004834GQ",
		//	"$brand"          : "Slanket",
		//	"$manufacturer"   : "Slanket",
		//	"$category"       : "Blankets & Throws",
		//	"$tags"           : ["Awesome", "Wintertime specials"],
		//		"$color"          : "Texas Tea",
		//	"$quantity"       : 2
		//	}
		//	],
		//	# For marketplaces, use $seller_user_id to identify the seller
		//	"$seller_user_id"     : "slinkys_emporium",
		//
		//	"$promotions"         : [
		//	{
		//		"$promotion_id" : "FirstTimeBuyer",
		//		"$status"       : "$success",
		//		"$description"  : "$5 off",
		//		"$discount"     : {
		//			"$amount"                   : 5000000,  # $5.00
		//			"$currency_code"            : "USD",
		//			"$minimum_purchase_amount"  : 25000000  # $25.00
		//		}
		//	}
		//	],
		//
		//	# Sample Custom Fields
		//	"digital_wallet"      : "apple_pay", # "google_wallet", etc.
		//	"coupon_code"         : "dollarMadness",
		//	"shipping_choice"     : "FedEx Ground Courier",
		//	"is_first_time_buyer" : False
	extras := map[string]interface{}{}

	r, err := sift.Track(eventName, data, extras)
	if err != nil {
		log.Fatal(err)
	}

	log.Printf("Got tracking record: %v", r)
}


