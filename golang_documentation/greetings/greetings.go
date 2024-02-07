package greetings

import (
	"errors"
	"fmt"
)

func Hello(name string) (string, error)  {
if name == "" {
	return "", errors.New("empty name")
}

	message := fmt.Sprintf("hi, %v. welcome!", name)
	return message, nil
}