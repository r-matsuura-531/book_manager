SELECT
    /*%expand*/*
FROM
    books b
WHERE
    b.isbn = /* isbn */''
    AND b.deleted = 0
