create table book(
    id long not null,
    author varchar(255),
    copies_available integer,
    genre varchar(50),
    isbn integer,
    published_year integer,
    title varchar(255),
    primary key(id)
);