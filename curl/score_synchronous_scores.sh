curl -X POST \
-H "Accept: application/json" \
-d '{
    "$type"             : "$create_order",
    "$api_key"          : "'$(cat ../.api_key)'",
    "$user_id"          : "billy_jones_301",
    "$session_id"       : "gigtleqddo84l8cm15qe4il",
    "$order_id"         : "ORDER-28168441",
    "$user_email"       : "bill@gmail.com",
    "$amount"           : 115940000,
    "$currency_code"    : "USD"
}' https://api.siftscience.com/v204/events?return_score=true&abuse_types=payment_abuse,promotion_abuse