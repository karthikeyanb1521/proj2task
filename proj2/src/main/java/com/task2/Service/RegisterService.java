package com.task2.Service;

import com.task2.Entity.Kitinfo;
import com.task2.Entity.Register;
import com.task2.Entity.Walletbalance;
import com.task2.Repo.KitinfoRepo;
import com.task2.Repo.RegisterRepo;
import com.task2.Repo.WalletBalanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    @Autowired
    RegisterRepo registerRepo;
    @Autowired
    WalletBalanceRepo walletBalanceRepo;

    public void addDetail(Register register){
        registerRepo.save(register);
    }
    public Register getDetail(String id){
        return registerRepo.findById(id).get();
    }
    public Walletbalance getBalance(String id){
        return walletBalanceRepo.findById(id).get();
    }

    //public void addKit(Kitinfo kitinfo){
        //kitinfoRepo.save(kitinfo);
    //}


}
