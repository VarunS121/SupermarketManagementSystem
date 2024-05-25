--drop database if exists <previous database name>
create database if not exists storev03;
use storev03;

-- Create Product Categories Table
CREATE TABLE ProductCategories (
	ProductName VARCHAR(100) PRIMARY KEY,
    Category VARCHAR(100)
);

-- Create Products table
CREATE TABLE Products (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(100) NOT NULL,
    CostPrice DECIMAL(10, 2) NOT NULL,
    SellingPrice DECIMAL(10, 2) NOT NULL,
    Quantity INT NOT NULL,
    Discount DECIMAL(5, 2),
    FOREIGN KEY (ProductName) references ProductCategories(ProductName)
);

-- Create Vendors table
CREATE TABLE Vendors (
    VendorID INT PRIMARY KEY,
    VendorName VARCHAR(100) NOT NULL,
    ContactDetails VARCHAR(200)
);

-- Create Orders table
CREATE TABLE Orders (
    OrderID INT PRIMARY KEY,
    Status ENUM('In Progress', 'Pending', 'Shipped', 'Delivered', 'Cancelled') NOT NULL,
    OrderDate DATE NOT NULL
);
-- ALTER TABLE Orders MODIFY COLUMN Status ENUM('In Progress', 'Pending', 'Shipped', 'Delivered', 'Cancelled');

-- Create Customers table
CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    CustomerName VARCHAR(100) NOT NULL,
    EmailID VARCHAR(100),
    PhoneNumber VARCHAR(20),
    Password VARCHAR(64) NOT NULL
);

-- Create Employees table
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    EmployeeName VARCHAR(100) NOT NULL,
    UserID VARCHAR(50) NOT NULL,
    Password VARCHAR(64) NOT NULL,
    Role VARCHAR(50) NOT NULL
);

-- Create Promotions table
CREATE TABLE Promotions (
    PromotionID INT PRIMARY KEY,
    PromotionName VARCHAR(100) NOT NULL,
    Discount DECIMAL(5, 2) NOT NULL,
    StartDate DATE NOT NULL,
    EndDate DATE NOT NULL
);

--
CREATE TABLE Bills (
	BillID INT PRIMARY KEY,
    BillDate DATE NOT NULL,
    PaymentMethod ENUM('Cash', 'Credit Card', 'Debit Card', 'Online Payment') NOT NULL   
);

-- Create OrderDetails table (Relationship table)
CREATE TABLE OrderDetails (
    OrderID INT NOT NULL,
    VendorID INT NOT NULL,
    ProductID INT NOT NULL,
    EmployeeID INT NOT NULL,
    Quantity INT NOT NULL,
    PRIMARY KEY (OrderID, VendorID, ProductID),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    FOREIGN KEY (VendorID) REFERENCES Vendors(VendorID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID),
    FOREIGN KEY (EmployeeID) REFERENCES Employees(EmployeeID)
);

-- Create Transactions table (Relationship table)
CREATE TABLE Transactions (
    BillID INT PRIMARY KEY,
    PromotionID INT,
    CustomerID INT NOT NULL,
    EmployeeID INT NOT NULL,
    FOREIGN KEY (PromotionID) REFERENCES Promotions(PromotionID),
    FOREIGN KEY (BillID) REFERENCES Bills(BillID),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID),
    FOREIGN KEY (EmployeeID) REFERENCES Employees(EmployeeID)
);

-- Create Transactions table (Relationship table)
CREATE TABLE Checkout (
    BillID INT NOT NULL,
    ProductID INT NOT NULL,
    Price INT NOT NULL,
    Quantity INT NOT NULL,
    PRIMARY KEY (BillID, ProductID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID),
    FOREIGN KEY (BillID) REFERENCES Bills(BillID)
);
