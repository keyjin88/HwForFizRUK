-- 1. По идентификатору заказа получить данные заказа и данные клиента,
-- создавшего этот заказ
select *
from orders
         inner join customers c on c.id = orders.customer_id;

-- Получить данные всех заказов одного клиента по идентификатору
-- клиента за последний месяц
select *
from orders
where customer_id = 1
  and order_date >= date_trunc('month', current_date - interval '1' month)
  and order_date < date_trunc('month', current_date);

-- Найти заказ с максимальным количеством купленных цветов, вывести их
-- название и количество
select fk.kind, amount
from orders
         inner join flower_kinds fk on fk.id = orders.kind_id
where amount = (SELECT MAX(amount)
                FROM orders);

-- Вывести общую выручку (сумму золотых монет по всем заказам) за все
-- время
SELECT sum(orders.amount * prices.price) AS summa
FROM orders,
     prices
WHERE orders.kind_id = prices.kind_id