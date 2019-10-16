package com.example.ec.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;
import java.util.Objects;

/**
 * The Tour contains all attributes of an Explore California Tour.
 * This MongoDb Document Collection schema is different than the JPA Entity.
 * Only id, title, and tourPackage are identified and indexed.
 * The rest of the fields are grouped into a Map.
 *
 * Created by Mary Ellen Bowman
 */
@Document
public class Tour {
    @Id
    private String id;

    @Indexed
    private String title;

    @Indexed
    private String tourPackageCode;

    @Indexed
    private String tourPackageName;

    private Map<String, String> fields;

    public Tour(String title, TourPackage tourPackage, Map<String, String> fields) {
        this.title = title;
        this.tourPackageCode = tourPackage.getCode();
        this.tourPackageName = tourPackage.getName();
        this.fields = fields;
    }

    protected Tour() {
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTourPackageCode() {
        return tourPackageCode;
    }

    public String getTourPackageName() {
        return tourPackageName;
    }

    public Map<String, String> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id='" + id + '\'' +
                ", fields=" + fields +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return Objects.equals(id, tour.id) &&
                Objects.equals(fields, tour.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fields);
    }

}
