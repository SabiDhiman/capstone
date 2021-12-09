package com.example.demo.request;

import java.util.List;
import java.util.Optional;

public interface RequestDAO {

    List<Request> selectAllRequests();

    Optional<Request> selectRequestById(Integer id);

    int addRequest(Request request);

    int deleteRequest(int id);

    int updateRequest(Integer id, Request request);
}
