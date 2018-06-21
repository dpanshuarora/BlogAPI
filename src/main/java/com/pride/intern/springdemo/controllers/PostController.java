package com.pride.intern.springdemo.controllers;

import com.pride.intern.springdemo.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts/{author}")
    public List<String> retrieveAllPostsByAuthor(@PathVariable String author) {
        List<Post> posts = new ArrayList<>();
        postRepository.findAll().forEach(posts::add);
        return posts.stream()
                .filter(post -> author.equals(post.getAuthor()))
                .map(post -> post.getBody())
                .collect(Collectors.toList());
    }

    @GetMapping("/post/top-ten-posts")
    public List<String> retrieveTopTenPosts() {
        List<Post> posts = new ArrayList<>();
        postRepository.findAll().forEach(posts::add);
        return posts.stream()
                .sorted(Comparator.comparingLong(Post::getVotes))
                .map(post -> post.getBody())
                .collect(Collectors.toList());
    }

    @GetMapping("/author/{author}/top-three-posts")
    public List<String> retrieveTopThreePostsByAuthor(@PathVariable String author) {
        List<Post> posts = new ArrayList<>();
        postRepository.findAll().forEach(posts::add);
        return posts.stream()
                .filter(post -> author.equals(post.getAuthor()))
                .sorted(Comparator.comparingLong(Post::getVotes))
                .map(post -> post.getBody())
                .collect(Collectors.toList());
    }
}