package com.thornie.dev.phoneshop.PhoneShop.service.impl;

import com.thornie.dev.phoneshop.PhoneShop.entity.Brand;
import com.thornie.dev.phoneshop.PhoneShop.repository.BrandRepository;
import com.thornie.dev.phoneshop.PhoneShop.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public Brand getById(Integer id) {
//        Optional<Brand> brandOptional = brandRepository.findById(id);
//        if (brandOptional.isPresent()) {
//            return brandOptional.get();
//        }
//        //throw new HttpClientErrorException(HttpStatus.NOT_FOUND, "Brand with Id = " + id + " not found");
//        throw new HttpClientErrorException(HttpStatus.NOT_FOUND, String.format("Brand with Id = %d not found", id));

        return brandRepository.findById(id)
                .orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND, String.format("Brand with id = %d not found",id)));
    }

}

