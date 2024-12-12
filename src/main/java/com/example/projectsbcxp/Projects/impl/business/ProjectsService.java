package com.example.projectsbcxp.Projects.impl.business;
import com.example.projectsbcxp.Projects.api.ProjectInterface;
import com.example.projectsbcxp.Projects.api.to.ProjectsTO;
import com.example.projectsbcxp.Projects.impl.data.repository.ProjectRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * Implementierung der ProjektService Methoden.
 */
@Service
@AllArgsConstructor
@Slf4j
public class ProjectsService implements ProjectInterface {
    private ProjectRepository projectRepository;
    private ProjectsMapper projectsMapper;
    /**
     * Liefert die Liste aller Projekt Daten der Datenbank.
     *
     * @return Liste aller gefundenen Zeilen, sonst leere Liste
     */
    @Override
    public List<ProjectsTO> getActiveProjects() {
        return projectRepository.findAll()
                .stream()
                .map(projectsMapper::fromEntity)
                .toList();
    }

    public ProjectsTO addProject(ProjectsTO projectsTO) {

    }
}
