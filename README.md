# CareMesh Core

CareMesh Core is the backend brain for a healthcare system that actually pays attention to how messy real life is.

Patients lose access to medications all the time.  
Manufacturers retire products. Pharmacies quietly stop stocking older meds.  
But people don’t magically stop needing what worked for them.

This project is my answer to that gap.

---

## What CareMesh is trying to solve

CareMesh lives in the space between manufacturers, pharmacies, and patients.

Think about someone who’s been stable on a specific medication for years. One day their local pharmacy says,  
“Yeah, we don’t carry that anymore. The system won’t even let me order it.”

They’re stressed. The pharmacist is frustrated.  
The manufacturer is somewhere upstream with zero visibility into that pain.

CareMesh aims to become the connective tissue in that chain.  
Not another “online pharmacy clone,” but a backend platform that can:

- Understand what a patient is trying to refill
- See which manufacturers or wholesalers can still fulfill it
- Route that order intelligently to pickup points or delivery partners
- Help small pharmacies participate as local nodes instead of being left behind

In other words, instead of patients hunting for meds, the system hunts for them.

---

## What this repo is

This repo, `caremesh-core`, is the backend service layer.

Right now it’s focused on:

- A Spring Boot API that exposes core operations
- A relational model for medicines, manufacturers, pharmacies, orders, and patients
- A clean foundation for adding smarter logic: recommendations, routing, and later, AI assistance

No fluff. No fake “microservices” just for the buzzword.  
Start with a solid monolith, but architected like it wants to grow up.

---

## High-level architecture

The first version of CareMesh Core will center around a few core domains:

- **Medication catalog**  
  The source of truth for medications, SKUs, formulations, and their manufacturer relationships.  
  Old, new, discontinued, or niche.

- **Manufacturer and supplier graph**  
  Who actually makes what. Who can still supply it. What regions they serve.

- **Pharmacy and pickup network**  
  Small and mid-sized pharmacies acting as local nodes where medications can be routed and picked up.

- **Orders and matching**  
  A patient (or provider) requests something.  
  The system finds a realistic path to fulfill it, either with the original product or a safe, mapped alternative.

Under the hood the stack is:

- Java 17
- Spring Boot (Web, Data JPA)
- MySQL as the primary data store
- RESTful endpoints designed to be frontend-agnostic

The long-term goal is to treat this as a platform, not just a backend script pile.

---

## Who this is for (right now)

Right now, this codebase is for:

- Future me, when I come back in three months and want to remember what I was thinking
- Other devs who care about healthcare problems beyond “build another todo app”
- Anyone curious about how to structure a backend around real-world supply constraints

This is not production-ready healthcare software.  
It’s the beginning of an opinionated backbone that *could* evolve into that with the right rigor and safeguards.

---

## Development status

Early phase. Think of this as:

- Domain modeling and naming things carefully
- Building a clean HTTP API surface
- Wiring up database access in a way that won’t turn into a ball of mud later
- Laying the groundwork for things like authentication, authorization, observability, and routing intelligence

If you’re reading this and things feel a little rough around the edges, that’s normal at this stage.  
The goal is honest progress, not fake polish.

---

## Big picture

CareMesh Core is the starting point of a larger idea:

A mesh of care nodes, not a single “hero” app.  
Manufacturers, pharmacies, and patients connected by a system that can actually see the whole board and make smart decisions.

This repo is where that system learns how to think.
