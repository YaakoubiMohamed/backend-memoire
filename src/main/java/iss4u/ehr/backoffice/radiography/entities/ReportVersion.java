package iss4u.ehr.backoffice.radiography.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "ReportVersion")
public class ReportVersion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Report_Version_Ky", nullable = false)
    private Long reportVersionKy;

    @Column(name = "Report_Version_Label", nullable = false)
    private String reportVersionLabel;

    @Column(name = "Report_Version_Type", nullable = false)
    private String reportVersionType;

    @Column(name = "Report_Version_Comment", length = 1000)
    private String reportVersionComment;

    @Column(name = "Report_Version_Impression", length = 1000)
    private String reportVersionImpression;

    @Column(name = "Report_Version_findings", length = 1000)
    private String reportVersionFindings;

    @Column(name = "Report_Version_path")
    private String reportVersionPath;

    @Column(name = "Report_Version_status", nullable = false)
    private String reportVersionStatus;

    @Column(name = "Report_Version_Signed")
    private Boolean reportVersionSigned;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Report_Version_UnxTmSign")
    private Date reportVersionUnxTmSign;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Report_Version_UnxTmCrt", nullable = false)
    private Date reportVersionUnxTmCrt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Report_Version_UnxTmUpdt", nullable = false)
    private Date reportVersionUnxTmUpdt;

    @Column(name = "Report_Version_RcrdSts", nullable = false)
    private Integer reportVersionRcrdSts;

    // RelationShip...

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Report_Ref")
    private Report report;

	public String getReportVersionLabel() {
		return reportVersionLabel;
	}

	public void setReportVersionLabel(String reportVersionLabel) {
		this.reportVersionLabel = reportVersionLabel;
	}

	public String getReportVersionType() {
		return reportVersionType;
	}

	public void setReportVersionType(String reportVersionType) {
		this.reportVersionType = reportVersionType;
	}

	public String getReportVersionComment() {
		return reportVersionComment;
	}

	public void setReportVersionComment(String reportVersionComment) {
		this.reportVersionComment = reportVersionComment;
	}

	public String getReportVersionImpression() {
		return reportVersionImpression;
	}

	public void setReportVersionImpression(String reportVersionImpression) {
		this.reportVersionImpression = reportVersionImpression;
	}

	public String getReportVersionFindings() {
		return reportVersionFindings;
	}

	public void setReportVersionFindings(String reportVersionFindings) {
		this.reportVersionFindings = reportVersionFindings;
	}

	public String getReportVersionPath() {
		return reportVersionPath;
	}

	public void setReportVersionPath(String reportVersionPath) {
		this.reportVersionPath = reportVersionPath;
	}

	public String getReportVersionStatus() {
		return reportVersionStatus;
	}

	public void setReportVersionStatus(String reportVersionStatus) {
		this.reportVersionStatus = reportVersionStatus;
	}

	public Boolean getReportVersionSigned() {
		return reportVersionSigned;
	}

	public void setReportVersionSigned(Boolean reportVersionSigned) {
		this.reportVersionSigned = reportVersionSigned;
	}

	public Date getReportVersionUnxTmSign() {
		return reportVersionUnxTmSign;
	}

	public void setReportVersionUnxTmSign(Date reportVersionUnxTmSign) {
		this.reportVersionUnxTmSign = reportVersionUnxTmSign;
	}

	public Date getReportVersionUnxTmCrt() {
		return reportVersionUnxTmCrt;
	}

	public void setReportVersionUnxTmCrt(Date reportVersionUnxTmCrt) {
		this.reportVersionUnxTmCrt = reportVersionUnxTmCrt;
	}

	public Date getReportVersionUnxTmUpdt() {
		return reportVersionUnxTmUpdt;
	}

	public void setReportVersionUnxTmUpdt(Date reportVersionUnxTmUpdt) {
		this.reportVersionUnxTmUpdt = reportVersionUnxTmUpdt;
	}

	public Integer getReportVersionRcrdSts() {
		return reportVersionRcrdSts;
	}

	public void setReportVersionRcrdSts(Integer reportVersionRcrdSts) {
		this.reportVersionRcrdSts = reportVersionRcrdSts;
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}
    
    
    
}

