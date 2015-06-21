package com.va.datalist.web;

import com.va.datalist.domain.Data;
import com.va.datalist.service.DataListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by hectar on 20/06/15.
 */
@RestController
public class DataListServiceController {

    @Autowired
    private DataListService dataListService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }


    @RequestMapping("/datalist")
    @ResponseBody
    public Iterable<Data> getDataList() {
        return dataListService.getData();
    }


}
