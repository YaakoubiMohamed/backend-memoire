package iss4u.ehr.backoffice.radiography.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import iss4u.ehr.backoffice.radiography.human_resources.entities.Patient;
import iss4u.ehr.backoffice.radiography.human_resources.entities.PrfrmngPhysic;
import iss4u.ehr.backoffice.radiography.human_resources.entities.RfrntPhysic;
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
@Table(name = "Study")
public class Study {
    @Id

    @Column(name="Study_Ky", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studyKy;

    @Column(name="Study_Label", nullable=false, unique = true)
    private String studyLabel;

    @Column(name="Study_Desc", nullable=false)
    private String studyDesc ;

    @Column(name="Study_Comment", nullable=false)
    private String studyComment ;

    @Column(name="Study_AETitle", nullable=false)
    private String studyAetitle ;

    @Column(name="Study_Type", nullable=false)
    private String studyType;

    @Column(name="Study_Status", nullable=false)
    private String studyStatus;

    @Column(name="Study_Priority", nullable=false)
    private String studyPriority;

    @Column(name="Study_Note", columnDefinition="TEXT")
    private String studyNote;

    @Column(name="Study_Date")
    private Date studyDate;

//    @Column(name="End_Date")
//    private Date endDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Study_UnxTmCrt", nullable=false)
    private Date studyUnxTmCrt ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Study_UnxTmUpdt", nullable=false)
    private Date studyUnxTmUpdt;

    @Column(name="Study_RcrdSts", nullable=false)
    private Integer studyRcrdSts ;


    // STUDY RELATIONSHIP

    @OneToMany(mappedBy = "study", cascade = CascadeType.ALL)
    private List<Series> listOfSeries ;

    @OneToMany(mappedBy = "study", cascade = CascadeType.ALL)
    private List<Report> reports ;

    @ManyToOne
    @JoinColumn(name = "RfrntPhysic_Ref", referencedColumnName = "User_Ky")
    private RfrntPhysic rfrntPhysic;

    @ManyToOne
    @JoinColumn(name = "PrfrmngPhysic_Ref", referencedColumnName = "User_Ky")
    private PrfrmngPhysic prfrmngPhysic;

    @ManyToOne
    @JoinColumn(name = "Patient_Ref", referencedColumnName = "User_Ky")
    private Patient patient;

    @JsonIgnore
    @OneToMany(mappedBy = "study")
    private List<SharedExamLink> sharedExamLinks;

	public String getStudyLabel() {
		return studyLabel;
	}

	public void setStudyLabel(String studyLabel) {
		this.studyLabel = studyLabel;
	}

	public String getStudyDesc() {
		return studyDesc;
	}

	public void setStudyDesc(String studyDesc) {
		this.studyDesc = studyDesc;
	}

	public String getStudyComment() {
		return studyComment;
	}

	public void setStudyComment(String studyComment) {
		this.studyComment = studyComment;
	}

	public String getStudyAetitle() {
		return studyAetitle;
	}

	public void setStudyAetitle(String studyAetitle) {
		this.studyAetitle = studyAetitle;
	}

	public String getStudyType() {
		return studyType;
	}

	public void setStudyType(String studyType) {
		this.studyType = studyType;
	}

	public String getStudyStatus() {
		return studyStatus;
	}

	public void setStudyStatus(String studyStatus) {
		this.studyStatus = studyStatus;
	}

	public String getStudyPriority() {
		return studyPriority;
	}

	public void setStudyPriority(String studyPriority) {
		this.studyPriority = studyPriority;
	}

	public String getStudyNote() {
		return studyNote;
	}

	public void setStudyNote(String studyNote) {
		this.studyNote = studyNote;
	}

	public Date getStudyDate() {
		return studyDate;
	}

	public void setStudyDate(Date studyDate) {
		this.studyDate = studyDate;
	}

	public Date getStudyUnxTmCrt() {
		return studyUnxTmCrt;
	}

	public void setStudyUnxTmCrt(Date studyUnxTmCrt) {
		this.studyUnxTmCrt = studyUnxTmCrt;
	}

	public Date getStudyUnxTmUpdt() {
		return studyUnxTmUpdt;
	}

	public void setStudyUnxTmUpdt(Date studyUnxTmUpdt) {
		this.studyUnxTmUpdt = studyUnxTmUpdt;
	}

	public Integer getStudyRcrdSts() {
		return studyRcrdSts;
	}

	public void setStudyRcrdSts(Integer studyRcrdSts) {
		this.studyRcrdSts = studyRcrdSts;
	}

	public List<Series> getListOfSeries() {
		return listOfSeries;
	}

	public void setListOfSeries(List<Series> listOfSeries) {
		this.listOfSeries = listOfSeries;
	}

	public List<Report> getReports() {
		return reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}

	public RfrntPhysic getRfrntPhysic() {
		return rfrntPhysic;
	}

	public void setRfrntPhysic(RfrntPhysic rfrntPhysic) {
		this.rfrntPhysic = rfrntPhysic;
	}

	public PrfrmngPhysic getPrfrmngPhysic() {
		return prfrmngPhysic;
	}

	public void setPrfrmngPhysic(PrfrmngPhysic prfrmngPhysic) {
		this.prfrmngPhysic = prfrmngPhysic;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public List<SharedExamLink> getSharedExamLinks() {
		return sharedExamLinks;
	}

	public void setSharedExamLinks(List<SharedExamLink> sharedExamLinks) {
		this.sharedExamLinks = sharedExamLinks;
	}

	public Long getStudyKy() {
		return studyKy;
	}

	
    
    
    

}
