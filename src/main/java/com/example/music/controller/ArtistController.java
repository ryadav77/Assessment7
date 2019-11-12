package com.example.music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.music.model.Artist;
import com.example.music.repository.AlbumRepo;
import com.example.music.repository.ArtistRepo;
import com.example.music.repository.TrackRepo;

@RestController
public class ArtistController {
@Autowired
private ArtistRepo artistRepo;

@PostMapping("/artists")
public void create(@RequestBody Artist artist) {

	artistRepo.save(artist);
}
@GetMapping("/artists")
public List<Artist> findAll(){
	return artistRepo.findAll();
}
@DeleteMapping("/track/{id}")
public void deleteByUser(@PathVariable String id) {
	artistRepo.deleteById(id);
}

@PutMapping("/track")
public void update(@RequestBody Artist artists) {
	artistRepo.save(artists);
}
}
