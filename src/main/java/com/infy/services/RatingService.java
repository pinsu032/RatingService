package com.infy.services;

import org.springframework.stereotype.Service;

import com.infy.entities.Rating;

import java.util.List;


public interface RatingService {

    //create
    Rating create(Rating rating);


    //get all ratings
    List<Rating> getRatings();

    //get all by UserId
    List<Rating> getRatingByUserId(Integer userId);

    //get all by hotel
    List<Rating> getRatingByHotelId(Integer hotelId);




}
