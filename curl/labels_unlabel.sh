# Example curl request to remove a payment abuse label:
curl -X DELETE "https://api.siftscience.com/v204/users/billy_jones_301/labels/?api_key=$(cat ../.api_key)&abuse_type=payment_abuse"