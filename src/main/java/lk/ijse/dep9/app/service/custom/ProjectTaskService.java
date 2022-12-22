package lk.ijse.dep9.app.service.custom;

import lk.ijse.dep9.app.dto.ProjectDTO;
import lk.ijse.dep9.app.dto.TaskDTO;

import java.util.List;

public interface ProjectTaskService {
    List<ProjectDTO> getAllProjects(String username);

    ProjectDTO getProjectDetails(String username, int projectId);

    void renameProject(ProjectDTO project);

    void deleteProject(String username, int projectId);

    ProjectDTO createNewProject(ProjectDTO projectDTO);

    TaskDTO createNewTask(String username, TaskDTO task);

    void renameTask(String username, TaskDTO task);

    void deleteTask(String username, TaskDTO taskDTO);

    TaskDTO getTaskDetails(String username, TaskDTO taskDTO);

    List<TaskDTO> getAllTasks(String username, int projectId);

    void updateTaskStatus(String username, TaskDTO taskDTO, boolean completed);

}
