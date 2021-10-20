CREATE TABLE outlet (
    outlet_id VARCHAR(255) PRIMARY KEY
);

CREATE TABLE outlet_offeredservice (
    id VARCHAR(255) PRIMARY KEY,
    outlet_id VARCHAR(255) NOT NULL,
    FOREIGN KEY (outlet_id) REFERENCES outlet(outlet_id)
);