package com.thornie.dev.phoneshop.PhoneShop.service;

import com.thornie.dev.phoneshop.PhoneShop.entity.Brand;

public interface BrandService {
    Brand create(Brand brand);
    Brand getById(Integer id);

}
