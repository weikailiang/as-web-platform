package com.kleng.aspoj.mapper;

import com.kleng.aspoj.entity.CityEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityMapper {
    List<CityEntity> getCities();
}
