CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

ALTER EXTENSION "uuid-ossp" SET SCHEMA inventory_service;

CREATE TABLE IF NOT EXISTS inventory_service.tbl_inventory (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    sku_code VARCHAR(255) NOT NULL,
    quantity INTEGER NOT NULL,
    location VARCHAR(255) NOT NULL,
    status VARCHAR(255) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);