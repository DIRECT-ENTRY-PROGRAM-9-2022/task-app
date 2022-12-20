package lk.ijse.dep9.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task implements SuperEntity{
    private  int id;
    private String content;
    private Status status;
    private Project projectId;


    public Task(String content, Status status, Project project) {
        this.content = content;
        this.status = status;
        this.projectId = project;
    }

    public static enum Status{
        COMPLETED, NOT_COMPLETED
    }
}
