package com.smsys.weddinglocationservice.service.impl;

import com.smsys.weddinglocationservice.dao.LocationRepository;
import com.smsys.weddinglocationservice.dao.entity.LocationEntity;
import com.smsys.weddinglocationservice.mapper.LocationMapper;
import com.smsys.weddinglocationservice.model.Location;
import com.smsys.weddinglocationservice.model.NewLocation;
import com.smsys.weddinglocationservice.service.LocationService;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;
    private final LocationMapper locationMapper;

    public LocationServiceImpl(LocationRepository locationRepository, LocationMapper locationMapper) {
        this.locationRepository = locationRepository;
        this.locationMapper = locationMapper;
    }

    @Override
    public Location addLocation(NewLocation newLocation) {
        LocationEntity locationEntity = locationRepository.save(locationMapper.newLocationToLocationEntity(newLocation));
        return locationMapper.locationEntityToLocation(locationEntity);

    }
}
