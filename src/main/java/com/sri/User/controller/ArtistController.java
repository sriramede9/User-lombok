package com.sri.User.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sri.User.model.Artist;
import com.sri.User.model.User;
import com.sri.User.service.ArtistService;

@RestController
public class ArtistController {

	@Autowired
	private ArtistService artistService;

	@GetMapping("/getArtists")
	public List<Artist> GetArtist() {

		return artistService.getAllArtists();
	}

	@PostMapping("/addartist")
	public void createArtist(@RequestBody Artist artist) {

		System.out.println("Here is the artist received" + artist);
		artistService.addArtist(artist);

	}
	
	@GetMapping("/artist/{id}")
	public Artist getArtist(@PathVariable("id") int id) {
		Artist artist=artistService.getArtistbyId(id);
//		artist.setFirstname("artist");
//		artist.setLastname("one");
//		artist.setUser(new User("sri","test","artist"));
		artist.getUser().setRole("Honey Bunny");
		return artist;
	}

}
