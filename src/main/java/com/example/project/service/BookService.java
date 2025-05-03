package com.example.project.service;

import com.example.project.entities.Book;
import com.example.project.entities.Comment;
import com.example.project.repository.BookRepository;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Paginated Browsing: Get all books paginated
    public Page<Book> getBooksPaged(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("title").ascending());
        return bookRepository.findAll(pageable);
    }

    // Search by Title or Author with Pagination
    public Page<Book> searchByTitleOrAuthor(String keyword, int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("title").ascending());
        return bookRepository.findByTitleContainingIgnoreCaseOrAuthorContainingIgnoreCase(keyword, keyword, pageable);
    }

    // Get book by ID
    public Book getBookById(String id) {
        return bookRepository.findById(id).orElse(null);
    }

    // Save a new book
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    // Delete a book by ID
    public void deleteBookById(String id) {
        bookRepository.deleteById(id);
    }

    // Add rating to a book
    public void addRating(String id, int rating) {
        Book book = getBookById(id);
        if (book != null) {
            book.addRating(rating);
            bookRepository.save(book);
        }
    }

    // Update book information
    public Book updateBook(String id, Book updatedBook) {
        Book existingBook = getBookById(id);
        if (existingBook != null) {
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setGenre(updatedBook.getGenre());
            existingBook.setYear(updatedBook.getYear());
            existingBook.setDescription(updatedBook.getDescription());
            return bookRepository.save(existingBook);
        }
        return null;
    }

    // Add a comment to a book
    public void addComment(String id, Comment comment) {
        Book book = getBookById(id);
        if (book != null) {
            book.addComment(comment);
            bookRepository.save(book);
        }
    }

    // Fetch all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
