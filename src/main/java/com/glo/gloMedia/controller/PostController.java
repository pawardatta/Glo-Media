package com.glo.gloMedia.controller;

import com.glo.gloMedia.entity.Post;
import com.glo.gloMedia.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class PostController {

    @Autowired
    PostService postService;

    public void addPost(Post post) {
        postService.addPost(post);

    }

    public List<Post> getAllPost() {
        return postService.getAllPost();
    }

    public Optional<Post> getPostById(long postId) {
        return postService.getPostById(postId);
    }


    public void deletePost(long postId) {
        postService.deletePost(postId);

    }
}
