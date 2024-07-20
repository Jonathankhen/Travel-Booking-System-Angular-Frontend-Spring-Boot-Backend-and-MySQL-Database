# Travel-Booking-System-Angular-Frontend-Spring-Boot-Backend-and-MySQL-Database
This code implements a Minimal Viable Product (MVP) for a travel booking system with an Angular frontend and a Spring Boot backend for API services. A MySQL database is used for secure data storage.

## Project Overview

The Travel Booking System is engineered to provide a robust platform for booking travel packages, including vacations and excursions. It employs a modern tech stack to ensure seamless interactions between the user interface and the underlying data services.

## Features

- **Angular Frontend**: Provides a responsive and intuitive user interface for end-users to browse and book travel packages.
- **Spring Boot Backend**: Handles API requests, processes business logic, and manages data transactions in a secure and scalable manner.
- **MySQL Database**: Stores all relevant data including customer information, booking details, and package options, ensuring data integrity and accessibility.

## Key Components

### Backend

- **Controllers**: Manage incoming HTTP requests and respond with appropriate HTTP responses. Includes endpoints for handling bookings and customer inquiries.
- **Services**: Contains the business logic of the application, including the calculation of prices, availability checks, and booking confirmations.
- **Repositories**: Interface with the MySQL database using Spring Data JPA to retrieve, update, and store data.
- **Entities**: Java classes that map to database tables, representing customers, bookings, and travel packages.

### Frontend

- **Components**: Angular components that render the user interface, including forms for entering customer data and interactive lists for selecting travel packages.
- **Services**: Angular services that handle the communication with the backend via HTTP, sending and receiving data as needed.

### Database

- **Schema**: Consists of tables for customers, bookings, and travel packages. Designed to support efficient queries and updates.
- **Security**: Utilizes best practices for data security, including encrypted connections and secure access controls.

## Installation

### Prerequisites

- Java JDK 11 or later
- MySQL
- Node.js and npm

### Setup

#### Clone the repository and navigate to the project directory:

```bash
git clone https://github.com/Jonathankhen/Travel-Booking-System-Angular-Frontend-Spring-Boot-Backend-and-MySQL-Database.git
cd Travel-Booking-System-Angular-Frontend-Spring-Boot-Backend-and-MySQL-Database
```

#### Install Dependencies
```bash
npm install
./mvnw install
```

#### Running the Application
```bash
./mvnw spring-boot:run
```

## Screenshots

### Vacation Packages Interface
This section showcases various vacation packages available for booking. Users can select packages based on different countries and available activities.
![WhatsApp Image 2024-07-20 at 17 43 42_d5dc0813](https://github.com/user-attachments/assets/68439846-d897-4e1d-b527-d7ec04327dce)

### Detailed Activity Selection
Here, users can view and choose specific activities for their vacation package. Each activity includes a price tag.
![WhatsApp Image 2024-07-20 at 17 55 57_074b2026](https://github.com/user-attachments/assets/1734af4a-71f7-4388-9dfc-bd1ecdf2c236)

### Database Customer Information
![MySQL Workbench_Customer Info_1](https://github.com/user-attachments/assets/c9ed12de-7fc9-4904-a87c-c0fc5d37ac08)
![MySQL Workbench_Customer Info_2](https://github.com/user-attachments/assets/fff59fb3-a2db-4ee9-af9d-66f925b031bf)

This screenshot shows the front-end interface used for selecting customers, which is connected to the MySQL backend displaying customer details for booking management.

![WhatsApp Image 2024-07-20 at 17 54 38_8c0294fa](https://github.com/user-attachments/assets/f657ad3c-bf53-4281-946d-f26d96392d1c)

### Customer Checkout Process
This screenshot displays the customer checkout interface with the network activity tab visible, demonstrating that there are no issues in the network while rendering the page:
![Picture of Customer Checkout_Two Excursions_Network Tab Open](https://github.com/user-attachments/assets/4c0b9c39-f82c-4ff5-b464-0c32bf08e9ed)
![WhatsApp Image 2024-07-20 at 17 56 10_3a5529cd](https://github.com/user-attachments/assets/8cda263f-4791-4763-97c3-33cc3ba119dd)



