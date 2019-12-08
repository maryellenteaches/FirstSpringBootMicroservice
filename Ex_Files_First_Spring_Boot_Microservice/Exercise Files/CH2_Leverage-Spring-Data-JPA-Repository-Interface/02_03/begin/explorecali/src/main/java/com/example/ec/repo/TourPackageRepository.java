package com.example.ec.repo;

import com.example.ec.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;

public interface TourPackageRepository
        extends CrudRepository<TourPackage, String> {
}
