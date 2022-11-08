package Kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.rentACar.business.abstracts.BrandService;
import Kodlama.io.rentACar.dataAcces.abstracts.BrandRepository;
import Kodlama.io.rentACar.entities.concretes.Brand;

@Service
//bu sınıf bir businnes nesnesidir.
public class BrandManager implements BrandService {

	private BrandRepository brandRepository;
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}



	@Override
	public List<Brand> getAll() {
		// iş kuralları
		return brandRepository.getAll();
		
		
		
	}

}
