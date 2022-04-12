package com.kleng.aspoj.mapper;

import com.kleng.aspoj.hiconfig.HiConfigModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HiConfigMapper {
    List<HiConfigModel> getConfig(String namespace);

    List<HiConfigModel> getAllConfig();

    void saveConfig(HiConfigModel model);
}
