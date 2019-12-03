package com.lucifiere.scd.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MetaInfoService {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/meta/{serviceId}")
    public String printServiceMetaInfo(@PathVariable("serviceId") String serviceId) {
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
        return JSON.toJSONString(instances, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue,
                SerializerFeature.WriteDateUseDateFormat);
    }

}