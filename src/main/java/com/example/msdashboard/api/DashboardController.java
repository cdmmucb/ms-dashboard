package com.example.msdashboard.api;

import com.example.msdashboard.dao.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/dashboard")
public class DashboardController {
   /* private DashboardRepository dashboardRepository;

    @Autowired
    private DashboardController(DashboardRepository dashboardRepository) {
        this.dashboardRepository = dashboardRepository;
    }*/

    @RequestMapping(value = "/prendassinstock", method = RequestMethod.GET)
    public ResponseEntity<Integer> getPrendasSinStock() {
        //Integer a = dashboardRepository.getPrendasSinStock();
        return new ResponseEntity<>(1, HttpStatus.OK);
    }

    @RequestMapping(value = "/prendasconstock", method = RequestMethod.GET)
    public ResponseEntity<Integer> getPrendasConStock() {
        //Integer a = dashboardRepository.getPrendasConStock();
        return new ResponseEntity<>(2, HttpStatus.OK);
    }

    @RequestMapping(value = "/prendasporcategoria", method = RequestMethod.GET)
    public ResponseEntity<List<Integer>> getPrendasPorCategoria() {
        //<Integer> a = dashboardRepository.getPrendasPorCategoria();
        List<Integer> a = new ArrayList<Integer>();
        a.add(3);
        a.add(4);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }

    @RequestMapping(value = "/prendasmes", method = RequestMethod.GET)
    public ResponseEntity<Integer> getPrendasMes() {
        //Integer a = dashboardRepository.getPrendasMes();
        return new ResponseEntity<>(5, HttpStatus.OK);
    }

    @RequestMapping(value = "/ordenesmes", method = RequestMethod.GET)
    public ResponseEntity<Integer> getOrdenesMes() {
        //Integer a = dashboardRepository.getOrdenesMes();
        return new ResponseEntity<>(6, HttpStatus.OK);
    }

    @RequestMapping(value = "/montomes", method = RequestMethod.GET)
    public ResponseEntity<Float> getMontoMes() {
        //Float a = dashboardRepository.getMontoMes();
        return new ResponseEntity<>(7.1f, HttpStatus.OK);
    }

    @RequestMapping(value = "/cantidadprendasmes", method = RequestMethod.GET)
    public ResponseEntity<Integer> getCantidadPrendasMes() {
        //Integer a = dashboardRepository.getCantidadPrendasMes();
        return new ResponseEntity<>(8, HttpStatus.OK);
    }
}