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

import com.example.music.model.Track;
import com.example.music.repository.TrackRepo;

@RestController
public class TrackController {
@Autowired
private TrackRepo trackRepo;
@PostMapping("/tracks")
public void create(@RequestBody Track track) {
	trackRepo.save(track);
}
@GetMapping("/tracks")
public List<Track> findAll(){
	return trackRepo.findAll();
}
@DeleteMapping("/track/{id}")
public void deleteByUser(@PathVariable String id) {
	trackRepo.deleteById(id);
}

@PutMapping("/track")
public void update(@RequestBody Track tracks) {
	trackRepo.save(tracks);
}
}
