package com.example.pr14.controllers;

import com.example.pr14.entities.Worker;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/workers")
public class WorkerController {
    public static Map<String, Worker> workerMap = new HashMap<>();

    @RequestMapping("/create")
    @ResponseBody
    public Worker createWorker(
            @RequestParam(name="firstName", required=false, defaultValue = "John") String firstName,
            @RequestParam(name="lastName", required=false, defaultValue = "Doe") String lastName,
            @RequestParam(name="middleName", required=false, defaultValue = "Smith") String middleName) {
        Worker worker = new Worker();
        worker.setFirstName(firstName);
        worker.setLastName(lastName);
        worker.setMiddleName(middleName);
        workerMap.put(firstName + lastName + middleName, worker);
        return worker;
    }

    // localhost:8080/workers/create?firstName=Ivan&lastName=Ivanov&middleName=Ivanovich

    @RequestMapping("/get-all")
    @ResponseBody
    public List<Worker> getAllWorkers() {
        return new ArrayList<>(workerMap.values());
    }

    // localhost:8080/workers/get-all

    @RequestMapping("/delete")
    @ResponseBody
    public List<Worker> deleteWorker(
            @RequestParam(name="firstName", required=true) String firstName,
            @RequestParam(name="lastName", required=true) String lastName,
            @RequestParam(name="middleName", required=true) String middleName) {
        workerMap.remove(firstName + lastName + middleName);
        return new ArrayList<>(workerMap.values());
    }

    // localhost:8080/workers/delete?firstName=Ivan&lastName=Ivanov&middleName=Ivanovich
}
