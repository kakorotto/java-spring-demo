package com.newsapp.newsapp.Api.contoller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.newsapp.newsapp.Api.entity.News;
import com.newsapp.newsapp.Api.service.NewsService;


@RestController
@RequestMapping("/news")

public class NewsController {

	

	@Autowired
	private NewsService newsService;

	@GetMapping("view")
	public List<News> getNews() {
		return newsService.findAll();
	}

 
	@PostMapping("add/news")
	public void addNews(@RequestPart("file") MultipartFile file, @RequestPart News news) {

		newsService.save(file, news);

	}

	@GetMapping("view/{id}")
	public ResponseEntity<News> viewById(@PathVariable int id) {
			return newsService.findById(id);

	}

	@DeleteMapping("delete/{id}")
	public void deleteNewsById(@PathVariable int id) {
		newsService.deleteById(id);

	}



}
