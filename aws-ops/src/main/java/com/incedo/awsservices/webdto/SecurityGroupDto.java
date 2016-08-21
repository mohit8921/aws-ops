package com.incedo.awsservices.webdto;

import java.util.List;

/**
 * Created by Sourabh on 8/21/2016.
 */
public class SecurityGroupDto {

    public List<IpPermissionDto> ipPermissions;
    public String groupName;
    public String description;
}
