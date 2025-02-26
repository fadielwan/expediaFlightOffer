# Expedia Flight Offers Web Application

## Overview
This project consists of two main components:

1. **Frontend**: A simple web interface that allows users to search for flight offers between two cities.
2. **Backend**: A Spring Boot REST API that fetches flight offers from an external service (such as Expedia or similar).

The frontend is built using HTML, CSS (Bootstrap), and JavaScript (jQuery), while the backend is a Spring Boot application.

## Features

- **User Interface**: The frontend allows the user to enter the origin and destination cities and search for available flight offers.
- **Flight Offers**: The backend API fetches flight offers based on the user’s input and displays them with flight details.
- **Flight Details**: Each flight offer displays details such as:
  - Carrier
  - Trip type
  - Price
  - Travel start and end dates
  - A link to book the flight

## Prerequisites

### Backend
- Java 17
- Maven for dependency management
- Spring Boot
- A running server or API (e.g., Expedia API, simulated service)

### Frontend
- A modern browser with JavaScript and jQuery support
- Bootstrap for styling

### Sample Request
   curl --location --request GET 'http://localhost:8085/expedia/flight-offers?origin=Dubai&destination=Doha' \
--header 'content-type: application/json' \
--header 'Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7' \
--header 'sec-ch-ua-platform: "Windows"' \
--header 'User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Safari/537.36' \
--header 'Cookie: JSESSIONID=E04D0A60A1055E14C517C25878909C34' \
--data 'Map<String, List<FlightOfferDTO>> offers;  '



