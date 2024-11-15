package iss4u.ehr.backoffice.radiography.entities;

import iss4u.ehr.backoffice.radiography.human_resources.entities.Staff;
import iss4u.ehr.backoffice.radiography.human_resources.entities.User;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "Task")
public class Task {
    @Id

    @Column(name="Task_Ky", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskKy;

    @Column(name="Task_Title", nullable=false)
    private String taskTitle;

    @Column(name="Is_Complete", nullable=false)
    private Boolean isComplete;

    @Column(name="Task_Priority", nullable=false)
    private String taskPriority;

    @Column(name="Due_Date", nullable=false)
    private String dueDate;

    @Column(name="Event_Details")
    private String eventDetails;


    @ManyToOne
    @JoinColumn(name = "Owner_Ky")
    private User user; // owner

    @ManyToOne
    @JoinColumn(name = "AssignedTo_Ky")
    private Staff assignedTo; // RfrntPhysic or PrfrmngPhysic or secretary

	public String getTaskTitle() {
		return taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	public Boolean getIsComplete() {
		return isComplete;
	}

	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}

	public String getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(String taskPriority) {
		this.taskPriority = taskPriority;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getEventDetails() {
		return eventDetails;
	}

	public void setEventDetails(String eventDetails) {
		this.eventDetails = eventDetails;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Staff getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(Staff assignedTo) {
		this.assignedTo = assignedTo;
	}

	public Long getTaskKy() {
		return taskKy;
	}

	public void setTaskKy(Long taskKy) {
		this.taskKy = taskKy;
	}

    
    
}
