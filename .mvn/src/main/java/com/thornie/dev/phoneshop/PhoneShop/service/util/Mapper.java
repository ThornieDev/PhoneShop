package com.thornie.dev.phoneshop.PhoneShop.service.util;

import com.thornie.dev.phoneshop.PhoneShop.dto.BrandDTO;
import com.thornie.dev.phoneshop.PhoneShop.entity.Brand;

public class Mapper {

    public static Brand toBrand(BrandDTO dto){
        Brand brand =  new Brand();
        // brand.setId(dto.getId());
        brand.setName(dto.getName());

        return brand;
    }

    public static BrandDTO tBrandDTO(Brand brand){
        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setName(brand.getName());
        return brandDTO;
    }
}
