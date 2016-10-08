package main

import (
	"github.com/grant/sift-golang"
	"io/ioutil"
	"log"
)

type eventName string;

func main() {
	buf, _ := ioutil.ReadFile(".api_key")
	api_key := string(buf)
	sift := sift.New(api_key)

	eventName := "$transaction"

	data := map[eventName]interface{}{
		"$user_id":          "someone@someone.com",
		"$transaction_id":   "1233456",
		"$currency_code":    "USD",
		"$amount":           15230000,
		"$time":             1327604222,
		"trip_time":         930,
		"distance_traveled": 5.26,
		"$order_id":         "ORDER-123124124",
	}

	extras := map[string]interface{}{
		"return_action": true,
	}

	r, err := sift.Track(eventName, data, extras)
	if err != nil {
		log.Fatal(err)
	}

	log.Printf("Got tracking record: %v", r)
}
