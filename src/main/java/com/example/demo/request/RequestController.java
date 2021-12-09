package com.example.demo.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/request")
public class RequestController {
    private RequestService requestService;

    @Autowired
    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping
    public List<Request> getAllRequests() {
        return requestService.getAllRequests();
    }

    @GetMapping("{id}")
    public Optional<Request> getRequestById(@PathVariable("id") int id) throws Exception {
        return requestService.getRequestById(id);
    }

    @PostMapping
    public void addRequest(@RequestBody Request request) {
        requestService.addRequest(request);
    }

    @PutMapping("{id}")
    public void updateRequest(@PathVariable("id") Integer id, @RequestBody Request request) {requestService.updateRequest(id, request);}

    @DeleteMapping("{id}")
    public void deleteRequest(@PathVariable("id")Integer id){requestService.deleteRequest(id);}
}
