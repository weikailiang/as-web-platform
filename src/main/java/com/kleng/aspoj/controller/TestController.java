package com.kleng.aspoj.controller;

import com.kleng.aspoj.entity.ResponseEntity;
import com.kleng.aspoj.util.AESUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class TestController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Object hello() {
        return "hello1";
    }

    @ApiOperation(value = "加密")
    @RequestMapping(value = "/encrypt", method = RequestMethod.POST)
    public ResponseEntity encrypt(@RequestParam(value = "content") @ApiParam("content") String content
            , @RequestParam(value = "clientSecret") @ApiParam("clientSecret") String clientSecret) {
        return ResponseEntity.success(AESUtil.encrypt(content,clientSecret));
    }
    @ApiOperation(value = "加密")
    @RequestMapping(value = "/decrypt", method = RequestMethod.POST)
    public ResponseEntity decrypt(@RequestParam(value = "cryptograph") @ApiParam("cryptograph") String cryptograph
            , @RequestParam(value = "password") @ApiParam("password") String password) {
        return ResponseEntity.success(AESUtil.encrypt(cryptograph,password));
    }
}
