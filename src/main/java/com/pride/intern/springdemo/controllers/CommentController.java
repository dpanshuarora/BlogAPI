package com.pride.intern.springdemo.controllers;

import com.pride.intern.springdemo.models.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CommentController {
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping("student/{id}/comment")
    public List<String> retrieveStudentsById(@PathVariable long id){
        List<String> comments = new ArrayList<>();
        for (Comment comment: commentRepository.findAllById(id))
        {comments.add(comment.getBody());}
        return comments;
    }
}

