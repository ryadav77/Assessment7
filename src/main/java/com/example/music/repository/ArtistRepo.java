package com.example.music.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.music.model.Artist;

public interface ArtistRepo extends MongoRepository<Artist, String> {

}
