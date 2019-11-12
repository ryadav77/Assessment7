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

import com.example.music.model.Album;
import com.example.music.repository.AlbumRepo;

@RestController
public class AlbumController {
@Autowired
private AlbumRepo albumRepo;
@PostMapping("/albums")
public void create (@RequestBody Album album) {
albumRepo.save(album);	
}
@GetMapping("/albums")
public List<Album> findAll(){
	return albumRepo.findAll();
}
@DeleteMapping("/track/{id}")
public void deleteByUser(@PathVariable String id) {
	albumRepo.deleteById(id);
}

@PutMapping("/track")
public void update(@RequestBody Album albums) {
	albumRepo.save(albums);
}
}
