package Kodlama.io.rentACar.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.rentACar.dataAcces.abstracts.BrandRepository;
import Kodlama.io.rentACar.entities.concretes.Brand;
@Repository
//bu sınıf bir dataAcces Nesnesidir.
public class inMemeoryBrandRepository implements BrandRepository {

	List<Brand> brands;
	//boş array
	public inMemeoryBrandRepository() {
		brands=new ArrayList<Brand>();
		brands.add(new Brand(1,"bmw"));
		brands.add(new Brand(2,"mercedes"));
		brands.add(new Brand(3,"audi"));
	}
	
	@Override
	public List<Brand> getAll() {
		
		return brands;
	}

}
