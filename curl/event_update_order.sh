# Sample $update_order event
curl -X POST -d '{
  "$type"             : "$update_order",
  "$api_key"          : "'$(cat ../.api_key)'",
  "$user_id"          : "billy_jones_301",

  "$session_id"       : "gigtleqddo84l8cm15qe4il",
  "$order_id"         : "ORDER-28168441",
  "$user_email"       : "bill@gmail.com",
  "$amount"           : 115940000,
  "$currency_code"    : "USD",
  "$billing_address"  : {
      "$name"         : "Bill Jones",
      "$phone"        : "1-415-555-6041",
      "$address_1"    : "2100 Main Street",
      "$address_2"    : "Apt 3B",
      "$city"         : "New London",
      "$region"       : "New Hampshire",
      "$country"      : "US",
      "$zipcode"      : "03257"
  },
  "$payment_methods"  : [
      {
          "$payment_type"    : "$credit_card",
          "$payment_gateway" : "$braintree",
          "$card_bin"        : "542486",
          "$card_last4"      : "4444"
      }
  ],
  "$shipping_address"  : {
      "$name"          : "Bill Jones",
      "$phone"         : "1-415-555-6041",
      "$address_1"     : "2100 Main Street",
      "$address_2"     : "Apt 3B",
      "$city"          : "New London",
      "$region"        : "New Hampshire",
      "$country"       : "US",
      "$zipcode"       : "03257"
  },
  "$expedited_shipping" : true,
  "$shipping_method"    : "$physical",
  "$items"             : [
    {
      "$item_id"        : "12344321",
      "$product_title"  : "Microwavable Kettle Corn: Original Flavor",
      "$price"          : 4990000,
      "$upc"            : "097564307560",
      "$sku"            : "03586005",
      "$brand"          : "Peters Kettle Corn",
      "$manufacturer"   : "Peters Kettle Corn",
      "$category"       : "Food and Grocery",
      "$tags"           : ["Popcorn", "Snacks", "On Sale"],
      "$quantity"       : 4
    },
    {
      "$item_id"        : "B004834GQO",
      "$product_title"  : "The Slanket Blanket-Texas Tea",
      "$price"          : 39990000,
      "$upc"            : "67862114510011",
      "$sku"            : "004834GQ",
      "$brand"          : "Slanket",
      "$manufacturer"   : "Slanket",
      "$category"       : "Blankets & Throws",
      "$tags"           : ["Awesome", "Wintertime specials"],
      "$color"          : "Texas Tea",
      "$quantity"       : 2
    }
  ],


  "$seller_user_id"     : "slinkys_emporium",

  "$promotions"         : [
    {
      "$promotion_id" : "FirstTimeBuyer",
      "$status"       : "$success",
      "$description"  : "$5 off",
      "$discount"     : {
        "$amount"                   : 5000000,
        "$currency_code"            : "USD",
        "$minimum_purchase_amount"  : 25000000
      }
    }
  ],


  "digital_wallet"      : "apple_pay",
  "coupon_code"         : "dollarMadness",
  "shipping_choice"     : "FedEx Ground Courier",
  "is_first_time_buyer" : false
}' https://api.siftscience.com/v204/events