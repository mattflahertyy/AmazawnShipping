package com.backend.Controllers;

import com.backend.Entities.Structures.TrackingData;
import com.backend.Entities.Structures.TrackingInfo;
import com.backend.Services.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/tracking")

public class TrackingController {

    @Autowired
    private LogisticsService logisticsService;

    @PostMapping("/trackShipment")
    public TrackingData trackShipment(@RequestBody TrackingInfo t) {return logisticsService.getShipmentLocation(t);}

    @GetMapping("/getShipment")
    public UUID getAllShipmentIDs () {
        return logisticsService.getShipment();
    }
}
