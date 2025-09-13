# 🎯 Quiz App Using Microservices

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green)](https://spring.io/projects/spring-boot)
[![Microservices](https://img.shields.io/badge/Architecture-Microservices-orange)](#)
[![License](https://img.shields.io/badge/License-MIT-lightgrey)](LICENSE)

A **Quiz Application** built with **Spring Boot Microservices** architecture.  
This project demonstrates service discovery, API gateway, and communication between microservices.

---

## 🚀 Features

- ✅ **Service Registry (Eureka Server)** for microservice registration & discovery  
- ✅ **API Gateway** for routing client requests  
- ✅ **Question Service** to manage quiz questions  
- ✅ **Quiz Service** to create & evaluate quizzes  
- ✅ **Scalable Architecture** – easily extendable for new services  

---

## 🏗️ Architecture

flowchart TD
    A[Client / Postman / Frontend] --> B[API Gateway]
    B --> C[Question Service]
    B --> D[Quiz Service]
    C & D --> E[Service Registry (Eureka)]

 ---

📂 Project Structure
Quiz-App-Using-MicroServices/
│
├── api-gateway/            # API Gateway for routing
├── question-service-ms/    # Manages questions
├── quiz-service-ms/        # Manages quiz creation & evaluation
└── service-registry/       # Eureka Server for discovery

---

⚙️ Tech Stack
Java 17+
Spring Boot 3
Spring Cloud Netflix Eureka
Spring Cloud Gateway
Maven
REST API

