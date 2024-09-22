package com.resul.feignclient.service;

import com.resul.feignclient.yts.YtsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "ytsClient", url = "https://yts.mx/api/v2/")
public interface MovieServiceClient {

    @GetMapping("/list_movies.json")
    YtsResponse getMovies(@RequestParam("limit") Long limit);
}
