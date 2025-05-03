# Vehicle Rental System

The **Vehicle Rental System** is a Java-based desktop application built using **Swing** for the graphical user interface (GUI) and **MySQL** for backend data storage. The system allows users to manage customer and vehicle information for a vehicle rental company.

## 🚀 Features

- 📄 **Add, Delete, and View Vehicles**
- 👤 **Add, Delete, and View Customers**
- 📊 **View all records in organized tables**
- 🔄 **Data automatically refreshes upon changes**
- 🔒 **Connects securely to MySQL database using JDBC**

## 🛠️ Technologies Used

- Java (Swing for GUI)
- MySQL (with JDBC connector)
- NetBeans IDE (for UI design and development)

## 🧩 Key Features

- **Customer Management**: Add, update, and track customers who rent vehicles.
- **Vehicle Management**: Register new vehicles and update their availability status.
- **Rental Transactions**: Record rentals and returns while auto-updating the database.
- **GUI Interface**: Built with Java Swing for ease of use.
- **Database Connectivity**: Uses JDBC for interaction with a MySQL database.

---

## 🖼️ Screenshots

### 1. Customer Renting Vehicles  
![Customer Renting Vehicles](1_Customer%20Renting%20Vehicles.png)

### 2. Adding Their Details to Databases  
![Adding Their Details to Databases](2_Adding%20Their%20details%20to%20databases.png)

### 3. Updating Vehicle Database After Renting  
![Updating Vehicle Database](3_Adding%20Their%20details%20to%20database%20%2B%20updating%20vehicle%20database.png)

### 4. Adding a New Vehicle to the System  
![Add New Vehicle](4_Adding%20a%20new%20vehicle%20in%20the%20system.png)

### 5. Another Customer Renting a Different Vehicle  
![Second Customer Rent](5_Another%20customer%20renting%20a%20differnt%20vehicle.png)

### 6. Returning a Vehicle (Status Updated to Available)  
![Return Vehicle](6_Return%20an%20vehicle%20updates%20the%20database%20-%20status%20to%20available.png)

---

## 🛠️ How to Run

1. Make sure you have Java and a MySQL server installed.
2. Clone the repository or download the files.
3. Set up the MySQL database using the required schema (not included here).
4. Open the project in NetBeans or your preferred IDE.
5. Run `VehicleRentalSystem.java`.

---

## 🧩 System Structure

### GUI Components

- `JTextField` inputs for:
  - VehicleNumber (ID), VehicleName, Color, Status
  - Customer ID, Name, Surname, Address, VehicleNumber

- `JTable` displays:
  - Vehicle data (`vehicleTable`)
  - Customer data (`customerTable`)

### Database Tables

#### `vehicles` Table
| Column Name | Type     | Description         |
|-------------|----------|---------------------|
| vehicle_id  | VARCHAR  | Unique ID for car   |
| VehicleName | VARCHAR  | Car model name      |
| color       | VARCHAR  | Car color           |
| status      | VARCHAR  | e.g. Available/Rented |

#### `customer_details` Table
| Column Name | Type     | Description        |
|-------------|----------|--------------------|
| customer_id | VARCHAR  | Unique ID for customer |
| name        | VARCHAR  | Customer name      |
| Surname     | VARCHAR  | Customer surname   |
| Address     | VARCHAR  | Customer address   |
| VehicleNum  | VARCHAR  | Unique ID for car  |


## 🧑‍💻 Contributors

- Built by [Maxwell Dube]
   [git clone https://github.com/your-username/vehicle-rental-system.git](https://github.com/MaxwellDube/Vehicle_Management_System_Java_-_SQL.git)
