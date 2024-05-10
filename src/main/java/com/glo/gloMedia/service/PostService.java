package com.glo.gloMedia.service;

import com.glo.gloMedia.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    public void addPost(Post post);
    public List<Post> getAllPost();
    public Optional<Post> getPostById(long postId);
    public void deletePost(long postId);
}
