package com.newsapp.newsapp.Api.serviceimp;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.newsapp.newsapp.Api.dao.NewsDao;
import com.newsapp.newsapp.Api.entity.News;
import com.newsapp.newsapp.Api.service.NewsService;

//import lombok.extern.slf4j.Slf4j;

@Service
//@Slf4j
public class NewsServiceImp implements NewsService {
	
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(NewsServiceImp.class);

	
	@Autowired
   private	NewsDao newsDAO; 
	
	
	@Override
	public List<News> findAll() {
		return newsDAO.findAll();
	}

	@Override
	public ResponseEntity<News> findById(int id) {
		Optional<News> newsOptional = newsDAO.findById(id);

		if (newsOptional.isPresent()) {
			return ResponseEntity.ok(newsOptional.get());
		} else {
			log.debug(id + "non applicable id");
			return ResponseEntity.notFound().build();
		}
	}

	@Override
	public void save( MultipartFile file ,News news) {
		try {
			news.setImage(file.getBytes());
			newsDAO.save(news);
		} catch (Exception e) {
			log.debug("upload failed" + e);

		}

	}

	@Override
	public void deleteById(int id) {
		try {
			newsDAO.deleteById(id);
		} catch (Exception e) {
			log.debug(id + "non applicable id");
		}
		
	}

}
