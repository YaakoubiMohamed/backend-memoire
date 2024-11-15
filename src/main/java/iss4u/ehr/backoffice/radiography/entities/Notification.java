package iss4u.ehr.backoffice.radiography.entities;

import iss4u.ehr.backoffice.radiography.human_resources.entities.User;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "Notification")
public class Notification {
    @Id
    @Column(name = "NotificationKy", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationKy;

    @Column(name = "Notification_Message", nullable = false)
    private String notificationMessage;

    @Column(name = "Notification_Status", nullable = false)
    private boolean notificationStatus; // is read

    @Column(name = "Notification_Icon", nullable = false)
    private String notificationIcon;

    @Column(name = "Notification_Color", nullable = false)
    private String notificationColor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Notification_UnxTmCrt", nullable = false)
    private Date notificationUnxTmCrt;

    @ManyToOne // Many notifications can be associated with one user
    @JoinColumn(name = "Recipient_Ky")
    private User recipient;

	public String getNotificationMessage() {
		return notificationMessage;
	}

	public void setNotificationMessage(String notificationMessage) {
		this.notificationMessage = notificationMessage;
	}

	public boolean isNotificationStatus() {
		return notificationStatus;
	}

	public void setNotificationStatus(boolean notificationStatus) {
		this.notificationStatus = notificationStatus;
	}

	public String getNotificationIcon() {
		return notificationIcon;
	}

	public void setNotificationIcon(String notificationIcon) {
		this.notificationIcon = notificationIcon;
	}

	public String getNotificationColor() {
		return notificationColor;
	}

	public void setNotificationColor(String notificationColor) {
		this.notificationColor = notificationColor;
	}

	public Date getNotificationUnxTmCrt() {
		return notificationUnxTmCrt;
	}

	public void setNotificationUnxTmCrt(Date notificationUnxTmCrt) {
		this.notificationUnxTmCrt = notificationUnxTmCrt;
	}

	public User getRecipient() {
		return recipient;
	}

	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}
    
    
}
