SELECT
    b.*,
    a.name AS author_name,
    p.name AS publisher_name,
    g.name AS genre_name
FROM
    books b
INNER JOIN authors a
    ON b.author_id = a.id
INNER JOIN publishers p
    ON b.publisher_id = p.id
INNER JOIN genres g
    ON b.genre_id = g.id
WHERE
    b.deleted = 0
    AND b.id = /* id */'1'
