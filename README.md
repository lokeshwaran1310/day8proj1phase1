# 🐞 Issue Tracker ORM

**Description**  
A Spring Boot REST API using Spring Data JPA and PostgreSQL, built to manage Users, Projects, and Bugs. It demonstrates clean relational mapping, schema evolution, and RESTful endpoints.

---

## Components  
- **Domains**:  
  - `User`: id, name, role.  
  - `Project`: id, name.  
  - `Bug`: bugid, title, description, status.  
- **Repositories**: `JpaRepository` interfaces for CRUD operations on each entity.  
- **Service Layer**: `BugService` to encapsulate business logic (e.g., `getAllBugs()`).  
- **Controller**: `BugController` exposing `/api/bugs` endpoints.

---

## Design Highlights  
- **Relational Mapping**:  
  - `@OneToMany(mappedBy="assignedTo")` in `User`  
  - `@OneToMany(mappedBy="project")` in `Project`  
  - `@ManyToOne @JoinColumn` in `Bug` (owning side stores foreign keys `assigned_to`, `project_ID`)  
- **Bidirectional Navigation**: You can traverse from `User → bugs`, `Project → bugs`, and from `Bug → User/Project`.  
- **Schema Management**: Uses `spring.jpa.hibernate.ddl-auto=update` for automatic schema alignment.  
- **SQL Logging**: Enabled via `spring.jpa.show-sql=true` for development visibility.  
- **JSON Serialization Safeguards**: Prevent infinite recursion using `@JsonManagedReference`, `@JsonBackReference`, or `@JsonIgnore` on entity relationships.  
- **Best Practices Inspired by README guidelines**: Structured layout, component clarity, and audience balance for both developers and testers :contentReference[oaicite:0]{index=0}.

---

## Purpose  
Serve as a simple yet powerful issue tracking API backend—showcasing relational design, REST endpoints, and JPA best practices in a Spring Boot context.

---

## Author  
*Lokeshwaran M* |
lokeshwaran.m@epssw.com

---

## Setup Instructions

1. **Clone the repo**  
   ```bash
   git clone <repo-url>
   cd issue-tracker-orm
