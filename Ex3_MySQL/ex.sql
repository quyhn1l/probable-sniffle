CREATE DATABASE myDB;
USE myDB;
CREATE TABLE storages (
	storage_id				int,
    storage_code			varchar(3),
    storage_name			varchar(255),
    storage_address			varchar(255),
    storage_describe		varchar(255),
    storage_created_date	date,
    storage_modify_date		date,
    PRIMARY KEY (storage_id)
    );
    
CREATE TABLE categories (
	category_id 			int,
    category_code 			varchar(3),
    category_name 			varchar(255),
    category_describe 		varchar(255),
    category_created_date	date,
    category_modify_date	date,
    PRIMARY KEY (category_id)
    
);

CREATE TABLE products (
	product_id				int,
    product_code			varchar(3),
    product_name 			varchar(255),
    product_price 			int,
    product_describe		varchar(255),
    product_image_path		varchar(255),
    product_in_storage		int,
    bought_product_number 	int,
    category_id				int,
    storage_id				int,
    FOREIGN KEY (category_id) REFERENCES categories(category_id),
	FOREIGN KEY (storage_id) REFERENCES storages(storage_id),
    PRIMARY KEY (product_id)
);

-- Inserting data into storages table
INSERT INTO storages (storage_id, storage_code, storage_name, storage_address, storage_describe, storage_created_date, storage_modify_date)
VALUES 
(1, '001', 'Warehouse A', '123 Main St', 'Large warehouse for storing goods', '2024-03-06', '2024-03-06'),
(2, '002', 'Warehouse B', '456 Elm St', 'Small warehouse for temporary storage', '2024-03-06', '2024-03-06'),
(3, '003', 'Regional Warehouse 1', '789 Oak St', 'Regional warehouse serving specific area', '2024-03-06', '2024-03-06'),
(4, '004', 'Regional Warehouse 2', '101 Pine St', 'Regional warehouse serving specific area', '2024-03-06', '2024-03-06'),
(5, '005', 'Cold Storage Facility', '222 Frost St', 'Specialized facility for cold storage', '2024-03-06', '2024-03-06'),
(6, '006', 'Temporary Storage', '333 Maple St', 'Temporary storage facility for short-term use', '2024-03-06', '2024-03-06'),
(7, '007', 'Distribution Center', '444 Cherry St', 'Central hub for product distribution', '2024-03-06', '2024-03-06'),
(8, '008', 'Bulk Storage', '555 Walnut St', 'Bulk storage facility for large quantities', '2024-03-06', '2024-03-06'),
(9, '009', 'Urban Warehouse', '666 Birch St', 'Warehouse located in urban area for easy access', '2024-03-06', '2024-03-06'),
(10, '010', 'High Security Vault', '777 Cedar St', 'Secure vault for high-value items', '2024-03-06', '2024-03-06');
-- Inserting data into categories table
INSERT INTO categories (category_id, category_code, category_name, category_describe, category_created_date, category_modify_date)
VALUES
(1, '001', 'Electronics', 'Electronic devices and components', '2024-03-06', '2024-03-06'),
(2, '002', 'Clothing', 'Apparel and fashion accessories', '2024-03-06', '2024-03-06'), 
(3, '003', 'Books', 'Printed and digital books', '2024-03-06', '2024-03-06'),
(4, '004', 'Home Appliances', 'Household electronic appliances', '2024-03-06', '2024-03-06'),
(5, '005', 'Furniture', 'Household and office furniture', '2024-03-06', '2024-03-06'),
(6, '006', 'Sports Equipment', 'Equipment for various sports activities', '2024-03-06', '2024-03-06'),
(7, '007', 'Beauty Products', 'Cosmetics and skincare products', '2024-03-06', '2024-03-06'),
(8, '008', 'Toys', 'Toys and games for children', '2024-03-06', '2024-03-06'),
(9, '009', 'Kitchenware', 'Utensils and appliances for the kitchen', '2024-03-06', '2024-03-06'),
(10, '010', 'Pet Supplies', 'Supplies for pets and pet care', '2024-03-06', '2024-03-06');

