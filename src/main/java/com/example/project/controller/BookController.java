package com.example.project.controller;

import com.example.project.entities.Book;
import com.example.project.entities.Comment;
import com.example.project.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Homepage with pagination and statistics
    @GetMapping("/")
    public String home(@RequestParam(defaultValue = "0") int page,
                       @RequestParam(defaultValue = "8") int size,
                       Model model) {

        // Fetch paginated books
        Page<Book> booksPage = bookService.getBooksPaged(page, size);

        // Add all attributes to the model
        model.addAttribute("booksPage", booksPage);
        model.addAttribute("currentPage", page);
        model.addAttribute("isSearch", false); // Not a search

        return "home"; // Return the homepage view
    }

    // Search with pagination
    @GetMapping("/search")
    public String searchBooks(@RequestParam("keyword") String keyword,
                              @RequestParam(defaultValue = "0") int page,
                              @RequestParam(defaultValue = "8") int size,
                              Model model) {

        // Use the pagination method for search
        Page<Book> booksPage = bookService.searchByTitleOrAuthor(keyword, page, size);

        // Add attributes to the model for pagination
        model.addAttribute("booksPage", booksPage);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalBooks", booksPage.getTotalElements());
        model.addAttribute("searchKeyword", keyword);
        model.addAttribute("isSearch", true); // Indicates we're in search mode

        return "home"; // Return the homepage view
    }

    @GetMapping("/book/{id}")
    public String viewBook(@PathVariable String id, Model model) {
        model.addAttribute("book", bookService.getBookById(id));
        model.addAttribute("comment", new Comment());
        return "book-details";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("book", new Book());
        return "add-book";
    }

    @PostMapping("/add")
    public String submitAddForm(@ModelAttribute Book book) {
        bookService.saveBook(book);
        return "redirect:/add?success=true";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable String id, Model model) {
        Book book = bookService.getBookById(id);
        if (book != null) {
            model.addAttribute("book", book);
            return "edit-book";
        }
        return "redirect:/";
    }

    @PostMapping("/edit/{id}")
    public String submitEditForm(@PathVariable String id, @ModelAttribute Book updatedBook) {
        bookService.updateBook(id, updatedBook);
        return "redirect:/book/" + id;
    }

    @PostMapping("/rate/{id}")
    public String rateBook(@PathVariable String id, @RequestParam int rating) {
        bookService.addRating(id, rating);
        return "redirect:/book/" + id;
    }

    @PostMapping("/comment/{id}")
    public String commentBook(@PathVariable String id, @ModelAttribute Comment comment) {
        bookService.addComment(id, comment);
        return "redirect:/book/" + id;
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable String id) {
        bookService.deleteBookById(id);
        return "redirect:/";
    }
}
