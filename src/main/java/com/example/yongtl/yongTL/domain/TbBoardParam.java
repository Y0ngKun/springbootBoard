package com.example.yongtl.yongTL.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TbBoardParam {
    private int id;
    private String writer;
    private String title;
    private String content;

}
