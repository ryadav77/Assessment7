package com.example.music.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="artists")
public class Artist {
@Id
private String artistId;
private String artistName;
@DBRef
private List<Track> tracks;
@DBRef
private List<Album> albums;
public Artist() {
	
}
public Artist(String artistName, List<Track> tracks, List<Album> albums) {
	
	this.artistName = artistName;
	this.tracks = tracks;
	this.albums = albums;
}
public String getArtistId() {
	return artistId;
}
public void setArtistId(String artistId) {
	this.artistId = artistId;
}
public String getArtistName() {
	return artistName;
}
public void setArtistName(String artistName) {
	this.artistName = artistName;
}
public List<Track> getTracks() {
	return tracks;
}
public void setTracks(List<Track> tracks) {
	this.tracks = tracks;
}
public List<Album> getAlbums() {
	return albums;
}
public void setAlbums(List<Album> albums) {
	this.albums = albums;
}

}
