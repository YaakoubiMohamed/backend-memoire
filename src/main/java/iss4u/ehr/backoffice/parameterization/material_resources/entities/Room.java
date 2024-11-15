package iss4u.ehr.backoffice.parameterization.material_resources.entities;

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
@Table(name = "Room")
public class Room {

    //--- ROOM PRIMARY KEYS
    @Id

    @Column(name="Room_Ky", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomKy;

    //--- ROOM DATA FIELDS
    @Column(name="Room_Label", nullable=false)
    private String roomLabel ;

    @Column(name="Room_Type", nullable=false)
    private String roomType ;

    @Column(name="Room_Class")
    private String roomClass ;

    //--- ROOM TEMPORAL DATA
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Room_UnxTmCrt", nullable=false)
    private Date roomUnxTmCrt ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Room_UnxTmUpdt", nullable=false)
    private Date roomUnxTmUpdt;

    @Column(name="Room_RcrdSts", nullable=false)
    private Integer roomRcrdSts ;

    //--- ROOM LINKS ( RELATIONSHIP )
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "RoomGrp_Ref")
    private RoomGrp roomGrp;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Equipment> equipments ;

	public String getRoomLabel() {
		return roomLabel;
	}

	public void setRoomLabel(String roomLabel) {
		this.roomLabel = roomLabel;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomClass() {
		return roomClass;
	}

	public void setRoomClass(String roomClass) {
		this.roomClass = roomClass;
	}

	public Date getRoomUnxTmCrt() {
		return roomUnxTmCrt;
	}

	public void setRoomUnxTmCrt(Date roomUnxTmCrt) {
		this.roomUnxTmCrt = roomUnxTmCrt;
	}

	public Date getRoomUnxTmUpdt() {
		return roomUnxTmUpdt;
	}

	public void setRoomUnxTmUpdt(Date roomUnxTmUpdt) {
		this.roomUnxTmUpdt = roomUnxTmUpdt;
	}

	public Integer getRoomRcrdSts() {
		return roomRcrdSts;
	}

	public void setRoomRcrdSts(Integer roomRcrdSts) {
		this.roomRcrdSts = roomRcrdSts;
	}

	public RoomGrp getRoomGrp() {
		return roomGrp;
	}

	public void setRoomGrp(RoomGrp roomGrp) {
		this.roomGrp = roomGrp;
	}

	public List<Equipment> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<Equipment> equipments) {
		this.equipments = equipments;
	}
    
    
    
}
