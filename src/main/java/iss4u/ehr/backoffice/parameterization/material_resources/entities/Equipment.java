package iss4u.ehr.backoffice.parameterization.material_resources.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Equipment")
public class Equipment {

    //--- EQUIPMENT PRIMARY KEYS
    @Id

    @Column(name="Eqpmnt_Ky", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equipmentKy;

    //--- EQUIPMENT DATA FIELDS
    @Column(name="Eqpmnt_Label", nullable=false)
    private String equipmentLabel ;

    @Column(name="Eqpmnt_Desc")
    private String description ;

    @Column(name="Eqpmnt_Type", nullable=false)
    private String equipmentType ;

    @Column(name="Eqpmnt_IPAdrs")
    private String addressIp ;

    @Column(name="Eqpmnt_MACAdrs")
    private String addressMac ;

    //--- EQUIPMENT TEMPORAL DATA
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Eqpmnt_UnxTmCrt", nullable=false)
    private Date equipmentUnxTmCrt ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Eqpmnt_UnxTmUpdt", nullable=false)
    private Date equipmentUnxTmUpdt;

    @Column(name="Eqpmnt_RcrdSts", nullable=false)
    private Integer equipmentRcrdSts ;

    //--- EQUIPMENT LINKS ( RELATIONSHIP )
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Room_Ref")
    private Room room;

    @OneToMany(mappedBy = "equipment", cascade = CascadeType.ALL)
    private List<Bed> beds ;

	public String getEquipmentLabel() {
		return equipmentLabel;
	}

	public void setEquipmentLabel(String equipmentLabel) {
		this.equipmentLabel = equipmentLabel;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getAddressIp() {
		return addressIp;
	}

	public void setAddressIp(String addressIp) {
		this.addressIp = addressIp;
	}

	public String getAddressMac() {
		return addressMac;
	}

	public void setAddressMac(String addressMac) {
		this.addressMac = addressMac;
	}

	public Date getEquipmentUnxTmCrt() {
		return equipmentUnxTmCrt;
	}

	public void setEquipmentUnxTmCrt(Date equipmentUnxTmCrt) {
		this.equipmentUnxTmCrt = equipmentUnxTmCrt;
	}

	public Date getEquipmentUnxTmUpdt() {
		return equipmentUnxTmUpdt;
	}

	public void setEquipmentUnxTmUpdt(Date equipmentUnxTmUpdt) {
		this.equipmentUnxTmUpdt = equipmentUnxTmUpdt;
	}

	public Integer getEquipmentRcrdSts() {
		return equipmentRcrdSts;
	}

	public void setEquipmentRcrdSts(Integer equipmentRcrdSts) {
		this.equipmentRcrdSts = equipmentRcrdSts;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public List<Bed> getBeds() {
		return beds;
	}

	public void setBeds(List<Bed> beds) {
		this.beds = beds;
	}
    
    
    
}
