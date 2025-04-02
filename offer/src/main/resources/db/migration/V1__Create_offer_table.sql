CREATE TABLE offer
(
    id     UUID PRIMARY KEY,
    title  VARCHAR(255),
    price  DECIMAL(19, 2),
    store  VARCHAR(255),
    status VARCHAR(50)
);