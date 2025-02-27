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
  - Link of stay
  - A link to book the flight

## Prerequisites

### Backend
- Java 17
- Maven for dependency management
- Spring Boot
- Expedia API called usign feign client spring boot

### Frontend
- A modern browser with JavaScript and jQuery support
- Bootstrap for styling

### Sample request
-Origin City: Chicago

-Destination City: Miami

![image](https://github.com/user-attachments/assets/035e1771-e868-452d-80ed-904a14ecae94)

### Link project
http://localhost:8085

### Swagger API
http://localhost:8085/swagger-ui/index.html#
 


