package com.caching.library_system.service;

import com.caching.library_system.model.Book;
import com.caching.library_system.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Cacheable(cacheNames = "books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Cacheable(cacheNames = "books", key = "#id")
    public Optional<Book> getBookById(Long id) {
        System.out.println("Getting Book from DB........");
        return bookRepository.findById(id);
    }

    @CachePut(cacheNames = "books", key = "#book.id")
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @CachePut(cacheNames = "books", key = "#book.id")
    public Book updateBook(Book book) {
        bookRepository.updateBookName(book.getId(), book.getTitle());
        return book;
    }

    @CachePut(cacheNames = "books", key = "#book.id")
    public Book updateBook(Long id, Book updatedBook) {
        return bookRepository.findById(id).map(book -> {
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setIsbn(updatedBook.getIsbn());
            book.setPublishedYear(updatedBook.getPublishedYear());
            book.setGenre(updatedBook.getGenre());
            book.setCopiesAvailable(updatedBook.getCopiesAvailable());
            return bookRepository.save(book);
        }).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    @CacheEvict(cacheNames = "books", key = "#id")
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public List<Book> searchByTitle(String title) {
        return bookRepository.findByTitleContainingIgnoreCase(title);
    }

    public List<Book> searchByAuthor(String author) {
        return bookRepository.findByAuthorContainingIgnoreCase(author);
    }

    public List<Book> searchByGenre(String genre) {
        return bookRepository.findByGenreContainingIgnoreCase(genre);
    }
}
