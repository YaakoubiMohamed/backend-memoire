package iss4u.ehr.backoffice.parameterization.material_resources.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import iss4u.ehr.backoffice.parameterization.material_resources.entities.enumerations.BedType;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "Bed")
public class Bed {
    //--- BED PRIMARY KEYS
    @Id
    @Column(name="Bed_Ky", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bedKy;

    @Column(name="Bed_Number", nullable=false)
    private Integer bedNumber ;

    @Column(name="Bed_Type", nullable=false)
    private BedType bedType ;

    @Column(name="Bed_Note", nullable=false)
    private String bedNote ;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "Equipment_Ref")
    private Equipment equipment;

	public Integer getBedNumber() {
		return bedNumber;
	}

	public void setBedNumber(Integer bedNumber) {
		this.bedNumber = bedNumber;
	}

	public BedType getBedType() {
		return bedType;
	}

	public void setBedType(BedType bedType) {
		this.bedType = bedType;
	}

	public String getBedNote() {
		return bedNote;
	}

	public void setBedNote(String bedNote) {
		this.bedNote = bedNote;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
    
   
    
    
}