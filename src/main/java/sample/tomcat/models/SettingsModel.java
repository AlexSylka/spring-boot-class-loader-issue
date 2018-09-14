package sample.tomcat.models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SettingsModel {
    public final Boolean useSelfSignUp;
    public final Boolean approve;
    public final Boolean verifyData;
    public final Boolean collectMid;
    public final Boolean flowEnabled;
    public final String  partnerName;
    public final String  networkType;
    public final String upc;
}
