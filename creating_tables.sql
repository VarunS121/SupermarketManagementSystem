create database store;
use store;

-- Create Products table
CREATE TABLE Products (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(100) NOT NULL,
    CostPrice DECIMAL(10, 2) NOT NULL,
    SellingPrice DECIMAL(10, 2) NOT NULL,
    Discount DECIMAL(5, 2) NOT NULL
);

--
CREATE TABLE ProductCategories (
	ProductID INT PRIMARY KEY,
    Category VARCHAR(100),
    FOREIGN KEY (ProductID) references Products(ProductID)
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
    Status ENUM('Pending', 'Shipped', 'Delivered', 'Cancelled') NOT NULL,
    OrderDate DATE NOT NULL
);

-- Create Customers table
CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    CustomerName VARCHAR(100) NOT NULL,
    EmailID VARCHAR(100) NOT NULL,
    PhoneNumber VARCHAR(20)
);

-- Create Employees table
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    EmployeeName VARCHAR(100) NOT NULL,
    UserID VARCHAR(50) NOT NULL,
    Password VARCHAR(100) NOT NULL,
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
    PromotionID INT NOT NULL,
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

