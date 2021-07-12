package com.Mobiquity.Rakesh.ATM.controller;

import com.Mobiquity.Rakesh.ATM.VO.Address;
import com.Mobiquity.Rakesh.ATM.VO.Atm;
import com.Mobiquity.Rakesh.ATM.service.AtmLocationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/getATMDutch")
@Slf4j
public class ATMController {

    @Autowired
    private AtmLocationService atmService ;

    @GetMapping(path= "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<String> getAllAtmsByCity() throws IOException {
        log.info("Inside getAllAtmsByCity Method of ATMController ");
        return atmService.getAllAtmsByCity();
    }

    @GetMapping(path= "/{city}",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Atm> getAtmsAddressByCity(@PathVariable String city) throws IOException {
        log.info("Inside getAtmsAddressByCity Method of ATMController ");
        return atmService.getAtmsAddressByCity(city);
    }

    @GetMapping(path= "/address/",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Address> getAtmsAddress() throws IOException {
        log.info("Inside getAtmsAddress Method of ATMController ");
        return atmService.getAtmsAddress();
    }


}
