# [https://siftscience.com/developers/docs/curl/apis-overview](curl API)

curl support for Sift Science.

Put your API_KEY in a file called .api_key in the `sift-all` directory.

## Required fields

- `$api_key`: (String) Your Sift REST API key.
- `$user_id`: (String) The user’s internal account ID. This field is required on all events performed by the user while logged in. Users without an assigned $user_id will not show up in the console. Note: User IDs are case sensitive. You may need to normalize the capitalization of your user IDs. Only the following characters may be used:a-z,A-Z,0-9,=, ., -, _, +, @, :, &, ^, %, !, $
- `$session_id`: (String) The user's current session ID, used to tie a user's action before and after log in or account creation.
- `$type`: (String) The name of the event, for example $create_order.

# Optional
  
- `$ip`: (String) IP address of the request made by the user. Recommended for historical backfills and customers with mobile apps.
- `$time`: (Integer) Represents the time the event occured in your system. Send as a UNIX timestamp in milliseconds as shown in the historical backfill tutorial.

# Not working?

- unlabel

