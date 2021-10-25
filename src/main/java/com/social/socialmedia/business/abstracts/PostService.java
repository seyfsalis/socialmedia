package com.social.socialmedia.business.abstracts;

import com.social.socialmedia.dtos.PostDto;
import com.social.socialmedia.entities.Post;

import java.util.List;

public interface PostService {
    List<Post> getAll();
    Post createPost(PostDto post);
}
