insert into flower_kinds (kind)
values ('Ромашки');
insert into flower_kinds (kind)
values ('Розы');
insert into flower_kinds (kind)
values ('Лилии');

insert into prices (kind_id, price)
VALUES ((select id from flower_kinds where kind = 'Розы'), 100);

insert into prices (kind_id, price)
VALUES ((select id from flower_kinds where kind = 'Ромашки'), 25);

insert into prices (kind_id, price)
VALUES ((select id from flower_kinds where kind = 'Лилии'), 50);

insert into customers (full_name, phone_number)
VALUES ('Физрук', '+79107675432');

insert into orders (amount, kind_id, price_id, customer_id, order_date)
VALUES (10, 2, (select id from prices where prices.kind_id = 2), 2, now());

insert into orders (amount, kind_id, price_id, customer_id, order_date)
VALUES (10, 3, (select id from prices where prices.kind_id = 3), 2, now());