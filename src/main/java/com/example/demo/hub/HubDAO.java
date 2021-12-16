package com.example.demo.hub;

import java.util.List;
import java.util.Optional;

public interface HubDAO {

    List<Hub> selectAllHubs();

    Optional<Hub> selectHubById(Integer id);

    int addHub(Hub hub);

    int deleteHub(int id);

    int updateHub(Integer id, Hub hub);
}