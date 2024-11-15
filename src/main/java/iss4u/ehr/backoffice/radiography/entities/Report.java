package iss4u.ehr.backoffice.radiography.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "Report")
public class Report {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Report_Ky", nullable=false)
    private Long reportKy ;

    @Column(name="Report_Label", nullable=false)
    private String reportLabel ;

    @Column(name="Report_Type", nullable=false)
    private String reportType ; // text record

    @Column(name="Report_Comment", length = 1000)
    private String reportComment ;

    @Column(name="Report_Impression", length = 1000)
    private String reportImpression ;

    @Column(name="Report_findings", length = 1000)
    private String reportFindings ;

    @Lob
    @Column(name = "Report_path")
    private String reportPath;

    @Column(name="Report_status", nullable=false)
    private String reportStatus ; // DRAFT OR FINAL

    @Column(name="Report_version")
    private String reportVersion ;

    @Column(name="Report_Signed")
    private Boolean isSigned ;

    @Column(name="Report_Access_Nmbr")
    private Integer reportAccessNmbr ; // 0 or 1

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Report_UnxTmSign")
    private Date reportUnxTmSign ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Report_UnxTmCrt", nullable=false)
    private Date reportUnxTmCrt ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Report_UnxTmUpdt", nullable=false)
    private Date reportUnxTmUpdt;

    @Column(name="Report_RcrdSts", nullable=false)
    private Integer reportRcrdSts ;

    @Column(name="Generated_By")
    private Long generatorKy ; // invited radio key

    // REPORT RELATIONSHIP

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Study_Ref")
    private Study study;

    @OneToMany(mappedBy = "report", cascade = CascadeType.ALL)
    private List<Object> objects ;

    @OneToMany(mappedBy = "report", cascade = CascadeType.ALL)
    private List<ReportVersion> reportVersions;

    @PrePersist
    public void prePersist() {
        this.reportVersion = "0.0";
        this.isSigned = false;
    }

    @PreUpdate
    public void preUpdate() {
         // Split the version into major and minor parts
            String[] parts = this.reportVersion.split("\\.");
            int major = Integer.parseInt(parts[0]);
            int minor = Integer.parseInt(parts[1]);

            // Increment the minor part and update the version
            minor++;
            this.reportVersion = major + "." + minor;
        }

	public String getReportLabel() {
		return reportLabel;
	}

	public void setReportLabel(String reportLabel) {
		this.reportLabel = reportLabel;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getReportComment() {
		return reportComment;
	}

	public void setReportComment(String reportComment) {
		this.reportComment = reportComment;
	}

	public String getReportImpression() {
		return reportImpression;
	}

	public void setReportImpression(String reportImpression) {
		this.reportImpression = reportImpression;
	}

	public String getReportFindings() {
		return reportFindings;
	}

	public void setReportFindings(String reportFindings) {
		this.reportFindings = reportFindings;
	}

	public String getReportPath() {
		return reportPath;
	}

	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}

	public String getReportStatus() {
		return reportStatus;
	}

	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}

	public String getReportVersion() {
		return reportVersion;
	}

	public void setReportVersion(String reportVersion) {
		this.reportVersion = reportVersion;
	}

	public Boolean getIsSigned() {
		return isSigned;
	}

	public void setIsSigned(Boolean isSigned) {
		this.isSigned = isSigned;
	}

	public Integer getReportAccessNmbr() {
		return reportAccessNmbr;
	}

	public void setReportAccessNmbr(Integer reportAccessNmbr) {
		this.reportAccessNmbr = reportAccessNmbr;
	}

	public Date getReportUnxTmSign() {
		return reportUnxTmSign;
	}

	public void setReportUnxTmSign(Date reportUnxTmSign) {
		this.reportUnxTmSign = reportUnxTmSign;
	}

	public Date getReportUnxTmCrt() {
		return reportUnxTmCrt;
	}

	public void setReportUnxTmCrt(Date reportUnxTmCrt) {
		this.reportUnxTmCrt = reportUnxTmCrt;
	}

	public Date getReportUnxTmUpdt() {
		return reportUnxTmUpdt;
	}

	public void setReportUnxTmUpdt(Date reportUnxTmUpdt) {
		this.reportUnxTmUpdt = reportUnxTmUpdt;
	}

	public Integer getReportRcrdSts() {
		return reportRcrdSts;
	}

	public void setReportRcrdSts(Integer reportRcrdSts) {
		this.reportRcrdSts = reportRcrdSts;
	}

	public Long getGeneratorKy() {
		return generatorKy;
	}

	public void setGeneratorKy(Long generatorKy) {
		this.generatorKy = generatorKy;
	}

	public Study getStudy() {
		return study;
	}

	public void setStudy(Study study) {
		this.study = study;
	}

	public List<Object> getObjects() {
		return objects;
	}

	public void setObjects(List<Object> objects) {
		this.objects = objects;
	}

	public List<ReportVersion> getReportVersions() {
		return reportVersions;
	}

	public void setReportVersions(List<ReportVersion> reportVersions) {
		this.reportVersions = reportVersions;
	}
    
    
    
}
