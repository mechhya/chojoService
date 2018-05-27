package chojo.rest.api.dto;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class LoginDto  implements Serializable {
    /**
     * ユーザ名
     * **/
    @Getter@Setter
    private String userName;
    /**
     * パスワード
     * **/
    @Getter@Setter
    private  String password;





}
