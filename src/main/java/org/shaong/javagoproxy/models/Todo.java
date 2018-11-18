package org.shaong.javagoproxy.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Todo {
    private Integer userId;
    private Integer id;
    private String title;
    private Boolean completed;
}
