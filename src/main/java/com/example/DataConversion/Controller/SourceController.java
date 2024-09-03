package com.example.DataConversion.Controller;

import com.example.DataConversion.Model.CustomField;
import com.example.DataConversion.Model.SourceData;
import com.example.DataConversion.service.MappingService;
import com.example.DataConversion.service.SourceAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/source")
public class SourceController {

    private final SourceAPIService sourceAPIService;
    private final MappingService mappingService;

    @Autowired
    public SourceController(SourceAPIService sourceAPIService, MappingService mappingService) {
        this.sourceAPIService = sourceAPIService;
        this.mappingService = mappingService;
    }

    // Endpoint to get the current state of the SourceData
    @GetMapping("/getSourceData")
    public SourceData getSourceData() {

        return sourceAPIService.getSourceData();
    }

    // Endpoint to add a custom field
    @PostMapping("/addCustomField")
    public SourceData addCustomField(@RequestBody CustomField customField) {
        sourceAPIService.addCustomField(customField);
        return sourceAPIService.getSourceData();
    }

    // Endpoint to update a specific field in the SourceData
    @PostMapping("/updateSourceField")
    public SourceData updateSourceField(@RequestParam String fieldName, @RequestParam Object value) {
        sourceAPIService.updateSourceField(fieldName, value);
        return sourceAPIService.getSourceData();
    }

    // Endpoint to convert SourceData to the destination format
    @GetMapping("/convertToDestination")
    public Object convertToDestination() {
        SourceData sourceData = sourceAPIService.getSourceData();
        return mappingService.convertSourceToDestination(sourceData);
    }
}


