create table customers
(
    id           serial
        primary key,
    full_name    varchar,
    phone_number varchar
);

create table flower_kinds
(
    id   serial
        primary key,
    kind varchar
);

create table prices
(
    id      serial
        primary key,
    kind_id bigint
        constraint prices_flower_kinds_null_fk
            references flower_kinds,
    price   numeric(19, 2)
);

create table orders
(
    id          serial
        primary key,
    amount      integer
        constraint orders_amount_check
            check ((amount > 0) AND (amount < 1000)),
    kind_id     bigint
        constraint orders_flower_kinds_null_fk
            references flower_kinds,
    price_id    bigint
        constraint orders_prices_null_fk
            references prices,
    customer_id bigint,
    order_date  date not null
);
