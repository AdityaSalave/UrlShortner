# URL Shortener

## Project Overview

The **URL Shortener** is a web-based application designed to create short, shareable URLs from long links. The application will provide two key functionalities:
1. Anonymous URL creation: Any user can create shortened URLs without the need to log in.

## Features

1. **Anonymous URL Creation**:
    - Generate short URLs for long links.
    - No login required.

2**Technical Implementation**:
    - Database integration for storing original and shortened URLs.
    - Validation to ensure URL uniqueness and prevent duplicates.
    

## System Requirements

To run this project, the following software and tools are required:



### Tools
- **Version Control**: Git
- **CI/CD**: GitHub Actions
- **IDE**: IntelliJ IDEA

### System
- **Operating System**: Windows 
- **Memory**: 8 GB RAM
- **Browser**: Google Chrome,Brave

## Development Workflow

1. **Structured Approach**:
    - Use GitHub Issues to document and track all tasks.
    - Categorize issues based on features, bugs, and enhancements.
    - Follow Agile principles to prioritize work.

2. **Branching Strategy**:
    - Use `master` branch for production-ready code.
    - Create feature-specific branches (`Telosa-branch`).

3. **Code Review**:
    - Submit pull requests for each feature branch.
    - Conduct self-reviews and team reviews for pull requests.

4. **Continuous Integration**:
    - Set up GitHub Actions for automated builds and tests.
    - Ensure builds pass before merging pull requests.

## How to Contribute

1. **Fork the Repository**: Clone the repository to your local machine.
2. **Set Up the Project**:
    - Clone the repository: `git clone <repository-url>`
    - Set up the database and configure environment variables (e.g., `application.properties` or `.env` file).
    - Run the application locally using `mvn spring-boot:run` or equivalent.
3. **Work on Issues**:
    - Assign yourself an issue from GitHub.
    - Create a new branch for the issue: `git checkout -b feature/<issue-name>`
    - Make your changes and commit: `git commit -m "Fix: <issue-description>"`
4. **Submit a Pull Request**:
    - Push your branch: `git push origin feature/<issue-name>`
    - Open a pull request and link the issue.
    - Add comments for reviewers to understand your changes.

## Deployment

The application will be deployed on:
-Github Workflow




