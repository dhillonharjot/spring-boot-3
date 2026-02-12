package com.example.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class studentDTO {
    private Long id;
    private String name;
    private String email;

}
