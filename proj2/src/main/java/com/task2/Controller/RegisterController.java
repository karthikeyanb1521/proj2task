package com.task2.Controller;

import com.task2.Entity.Register;
import com.task2.Entity.Walletbalance;
import com.task2.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @RequestMapping(method = RequestMethod.POST, value = "/detail")
    public String addDetail(@RequestBody Register register){
        registerService.addDetail(register);
        return "Added Successfully";
    }
    @RequestMapping(method = RequestMethod.GET,value = "/detail/{id}")
    public Register getDetail(@PathVariable String id){
        return registerService.getDetail(id);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/balance/{id}")
    public Walletbalance getBalance(@PathVariable String id){
        return registerService.getBalance(id);
    }


    //@RequestMapping(method = RequestMethod.POST, value = "/kit")
    //public String addKit(@RequestBody Kitinfo kitinfo){
    // registerService.addKit(kitinfo);
    //return "Added Successfully";
    //}



}
