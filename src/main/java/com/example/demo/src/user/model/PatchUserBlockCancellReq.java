package com.example.demo.src.user.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor


public class PatchUserBlockCancellReq {
    private int userIdx;
    private String blockCancellNickName;

}