# Sample $transaction event
curl -X POST -d '{
  "$type"             : "$transaction",
  "$api_key"          : "'$(cat ../.api_key)'",
  "$user_id"          : "billy_jones_301",
  "$amount"           : 506790000,
  "$currency_code"    : "USD",

  "$user_email"       : "bill@gmail.com",
  "$transaction_type" : "$sale",
  "$transaction_status" : "$success",
  "$order_id"         : "ORDER-123124124",
  "$transaction_id"   : "719637215",

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
  "$payment_method"   : {
      "$payment_type"    : "$credit_card",
      "$payment_gateway" : "$braintree",
      "$card_bin"        : "542486",
      "$card_last4"      : "4444"
  },

  "$payment_method"   : {
      "$payment_type"    : "$electronic_fund_transfer",
      "$routing_number"  : "021001088"
  },

  "$shipping_address" : {
      "$name"         : "Bill Jones",
      "$phone"        : "1-415-555-6041",
      "$address_1"    : "2100 Main Street",
      "$address_2"    : "Apt 3B",
      "$city"         : "New London",
      "$region"       : "New Hampshire",
      "$country"      : "US",
      "$zipcode"      : "03257"
  },
  "$session_id"       : "gigtleqddo84l8cm15qe4il",

  "$seller_user_id"     : "slinkys_emporium",

  "digital_wallet"      : "apple_pay",
  "coupon_code"         : "dollarMadness",
  "shipping_choice"     : "FedEx Ground Courier",
  "is_first_time_buyer" : false
}' https://api.siftscience.com/v204/events