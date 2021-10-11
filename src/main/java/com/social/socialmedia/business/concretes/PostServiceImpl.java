package com.social.socialmedia.business.concretes;

import com.social.socialmedia.business.abstracts.PostService;
import com.social.socialmedia.dataAccess.PostRepository;
import com.social.socialmedia.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAll() {
        return postRepository.findAll();
    }
}
