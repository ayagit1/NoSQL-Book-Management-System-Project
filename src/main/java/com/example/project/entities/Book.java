package com.example.project.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Document("books")
public class Book {

    @Id
    private String id;

    private String title;
    private String author;
    private String genre;
    private int year;

    private List<Integer> ratings = new ArrayList<>();
    private List<Comment> comments = new ArrayList<>();

    @Field
    private String description;


    // Constructors
    public Book() {}

    public Book(String title, String author, String genre, int year, String description) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.description = description;
    }


    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Integer> getRatings() {
        return ratings;
    }

    public void setRatings(List<Integer> ratings) {
        this.ratings = ratings;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public double getAverageRating() {
        if (ratings == null || ratings.isEmpty()) return 0.0;
        return ratings.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public void addRating(int rating) {
        this.ratings.add(rating);
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }
}