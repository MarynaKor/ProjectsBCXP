package com.example.projectsbcxp.Projects.api.to;
import lombok.Builder;

@Builder(toBuilder = true)
public record PersonTO(Integer id,
                      String name,
                      String title) {
}
