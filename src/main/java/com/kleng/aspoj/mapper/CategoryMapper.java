package com.kleng.aspoj.mapper;


import com.kleng.aspoj.entity.CategoryEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper {
    List<CategoryEntity> getCategoryList(int pageIndex, int pageSize);

    void addCategory(String categoryName, String createTime);

    void removeCategory(String id);
}
