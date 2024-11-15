package iss4u.ehr.backoffice.radiography.human_resources.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import iss4u.ehr.backoffice.radiography.entities.Notification;
import iss4u.ehr.backoffice.radiography.entities.Study;
import iss4u.ehr.backoffice.radiography.entities.Task;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "PrfrmngPhysic")
public class PrfrmngPhysic extends Staff {
    @Id
    @Column(name="User_Ky", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userKy;

    @Lob
    @Column(name="User_Image", nullable=false)
    private String userImage;

    @Column(name="Last_Name", nullable=false)
    private String lastName;

    @Column(name="First_Name", nullable=false)
    private String firstName;

    @Column(name="User_Name", nullable=false, unique = true)
    private String userName;

    @Column(name="User_Password", nullable=false)
    private String userPassword;

    @Column(name="User_Id", nullable=false, unique = true)
    private String userId ;

    @Column(name="Maiden_Name", nullable=false)
    private String maidenName;

    @Column(name="Birth_Date", nullable=false)
    private Date birthDate;

    @Column(name="Gender", nullable=false)
    private String gender;

    @Column(name="civil_status", nullable=false)
    private String cvlStatus;

    @Column(name="nationality", nullable=false)
    private String nationality;

    @Column(name="User_Role", nullable=false)
    private String userRole;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="User_UnxTmCrt", nullable=false)
    private Date userUnxTmCrt ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="User_UnxTmUpdt", nullable=false)
    private Date userUnxTmUpdt;

    @Column(name="User_RcrdSts", nullable=false)
    private Integer userRcrdSts ;

    // only for prf

    @Column(name = "Employee_Id")
    private String employeeId;

    @Column(name = "Qualification")
    private String qualification;

    @Column(name = "Specialization")
    private String specialization;

    @Column(name = "Date_Of_Hire")
    private Date dateOfHire;


    // Constructeur : Appel de constructeur de la classe parente Staff
    public PrfrmngPhysic() {
        super();
    }


    // PERFORMING PHYSICIAN RELATIONSHIPS
    @JsonIgnore
    @OneToMany(mappedBy = "prfrmngPhysic", cascade = CascadeType.ALL)
    private List<Study> studies ;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Task> tasks ;

    @JsonIgnore
    @OneToMany(mappedBy = "recipient", cascade = CascadeType.ALL)
    private List<Notification> notifications;


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

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Date getDateOfHire() {
		return dateOfHire;
	}

	public void setDateOfHire(Date dateOfHire) {
		this.dateOfHire = dateOfHire;
	}

	public List<Study> getStudies() {
		return studies;
	}

	public void setStudies(List<Study> studies) {
		this.studies = studies;
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
    
    
}
