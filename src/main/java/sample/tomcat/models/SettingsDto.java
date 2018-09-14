package sample.tomcat.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SettingsDto {
    private Boolean useSelfSignUp;
    private Boolean approve;
    private Boolean verifyData;
    private Boolean collectMid;
    private String  partnerName;
    private String  networkType;
    private Boolean flowEnabled;
    private String  upc;
}
