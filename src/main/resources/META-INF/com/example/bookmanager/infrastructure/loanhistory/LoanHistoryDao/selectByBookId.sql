SELECT
    /*%expand*/*
FROM
    loan_histories lh
WHERE
    lh.book_id = /* bookId */''
    AND lh.deleted = 0
