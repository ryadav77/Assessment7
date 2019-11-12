package com.example.music.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.music.model.Album;

public interface AlbumRepo extends MongoRepository<Album, String> {

}
