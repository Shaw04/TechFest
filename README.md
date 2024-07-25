# 🎉 TechFest Event Management System

## 📌 Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Implementation Steps](#implementation-steps)
- [Security](#security)


## 🌟 Overview

This project is a Single Page Application (SPA) for managing a tech fest, allowing users to log in, log out, and register for events. It includes an about page and robust security features.

## 🚀 Features

- User authentication (login/logout)
- Event registration
- About page
- Secure API calls
- Single Sign-On (SSO)

## 💻 Tech Stack

- **Frontend**: React.js
- **Backend**: Spring Boot
- **Database**: PostgreSQL
- **Authentication**: Okta Auth

## 🛠️ Implementation Steps

1. **SPA Creation**: 
   Developed a Single Page Application with login, logout, and event registration functionalities.

2. **Microservices**: 
   Utilized Spring Boot for creating microservices and database interactions.

3. **Database**: 
   Implemented PostgreSQL for data storage and management.

4. **Security Enhancement**: 
   Integrated Okta Auth to bolster application security.

5. **Okta Configuration**: 
   - Created an account on Auth0 website
   - Set up a server for the application

6. **Auth Configuration**: 
   Added AuthProvider in React app with necessary parameters:
   - Domain
   - Client ID
   - Audience
   - Scope
   - Redirect URL
   - Cache Location
   - Use Refresh Tokens

7. **SSO Implementation**: 
   Developed a Single Sign-On page to verify authentication:
   - Authenticated users gain access to the application
   - Non-authenticated users are redirected to the login page

8. **Application Structure**: 
   Wrapped all pages (home, about, etc.) within the SSO page for hierarchical authentication.

9. **API Interceptor**: 
   Created an interceptor to include authentication tokens with every API call.

10. **Backend Middleware**: 
    Implemented a Spring Boot middleware for token authentication before routing to the requested service.

## 🔐 Security

Our application prioritizes security through:
- Okta Auth integration
- Token-based authentication
- Secure API calls
- Single Sign-On (SSO) implementation

