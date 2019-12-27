package com.crud.RestDB.exception;

public class RatingNotFoundException extends Exception {
private long product_id;
public RatingNotFoundException(long product_id) {
        super(String.format("Rating is not found with id : '%s'", product_id));
        }
}
