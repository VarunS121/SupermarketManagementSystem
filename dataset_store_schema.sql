INSERT INTO Vendors (VendorID, VendorName, ContactDetails) VALUES
(0, 'Acme Supplies', '9876543210,acme@example.com,123 Main St, Cityville'),
(1, 'GlobalMart Inc.', '5678901234,global@example.com,456 Oak Rd, Townsville'),
(2, 'TechWorld Co.', '3456789012,tech@example.com,789 Elm Ave, Villageton'),
(3, 'FreshFoods Ltd.', '9012345678,fresh@example.com,321 Pine St, Ruralville'),
(4, 'CleanCo Ltd.', '6789012345,clean@example.com,654 Cedar Ln, Suburbia'),
(5, 'OfficeSupplies Corp.', '2345678901,office@example.com,987 Maple Dr, Metropolis'),
(6, 'ElectroMart Inc.', '8901234567,electro@example.com,753 Birch Rd, Urbanville'),
(7, 'HygieneWorld Co.', '4567890123,hygiene@example.com,246 Spruce Ave, Ruraltown'),
(8, 'FoodDepot Ltd.', '1234567890,food@example.com,369 Oak Blvd, Suburbanville'),
(9, 'StationeryMart Corp.', '7890123456,stationery@example.com,159 Elm St, Citycentre');

INSERT INTO Orders (OrderID, Status, OrderDate) VALUES
(0, 'Pending', '2024-04-05'),
(1, 'Pending', '2024-04-06'),
(2, 'Pending', '2024-04-07'),
(3, 'Pending', '2024-04-08'),
(4, 'Shipped', '2024-04-06'),
(5, 'Shipped', '2024-04-07'),
(6, 'Shipped', '2024-04-08'),
(7, 'Shipped', '2024-04-09'),
(8, 'Delivered', '2024-04-07'),
(9, 'Delivered', '2024-04-08'),
(10, 'Delivered', '2024-04-09'),
(11, 'Delivered', '2024-04-10'),
(12, 'Cancelled', '2024-04-09'),
(13, 'Cancelled', '2024-04-10'),
(14, 'Cancelled', '2024-04-11'),
(15, 'Cancelled', '2024-04-11');

INSERT INTO Productcategories (ProductName, Category) VALUES
('Bread', 'Food'),
('Amul Milk', 'Food'),
('Cup Noodles', 'Food'),
('Maggie', 'Food'),
('Pringles', 'Food'),
('50 50 Biscuit', 'Food'),
('Gooday Biscuit', 'Food'),
('Cadbury Silk', 'Food'),
('Oreo Silk', 'Food'),
('Choco Latte', 'Food'),
('Dark Fanatsy', 'Food'),
('Croissant', 'Food'),
('Pasta', 'Food'),
('Soap', 'Hygiene'),
('Shampoo', 'Hygiene'),
('Toothpaste', 'Hygiene'),
('Deodorant', 'Hygiene'),
('Toilet Paper', 'Hygiene'),
('Tissues', 'Hygiene'),
('Laundry Detergent', 'Hygiene'),
('Dishwashing Liquid', 'Hygiene'),
('Pens', 'Stationery'),
('Notebooks', 'Stationery'),
('Scissors', 'Stationery'),
('Rulers', 'Stationery'),
('Pencils', 'Stationery'),
('Erasers', 'Stationery'),
('Binders', 'Stationery'),
('Highlighters', 'Stationery'),
('6-in-1 Notebook', 'Stationery'),
('A4 Notebooks', 'Stationery'),
('Whiteboard Marker', 'Stationery'),
('Permanent Marker', 'Stationery'),
('Headphones', 'Electronic'),
('16GB Pendrive', 'Electronic'),
('Mouse', 'Electronic'),
('Keyboards', 'Electronic'),
('Neckbands', 'Electronic'),
('AA Battery', 'Electronic'),
('AAA Battery', 'Electronic');

