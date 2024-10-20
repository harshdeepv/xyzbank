-- Create BankBranch table
CREATE TABLE IF NOT EXISTS bank_branch (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    branch_name VARCHAR(255),
    branch_address VARCHAR(255),
    city VARCHAR(255),
	ifsc VARCHAR(255)
);

-- Create BankFeatures table
CREATE TABLE IF NOT EXISTS bank_feautres (
    feature_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    feature_description VARCHAR(255)
);

-- Insert dummy data into BankBranch
INSERT INTO BankBranch (branch_name, branch_address, city, ifsc) VALUES
('Branch A', 'Whitefield', 'Bangalore', '123'),
('Branch B', 'Sarjapur', 'Bangalore', '234'),
('Branch C', 'Yelhanka', 'Bangalore', '345');

-- Insert dummy data into BankFeatures
INSERT INTO BankFeatures (feature_description) VALUES
('ATM')