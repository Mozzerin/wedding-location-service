package com.smsys.weddinglocationservice.controller;

import com.smsys.weddinglocationservice.api.LocationsApi;
import com.smsys.weddinglocationservice.model.Location;
import com.smsys.weddinglocationservice.model.NewLocation;
import com.smsys.weddinglocationservice.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LocationController implements LocationsApi {

    @Autowired
    LocationService locationService;

    @Override
    public ResponseEntity<Location> postLocation(@Valid NewLocation newLocation) {
        return ResponseEntity.status(HttpStatus.CREATED).body(locationService.addLocation(newLocation));
    }

    public ResponseEntity<Void> deleteLocation(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Location> findLocationById(Long id) {
        return new ResponseEntity<>(new Location(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Location>> findLocations(@Valid Integer limit) {
        return null;
    }
}
