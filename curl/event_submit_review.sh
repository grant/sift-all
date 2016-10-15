# Sample $submit_review event
curl -X POST -d '{
  "$type"              : "$submit_review",
  "$api_key"    : "'$(cat ../.api_key)'",
  "$user_id"           : "billy_jones_301",

  "$content"           : "Text content of submitted review goes here.",
  "$review_title"      : "Title of Review Goes Here",
  "$item_id"           : "V4C3D5R2Z6",
  "$reviewed_user_id"  : "billy_jones_301",
  "$submission_status" : "$success",

  "rating"             : "5"
}' https://api.siftscience.com/v204/events