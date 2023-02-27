package Kodlama.io.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.rentACar.business.abstracts.BrandService;
import Kodlama.io.rentACar.business.requests.CreateBrandRequest;
import Kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
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
	public List<GetAllBrandsResponse> getAll() {
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse>brandsResponses=new ArrayList<GetAllBrandsResponse>(); 

		
		for ( Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName()); 
			brandsResponses.add(responseItem);
		}
		
		// iş kuralları
		return brandsResponses;
		
		
		
	}



	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName()); 
		this.brandRepository.save(brand); 
	}

}
