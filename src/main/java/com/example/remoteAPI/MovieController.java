package com.example.remoteAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/getInfo")
    public Object getMovieInfo(@RequestParam("movie") String movieId) {
        String url = "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=2b25f015041245b73a9504ffb6c31f78";
        Object response = restTemplate.getForObject(url, Object.class);
        return response;
    }

    @GetMapping("/getInfo/{movie}")
    public Object getMovieInfoUsingPath(@PathVariable("movie") String movieId) {
        String url = "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=2b25f015041245b73a9504ffb6c31f78";
        Object response = restTemplate.getForObject(url, Object.class);
        return response;
    }

    @GetMapping("/getCustomisedInfo/{movie}")
    public MovieResponse getCustomisedInfoUsingPath(@PathVariable("movie") String movieId) {
        String url = "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=2b25f015041245b73a9504ffb6c31f78";
        MovieResponse response = restTemplate.getForObject(url, MovieResponse.class);
        return response;
    }

    @GetMapping("/getCustomisedInfo")
    public MovieResponse getCustomisedInfo(@RequestParam("movie") String movieId) {
        String url = "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=2b25f015041245b73a9504ffb6c31f78";
        MovieResponse response = restTemplate.getForObject(url, MovieResponse.class);
        return response;
    }

    @GetMapping("/getStudent/{id}")
    public Object getStudent(@PathVariable("id") int regNo) {
        String url = "http://localhost:9999/Student/getByPath/" + regNo;
        Object response = restTemplate.getForObject(url, Object.class);
        return response;
    }
}