-- Inserting data into products table
INSERT INTO products (product_id, product_code, product_name, product_price, product_describe, product_image_path, product_in_storage, bought_product_number, category_id, storage_id)
VALUES
(3, '003', 'Smartphone', 800, 'Latest smartphone with dual camera', '/images/smartphone.jpg', 100, 30, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(4, '004', 'Jeans', 40, 'Denim jeans with slim fit', '/images/jeans.jpg', 150, 40, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(5, '005', 'Tablet', 500, '10-inch tablet with stylus support', '/images/tablet.jpg', 80, 25, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(6, '006', 'Sneakers', 60, 'Canvas sneakers with rubber sole', '/images/sneakers.jpg', 120, 35, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(7, '007', 'Desktop PC', 1200, 'Desktop computer with powerful specs', '/images/desktop.jpg', 30, 10, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(8, '008', 'Dress', 50, 'Floral print summer dress', '/images/dress.jpg', 180, 45, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(9, '009', 'Headphones', 80, 'Wireless over-ear headphones', '/images/headphones.jpg', 90, 15, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(10, '010', 'Jacket', 70, 'Waterproof windbreaker jacket', '/images/jacket.jpg', 100, 20, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(11, '011', 'Digital Camera', 600, 'Mirrorless camera with 24MP sensor', '/images/camera.jpg', 70, 25, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(12, '012', 'Shorts', 25, 'Cargo shorts with multiple pockets', '/images/shorts.jpg', 120, 30, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(13, '013', 'Smartwatch', 150, 'Fitness tracker with heart rate monitor', '/images/smartwatch.jpg', 150, 40, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(14, '014', 'Skirt', 35, 'A-line skirt with floral pattern', '/images/skirt.jpg', 90, 20, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(15, '015', 'Bluetooth Speaker', 40, 'Portable speaker with Bluetooth connectivity', '/images/speaker.jpg', 80, 30, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(16, '016', 'Swimwear', 45, 'One-piece swimsuit for beach days', '/images/swimwear.jpg', 100, 25, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(17, '017', 'External Hard Drive', 80, 'Portable storage device with large capacity', '/images/harddrive.jpg', 60, 15, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(18, '018', 'Polo Shirt', 30, 'Collared polo shirt for casual wear', '/images/poloshirt.jpg', 120, 35, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(19, '019', 'Gaming Console', 400, 'Latest gaming console with advanced graphics', '/images/console.jpg', 50, 10, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1),
(20, '020', 'Backpack', 50, 'Water-resistant backpack with laptop compartment', '/images/backpack.jpg', 150, 40, FLOOR(RAND() * 10) + 1, FLOOR(RAND() * 10) + 1);



select * from products;
delete from products where product_id = 20;
delete from storages where storage_id = 11;
delete from categories where category_id = 11;

INSERT INTO categories (category_id, category_code, category_name, category_describe, category_created_date, category_modify_date)
VALUES
(12, '012', 'Apple', 'Cong ty da quoc gia chuyen ban cac thiet bi dien tu', '2024-03-06', '2024-03-06');

INSERT INTO products (product_id, product_code, product_name, product_price, product_describe, product_image_path, product_in_storage, bought_product_number, category_id, storage_id)
VALUES
(22, '022', 'Smartphone', 800, 'Latest smartphone with dual camera', '/images/smartphone.jpg', 100, 30, 12, FLOOR(RAND() * 10) + 1);

SELECT product_name, category_name
FROM products
INNER JOIN categories ON products.category_id = categories.category_id
WHERE products.product_name LIKE '%Phone%' AND categories.category_name = 'Apple';
-- Đếm số sản phẩm trong mỗi loại danh mục, sắp xếp theo thứ tự giảm dần
SELECT categories.category_name, COUNT(products.product_id) AS total_products
FROM categories
left JOIN products ON categories.category_id = products.category_id
GROUP BY categories.category_name
ORDER BY total_products DESC;
-- Xóa danh mục đồng thời xóa luôn các sản phẩm thuộc danh mục đó (Có sử dụng transaction)



