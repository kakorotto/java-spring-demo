package com.newsapp.newsapp.Api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newsapp.newsapp.Api.entity.News;
@Repository
public interface NewsDao   extends JpaRepository<News, Integer> {

}
