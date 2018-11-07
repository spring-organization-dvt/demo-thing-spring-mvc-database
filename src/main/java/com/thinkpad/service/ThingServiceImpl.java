package com.thinkpad.service;

import com.thinkpad.model.Thing;
import com.thinkpad.repository.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ThingServiceImpl implements ThingService {

    @Autowired
    private ThingRepository thingRepository;
    @Override
    public Thing findById(int id) {
        return thingRepository.findById(id);
    }
}
