package com.example.music.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="tracks")
public class Track {
@Id
private String trackId;
private String trackName;
@DBRef
private List<Artist> artists;
@DBRef
private Album album;
public Track() {
	
}
public Track(String trackName, List<Artist> artists, Album album) {
	
	this.trackName = trackName;
	this.artists = artists;
	this.album = album;
}
public String getTrackId() {
	return trackId;
}
public void setTrackId(String trackId) {
	this.trackId = trackId;
}
public String getTrackName() {
	return trackName;
}
public void setTrackName(String trackName) {
	this.trackName = trackName;
}
public List<Artist> getArtists() {
	return artists;
}
public void setArtists(List<Artist> artists) {
	this.artists = artists;
}
public Album getAlbum() {
	return album;
}
public void setAlbum(Album album) {
	this.album = album;
}

}
