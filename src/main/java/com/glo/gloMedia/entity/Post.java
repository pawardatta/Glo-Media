package com.glo.gloMedia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {

    @Id
    private long postId;
    private String content;

    public Post() {
    }

    public Post(long postId,String content) {
        this.postId = postId;
        this.content = content;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", content='" + content + '\'' +
                '}';
    }
}
