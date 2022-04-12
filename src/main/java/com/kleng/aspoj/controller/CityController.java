package com.kleng.aspoj.controller;

import com.kleng.aspoj.entity.CityEntity;
import com.kleng.aspoj.entity.ResponseEntity;
import com.kleng.aspoj.service.CityService;
import com.kleng.aspoj.util.DataUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
@Api(tags = {"City"})
public class CityController {
    @Autowired
    private CityService mService;

    @ApiOperation(value = "获取城市列表")
    @RequestMapping(value = "/cities", method = RequestMethod.GET)
    public ResponseEntity getCities() {
        List<CityEntity> list = mService.getCities();
        return ResponseEntity.success(DataUtil.getPageData(list));
    }
    @ApiOperation(value = "加密")
    @RequestMapping(value = "/encrypt", method = RequestMethod.GET)
    public ResponseEntity encrypt() {
        return ResponseEntity.success("访问成功");
    }
}
