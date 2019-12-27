package com.crud.RestDB.repository;

import com.crud.RestDB.model.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RatingsRepository extends JpaRepository<Ratings, Long> {
}
