package com.thornie.dev.phoneshop.PhoneShop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thornie.dev.phoneshop.PhoneShop.entity.Brand;
import com.thornie.dev.phoneshop.PhoneShop.repository.BrandRepository;
import com.thornie.dev.phoneshop.PhoneShop.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }
    
}

