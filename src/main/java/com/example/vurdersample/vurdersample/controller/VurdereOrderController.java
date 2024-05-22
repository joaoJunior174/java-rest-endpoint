package com.example.vurdersample.vurdersample.controller;

import com.example.vurdersample.vurdersample.dto.OrderDto;
import org.apache.coyote.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/vurdere/sample")
public class VurdereOrderController {

    @PostMapping
    public ResponseEntity<String> receiveOrder(@RequestBody OrderDto order) {
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        int seed = (int)(Math.random() * range) + min;
        return ResponseEntity.badRequest().body("A odd number was sorted");
//        if (seed % 2 == 0) {
//            return ResponseEntity.badRequest().body("A odd number was sorted");
//        }
//
//        return ResponseEntity.ok().body("A request foi processada com sucesso");

    }

}
