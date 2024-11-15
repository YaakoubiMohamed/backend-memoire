package iss4u.ehr.backoffice.radiography.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "Series")
public class Series {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Series_Ky", nullable=false)
    private Long seriesKy ;

    @Column(name="Series_Label", nullable=false, unique = true)
    private String seriesLabel ;

    @Column(name="Series_Desc")
    private String seriesDesc ;

    @Column(name="Series_BodyPart", nullable=false)
    private String seriesBodyPart ;

    @Column(name="Series_DcmModality", nullable=false)
    private String seriesDcmModality ;

    @Column(name="Series_DLP", nullable=false)
    private String seriesDlp ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Series_UnxTmCrt", nullable=false)
    private Date seriesUnxTmCrt ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Series_UnxTmUpdt", nullable=false)
    private Date seriesUnxTmUpdt;

    @Column(name="Series_RcrdSts", nullable=false)
    private Integer seriesRcrdSts ;

    // SERIES ( RELATIONSHIP )
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Study_Ref")
    private Study study;

    @OneToMany(mappedBy="series", cascade = CascadeType.ALL)
    private List<Object> objects ;

	public String getSeriesLabel() {
		return seriesLabel;
	}

	public void setSeriesLabel(String seriesLabel) {
		this.seriesLabel = seriesLabel;
	}

	public String getSeriesDesc() {
		return seriesDesc;
	}

	public void setSeriesDesc(String seriesDesc) {
		this.seriesDesc = seriesDesc;
	}

	public String getSeriesBodyPart() {
		return seriesBodyPart;
	}

	public void setSeriesBodyPart(String seriesBodyPart) {
		this.seriesBodyPart = seriesBodyPart;
	}

	public String getSeriesDcmModality() {
		return seriesDcmModality;
	}

	public void setSeriesDcmModality(String seriesDcmModality) {
		this.seriesDcmModality = seriesDcmModality;
	}

	public String getSeriesDlp() {
		return seriesDlp;
	}

	public void setSeriesDlp(String seriesDlp) {
		this.seriesDlp = seriesDlp;
	}

	public Date getSeriesUnxTmCrt() {
		return seriesUnxTmCrt;
	}

	public void setSeriesUnxTmCrt(Date seriesUnxTmCrt) {
		this.seriesUnxTmCrt = seriesUnxTmCrt;
	}

	public Date getSeriesUnxTmUpdt() {
		return seriesUnxTmUpdt;
	}

	public void setSeriesUnxTmUpdt(Date seriesUnxTmUpdt) {
		this.seriesUnxTmUpdt = seriesUnxTmUpdt;
	}

	public Integer getSeriesRcrdSts() {
		return seriesRcrdSts;
	}

	public void setSeriesRcrdSts(Integer seriesRcrdSts) {
		this.seriesRcrdSts = seriesRcrdSts;
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

	public Long getSeriesKy() {
		return seriesKy;
	}

	
    
    
    
}