INSERT INTO Products (ProductID, ProductName, CostPrice, SellingPrice, Quantity, Discount) VALUES
(0, 'Bread', 30.00, 45.00, 100, 0),
(1, 'Amul Milk', 15.00, 20.00, 150, 0),
(2, 'Cup Noodles', 37.00, 50.00, 200, 0),
(3, 'Maggie', 20.00, 25.00, 80, 0),
(4, 'Pringles', 100.00, 120.00, 120, 0),
(5, '50 50 Biscuit', 8.50, 10.00, 115, 0),
(6, 'Gooday Biscuit', 7.50, 10.00, 100, 0),
(7, 'Cadbury Silk', 65.00, 70.00, 30, 0),
(8, 'Oreo Silk', 70.00, 80.00, 50, 0),
(9, 'Choco Latte', 73.50, 80.00, 100, 0),
(10, 'Dark Fanatsy', 37.75, 50.00, 120, 0),
(11, 'Croissant', 6.75, 10.00, 200, 0),
(12, 'Pasta', 18.50, 25.00, 150, 0),
(13, 'Soap', 1.25, 2.00, 75, 0),
(14, 'Shampoo', 120.00, 150.00, 60, 0),
(15, 'Toothpaste', 20.00, 30.00, 90, 0),
(16, 'Deodorant', 275.00, 375.00, 70, 0),
(17, 'Toilet Paper', 20.00, 35.00, 100, 0),
(18, 'Tissues', 45.00, 65.00, 150, 0),
(19, 'Laundry Detergent', 160.00, 230.00, 80, 0),
(20, 'Dishwashing Liquid', 250.00, 400.00, 90, 0),
(21, 'Pens', 5.00, 10.00, 300, 0),
(22, 'Notebooks', 65.50, 80.00, 200, 0),
(23, 'Scissors', 20.00, 35.00, 40, 0),
(24, 'Rulers', 10.00, 12.50, 50, 0),
(25, 'Pencils', 2.50, 5.00, 300, 0),
(26, 'Erasers', 5.0, 7.50, 100, 0),
(27, 'Binders', 20.0, 35.00, 100, 0),
(28, 'Highlighters', 15.00, 25.00, 200, 0),
(29, '6-in-1 Notebook', 100.00, 125.00, 100, 0),
(30, 'A4 Notebooks', 70.00, 100.00, 60, 0),
(31, 'Whiteboard Marker', 20.00, 30.00, 200, 0),
(32, 'Permanent Marker', 25.00, 40.00, 80, 0),
(33, 'Headphones', 600.00, 900.00, 15, 0),
(34, '16GB Pendrive', 100.00, 150.00, 25, 0),
(35, 'Mouse', 300.00, 450.00, 60, 0),
(36, 'Keyboards', 600.00, 750.00, 80, 0),
(37, 'Neckbands', 900.00, 1250.00, 30, 0),
(38, 'AA Battery', 35.00, 45.00, 300, 0),
(39, 'AAA Battery', 35.00, 45.00, 300, 0);

INSERT INTO Employees (EmployeeID, EmployeeName, UserID, Password, Role) VALUES
(0, 'John Doe', 'jdoe', 'password123', 'Department Manager'), 
(1, 'Jane Smith', 'jsmith', 'qwerty456', 'Department Manager'),
(2, 'Emily Davis', 'edavis', 'abc123def', 'Stock Manager'),
(3, 'David Wilson', 'dwilson', 'p@ssw0rd', 'Stock Manager'),
(4, 'Michael Johnson', 'mjohnson', 'letmein789', 'Cashier'),
(5, 'Sarah Thompson', 'sthompson', 'securepass', 'Cashier'),
(6, 'Abhiram H', 'AbhiramROX', '123', 'Associate Manager');

