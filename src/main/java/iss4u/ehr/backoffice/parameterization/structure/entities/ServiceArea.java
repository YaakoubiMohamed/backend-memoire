package iss4u.ehr.backoffice.parameterization.structure.entities;

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
@Table(name = "ServiceArea")
public class ServiceArea {

    //--- SERVICE AREA PRIMARY KEYS
    @Id

    @Column(name="ServArea_Ky", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long servAreaKy;

    //--- SERVICE AREA DATA FIELDS
    @Column(name="ServArea_Nm", nullable=false)
    private String servAreaNm ;

    //--- SERVICE AREA TEMPORAL DATA
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ServArea_UnxTmCrt", nullable=false)
    private Date servAreaUnxTmCrt ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ServArea_UnxTmUpdt", nullable=false)
    private Date servAreaUnxTmUpdt;

    @Column(name="ServArea_RcrdSts", nullable=false)
    private Integer servAreaRcrdSts ;

    //--- SERVICE AREA LINKS ( RELATIONSHIP )
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Service_Ref")
    private Service service;

    @OneToMany(mappedBy = "serviceArea", cascade = CascadeType.ALL)
    private List<ExploitationUnit> exploitationUnits ;

	public String getServAreaNm() {
		return servAreaNm;
	}

	public void setServAreaNm(String servAreaNm) {
		this.servAreaNm = servAreaNm;
	}

	public Date getServAreaUnxTmCrt() {
		return servAreaUnxTmCrt;
	}

	public void setServAreaUnxTmCrt(Date servAreaUnxTmCrt) {
		this.servAreaUnxTmCrt = servAreaUnxTmCrt;
	}

	public Date getServAreaUnxTmUpdt() {
		return servAreaUnxTmUpdt;
	}

	public void setServAreaUnxTmUpdt(Date servAreaUnxTmUpdt) {
		this.servAreaUnxTmUpdt = servAreaUnxTmUpdt;
	}

	public Integer getServAreaRcrdSts() {
		return servAreaRcrdSts;
	}

	public void setServAreaRcrdSts(Integer servAreaRcrdSts) {
		this.servAreaRcrdSts = servAreaRcrdSts;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public List<ExploitationUnit> getExploitationUnits() {
		return exploitationUnits;
	}

	public void setExploitationUnits(List<ExploitationUnit> exploitationUnits) {
		this.exploitationUnits = exploitationUnits;
	}
    
    
}
