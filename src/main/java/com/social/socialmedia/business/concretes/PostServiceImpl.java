package com.social.socialmedia.business.concretes;

import com.social.socialmedia.business.abstracts.PostService;
import com.social.socialmedia.dataAccess.PostRepository;
import com.social.socialmedia.dtos.PostDto;
import com.social.socialmedia.entities.Post;
import com.social.socialmedia.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PostServiceImpl implements PostService {


    private PostRepository postRepository;

    private CustomUserDetailService userService;

    @Autowired
    public PostServiceImpl(PostRepository postRepository, CustomUserDetailService userService) {
        this.postRepository = postRepository;
        this.userService = userService;
    }

    @Override
    public List<Post> getAll() {
        return postRepository.findAll();
    }

    @Override
    public Post createPost(PostDto post) {
        User user = userService.finById(post.getUserId());
        if(user == null){
            return null;
        }
        Post toSave = new Post();
        toSave.setId(post.getId());
        toSave.setContent(post.getContent());
        toSave.setTitle(post.getTitle());
        toSave.setPerson(user);
        return postRepository.save(toSave);
    }
}
