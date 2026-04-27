# jdbc-connectivity
#  JDBC Book Database Project

##  Description

This project demonstrates how to use **Java JDBC** to interact with a **MySQL database**. It includes operations like creating tables, inserting records, and retrieving data using column indexes.

---

##  Features

* Create a database table using JDBC
* Insert multiple records into the table
* Retrieve data using column numbers
* Establish MySQL database connection

---

##  Tech Stack

* Java
* JDBC (Java Database Connectivity)
* MySQL

---

##  Project Structure

```
src/com/loke/
 ├── MYSQLconnector.java        # Handles database connection
 ├── CreatingTableBook.java    # Creates table in MySQL
 ├── Insert2RecordsIntoBookTable.java  # Inserts records
 ├── AccessingColumnNumber.java # Retrieves data using column index
```

---

##  Setup Instructions

### 1. Install Requirements

* Java (JDK 8 or above)
* MySQL Server
* MySQL Connector/J (JDBC Driver)

---

### 2. Configure Database

* Create a database in MySQL:

```sql
CREATE DATABASE bookdb;
```

* Update database credentials inside:

```
MYSQLconnector.java
```

---

### 3. Run the Project

Execute files in this order:

1. `CreatingTableBook.java` → creates table
2. `Insert2RecordsIntoBookTable.java` → inserts data
3. `AccessingColumnNumber.java` → fetches and displays data

---

## Learning Outcomes

* Understanding JDBC workflow
* Connecting Java with MySQL
* Performing CRUD operations
* Working with ResultSet and column indexing

---

##  Output (Optional)

(Add screenshots of output here)

---

##  Author

Lokesh

---

## Future Improvements

* Add update and delete operations
* Use PreparedStatement for better security
* Convert into a full CRUD application

---
