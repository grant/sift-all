package main

const SIFT_TRANSACTION_ID string = ""
const SIFT_USER_ID string = "$user_id"
const SIFT_CURRENCY_CODE string = "$currency_code"
const SIFT_AMOUNT string = "$amount"
const SIFT_TIME string = "$time"
const SIFT_ORDER_ID string = "$order_id"

const EVENT_TRANSACTION string = "$transaction"

type Event struct {
	Transaction string
}

const E = Event{
	Transaction: "hi",
}
