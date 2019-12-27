package com.crud.RestDB.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.RestDB.exception.RatingNotFoundException;
import com.crud.RestDB.model.Ratings;
import com.crud.RestDB.repository.RatingsRepository;

@RestController
public class RatingController {
	@Autowired
    RatingsRepository ratingRepository;

// Get All Notes
    @GetMapping("/ratings")
    public List<Ratings> getAllNotes() {
        return ratingRepository.findAll();
    }

// Create a new Note
    @PostMapping("/ratings")
    public Ratings createNote(@Valid @RequestBody Ratings rating) {
        return ratingRepository.save(rating);
    }

// Get a Single Note
    @GetMapping("/ratings/{p_id}")
    public Ratings getNoteById(@PathVariable(value = "p_id") Long product_id) throws RatingNotFoundException {
        return ratingRepository.findById(product_id)
                .orElseThrow(() -> new RatingNotFoundException(product_id));
    }

// Update a Note
	/*
	 * @PutMapping("/books/{id}") public Book updateNote(@PathVariable(value = "id")
	 * Long bookId,
	 * 
	 * @Valid @RequestBody Book bookDetails) throws BookNotFoundException {
	 * 
	 * Book book = bookRepository.findById(bookId) .orElseThrow(() -> new
	 * BookNotFoundException(bookId));
	 * 
	 * book.setBook_name(bookDetails.getBook_name());
	 * book.setAuthor_name(bookDetails.getAuthor_name());
	 * book.setIsbn(bookDetails.getIsbn());
	 * 
	 * Book updatedBook = bookRepository.save(book);
	 * 
	 * return updatedBook;
	 */
    

// Delete a Note
    /*@DeleteMapping("/ratings/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable(value = "id") Long bookId) throws BookNotFoundException {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new BookNotFoundException(bookId));

bookRepository.delete(book);

return ResponseEntity.ok().build();*/
	

}
