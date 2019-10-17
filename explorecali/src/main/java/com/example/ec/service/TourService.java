package com.example.ec.service;

import com.example.ec.domain.Tour;
import com.example.ec.domain.TourPackage;
import com.example.ec.repo.TourPackageRepository;
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
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourService(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
        this.tourRepository = tourRepository;
        this.tourPackageRepository = tourPackageRepository;
    }

    /**
     * Create a Tour, verify that Tour Package Exists.
     *
     * @param title Title of the tour
     * @param tourPackage tour Package of the tour
     * @param details Extra details about the tour
     * @return Tour
     */
    public Tour createTour(String title, TourPackage tourPackage, Map<String, String> details) {
        if(!tourPackageRepository.existsById(tourPackage.getCode())) {
            throw new RuntimeException("Tour package does not exist: " + tourPackage);
        }
        return tourRepository.save(new Tour(title, tourPackage, details));
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

