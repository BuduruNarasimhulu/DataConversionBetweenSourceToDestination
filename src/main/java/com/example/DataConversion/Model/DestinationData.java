package com.example.DataConversion.Model;
import lombok.Data;


import java.time.LocalDateTime;
import java.util.Map;
@Data
public class DestinationData {
    private String id;
    private Map<String, String> properties;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean archived;
}
