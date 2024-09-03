package com.example.DataConversion.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomField {
    private String fieldName;
    private String value;
    private String dataType;
    private long definitionID;
}
