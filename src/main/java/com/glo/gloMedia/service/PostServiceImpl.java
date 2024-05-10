package com.glo.gloMedia.service;

import com.glo.gloMedia.entity.Post;
import com.glo.gloMedia.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService{
    @Autowired
    PostRepository postRepository;
    @Override
    public void addPost(Post post) {
        postRepository.save(post);

    }

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> getPostById(long postId) {
        return postRepository.findById(postId);
    }

    @Override
    public void deletePost(long postId) {
        postRepository.deleteById(postId);

    }
}
