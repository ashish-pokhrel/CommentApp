package com.comment.commentapp.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Comment {
    @Id @GeneratedValue
    private long id;
    private long BlogId;
    private String text;
    private Date PostedOn;
    private Long PostedBy;
    private boolean isDeleted;
    private boolean TotalReactedBy;
}
