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
@Table(name = "Object")
public class Object {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Object_Ky", nullable=false)
    private Long objectKy ;

    @Column(name="Object_Label", nullable=false)
    private String objectLabel ;

    @Column(name="Object_Path", nullable=false, length = 1000)
    private String objectPath ;

    @Column(name="Object_Tp", nullable=false)
    private String objectTp ;

    @Column(name="Object_Covid_Result")
    private String covidResult ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Object_UnxTmCrt", nullable=false)
    private Date objectUnxTmCrt ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Object_UnxTmUpdt", nullable=false)
    private Date objectUnxTmUpdt;

    @Column(name="Object_RcrdSts", nullable=false)
    private Integer objectRcrdSts ;

    // OBJECT ( RELATIONSHIP )
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Series_Ref")
    private Series series;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Report_Ref")
    private Report report;

	public String getObjectLabel() {
		return objectLabel;
	}

	public void setObjectLabel(String objectLabel) {
		this.objectLabel = objectLabel;
	}

	public String getObjectPath() {
		return objectPath;
	}

	public void setObjectPath(String objectPath) {
		this.objectPath = objectPath;
	}

	public String getObjectTp() {
		return objectTp;
	}

	public void setObjectTp(String objectTp) {
		this.objectTp = objectTp;
	}

	public String getCovidResult() {
		return covidResult;
	}

	public void setCovidResult(String covidResult) {
		this.covidResult = covidResult;
	}

	public Date getObjectUnxTmCrt() {
		return objectUnxTmCrt;
	}

	public void setObjectUnxTmCrt(Date objectUnxTmCrt) {
		this.objectUnxTmCrt = objectUnxTmCrt;
	}

	public Date getObjectUnxTmUpdt() {
		return objectUnxTmUpdt;
	}

	public void setObjectUnxTmUpdt(Date objectUnxTmUpdt) {
		this.objectUnxTmUpdt = objectUnxTmUpdt;
	}

	public Integer getObjectRcrdSts() {
		return objectRcrdSts;
	}

	public void setObjectRcrdSts(Integer objectRcrdSts) {
		this.objectRcrdSts = objectRcrdSts;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}
    
    
}