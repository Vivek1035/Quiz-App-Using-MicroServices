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

```mermaid
flowchart TD
    A[Client / Postman / Frontend] --> B[API Gateway]
    B --> C[Question Service]
    B --> D[Quiz Service]
    C & D --> E[Service Registry (Eureka)]
