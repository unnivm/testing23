package io.swagger.api;

import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import org.springframework.core.io.Resource;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-12T12:15:47.566700700+05:30[Asia/Calcutta]")
@RestController
public class PetApiController implements PetApi {

    private static final Logger log = LoggerFactory.getLogger(PetApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PetApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addPet(@Parameter(in = ParameterIn.DEFAULT, description = "Pet object that needs to be added to the store", required=true, schema=@Schema()) @Valid @RequestBody Pet body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletePet(@Parameter(in = ParameterIn.PATH, description = "Pet id to delete", required=true, schema=@Schema()) @PathVariable("petId") Long petId,@Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Pet>> findPetsByStatus(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Status values that need to be considered for filter" ,required=true,schema=@Schema(allowableValues={ "available", "pending", "sold" }
)) @Valid @RequestParam(value = "status", required = true) List<String> status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Pet>>(objectMapper.readValue("[ {\r\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\r\n  \"name\" : \"doggie\",\r\n  \"id\" : 0,\r\n  \"category\" : {\r\n    \"name\" : \"name\",\r\n    \"id\" : 6\r\n  },\r\n  \"tags\" : [ {\r\n    \"name\" : \"name\",\r\n    \"id\" : 1\r\n  }, {\r\n    \"name\" : \"name\",\r\n    \"id\" : 1\r\n  } ],\r\n  \"status\" : \"available\"\r\n}, {\r\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\r\n  \"name\" : \"doggie\",\r\n  \"id\" : 0,\r\n  \"category\" : {\r\n    \"name\" : \"name\",\r\n    \"id\" : 6\r\n  },\r\n  \"tags\" : [ {\r\n    \"name\" : \"name\",\r\n    \"id\" : 1\r\n  }, {\r\n    \"name\" : \"name\",\r\n    \"id\" : 1\r\n  } ],\r\n  \"status\" : \"available\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Pet>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Pet>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Pet>> findPetsByTags(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Tags to filter by" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "tags", required = true) List<String> tags) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Pet>>(objectMapper.readValue("[ {\r\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\r\n  \"name\" : \"doggie\",\r\n  \"id\" : 0,\r\n  \"category\" : {\r\n    \"name\" : \"name\",\r\n    \"id\" : 6\r\n  },\r\n  \"tags\" : [ {\r\n    \"name\" : \"name\",\r\n    \"id\" : 1\r\n  }, {\r\n    \"name\" : \"name\",\r\n    \"id\" : 1\r\n  } ],\r\n  \"status\" : \"available\"\r\n}, {\r\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\r\n  \"name\" : \"doggie\",\r\n  \"id\" : 0,\r\n  \"category\" : {\r\n    \"name\" : \"name\",\r\n    \"id\" : 6\r\n  },\r\n  \"tags\" : [ {\r\n    \"name\" : \"name\",\r\n    \"id\" : 1\r\n  }, {\r\n    \"name\" : \"name\",\r\n    \"id\" : 1\r\n  } ],\r\n  \"status\" : \"available\"\r\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Pet>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Pet>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Pet> getPetById(@Parameter(in = ParameterIn.PATH, description = "ID of pet to return", required=true, schema=@Schema()) @PathVariable("petId") Long petId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Pet>(objectMapper.readValue("{\r\n  \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ],\r\n  \"name\" : \"doggie\",\r\n  \"id\" : 0,\r\n  \"category\" : {\r\n    \"name\" : \"name\",\r\n    \"id\" : 6\r\n  },\r\n  \"tags\" : [ {\r\n    \"name\" : \"name\",\r\n    \"id\" : 1\r\n  }, {\r\n    \"name\" : \"name\",\r\n    \"id\" : 1\r\n  } ],\r\n  \"status\" : \"available\"\r\n}", Pet.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Pet>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Pet>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePet(@Parameter(in = ParameterIn.DEFAULT, description = "Pet object that needs to be added to the store", required=true, schema=@Schema()) @Valid @RequestBody Pet body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updatePetWithForm(@Parameter(in = ParameterIn.PATH, description = "ID of pet that needs to be updated", required=true, schema=@Schema()) @PathVariable("petId") Long petId,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="name", required=false)  String name,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> uploadFile(@Parameter(in = ParameterIn.PATH, description = "ID of pet to update", required=true, schema=@Schema()) @PathVariable("petId") Long petId,@Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="additionalMetadata", required=false)  String additionalMetadata,@Parameter(description = "file detail") @Valid @RequestPart("file") MultipartFile file) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{\r\n  \"code\" : 0,\r\n  \"type\" : \"type\",\r\n  \"message\" : \"message\"\r\n}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
