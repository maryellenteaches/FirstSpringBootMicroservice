package com.example.ec.web;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Data Transfer Object for Rating a Tour.
 *
 * Created by Mary Ellen Bowman
 */
public class RatingDto {

    @Min(0)
    @Max(5)
    private Integer score;

    @Size(max = 255)
    private String comment;

    @NotNull
    private Integer customerId;

    /**
     * Constructor to fully initialize the RatingDto
     *
     * @param score
     * @param comment
     * @param customerId
     */
    public RatingDto(Integer score, String comment, Integer customerId) {
        this.score = score;
        this.comment = comment;
        this.customerId = customerId;
    }

    protected RatingDto() {}

    public Integer getScore() {
        return score;
    }

    public String getComment() {
        return comment;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

}
