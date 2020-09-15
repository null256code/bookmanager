--https://sekom.hatenablog.com/entry/20081201/p1

CREATE TABLE book (
    book_id bigint identity not null primary key,
    title varchar(255) not null
);

CREATE TABLE publisher (
    publisher_id bigint identity not null primary key,
    name varchar(255) not null
);

CREATE TABLE book_publisher (
    book_publisher_id bigint identity not null primary key,
    book_id bigint not null,
    publisher_id bigint not null,
    FOREIGN KEY (book_id) REFERENCES book(book_id),
    FOREIGN KEY (publisher_id) REFERENCES publisher(publisher_id)
);

CREATE TABLE author (
    author_id bigint identity not null primary key,
    name varchar(255) not null
);

CREATE TABLE book_author (
    book_author_id bigint identity not null primary key,
    book_id bigint not null,
    author_id bigint not null,
    FOREIGN KEY (book_id) REFERENCES book(book_id),
    FOREIGN KEY (author_id) REFERENCES author(author_id)
);