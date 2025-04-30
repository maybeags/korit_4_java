package ch17_bean;
/*
    정보를 담는 객체를 Entity class라고 합니다.
    -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에
    특별한 지위에 있다고 할 수 있음.
        1열       2열         3열        4열        -> 세로줄(열/Column)
    +----------------------------------------+
    | username | password | email     | name |      -> 헤더/속성 etc
    ------------------------------------------
    |    1      | 1234    | a@test.com| 안근수|    -> 가로줄(행/Row)
    +----------------------------------------+

    이상의 테이블을 확인하여 필드 / getter / setter / toString()을 생성하시오
    toString()은 default값으로 만드시면 됩니다.
 */
public class UserEntity {
    private int username;
    private int password;
    private String email;
    private String name;

    @Override
    public String toString() {
        return "UserEntity{" +
                "username=" + username +
                ", password=" + password +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
