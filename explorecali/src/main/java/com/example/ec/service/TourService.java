package com.example.ec.service;

import com.example.ec.domain.Tour;
import com.example.ec.domain.TourPackage;
import com.example.ec.repo.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Tour  Service
 *
 * Created by Mary Ellen Bowman
 */
@Service
public class TourService {
    private TourRepository tourRepository;

    @Autowired  public TourService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    public Tour createTour(String title, TourPackage tourPackage, Map<String, String> fields) {
        return tourRepository.save(new Tour(title, tourPackage, fields));
    }
    /**
     * Calculate the number of Tours in the Database.
     *
     * @return the total.
     */
    public long total() {
        return tourRepository.count();
    }
}

