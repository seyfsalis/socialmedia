package com.social.socialmedia.dataAccess;

import com.social.socialmedia.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
