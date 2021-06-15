package com.codecool.posterlikemicroservice.service;

import com.codecool.posterlikemicroservice.model.Like;
import com.codecool.posterlikemicroservice.model.LikeKey;
import com.codecool.posterlikemicroservice.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;

@Service
public class LikeService {
    @Autowired
    private LikeRepository likeRepository;

    public void saveLike(long personId, long postId) {
        Like like = new Like(postId, personId, LocalDateTime.now());
        likeRepository.save(like);
    }

    public void deleteLike(long personId, long postId) {
        likeRepository.deleteById(new LikeKey(personId, postId));
    }

    public Collection<Like> findAllByPostIdIn(Collection<Long> postIds) {
        return likeRepository.findAllByPostIdIn(postIds);
    }
}