INSERT INTO Customers (CustomerID, CustomerName, EmailID, PhoneNumber, Password) VALUES
(0, 'John Smith', 'john.smith@example.com', '1234567890', 'password123'),
(1, 'Emily Johnson', 'emily.johnson@example.com', '9876543210', 'qwerty456'),
(2, 'Michael Brown', 'michael.brown@example.com', '5555555555', 'letmein789'),
(3, 'Sarah Davis', 'sarah.davis@example.com', '1112223333', 'abc123def'),
(4, 'David Wilson', 'david.wilson@example.com', '4445556666', 'p@ssw0rd'),
(5, 'Jessica Thompson', 'jessica.thompson@example.com', '7778889999', 'securepass'),
(6, 'Christopher Taylor', 'christopher.taylor@example.com', '2223334444', 'mypassword'),
(7, 'Amanda Anderson', 'amanda.anderson@example.com', '6667778888', 'qazwsx123'),
(8, 'Matthew Clark', 'matthew.clark@example.com', '9900112233', 'password123!'),
(9, 'Ashley Rodriguez', 'ashley.rodriguez@example.com', '4455667788', 'letmein456'),
(10, 'Daniel Lewis', 'daniel.lewis@example.com', '7788990011', 'abc123abc'),
(11, 'Samantha Walker', 'samantha.walker@example.com', '2233445566', 'p@ssw0rd!'),
(12, 'William Hall', 'william.hall@example.com', '6677889900', 'securepassword'),
(13, 'Olivia Allen', 'olivia.allen@example.com', '1122334455', 'mypassword123'),
(14, 'Joseph Young', 'joseph.young@example.com', '5566778899', 'qazwsx123!'),
(15, 'Emma Wright', 'emma.wright@example.com', '9900112233', 'password456'),
(16, 'Jacob Scott', 'jacob.scott@example.com', '4455667788', 'letmein789!'),
(17, 'Sophia Green', 'sophia.green@example.com', '7788990011', 'abc123abc!'),
(18, 'Ethan Baker', 'ethan.baker@example.com', '2233445566', 'p@ssw0rd123'),
(19, 'Isabella Adams', 'isabella.adams@example.com', '6677889900', 'securepassword!'),
(20, 'Michael Nelson', 'michael.nelson@example.com', '1122334455', 'mypassword456'),
(21, 'Ava Carter', 'ava.carter@example.com', '5566778899', 'qazwsx123!@'),
(22, 'William Mitchell', 'william.mitchell@example.com', '9900112233', 'password789'),
(23, 'Sophia Roberts', 'sophia.roberts@example.com', '4455667788', 'letmein456!'),
(24, 'Benjamin Turner', 'benjamin.turner@example.com', '7788990011', 'abc123abc!@'),
(25, 'Mia Phillips', 'mia.phillips@example.com', '2233445566', 'p@ssw0rd456'),
(26, 'Alexander Campbell', 'alexander.campbell@example.com', '6677889900', 'securepassword123'),
(27, 'Avery Parker', 'avery.parker@example.com', '1122334455', 'mypassword789'),
(28, 'Daniel Evans', 'daniel.evans@example.com', '5566778899', 'qazwsx123!@#'),
(29, 'Emma Edwards', 'emma.edwards@example.com', '9900112233', 'password456!');

INSERT INTO Promotions (PromotionID, PromotionName, Discount, StartDate, EndDate) VALUES
(0, 'Summer Sale', 20.00, '2024-04-01', '2024-05-31'),
(1, 'Black Friday Deal', 10.00, '2023-11-24', '2023-11-27'),
(2, 'New Year Promotion', 12.50, '2023-12-26', '2024-01-05'),
(3, 'Spring Clearance', 20.00, '2024-03-15', '2024-03-31'),
(4, 'April Fools', 50.00, '2024-04-01', '2024-04-01');

INSERT INTO Bills (BillID, BillDate, PaymentMethod) VALUES
(0, '2024-04-11', 'Cash'),
(1, '2024-04-11', 'Cash'),
(2, '2024-04-11', 'Credit Card'),
(3, '2024-04-11', 'Debit Card'),
(4, '2024-04-12', 'Cash'),
(5, '2024-04-12', 'Online Payment'),
(6, '2024-04-12', 'Debit Card'),
(7, '2024-04-13', 'Credit Card'),
(8, '2024-04-13', 'Cash'),
(9, '2024-04-13', 'Online Payment'),
(10, '2024-04-14', 'Debit Card'),
(11, '2024-04-14', 'Credit Card'),
(12, '2024-04-15', 'Cash'),
(13, '2024-04-15', 'Online Payment'),
(14, '2024-04-15', 'Debit Card'),
(15, '2024-04-16', 'Credit Card'),
(16, '2024-04-16', 'Cash'),
(17, '2024-04-17', 'Online Payment'),
(18, '2024-04-17', 'Debit Card'),
(19, '2024-04-17', 'Credit Card'),
(20, '2024-04-18', 'Cash'),
(21, '2024-04-18', 'Online Payment'),
(22, '2024-04-19', 'Debit Card'),
(23, '2024-04-19', 'Credit Card'),
(24, '2024-04-19', 'Cash'),
(25, '2024-04-20', 'Online Payment'),
(26, '2024-04-20', 'Debit Card');

