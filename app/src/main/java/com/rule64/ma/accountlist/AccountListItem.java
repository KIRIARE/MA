package com.rule64.ma.accountlist;

public class AccountListItem {
    String id;
    String site;
    String lastUpdated;

    public AccountListItem(String pId, String pSite, String pLastUpdated){
        id = pId;
        site = pSite;
        lastUpdated = pLastUpdated;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
