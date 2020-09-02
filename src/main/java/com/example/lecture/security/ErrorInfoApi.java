package com.example.lecture.security;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ErrorInfoApi implements Serializable {
    private final List<DetailErrorInfoApi> details =
            new ArrayList<DetailErrorInfoApi>();

    private String message;

    public void addDetailInfo(String target, String message) {
        details.add(new DetailErrorInfoApi(target, message));
    }

    public List<DetailErrorInfoApi> getDetails() {
        return details;
    }
}