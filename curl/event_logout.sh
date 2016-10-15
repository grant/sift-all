# Sample $logout event
curl -X POST -d '{
  "$type"      : "$logout",
  "$api_key"    : "'$(cat ../.api_key)'",
  "$user_id"   : "billy_jones_301"
}' https://api.siftscience.com/v204/events