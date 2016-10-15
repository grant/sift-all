# Sample $create_content event
curl -X POST -d '{
  "$type"       : "$create_content",
  "$api_key"    : "'$(cat ../.api_key)'",
  "$user_id"    : "billy_jones_301",

  "$contact_email"    : "bill@example.com",
  "$contact_phone"    : "1-415-555-6040",
  "$content_id"       : "9671500641",
  "$subject"          : "2 Bedroom Apartment for Rent",
  "$content"          : "Capitol Hill Seattle brand new condo. 2 bedrooms and 1 full bath.",
  "$amount"           : 2300000000,
  "$currency_code"    : "USD",
  "$categories"       : [
    "Housing",
    "Apartments",
    "2 Bedrooms"
  ],
  "$locations"        : [
    {
      "$city"       : "Seattle",
      "$region"     : "Washington",
      "$country"    : "US",
      "$zipcode"    : "98112"
    }
  ],
  "$image_hashes"     : [
    "912ec803b2ce49e4a541068d495ab570",
    "4be4b314caafaa3e12bfcb8d16df3aff"
  ],
  "$expiration_time"  : 1471003200000,
  "$status"           : "$active"
}' https://api.siftscience.com/v204/events