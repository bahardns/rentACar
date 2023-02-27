package Kodlama.io.rentACar.dataAcces.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
