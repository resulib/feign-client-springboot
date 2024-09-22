package com.resul.feignclient.yts;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class YtsMovie {
    private Long id;
    private String title;
    private String year;
    private String rating;
    private String duration;
    private List<String> genres;

}