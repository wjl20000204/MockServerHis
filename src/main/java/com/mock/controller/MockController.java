package com.mock.controller;

import com.mock.bean.ResponseBodyData;
import com.mock.bean.RequestBodyData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/his")
public class MockController  {

    @PostMapping("/dignostic")
    public ResponseEntity<Object> handleDignosisRequest(@RequestBody RequestBodyData requestBodyData) {
        // 检查请求中的诊断代码是否为指定的值
        if ("123456789".equals(requestBodyData.getDignosticCode())) {
            // 如果是指定的诊断代码，返回指定的响应
            ResponseBodyData responseBodyData = new ResponseBodyData();
            responseBodyData.setName("卡带名");
            responseBodyData.setPregnantCode("341282199912106832");
            responseBodyData.setOvulationDate("2024-04-03");
            responseBodyData.setDignosticCode(requestBodyData.getDignosticCode());
            return ResponseEntity.ok(responseBodyData.toString());
        } else {
            // 如果不是指定的诊断代码，返回错误响应
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid dignostic code");
        }
    }
}
