package com.Mobiquity.Rakesh.ATM.service;


import com.Mobiquity.Rakesh.ATM.VO.Address;
import com.Mobiquity.Rakesh.ATM.VO.Atm;
import com.Mobiquity.Rakesh.ATM.VO.ResponseAddress;
import com.Mobiquity.Rakesh.ATM.exception.NoAtmFound;
import com.Mobiquity.Rakesh.ATM.util.AtmWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class AtmLocationService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    AtmWrapper atmWrapper;

    @Value("${atm.locator.api.url}")
    private String atmLocatorApiUrl;

    public List<String> getAllAtmsByCity() throws JsonProcessingException {

        log.info("Inside getAllAtmsByCity Method of AtmLocationService ");
        List<String> cityList = Arrays.stream(atmWrapper.getAllAtms(atmLocatorApiUrl)).map( stm -> stm.getAddress().getCity()).distinct().collect(Collectors.toList());
        return cityList;
    }


    public List<Atm> getAtmsAddressByCity(String city) throws JsonProcessingException {
        log.info("Inside getAtmsAddressByCity Method of AtmLocationService ");
        List<Atm> atmList =  Arrays.stream(atmWrapper.getAllAtms(atmLocatorApiUrl)).filter(atm -> atm.getAddress().getCity().equals(city)).collect(Collectors.toList());
        return atmList;
    }

    public List<Address> getAtmsAddress() throws JsonProcessingException {
        log.info("Inside getAtmsAddress Method of AtmLocationService ");
        List<Address> addressList =  Arrays.stream(atmWrapper.getAllAtms(atmLocatorApiUrl)).map( stm -> stm.getAddress()).collect(Collectors.toList());
        return addressList;
    }
}
