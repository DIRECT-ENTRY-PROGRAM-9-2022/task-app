package lk.ijse.dep9.app.service.custom;

import lk.ijse.dep9.app.dto.ProjectDTO;

import java.util.List;

public interface ProjectTaskService {
    List<ProjectDTO> getAllProjects(String username);

    ProjectDTO getProjectDetails(String username, int projectId);

    void renameProject(ProjectDTO project);

    void deleteProject(String username, int projectId);

    ProjectDTO createNewProject(ProjectDTO projectDTO);
}
