package main

import (
	"io/ioutil"
)

func getAPIKey() string {
	buf, _ := ioutil.ReadFile("../.api_key")
	api_key := string(buf)
	return api_key
}
