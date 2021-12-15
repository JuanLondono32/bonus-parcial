package com.tutorial.mongodbdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tutorial.mongodbdemo.model.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {

	Movie findMovieById(String movieId);

}
