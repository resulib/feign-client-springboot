package com.resul.feignclient.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class MovieDto {
    private Long id;
    private String title;
    private String year;
    private String rating;
    private int duration;
    List<String> genres;
}
