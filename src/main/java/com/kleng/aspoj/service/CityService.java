package com.kleng.aspoj.service;

import com.kleng.aspoj.entity.CityEntity;
import com.kleng.aspoj.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityService {
    @Autowired
    private CityMapper mMapper;
    public List<CityEntity> getCities(){
        return mMapper.getCities();
    }
}
