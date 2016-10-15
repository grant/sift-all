# Sample $remove_item_from_cart event
curl -X POST -d '{
  "$type"       : "$remove_item_from_cart",
  "$api_key"    : "'$(cat ../.api_key)'",
  "$user_id"    : "billy_jones_301",

  "$session_id" : "gigtleqddo84l8cm15qe4il",
  "$item"       : {
    "$item_id"        : "B004834GQO",
    "$product_title"  : "The Slanket Blanket-Texas Tea",
    "$price"          : 39990000,
    "$currency_code"  : "USD",
    "$quantity"       : 2,
    "$upc"            : "67862114510011",
    "$sku"            : "004834GQ",
    "$brand"          : "Slanket",
    "$manufacturer"   : "Slanket",
    "$category"       : "Blankets & Throws",
    "$tags"           : ["Awesome", "Wintertime specials"],
    "$color"          : "Texas Tea"
  }
}' https://api.siftscience.com/v204/events