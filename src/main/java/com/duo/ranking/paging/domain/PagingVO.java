package com.duo.ranking.paging.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PagingVO {
    private int no;
    private String title;
    private String content;
}