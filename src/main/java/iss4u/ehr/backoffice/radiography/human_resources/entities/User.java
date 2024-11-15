package iss4u.ehr.backoffice.radiography.human_resources.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import iss4u.ehr.backoffice.radiography.entities.Notification;
import iss4u.ehr.backoffice.radiography.entities.Task;
import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "User")
public class User {
    @Id

    @Column(name="User_Ky", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userKy;

    @Lob
    @Column(name="User_Image")
    private String userImage;

    @Column(name="Last_Name", nullable=true)
    private String lastName;

    @Column(name="First_Name", nullable=true)
    private String firstName;

    @Column(name="User_Name", nullable=true, unique = true)
    private String userName;

    @Column(name="User_Password", nullable=true)
    private String userPassword;

    @Column(name="User_Id", nullable=true, unique = true) // unique identifier (ssn)
    private String userId ;

    @Column(name="Maiden_Name")
    private String maidenName;

    @Column(name="Birth_Date", nullable=true)
    private Date birthDate;

    @Column(name="Gender", nullable=true)
    private String gender;

    @Column(name="civil_status", nullable=true)
    private String cvlStatus;

    @Column(name="nationality")
    private String nationality;

    @Column(name="User_Role", nullable=true)
    private String userRole;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="User_UnxTmCrt", nullable=true)
    private Date userUnxTmCrt ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="User_UnxTmUpdt", nullable=true)
    private Date userUnxTmUpdt;

    @Column(name="User_RcrdSts", nullable=true)
    private Integer userRcrdSts ;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Task> tasks ;

    // Define a relationship between User and Notification
    @JsonIgnore
    @OneToMany(mappedBy = "recipient", cascade = CascadeType.ALL)
    private List<Notification> notifications;

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMaidenName() {
		return maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCvlStatus() {
		return cvlStatus;
	}

	public void setCvlStatus(String cvlStatus) {
		this.cvlStatus = cvlStatus;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Date getUserUnxTmCrt() {
		return userUnxTmCrt;
	}

	public void setUserUnxTmCrt(Date userUnxTmCrt) {
		this.userUnxTmCrt = userUnxTmCrt;
	}

	public Date getUserUnxTmUpdt() {
		return userUnxTmUpdt;
	}

	public void setUserUnxTmUpdt(Date userUnxTmUpdt) {
		this.userUnxTmUpdt = userUnxTmUpdt;
	}

	public Integer getUserRcrdSts() {
		return userRcrdSts;
	}

	public void setUserRcrdSts(Integer userRcrdSts) {
		this.userRcrdSts = userRcrdSts;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public Long getUserKy() {
		return userKy;
	}

	public void setUserKy(Long userKy) {
		this.userKy = userKy;
	}
    
	
    
}
