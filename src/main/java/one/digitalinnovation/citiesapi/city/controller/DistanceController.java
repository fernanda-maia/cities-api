package one.digitalinnovation.citiesapi.city.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.citiesapi.city.service.DistanceService;


@RestController
@RequestMapping(path = "/distance")
public class DistanceController {

    @Autowired
    private DistanceService service;

    @GetMapping(path = "/by-points")
    public ResponseEntity<Double> calculateByPoints(@RequestParam(name = "from") Long origin,
                                            @RequestParam(name = "to") Long destination) {

        return ResponseEntity.ok()
                .body(service.calculateByPoints(origin, destination));
    }

    @GetMapping(path = "/by-cube")
    public ResponseEntity<Double> calculateByCube(@RequestParam("from") Long origin,
                                  @RequestParam("to") Long destination) {

        return ResponseEntity.ok()
                .body(service.calculateByCube(origin, destination));
    }
}
