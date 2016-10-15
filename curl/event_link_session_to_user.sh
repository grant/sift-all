# Sample $link_session_to_user event
curl -X POST -d '{
  "$type"       : "$link_session_to_user",
  "$api_key"    : "'$(cat ../.api_key)'",
  "$user_id"    : "billy_jones_301",
  "$session_id" : "gigtleqddo84l8cm15qe4il"
}' https://api.siftscience.com/v204/events