package ch17_bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserEntityLombok {
    private int username;
    private int password;
    private String email;
    private String name;
}
