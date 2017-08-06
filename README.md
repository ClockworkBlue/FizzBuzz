# FizzBuzz

## Description

To evaluate your skills as a developer, you're hereby asked to complete the following assignment. You have full 5 days to finish it, but you can of course return it earlier, if you want.

### The Assignment
* Create an application that implements the rules of Fizz Buzz game
	* A user gives a number (or many) and expects a reply with numbers divisible by three replaced with the word "fizz" and numbers divisible by five with the word "buzz".
	* See more detailed description: http://en.wikipedia.org/wiki/Fizz_buzz
* The application has to be written in a language runnable on JVM
* The game must be playable through an HTTP API
* Make the code repository available to us. E.g. from GitHub or BitBucket
* Even though the assignment is rather simple, produce production-level code

### Bonus tasks

* Host the application on the internet and let us know how to reach it
* Create a web-based UI for the API

## Solution

This repository contains a simple RESTful web service implemented in Java using the Spring framework. It only handles a single command:

**Title** : Plays FizzBuzz on a provided list of arbitrarily large integers.  
**URL** : /  
**Method** : POST  
**Data Params** : { [integer] }  
**Response Codes** : Success (200 OK), Bad Request (400)  

To run it, simply execute :
```./gradlew bootRun```

The API is currently hosted at http://api.fizzbuzz.dalmas.ch, and can be reached using any REST client tool. Additionally, a simple user interface is available at http://fizzbuzz.dalmas.ch. Its source is available at https://github.com/ClockworkBlue/FizzBuzzUI.
