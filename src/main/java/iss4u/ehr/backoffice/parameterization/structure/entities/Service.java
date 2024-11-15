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
@Table(name = "Service")
public class Service {

    //--- SERVICE PRIMARY KEYS
    @Id

    @Column(name="Service_Ky", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceKy;

    //--- SERVICE DATA FIELDS
    @Column(name="Service_Nm", nullable=false)
    private String serviceNm ;

    //--- SERVICE TEMPORAL DATA
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Service_UnxTmCrt", nullable=false)
    private Date serviceUnxTmCrt ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Service_UnxTmUpdt", nullable=false)
    private Date serviceUnxTmUpdt;

    @Column(name="Service_RcrdSts", nullable=false)
    private Integer serviceRcrdSts ;

    //--- SERVICE LINKS ( RELATIONSHIP )
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Site_Ref")
    private Site site;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    private List<ServiceArea> serviceAreas ;

	public String getServiceNm() {
		return serviceNm;
	}

	public void setServiceNm(String serviceNm) {
		this.serviceNm = serviceNm;
	}

	public Date getServiceUnxTmCrt() {
		return serviceUnxTmCrt;
	}

	public void setServiceUnxTmCrt(Date serviceUnxTmCrt) {
		this.serviceUnxTmCrt = serviceUnxTmCrt;
	}

	public Date getServiceUnxTmUpdt() {
		return serviceUnxTmUpdt;
	}

	public void setServiceUnxTmUpdt(Date serviceUnxTmUpdt) {
		this.serviceUnxTmUpdt = serviceUnxTmUpdt;
	}

	public Integer getServiceRcrdSts() {
		return serviceRcrdSts;
	}

	public void setServiceRcrdSts(Integer serviceRcrdSts) {
		this.serviceRcrdSts = serviceRcrdSts;
	}

	public List<ServiceArea> getServiceAreas() {
		return serviceAreas;
	}

	public void setServiceAreas(List<ServiceArea> serviceAreas) {
		this.serviceAreas = serviceAreas;
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}
    
    
    
}
