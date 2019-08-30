package com.smsys.weddinglocationservice.mapper;

import com.smsys.weddinglocationservice.dao.entity.LocationEntity;
import com.smsys.weddinglocationservice.model.Location;
import com.smsys.weddinglocationservice.model.NewLocation;
import org.mapstruct.Mapper;

@Mapper
public interface LocationMapper {

    Location locationEntityToLocation(LocationEntity locationEntity);

    LocationEntity newLocationToLocationEntity(NewLocation newLocation);
}
