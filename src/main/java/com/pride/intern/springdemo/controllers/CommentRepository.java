package com.pride.intern.springdemo.controllers;

import com.pride.intern.springdemo.models.Comment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Long> {
    List<Comment> findAllById(long id);
}