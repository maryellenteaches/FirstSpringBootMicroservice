package com.example.ec;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.PropertyAccessor.FIELD;

@SpringBootApplication
public class ExplorecaliApplication  {
	@Value("${importfile:ExploreCalifornia.json}")
	private String filePath;

	public static void main(String[] args) {
		SpringApplication.run(ExplorecaliApplication.class, args);
	}




	/**
	 * Helper class to import the records in the ExploreCalifornia.json
	 */
	static class TourFromFile {
		//attributes as listed in the .json file
		private String packageType, title, description, blurb, price, length, bullets, keywords,  difficulty, region;

		public static List<TourFromFile> importTours(String path) throws IOException {
			return new ObjectMapper().setVisibility(FIELD, ANY).
					readValue(new FileInputStream(path),new TypeReference<List<TourFromFile>>(){});
		}
	}

}
