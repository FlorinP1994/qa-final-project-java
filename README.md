# QA Final Project - Java

![CI](https://github.com/FlorinP1994/qa-final-project-java/actions/workflows/ci.yml/badge.svg)

## Description

This project is a Java-based QA final project. It contains configuration files, API test pseudocode, a Dockerfile, and a GitHub Actions CI/CD workflow.

## Project Structure

- `config/` - application configuration
- `data/` - test data
- `src/test/java/com/FlorinP1994/tests/` - tests
- `.github/workflows/` - GitHub Actions workflow
- `Dockerfile` - Docker configuration

## API Test

The API test verifies that:

- `GET https://jsonplaceholder.typicode.com/todos/1` returns status code `200`
- The response contains a `title` field

## Running Tests Locally

Run:

```bash
mvn test
