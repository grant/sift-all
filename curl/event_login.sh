# Sample $login event
curl -X POST -d '{
  "$type"         : "$login",
  "$api_key"    : "'$(cat ../.api_key)'",
  "$user_id"      : "billy_jones_301",
  "$session_id"   : "gigtleqddo84l8cm15qe4il",

  "$login_status" : "$success"
}' https://api.siftscience.com/v204/events