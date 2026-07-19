# CareerConnect AI

An intelligent Placement Management System built using Spring Boot and Java 21.

## Features

- Student Registration
- Company Management
- Placement Drive Management
- Placement Applications
- Eligibility Checking (Strategy Pattern)
- AI Career Recommendation using Ollama (Llama 3)
- REST APIs
- In-memory Repository Pattern

## Tech Stack

- Java 21
- Spring Boot 4.1
- Maven
- REST API
- Ollama
- Llama 3
- Postman

## Design Patterns

- Strategy Pattern
- Repository Pattern
- Dependency Injection

## Project Structure

Controller
Service
Repository
Strategy
Entity
AI
Configuration

## Running the Project

1. Clone the repository

2. Run

./mvnw spring-boot:run

or run CareerConnectAiApplication.java

Application runs on

http://localhost:8080

## AI Setup

Install Ollama

Pull Llama 3

ollama pull llama3

Start Ollama

ollama serve

AI endpoint

GET /ai/recommend/STU001/DRIVE001

## Sample Endpoints

GET /students

GET /companies

GET /drives

GET /eligibility/STU001/DRIVE001

GET /ai/recommend/STU001/DRIVE001
