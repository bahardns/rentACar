package Kodlama.io.rentACar.dataAcces.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.rentACar.entities.concretes.Brand;
public interface BrandRepository extends JpaRepository<Brand, Integer> {


	List<Brand> getAll();
}
 