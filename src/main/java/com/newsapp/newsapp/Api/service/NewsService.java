package com.newsapp.newsapp.Api.service;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.newsapp.newsapp.Api.entity.News;



public interface NewsService {
	
	public List<News> findAll();
	
	public ResponseEntity<News> findById(int id);
	
	public void save( MultipartFile file ,News news);
	
	public void deleteById(int id);
	
}
