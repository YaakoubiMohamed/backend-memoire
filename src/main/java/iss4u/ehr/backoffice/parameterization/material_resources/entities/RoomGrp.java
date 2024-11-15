package iss4u.ehr.backoffice.parameterization.material_resources.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import iss4u.ehr.backoffice.parameterization.structure.entities.ExploitationUnit;
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
@Table(name = "RoomGroup")
public class RoomGrp {

    //--- ROOM GROUP PRIMARY KEYS
    @Id

    @Column(name="RoomGrp_Ky", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomGrpKy;

    //--- ROOM GROUP DATA FIELDS
    @Column(name="RoomGrp_Nm", nullable=false)
    private String roomGrpNm ;

    //--- ROOM GROUP TEMPORAL DATA
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RoomGrp_UnxTmCrt", nullable=false)
    private Date roomGrpUnxTmCrt ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RoomGrp_UnxTmUpdt", nullable=false)
    private Date roomGrpUnxTmUpdt;

    @Column(name="RoomGrp_RcrdSts", nullable=false)
    private Integer roomGrpRcrdSts ;

    //--- ROOM GROUP LINKS ( RELATIONSHIP )
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "ExploitationUnit_Ref")
    private ExploitationUnit exploitationUnit;

    @OneToMany(mappedBy = "roomGrp", cascade = CascadeType.ALL)
    private List<Room> rooms ;

	public String getRoomGrpNm() {
		return roomGrpNm;
	}

	public void setRoomGrpNm(String roomGrpNm) {
		this.roomGrpNm = roomGrpNm;
	}

	public Date getRoomGrpUnxTmCrt() {
		return roomGrpUnxTmCrt;
	}

	public void setRoomGrpUnxTmCrt(Date roomGrpUnxTmCrt) {
		this.roomGrpUnxTmCrt = roomGrpUnxTmCrt;
	}

	public Date getRoomGrpUnxTmUpdt() {
		return roomGrpUnxTmUpdt;
	}

	public void setRoomGrpUnxTmUpdt(Date roomGrpUnxTmUpdt) {
		this.roomGrpUnxTmUpdt = roomGrpUnxTmUpdt;
	}

	public Integer getRoomGrpRcrdSts() {
		return roomGrpRcrdSts;
	}

	public void setRoomGrpRcrdSts(Integer roomGrpRcrdSts) {
		this.roomGrpRcrdSts = roomGrpRcrdSts;
	}

	public ExploitationUnit getExploitationUnit() {
		return exploitationUnit;
	}

	public void setExploitationUnit(ExploitationUnit exploitationUnit) {
		this.exploitationUnit = exploitationUnit;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
    
    
}
