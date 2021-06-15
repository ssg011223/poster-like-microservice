package com.codecool.posterlikemicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "adom")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(LikeKey.class)
public class Like {
    @Id
    private long postId;
    @Id
    private long personId;

    @Column(name = "adom_date")
    private LocalDateTime likeDate;
}
