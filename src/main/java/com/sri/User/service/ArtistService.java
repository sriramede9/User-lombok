package com.sri.User.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.User.model.Artist;
import com.sri.User.model.ArtistRepository;

@Service
public class ArtistService {

	@Autowired
	private ArtistRepository artistRepository;

	public List<Artist> getAllArtists() {
		return artistRepository.findAll();
	}

	public Artist addArtist(Artist artist) {
		Artist savedArtist = artistRepository.save(artist);
		return savedArtist;
	}

	public Artist getArtistbyId(int id) {
		// TODO Auto-generated method stub
		return artistRepository.findById(id).get();
	}
}
