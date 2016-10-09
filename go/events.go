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

	eventName := EVENT_TRANSACTION

	Event.Transaction
	E.Transaction

	data := map[string]interface{}{
		SIFT_USER_ID:        "someone@someone.com",
		SIFT_TRANSACTION_ID:   "1233456",
		SIFT_CURRENCY_CODE:    "USD",
		SIFT_AMOUNT:           15230000,
		SIFT_TIME:             1327604222,
		"trip_time":         930,
		"distance_traveled": 5.26,
		SIFT_ORDER_ID:         "ORDER-123124124",
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
