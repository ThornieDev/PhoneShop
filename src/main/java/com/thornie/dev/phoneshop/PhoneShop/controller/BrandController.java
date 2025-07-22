package com.thornie.dev.phoneshop.PhoneShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thornie.dev.phoneshop.PhoneShop.dto.BrandDTO;
import com.thornie.dev.phoneshop.PhoneShop.entity.Brand;
import com.thornie.dev.phoneshop.PhoneShop.service.BrandService;
import com.thornie.dev.phoneshop.PhoneShop.service.util.Mapper;

@RestController
@RequestMapping("brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping(method = RequestMethod.POST)

    public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO) {
        Brand brand = Mapper.toBrand(brandDTO);
        brand = brandService.create(brand);
        return ResponseEntity.ok(Mapper.tBrandDTO(brand));
    }
}
