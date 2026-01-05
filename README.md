# Marks_Producer
Contract-First SOAP approach. The contract is designed first. Code is forced to obey the contract.  The contract = XSD + WSDL

🧾 Short Description (GitHub description field)

End-to-end SOAP integration demo using Spring Boot, showcasing both Contract-First and Contract-Last approaches with Producer & Consumer applications.

📘 Long Description (README.md)
# 🧩 Enterprise SOAP Integration Demo — Contract-First & Contract-Last

This repository demonstrates a complete, real-world style **SOAP-based integration architecture** using Spring Boot, covering both major SOAP design approaches:

- **Contract-First** (XSD → WSDL → Java)
- **Contract-Last** (Java → WSDL)

The project includes a fully working **Producer** and **Consumer** with a REST-to-SOAP bridge, closely reflecting how large enterprise systems (banks, insurance, telecom, government) implement and maintain SOAP services.

---

## 🏗 Architecture Overview



Client / UI (JSON)
↓
Consumer App (REST → SOAP Adapter)
↓
Producer App (SOAP Business Service)


- The **Producer** contains the business logic (marks calculation).
- The **Consumer** acts as an integration layer translating REST/JSON calls into SOAP requests.

---

## 🧪 What This Project Demonstrates

### ✅ Contract-First Implementation
- XSD defined first
- Java classes generated from XSD
- Producer implements business logic using generated classes
- WSDL automatically published from contract
- Consumer generates client code from WSDL

### ✅ Contract-Last Implementation
- Java service written first
- WSDL generated automatically by CXF
- Consumer consumes the generated WSDL
- Demonstrates pros/cons vs Contract-First

### ✅ Enterprise Integration Patterns
- Strict contract governance
- No shared DTOs between Producer & Consumer
- SOAP client generation
- REST → SOAP translation layer
- Namespace & schema evolution handling

---

## 🧾 Technologies Used

- Java 17
- Spring Boot 2.7.x / 3.x
- Spring Web Services
- Apache CXF
- JAXB
- Maven
- SOAP 1.1
- REST (JSON API for Consumer)

---

## 🚀 End-to-End Flow



POST /api/marks/calculate (JSON)
↓
Consumer REST Controller
↓
SOAP Client (generated from WSDL)
↓
Producer SOAP Service
↓
Business Logic Execution
↓
SOAP Response
↓
JSON Response returned to client


---

## 🎯 Learning Goals

This project is ideal for understanding:

- How SOAP contracts are designed & enforced
- Differences between Contract-First and Contract-Last approaches
- How Producers and Consumers remain decoupled
- How enterprise systems evolve contracts safely over time
- How REST systems integrate with legacy SOAP services

---

## 📌 Why This Matters

SOAP is still widely used in critical enterprise systems.  
Understanding both contract approaches and how integration layers work is essential for backend and enterprise developers.

---

Feel free to explore, extend, and experiment with the code.
