package com.lbis.aerovibe.model;

import com.lbis.aerovibe.enums.UserEnum;
import com.lbis.aerovibe.enums.UserEnum.Sex;
import com.lbis.aerovibe.enums.UserEnum.UserType;
import com.lbis.database.model.KeyObjectIfc;
import com.lbis.database.model.ValueObjectIfc;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class User implements ValueObjectIfc<User>, KeyObjectIfc, Serializable {

    /**
     *
     */
	public  final static String emailRegEx = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
	public  final static String passwordRegEx = "^(?=.*\\d)(?=.*[a-zA-Z])(?!.*[\\W_\\x7B-\\xFF]).{6,15}$";
	private static final long serialVersionUID = 5999518488909110902L;
    private String userId;
    @NotNull
    private String userFirstName;
    @NotNull
    private String userLastName;
    @NotNull
    @Pattern(regexp = emailRegEx)
    private String userEmail;
    @NotNull
    private String userPicture;
    @NotNull
    @Pattern(regexp = passwordRegEx)
    private String userPassword;
    @NotNull
    private UserEnum.UserType userType;
    @NotNull
    private UserEnum.Sex userSex;
    private Long userJoinDate;
    @NotNull
    private Long userBirthday;
    private Integer userNoNotificationsADay;
    private Integer userAQIProfileLevel;

    public User(String userId, String userFirstName, String userLastName, String userEmail, String userPicture, String userPassword, UserType userType, Sex userSex, Long userJoinDate, Long userBirthday, Integer userNoNotificationsADay, Integer userAQIProfileLevel) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = "user_" + userEmail;
        this.userPicture = userPicture;
        this.userPassword = userPassword;
        this.userType = userType;
        this.userSex = userSex;
        this.userJoinDate = userJoinDate;
        this.userBirthday = userBirthday;
        this.userNoNotificationsADay = userNoNotificationsADay;
        this.userAQIProfileLevel = userAQIProfileLevel;
    }

    public User() {
    }

    public Integer getUserAQIProfileLevel() {
        return userAQIProfileLevel;
    }

    public void setUserAQIProfileLevel(Integer userAQIProfileLevel) {
        this.userAQIProfileLevel = userAQIProfileLevel;
    }

    public Integer getUserNoNotificationsADay() {
        return userNoNotificationsADay;
    }

    public void setUserNoNotificationsADay(Integer userNoNotificationsADay) {
        this.userNoNotificationsADay = userNoNotificationsADay;
    }

    public Long getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Long userBirthday) {
        this.userBirthday = userBirthday;
    }

    public UserEnum.UserType getUserType() {
        return userType;
    }

    public void setUserType(UserEnum.UserType userType) {
        this.userType = userType;
    }

    public UserEnum.Sex getUserSex() {
        return userSex;
    }

    public void setUserSex(UserEnum.Sex userSex) {
        this.userSex = userSex;
    }

    public Long getUserJoinDate() {
        return userJoinDate;
    }

    public void setUserJoinDate(Long userJoinDate) {
        this.userJoinDate = userJoinDate;
    }

    public User(String userId) {
        this.userId = userId;
    }

    public String getObjectKey() {
        return "user_" + userEmail;
    }

    public Class<User> getClassType() {
        return User.class;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getSQLObjectKey() {
        return getObjectKey();
    }
}
