package com.example.projectsbcxp.Projects.api.to;
import lombok.Builder;

import java.sql.Timestamp;

/**
 * TODO
 *
 * @param id
 */
    @Builder
    public record ProjectsTO(Integer id,
                             String title,
                             String description,
                             Timestamp starting_at) {
}





