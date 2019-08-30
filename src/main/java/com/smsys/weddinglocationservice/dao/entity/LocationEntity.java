package com.smsys.weddinglocationservice.dao.entity;

import com.smsys.weddinglocationservice.model.Address;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.core.io.Resource;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document(collection = "Locations")
public class LocationEntity {
    @Id
    private String id;

    private String name;

    private Address address;

    private String shortDescription;

    private String longDescription;

    private List<Resource> photos;

    private Integer rating;

    private ZonedDateTime time;

}
