package com.smsys.weddinglocationservice.service;

import com.smsys.weddinglocationservice.model.Location;
import com.smsys.weddinglocationservice.model.NewLocation;

public interface LocationService {

    Location addLocation(NewLocation newLocation);
}
