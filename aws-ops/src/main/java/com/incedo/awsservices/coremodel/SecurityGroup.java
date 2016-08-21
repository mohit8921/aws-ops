package com.incedo.awsservices.coremodel;

import com.amazonaws.services.ec2.model.IpPermission;

import java.util.List;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class SecurityGroup {

    private List<IpPermission> ipPermissions;
    private String groupName;
    private String description;

    public List<IpPermission> getIpPermissions() {
        return ipPermissions;
    }

    public void setIpPermissions(List<IpPermission> ipPermissions) {
        this.ipPermissions = ipPermissions;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
