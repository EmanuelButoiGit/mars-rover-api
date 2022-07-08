package com.mars.rover.services;

import com.mars.rover.responses.ApiResponseRover;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsRoverApiService {
    public ApiResponseRover getRoverData(String roverType){
        RestTemplate rt = new RestTemplate(); //a way to issue get request,etc
        ResponseEntity<ApiResponseRover> response =
                rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/"+roverType+"/photos?sol=2&api_key=K6TwZ2FxiXCcxDiZteiYmPXfZVUBuDbVZnsRowKr",
                        ApiResponseRover.class);

        return response.getBody();
    }

    /*public MarsRoverApiResponse getRoverData(){
        RestTemplate rt = new RestTemplate(); //a way to issue get request,etc

        ResponseEntity<MarsRoverApiResponse> response =
                rt.getForEntity("https://api.nasa.gov/planetary/apod?api_key=K6TwZ2FxiXCcxDiZteiYmPXfZVUBuDbVZnsRowKr",
                        MarsRoverApiResponse.class);

        return response.getBody();
    }*/
}
