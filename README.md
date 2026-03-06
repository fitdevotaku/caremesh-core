# Caremesh Core

Caremesh Core is a backend platform designed to address real world medication access failures across pharmacies, manufacturers, and patients.

Medication discontinuations, supply gaps, and regional stocking issues routinely interrupt patient care. Caremesh focuses on the system level problem behind those disruptions, not on recreating another consumer facing pharmacy app.

The goal is simple. Instead of patients searching endlessly for medications, the system searches for viable fulfillment paths on their behalf.

## Problem Space

Caremesh operates at the intersection of manufacturers, suppliers, pharmacies, and patients.

Patients may rely on medications that are discontinued locally but still available upstream. Pharmacies often lack visibility into alternative suppliers or equivalent products. Manufacturers have limited insight into downstream access issues.

Caremesh is designed to act as connective infrastructure across this gap by modeling supply relationships and routing requests intelligently.

## What This Repository Is

This repository, caremesh-core, contains the backend service layer for the Caremesh platform.

It focuses on building a clean, extensible foundation rather than premature feature complexity. The system is intentionally designed as a modular monolith, with clear domain boundaries that support future growth.

## Core Capabilities

The current implementation focuses on:

Medication catalog management, including formulations, SKUs, manufacturer relationships, and discontinued products.
Manufacturer and supplier modeling, capturing supply relationships and regional availability.
Pharmacy network modeling, enabling small and mid sized pharmacies to act as fulfillment nodes.
Order matching logic that identifies realistic fulfillment paths or safe alternatives when direct fulfillment is unavailable.

### Architecture Overview

Caremesh Core is built as a Spring Boot application with a domain driven structure.

Core architectural goals include:

Clear domain boundaries and naming.
Frontend agnostic RESTful APIs.
Relational data modeling optimized for clarity and future extension.
A foundation that supports observability, authorization, and routing intelligence without major refactors.

The technology stack includes Java 17, Spring Boot, Spring Data JPA, MySQL, and REST based APIs.

### Development Status

This project is in early active development..

Current priorities include domain modeling, API design, and establishing stable persistence patterns. The focus is on correctness, clarity, and long term maintainability rather than surface level polish.

This is not production ready healthcare software. It is an early stage backend foundation that could evolve into a regulated system with appropriate safeguards and rigor.

### Intended Audience

This codebase is primarily intended for engineers interested in backend system design applied to real world healthcare constraints.

It is also written for future contributors and for revisiting architectural decisions as the system evolves.