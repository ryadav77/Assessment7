package com.example.music.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="albums")
public class Album {
@Id
private String albumId;
private String albumName;
@DBRef
private List<Track> tracks;
@DBRef
private List<Artist> artists;
public Album() {
	
}
public Album(String albumName, List<Track> tracks, List<Artist> artists) {
	
	this.albumName = albumName;
	this.tracks = tracks;
	this.artists = artists;
}
public String getAlbumId() {
	return albumId;
}
public void setAlbumId(String albumId) {
	this.albumId = albumId;
}
public String getAlbumName() {
	return albumName;
}
public void setAlbumName(String albumName) {
	this.albumName = albumName;
}
public List<Track> getTracks() {
	return tracks;
}
public void setTracks(List<Track> tracks) {
	this.tracks = tracks;
}
public List<Artist> getArtists() {
	return artists;
}
public void setArtists(List<Artist> artists) {
	this.artists = artists;
}

}
