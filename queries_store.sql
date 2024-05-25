use storev03;

INSERT INTO Orders (OrderID, Status, OrderDate) VALUES
(16, 'Pending', '2024-04-15'),
(17, 'Pending', '2024-04-16'),
(18, 'Pending', '2024-04-16');

-- Calculates the total Revnue generated today
SELECT SUM(Checkout.Price * Checkout.Quantity * (1 - COALESCE(Promotions.Discount, 0) / 100)) AS TotalRevenue
FROM Checkout JOIN Bills ON Checkout.BillID = Bills.BillID
LEFT JOIN Transactions ON Bills.BillID = Transactions.BillID
LEFT JOIN Promotions ON Transactions.PromotionID = Promotions.PromotionID
WHERE Bills.BillDate = CURDATE();

-- Finds the Average Value of the transactions generated today
SELECT AVG(total_bill) AS ATV FROM (
	SELECT Bills.BillID, SUM(Checkout.Price * Checkout.Quantity * (1 - COALESCE(Promotions.Discount, 0) / 100)) AS total_bill
    FROM Checkout JOIN Bills ON Checkout.BillID = Bills.BillID
    LEFT JOIN Transactions ON Bills.BillID = Transactions.BillID
	LEFT JOIN Promotions ON Transactions.PromotionID = Promotions.PromotionID
    WHERE Bills.BillDate = CURDATE() GROUP BY BillID
) AS subquery;


-- Print the number of items purchased in all transactions done today
SELECT Bills.BillID, COUNT(*) AS item_count
FROM Checkout JOIN Bills ON Checkout.BillID = Bills.BillID
WHERE Bills.BillDate = CURDATE() GROUP BY BillID;
 
 -- Print the average of items purchased in all transactions done today
SELECT AVG(item_count) AS UPT FROM (
	SELECT Bills.BillID, COUNT(*) AS item_count
	FROM Checkout JOIN Bills ON Checkout.BillID = Bills.BillID
	WHERE Bills.BillDate = CURDATE() GROUP BY BillID
) AS subquery;

-- Calculates the profit based on the discounted total of the bill and the cost price of each product.
SELECT (SUM(Checkout.Quantity * Checkout.Price * (1 - COALESCE(Promotions.Discount, 0) / 100)) - SUM(Checkout.Quantity * Products.CostPrice)) AS GrossProfit
FROM Checkout JOIN Bills ON Checkout.BillID = Bills.BillID 
JOIN Products ON Checkout.ProductID = Products.ProductID 
LEFT JOIN Transactions ON Bills.BillID = Transactions.BillID
LEFT JOIN Promotions ON Transactions.PromotionID = Promotions.PromotionID
WHERE Bills.BillDate = CURDATE();

WITH today_revenue AS (
	SELECT AVG(Checkout.Price * Checkout.Quantity * (1 - COALESCE(Promotions.Discount, 0) / 100))
	AS Avg FROM Checkout JOIN Bills ON Checkout.BillID = Bills.BillID
	LEFT JOIN Transactions ON Bills.BillID = Transactions.BillID
	LEFT JOIN Promotions ON Transactions.PromotionID = Promotions.PromotionID
	WHERE Bills.BillDate = CURDATE()
), total_revenue AS (
	SELECT AVG(Checkout.Price * Checkout.Quantity * (1 - COALESCE(Promotions.Discount, 0) / 100))
	AS Avg FROM Checkout JOIN Bills ON Checkout.BillID = Bills.BillID
	LEFT JOIN Transactions ON Bills.BillID = Transactions.BillID
	LEFT JOIN Promotions ON Transactions.PromotionID = Promotions.PromotionID
	WHERE Bills.BillDate < DATE_SUB(CURDATE(), INTERVAL 1 DAY)
) SELECT ROUND(100.0 * (today_revenue.avg - total_revenue.avg) / total_revenue.avg, 2)
AS percentage_change FROM today_revenue, total_revenue;