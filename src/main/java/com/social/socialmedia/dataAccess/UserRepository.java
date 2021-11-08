package com.social.socialmedia.dataAccess;


import com.social.socialmedia.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String userName);

}
