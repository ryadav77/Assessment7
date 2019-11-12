package com.example.music.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.music.model.Track;

public interface TrackRepo extends MongoRepository<Track, String> {

}
