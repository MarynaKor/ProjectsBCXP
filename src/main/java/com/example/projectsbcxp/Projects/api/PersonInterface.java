package com.example.projectsbcxp.Projects.api;
import com.example.projectsbcxp.Projects.api.to.PersonInProjectTO;
import com.example.projectsbcxp.Projects.impl.data.entities.PersonEntity;

import java.util.List;

public interface PersonInterface {
    List<PersonInProjectTO> getActivePersons();
}
