package com.example.demo.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequestService {
    private RequestDAO requestDAO;

    @Autowired
    public RequestService(@Qualifier("requests")RequestDAO requestDAO){
        this.requestDAO = requestDAO;

    }

    public List<Request> getAllRequests() {
        return requestDAO.selectAllRequests();
    }

    public Optional<Request> getRequestByPostId(int id) throws Exception {
        if (requestDAO.selectRequestByPostId(id).isEmpty()){
            throw new Exception("Request with the id " + id + " not found");
        }
        return requestDAO.selectRequestByPostId(id);
    }

    public Optional<Request> getRequestById(int id) throws Exception {
        if (requestDAO.selectRequestById(id).isEmpty()){
            throw new Exception("Request with the id " + id + " not found");
        }
        return requestDAO.selectRequestById(id);
    }

    public void addRequest(Request request) {
        requestDAO.addRequest(request);
    }

    public void deleteRequest(int id) {requestDAO.deleteRequest(id);}

    public void updateRequest(Integer id, Request request){requestDAO.updateRequest(id, request);}

}

