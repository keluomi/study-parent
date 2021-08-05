package com.lion.getway.autoconfig;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

@Component
public class LionRestTemplate extends RestTemplate {

    @Resource
    private DiscoveryClient discoveryClient;


    private String chooseOneService(){
        List<InstanceInfo> list = discoveryClient.getInstancesById("eureka-goods");
        for (InstanceInfo info: list){
            System.out.println(info.getIPAddr() + "::" + info.getPort());
        }

        return null;
    }

    @Override
    protected <T> T doExecute(URI url, HttpMethod method, RequestCallback requestCallback, ResponseExtractor<T> responseExtractor) throws RestClientException {
        return super.doExecute(url, method, requestCallback, responseExtractor);
    }
}
