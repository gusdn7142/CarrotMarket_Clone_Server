package com.example.demo.src.product.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

// ์ํ ์กฐํ model
@Getter
@Setter
@AllArgsConstructor
public class GetProductListReq {
    private int userIdx;
    private String regionName;
}