INSERT INTO Transactions (BillID, PromotionID, CustomerID, EmployeeID) VALUES
(0, NULL, 2, 0), -- Bill 0 with no promotion by Customer 2 authorized by Employee 0
(1, 2, 5, 0), -- Bill 1 with Promotion 2 (New Year Promotion), Customer 5, Employee 0
(2, 3, 10, 1), -- Bill 2 with Promotion 3 (Spring Clearance), Customer 10, Employee 1
(3, NULL, 15, 4), -- Bill 3 with no promotion, Customer 15, Employee 4
(4, 2, 20, 0), -- Bill 4 with Promotion 2 (New Year Promotion), Customer 20, Employee 0
(5, NULL, 25, 1), -- Bill 5 with no promotion, Customer 25, Employee 1
(6, 3, 10, 4), -- Bill 6 with Promotion 3 (Spring Clearance), Customer 30, Employee 4
(7, NULL, 5, 0), -- Bill 7 with no promotion, Customer 5, Employee 0
(8, 2, 10, 1), -- Bill 8 with Promotion 2 (New Year Promotion), Customer 10, Employee 1
(9, 3, 15, 4), -- Bill 9 with Promotion 3 (Spring Clearance), Customer 15, Employee 4
(10, NULL, 20, 0), -- Bill 10 with no promotion, Customer 20, Employee 0
(11, 2, 25, 1), -- Bill 11 with Promotion 2 (New Year Promotion), Customer 25, Employee 1
(12, NULL, 14, 4), -- Bill 12 with no promotion, Customer 30, Employee 4
(13, 3, 5, 0), -- Bill 13 with Promotion 3 (Spring Clearance), Customer 5, Employee 0
(14, 2, 10, 1), -- Bill 14 with Promotion 2 (New Year Promotion), Customer 10, Employee 1
(15, NULL, 15, 5), -- Bill 15 with no promotion, Customer 15, Employee 5
(16, 3, 20, 0), -- Bill 16 with Promotion 3 (Spring Clearance), Customer 20, Employee 0
(17, 2, 25, 1), -- Bill 17 with Promotion 2 (New Year Promotion), Customer 25, Employee 1
(18, NULL, 27, 5), -- Bill 18 with no promotion, Customer 30, Employee 5
(19, 3, 5, 0), -- Bill 19 with Promotion 3 (Spring Clearance), Customer 5, Employee 0
(20, NULL, 10, 1), -- Bill 20 with no promotion, Customer 10, Employee 1
(21, 2, 15, 5), -- Bill 21 with Promotion 2 (New Year Promotion), Customer 15, Employee 5
(22, 3, 20, 0), -- Bill 22 with Promotion 3 (Spring Clearance), Customer 20, Employee 0
(23, NULL, 25, 1), -- Bill 23 with no promotion, Customer 25, Employee 1
(24, 2, 13, 5), -- Bill 24 with Promotion 2 (New Year Promotion), Customer 30, Employee 5
(25, 3, 5, 0), -- Bill 25 with Promotion 3 (Spring Clearance), Customer 5, Employee 0
(26, NULL, 10, 1); -- Bill 26 with no promotion, Customer 10, Employee 1


