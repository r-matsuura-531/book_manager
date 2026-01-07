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
/*%if filter.hasIsbn() */
    AND b.isbn LIKE /* @prefix(filter.getIsbn()) */'' ESCAPE '$'
/*%end*/
/*%if filter.hasTitle() */
    AND b.title LIKE /* @infix(filter.getTitle()) */'' ESCAPE '$'
/*%end*/
/*%if filter.hasAuthorName() */
    AND a.name LIKE /* @infix(filter.getAuthorName()) */'' ESCAPE '$'
/*%end*/
/*%if filter.hasPublisherId() */
    AND p.id = /* filter.getPublisherId() */''
/*%end*/
/*%if filter.hasGenreId() */
    AND g.id = /* filter.getGenreId() */''
/*%end*/
ORDER BY b.id
