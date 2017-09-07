package se.sjtu.formfoss.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.management.relation.RoleNotFoundException;
import javax.persistence.*;
import javax.websocket.ClientEndpoint;
import java.sql.Timestamp;
import java.util.Set;

/**
 * Created by ace on 6/28/17.
 */
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", length = 11)
    private Integer userId;

    @Column(name = "user_name", length = 32, nullable = false, unique = true)
    private String userName;

    @Column(name = "password", length = 64, nullable = false)
    private String userPassword;

    @Column(name = "email", length = 128, nullable = false, unique = true)
    private String userEmail;

    @Column(name = "phone",  length = 16)
    private String userPhone;

    @Column(name="real_name",length = 16)
    private String userRealname;

    @Column(name="sex",length = 10)
    private String userSex;

    @Column(name="country",length = 16)
    private String userCountry;

    @Column(name="QQ",length = 16)
    private String userQQ;

    @Column(name="WeChat",length = 32)
    private String userWechat;

    @Column(name = "create_time", insertable = false,updatable = false, nullable = false)
    private Timestamp userCreateTime;

    @Column(name = "role" ,insertable = false,updatable = false, nullable = false)
    private String userRole;

    public UserEntity() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Timestamp getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Timestamp userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserRole() {
        return userRole;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public String getUserQQ() {
        return userQQ;
    }

    public String getUserRealname() {
        return userRealname;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getUserWechat() {
        return userWechat;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public void setUserQQ(String userQQ) {
        this.userQQ = userQQ;
    }

    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public void setUserWechat(String userWechat) {
        this.userWechat = userWechat;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userCreateTime=" + userCreateTime +
                ", userRole=" + userRole +
                '}';
    }
}
