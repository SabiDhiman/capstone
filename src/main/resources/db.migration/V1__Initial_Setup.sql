CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    user_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
)

CREATE TABLE hubs (
    id BIGSERIAL PRIMARY KEY,
    hub_name VARCHAR(255) NOT NULL,
    location VARCHAR(255) NOT NULL
)

CREATE TABLE posts (
    id BIGSERIAL PRIMARY KEY,
    hub_id INT NOT NULL REFERENCES hubs(id),
    post_body VARCHAR(255)
)

CREATE TABLE requests (
    id BIGSERIAL PRIMARY KEY,
    post_id INT NOT NULL REFERENCES posts(id),
    donation_type VARCHAR(255) NOT NULL,
    quantity_needed INT NOT NULL
)

CREATE TABLE donations (
    id BIGSERIAL PRIMARY KEY,
    user_id INT NOT NULL REFERENCES users(id),
    request_id INT NOT NULL REFERENCES requests(id),
    donation_quantity INT NOT NULL
)