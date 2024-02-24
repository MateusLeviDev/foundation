package main

import (
    "fmt"
	"log"

    "lev.i.com/greetings"
)

// return and handle an error
func main() {
    log.SetPrefix("greetings: ")
	log.SetFlags(0)

    message, err := greetings.Hello("")

	if err != nil {
		log.Fatal(err)
	}

    fmt.Println(message)
}