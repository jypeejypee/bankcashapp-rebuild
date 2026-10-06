DROP TABLE IF EXISTS transactions;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id              BIGSERIAL PRIMARY KEY,
    mobile_number   VARCHAR(11) UNIQUE NOT NULL,
    pin             VARCHAR(100) NOT NULL,
    full_name       VARCHAR(100) NOT NULL,
    balance         NUMERIC(12,2) NOT NULL DEFAULT 0 CHECK (balance >= 0)
);


CREATE TABLE transactions (
    id              BIGSERIAL PRIMARY KEY,
    user_id         BIGINT NOT NULL REFERENCES users(id),
    type            VARCHAR(20) NOT NULL,
    amount          NUMERIC(12,2) NOT NULL CHECK (AMOUNT>0),
    details         VARCHAR(255) NOT NULL,
    created_at      TIMESTAMP  NOT NULL DEFAULT now()
);

CREATE INDEX idx_user_mobile ON users(mobile_number);
CREATE INDEX idx_tx_user ON transactions(user_id);

INSERT INTO users (mobile_number, pin, full_name, balance) VALUES
('09171234567', '1234', 'Juan dela Cruz', 5000 ),
('09161234567', '4321', 'Maria dela Cruz', 3000);