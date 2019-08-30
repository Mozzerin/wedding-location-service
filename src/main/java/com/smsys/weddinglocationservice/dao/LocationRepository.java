package com.smsys.weddinglocationservice.dao;

import com.smsys.weddinglocationservice.dao.entity.LocationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<LocationEntity, String> {

    LocationEntity findByName(String Name);
}
