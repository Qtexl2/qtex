DROP TABLE IF EXISTS card;
CREATE TABLE card (
  card_id BIGSERIAL NOT NULL,
  qr_code VARCHAR(255) NOT NULL UNIQUE,
  email VARCHAR(255) NOT NULL,
  phone_number VARCHAR(255) NOT NULL,
  verification_key VARCHAR(255),
  PRIMARY KEY (card_id)
);

DROP TABLE IF EXISTS account;
CREATE TABLE account (
  account_id BIGSERIAL NOT NULL,
  card_id BIGINT NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  gender VARCHAR(255) NOT NULL,
  birthday TIMESTAMP,
  created_at TIMESTAMP,
  status VARCHAR(255) NOT NULL,
  PRIMARY KEY (card_id)
);