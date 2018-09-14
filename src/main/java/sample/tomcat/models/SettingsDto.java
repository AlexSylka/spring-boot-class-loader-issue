package sample.tomcat.models;


public class SettingsDto {
    private Boolean useSelfSignUp;
    private Boolean approve;
    private Boolean verifyData;
    private Boolean collectMid;
    private String  partnerName;
    private String  networkType;
    private Boolean flowEnabled;
    private String  upc;


    public Boolean getUseSelfSignUp() {
        return useSelfSignUp;
    }

    public void setUseSelfSignUp(Boolean useSelfSignUp) {
        this.useSelfSignUp = useSelfSignUp;
    }

    public Boolean getApprove() {
        return approve;
    }

    public void setApprove(Boolean approve) {
        this.approve = approve;
    }

    public Boolean getVerifyData() {
        return verifyData;
    }

    public void setVerifyData(Boolean verifyData) {
        this.verifyData = verifyData;
    }

    public Boolean getCollectMid() {
        return collectMid;
    }

    public void setCollectMid(Boolean collectMid) {
        this.collectMid = collectMid;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public Boolean getFlowEnabled() {
        return flowEnabled;
    }

    public void setFlowEnabled(Boolean flowEnabled) {
        this.flowEnabled = flowEnabled;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }


}
