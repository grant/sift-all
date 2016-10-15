# Sample $flag_content event
curl -X POST -d '{
  "$type"       : "$flag_content",
  "$api_key"    : "'$(cat ../.api_key)'",
  "$user_id"    : "billy_jones_301",
  "$content_id" : "9671500641",

  "$flagged_by" : "jamieli89"
}' https://api.siftscience.com/v204/events