package com.codecool.posterlikemicroservice.controller;

import com.codecool.posterlikemicroservice.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/like")
public class LikeController {
    @Autowired
    private LikeService likeService;

    @PostMapping("/{postId}")
    public void like(@RequestHeader("userId") long personId,
                     @PathVariable(name = "postId") long postId) {
        likeService.saveLike(personId, postId);
    }

    @DeleteMapping("/{postId}")
    public void unLike(@RequestHeader("userId") long personId,
                     @PathVariable(value = "postId") long postId) {
        likeService.deleteLike(personId,postId);
    }
}
