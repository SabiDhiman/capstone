package com.example.demo.hub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hub")
public class HubController {

    private HubService hubService;

    @Autowired
    public HubController(HubService hubService) {
        this.hubService = hubService;
    }

    @GetMapping
    public List<Hub> getAllHubs() {
        return hubService.getAllHubs();
    }

    @GetMapping("{id}")
    public Optional<Hub> getHubById(@PathVariable("id") int id) throws Exception {
        return hubService.getHubById(id);
    }

    @PostMapping
    public void createHub(@RequestBody Hub hub) {
        hubService.createHub(hub);
    }

    @DeleteMapping("{id}")
    public void deleteHub(@PathVariable("id") @RequestBody Integer id) {
        hubService.deleteHub(id);
    }

    @PutMapping("{id}")
    public void updateHub(@PathVariable("id") Integer id, @RequestBody Hub hub) {
        hubService.updateHub(id, hub);
    }
}
