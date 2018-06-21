package com.pride.intern.springdemo.controllers;

import com.pride.intern.springdemo.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {
    List<Post> findByAuthor(String name);
}