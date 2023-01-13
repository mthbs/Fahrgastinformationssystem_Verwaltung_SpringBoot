package com.maxcim.fahrgastinformationssystem.services.springdatajpa;

import com.maxcim.fahrgastinformationssystem.model.Abfahrt;
import com.maxcim.fahrgastinformationssystem.repositories.AbfahrtRepository;
import com.maxcim.fahrgastinformationssystem.services.AbfahrtService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class AbfahrtSDJpaService implements AbfahrtService {

    private final AbfahrtRepository abfahrtRepository;

    public AbfahrtSDJpaService(AbfahrtRepository abfahrtRepository) {
        this.abfahrtRepository = abfahrtRepository;
    }

    @Override
    public List<Abfahrt> findAll() {
        List<Abfahrt> abfahrten = new ArrayList<>();
        abfahrtRepository.findAll().forEach(abfahrten::add);
        return abfahrten;
    }

    @Override
    public Abfahrt findById(Long aLong) {
        return abfahrtRepository.findById(aLong).orElse(null);
    }

    @Override
    public void delete(Abfahrt object) {
        abfahrtRepository.delete(object);
    }
}
