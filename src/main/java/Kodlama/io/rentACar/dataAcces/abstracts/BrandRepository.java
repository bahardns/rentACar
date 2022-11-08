package Kodlama.io.rentACar.dataAcces.abstracts;

import java.util.List;

import Kodlama.io.rentACar.entities.concretes.Brand;
public interface BrandRepository {


	List<Brand> getAll();
}
 