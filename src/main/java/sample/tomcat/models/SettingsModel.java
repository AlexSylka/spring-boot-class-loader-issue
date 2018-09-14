package sample.tomcat.models;


public class SettingsModel {
    private  Boolean useSelfSignUp;
    private  Boolean approve;
    private  Boolean verifyData;
    private  Boolean collectMid;
    private  Boolean flowEnabled;
    private  String  partnerName;
    private  String  networkType;
    private  String upc;

    SettingsModel(Boolean useSelfSignUp,
                         Boolean approve,
                         Boolean verifyData,
                         Boolean collectMid,
                         Boolean flowEnabled,
                         String partnerName,
                         String networkType,
                         String upc) {
        this.useSelfSignUp = useSelfSignUp;
        this.approve = approve;
        this.verifyData = verifyData;
        this.collectMid = collectMid;
        this.flowEnabled = flowEnabled;
        this.partnerName = partnerName;
        this.networkType = networkType;
        this.upc = upc;
    }


    public Boolean getUseSelfSignUp() {
        return useSelfSignUp;
    }

    public Boolean getApprove() {
        return approve;
    }

    public Boolean getVerifyData() {
        return verifyData;
    }

    public Boolean getCollectMid() {
        return collectMid;
    }

    public Boolean getFlowEnabled() {
        return flowEnabled;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public String getNetworkType() {
        return networkType;
    }

    public String getUpc() {
        return upc;
    }


}
