--publisher
INSERT INTO publisher(publisher_id, name) VALUES(1, 'A Publisher');
INSERT INTO publisher(publisher_id, name) VALUES(2, 'B Publisher');
INSERT INTO publisher(publisher_id, name) VALUES(3, 'C Publisher');

--author
INSERT INTO author(author_id, name) VALUES(1, 'Anna');
INSERT INTO author(author_id, name) VALUES(2, 'Bob');

--book
INSERT INTO book(book_id, title) VALUES(1, 'Art Book');
INSERT INTO book_publisher(book_publisher_id, book_id, publisher_id) VALUES(1, 1, 1);
INSERT INTO book_publisher(book_publisher_id, book_id, publisher_id) VALUES(2, 1, 2);
INSERT INTO book_author(book_author_id, book_id, author_id) VALUES(1, 1, 1);
