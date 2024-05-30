package com.example.pr14.controllers;

import com.example.pr14.entities.Manufacture;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/manufactures")
public class ManufactureController {
    public static Map<String, Manufacture> manufactureMap = new HashMap<>();

    @RequestMapping("/create")
    @ResponseBody
    public Manufacture createManufacture(
            @RequestParam(name="name", required=false, defaultValue = "DefaultName") String name,
            @RequestParam(name="address", required=false, defaultValue = "DefaultAddress") String address) {
        Manufacture manufacture = new Manufacture();
        manufacture.setName(name);
        manufacture.setAddress(address);
        manufactureMap.put(name + address, manufacture);
        return manufacture;
    }

    // localhost:8080/manufactures/create?name=Factory1&address=Address1

    @RequestMapping("/get-all")
    @ResponseBody
    public List<Manufacture> getAllManufactures() {
        return new ArrayList<>(manufactureMap.values());
    }

    // localhost:8080/manufactures/get-all

    @RequestMapping("/delete")
    @ResponseBody
    public List<Manufacture> deleteManufacture(
            @RequestParam(name="name", required=true) String name,
            @RequestParam(name="address", required=true) String address) {
        manufactureMap.remove(name + address);
        return new ArrayList<>(manufactureMap.values());
    }

    // localhost:8080/manufactures/delete?name=Factory1&address=Address1
}
