package com.mars.rover;

import com.mars.rover.responses.MarsRoverApiResponse;
import com.mars.rover.responses.ApiResponseRover;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ExampleTest {
    @Test
    public void myTest(){
        RestTemplate rt = new RestTemplate(); //a way to issue get request,etc

        ResponseEntity<MarsRoverApiResponse> response =
                rt.getForEntity("https://api.nasa.gov/planetary/apod?api_key=K6TwZ2FxiXCcxDiZteiYmPXfZVUBuDbVZnsRowKr",
                        MarsRoverApiResponse.class);

        ResponseEntity<ApiResponseRover> response2 =
                rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=2&api_key=K6TwZ2FxiXCcxDiZteiYmPXfZVUBuDbVZnsRowKr",
                        ApiResponseRover.class);

        System.out.println(response2.getBody());
    }
}
