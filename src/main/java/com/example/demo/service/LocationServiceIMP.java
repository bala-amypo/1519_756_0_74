package com.example.demo.service;




public class LocationServiceIMP implements LocationService {
    @Autowired
    LocationRepository Locationrepo;
    @overide
    public LocationEntity createlocation(LocationEntity le){

        return Locationrepo.save(le); 
    }  
    public List getalllocation(LocationEntity le)


}