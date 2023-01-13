package com.maxcim.fahrgastinformationssystem.bootstrap;

import com.maxcim.fahrgastinformationssystem.model.Abfahrt;
import com.maxcim.fahrgastinformationssystem.services.AbfahrtService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final AbfahrtService abfahrtService;

    public DataLoader(AbfahrtService abfahrtService) {
        this.abfahrtService = abfahrtService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("------------------Bootstrap-Klasse:\n");
        Abfahrt abfahrt1 = abfahrtService.findById(614L);
        System.out.println(abfahrt1.toString());
    }
}
