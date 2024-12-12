package com.example.projectsbcxp.Projects.api.to;
import lombok.Builder;

/**
 * TODO
 *
 * @param id
 */
    @Builder
    public record ProjectsTO(Integer id,
                             String title,
                             String description) {
}





