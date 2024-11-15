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
@Table(name = "Site")
public class Site {

    //--- SITE PRIMARY KEYS
    @Id

    @Column(name="Site_Ky", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long siteKy;

    //--- SITE DATA FIELDS
    @Column(name="Site_Nm", nullable=false)
    private String siteNm ;

    @Column(name="Site_Country")
    private String siteCountry ;

    //--- SITE TEMPORAL DATA
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Site_UnxTmCrt", nullable=false)
    private Date siteUnxTmCrt ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="site_UnxTmUpdt", nullable=false)
    private Date siteUnxTmUpdt;

    @Column(name="site_RcrdSts", nullable=false)
    private Integer siteRcrdSts ;

    //--- SITE LINKS ( RELATIONSHIP )
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "SiteGrp_Ref")
    private SiteGrp siteGrp;

    @OneToMany(mappedBy = "site", cascade = CascadeType.ALL)
    private List<Service> services ;

	public String getSiteNm() {
		return siteNm;
	}

	public void setSiteNm(String siteNm) {
		this.siteNm = siteNm;
	}

	public String getSiteCountry() {
		return siteCountry;
	}

	public void setSiteCountry(String siteCountry) {
		this.siteCountry = siteCountry;
	}

	public Date getSiteUnxTmCrt() {
		return siteUnxTmCrt;
	}

	public void setSiteUnxTmCrt(Date siteUnxTmCrt) {
		this.siteUnxTmCrt = siteUnxTmCrt;
	}

	public Date getSiteUnxTmUpdt() {
		return siteUnxTmUpdt;
	}

	public void setSiteUnxTmUpdt(Date siteUnxTmUpdt) {
		this.siteUnxTmUpdt = siteUnxTmUpdt;
	}

	public Integer getSiteRcrdSts() {
		return siteRcrdSts;
	}

	public void setSiteRcrdSts(Integer siteRcrdSts) {
		this.siteRcrdSts = siteRcrdSts;
	}

	public SiteGrp getSiteGrp() {
		return siteGrp;
	}

	public void setSiteGrp(SiteGrp siteGrp) {
		this.siteGrp = siteGrp;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}
    
    
}
