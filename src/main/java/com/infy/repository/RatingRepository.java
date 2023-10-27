package com.infy.repository;

import com.infy.entities.Rating;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating,Integer>
{
    //custom finder methods
    List<Rating> findByUserId(Integer userId);
    List<Rating> findByHotelId(Integer hotelId);

}
