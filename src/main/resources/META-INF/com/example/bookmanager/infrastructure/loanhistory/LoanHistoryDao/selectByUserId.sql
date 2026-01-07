SELECT
    b.id AS id,
    b.title AS title,
    a.name AS author_name,
    p.name AS publisher_name,
    lh.loaned_at AS loaned_at,
    lh.return_due_on AS return_due_on,
    lh.returned_at AS returned_at
FROM
    loan_histories lh
INNER JOIN books b
    ON lh.book_id = b.id
INNER JOIN authors a
    ON b.author_id = a.id
INNER JOIN publishers p
    ON b.publisher_id = p.id
WHERE
    lh.user_id = /* userId */'1'
    AND b.deleted = 0
