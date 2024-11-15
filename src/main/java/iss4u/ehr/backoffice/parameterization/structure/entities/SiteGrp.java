package iss4u.ehr.backoffice.parameterization.structure.entities;

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
@Table(name = "Site_Group")
public class SiteGrp {

    //--- SITE GROUP PRIMARY KEYS
    @Id

    @Column(name="SiteGrp_Ky", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long siteGrpKy;

    //--- SITE GROUP DATA FIELDS
    @Column(name="SiteGrp_Nm", nullable=false, unique = true)
    private String siteGrpNm ;

    //--- SITE GROUP TEMPORAL DATA
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="SiteGrp_UnxTmCrt", nullable=false)
    private Date siteGrpUnxTmCrt ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="siteGrp_UnxTmUpdt", nullable=false)
    private Date siteGrpUnxTmUpdt;

    @Column(name="siteGrp_RcrdSts", nullable=false)
    private Integer siteGrpRcrdSts ;

    //--- SITE GROUP LINKS ( RELATIONSHIP )
    @OneToMany(mappedBy = "siteGrp", cascade = CascadeType.ALL)
    private List<Site> sites ;

	public String getSiteGrpNm() {
		return siteGrpNm;
	}

	public void setSiteGrpNm(String siteGrpNm) {
		this.siteGrpNm = siteGrpNm;
	}

	public Date getSiteGrpUnxTmCrt() {
		return siteGrpUnxTmCrt;
	}

	public void setSiteGrpUnxTmCrt(Date siteGrpUnxTmCrt) {
		this.siteGrpUnxTmCrt = siteGrpUnxTmCrt;
	}

	public Date getSiteGrpUnxTmUpdt() {
		return siteGrpUnxTmUpdt;
	}

	public void setSiteGrpUnxTmUpdt(Date siteGrpUnxTmUpdt) {
		this.siteGrpUnxTmUpdt = siteGrpUnxTmUpdt;
	}

	public Integer getSiteGrpRcrdSts() {
		return siteGrpRcrdSts;
	}

	public void setSiteGrpRcrdSts(Integer siteGrpRcrdSts) {
		this.siteGrpRcrdSts = siteGrpRcrdSts;
	}

	public List<Site> getSites() {
		return sites;
	}

	public void setSites(List<Site> sites) {
		this.sites = sites;
	}

    
    
}
