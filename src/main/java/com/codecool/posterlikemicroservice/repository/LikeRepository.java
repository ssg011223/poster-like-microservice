package com.codecool.posterlikemicroservice.repository;

import com.codecool.posterlikemicroservice.model.Like;
import com.codecool.posterlikemicroservice.model.LikeKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface LikeRepository extends JpaRepository<Like, LikeKey> {
    Collection<Like> findAllByPostIdIn(Collection<Long> postId);
}
