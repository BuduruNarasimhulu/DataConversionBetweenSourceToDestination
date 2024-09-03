package com.example.DataConversion.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Contact {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String homePhone;
    private String workPhone;
    private String mobilePhone;
    private String role;
}