INSERT INTO Checkout (BillID, ProductID, Price, Quantity) VALUES
(0, 0, 45.00, 3),
(0, 1, 20.00, 2),
(0, 5, 10.00, 4),
(1, 2, 50.00, 1),
(1, 8, 80.00, 3),
(2, 10, 50.00, 2),
(2, 15, 30.00, 5),
(3, 20, 400.00, 1),
(3, 22, 80.00, 3),
(4, 25, 5.00, 4),
(4, 30, 100.00, 2),
(5, 33, 900.00, 1),
(5, 36, 750.00, 3),
(6, 38, 45.00, 5),
(6, 39, 45.00, 2),
(7, 3, 25.00, 4),
(7, 9, 80.00, 1),
(8, 13, 2.00, 3),
(8, 18, 65.00, 2),
(9, 23, 35.00, 5),
(9, 28, 25.00, 4),
(10, 6, 10.00, 1),
(10, 12, 25.00, 3),
(11, 16, 375.00, 2),
(11, 21, 10.00, 5),
(12, 26, 7.50, 4),
(12, 31, 30.00, 1),
(13, 34, 150.00, 3),
(13, 37, 1250.00, 2),
(14, 4, 120.00, 5),
(14, 11, 10.00, 1),
(15, 17, 35.00, 4),
(15, 24, 12.50, 2),
(16, 7, 70.00, 3),
(16, 14, 150.00, 1),
(17, 19, 230.00, 2),
(17, 27, 35.00, 5),
(18, 29, 125.00, 4),
(18, 32, 40.00, 1),
(19, 35, 450.00, 3),
(19, 5, 120.00, 2),
(20, 0, 45.00, 5),
(20, 8, 80.00, 1),
(21, 15, 30.00, 4),
(21, 22, 80.00, 2),
(22, 28, 25.00, 3),
(22, 33, 900.00, 1),
(23, 37, 1250.00, 5),
(23, 2, 50.00, 2),
(24, 10, 50.00, 4),
(24, 18, 65.00, 1),
(25, 25, 5.00, 3),
(25, 31, 30.00, 2),
(26, 36, 750.00, 5),
(26, 39, 45.00, 1);

INSERT INTO OrderDetails (OrderID, VendorID, ProductID, EmployeeID, Quantity) VALUES
(0, 3, 0, 2, 20),
(0, 3, 1, 2, 30),
(0, 3, 11, 2, 50),

(1, 2, 34, 2, 25),
(1, 2, 33, 2, 10),
(1, 2, 38, 3, 50),
(1, 6, 39, 3, 100),
(1, 6, 37, 2, 20),

(2, 5, 25, 2, 70),
(2, 5, 26, 2, 40),
(2, 5, 27, 2, 60),
(2, 5, 30, 2, 20),
(2, 9, 31, 2, 50),

(3, 5, 32, 2, 40),
(3, 5, 24, 3, 25),
(3, 9, 29, 2, 15),
(3, 9, 26, 3, 60),

(4, 4, 13, 2, 20),
(4, 4, 14, 2, 10),
(4, 7, 14, 2, 10),
(4, 7, 17, 2, 30),
(4, 7, 18, 2, 25),

(5, 4, 19, 2, 25),
(5, 5, 24, 3, 35),
(5, 6, 29, 2, 20),
(5, 0, 1, 3, 50),

(6, 2, 6, 2, 30),
(6, 3, 11, 3, 60),
(6, 4, 16, 2, 10),
(6, 5, 21, 3, 40),
(6, 6, 26, 2, 20),

(7, 7, 31, 2, 70),
(7, 1, 33, 3, 5),
(7, 2, 36, 2, 15),
(7, 3, 38, 3, 60),
(7, 4, 39, 2, 40),

(8, 5, 34, 3, 10),
(8, 6, 37, 2, 8),
(8, 0, 2, 3, 25),
(8, 1, 7, 2, 15),
(8, 2, 12, 3, 40),

(9, 3, 17, 2, 30),
(9, 4, 22, 3, 50),
(9, 5, 27, 2, 20),
(9, 6, 32, 3, 25),

(10, 7, 3, 2, 35),
(10, 1, 8, 3, 15),
(10, 2, 13, 2, 25),
(10, 3, 18, 3, 45),

(11, 4, 23, 2, 10),
(11, 5, 28, 3, 40),
(11, 6, 33, 2, 3),
(11, 0, 0, 3, 30),
(11, 1, 5, 2, 25),

(12, 2, 10, 3, 50),
(12, 3, 15, 2, 20),
(12, 4, 20, 3, 35),
(12, 5, 25, 2, 15),

(13, 6, 30, 3, 25),
(13, 7, 35, 2, 12),
(13, 1, 4, 3, 40),
(13, 2, 9, 2, 30),

(14, 3, 14, 3, 20),
(14, 4, 19, 2, 30),
(14, 5, 24, 3, 45),
(14, 6, 29, 2, 15),

(15, 7, 34, 3, 8),
(15, 1, 36, 2, 20),
(15, 2, 37, 3, 10),
(15, 3, 38, 2, 50),
(15, 4, 39, 3, 40);
