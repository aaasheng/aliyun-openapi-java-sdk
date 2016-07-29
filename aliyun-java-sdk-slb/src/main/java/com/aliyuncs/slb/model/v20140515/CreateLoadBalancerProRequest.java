/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateLoadBalancerProRequest extends RpcAcsRequest<CreateLoadBalancerProResponse> {
	
	public CreateLoadBalancerProRequest() {
		super("Slb", "2014-05-15", "CreateLoadBalancerPro");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String addressType;

	private String internetChargeType;

	private Integer bandwidth;

	private String clientToken;

	private String loadBalancerName;

	private String loadBalancerMode;

	private String address;

	private String vpcId;

	private String vSwitchId;

	private String suName;

	private String cidrType;

	private String tunnelType;

	private String ownerAccount;

	private String masterZoneId;

	private String slaveZoneId;

	private String access_key_id;

	private String tags;

	private String enableVpcVipFlow;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
		putQueryParameter("AddressType", addressType);
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		putQueryParameter("InternetChargeType", internetChargeType);
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		putQueryParameter("Bandwidth", bandwidth);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		putQueryParameter("ClientToken", clientToken);
	}

	public String getLoadBalancerName() {
		return this.loadBalancerName;
	}

	public void setLoadBalancerName(String loadBalancerName) {
		this.loadBalancerName = loadBalancerName;
		putQueryParameter("LoadBalancerName", loadBalancerName);
	}

	public String getLoadBalancerMode() {
		return this.loadBalancerMode;
	}

	public void setLoadBalancerMode(String loadBalancerMode) {
		this.loadBalancerMode = loadBalancerMode;
		putQueryParameter("LoadBalancerMode", loadBalancerMode);
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		putQueryParameter("Address", address);
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		putQueryParameter("VpcId", vpcId);
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		putQueryParameter("VSwitchId", vSwitchId);
	}

	public String getSuName() {
		return this.suName;
	}

	public void setSuName(String suName) {
		this.suName = suName;
		putQueryParameter("SuName", suName);
	}

	public String getCidrType() {
		return this.cidrType;
	}

	public void setCidrType(String cidrType) {
		this.cidrType = cidrType;
		putQueryParameter("CidrType", cidrType);
	}

	public String getTunnelType() {
		return this.tunnelType;
	}

	public void setTunnelType(String tunnelType) {
		this.tunnelType = tunnelType;
		putQueryParameter("TunnelType", tunnelType);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	public String getMasterZoneId() {
		return this.masterZoneId;
	}

	public void setMasterZoneId(String masterZoneId) {
		this.masterZoneId = masterZoneId;
		putQueryParameter("MasterZoneId", masterZoneId);
	}

	public String getSlaveZoneId() {
		return this.slaveZoneId;
	}

	public void setSlaveZoneId(String slaveZoneId) {
		this.slaveZoneId = slaveZoneId;
		putQueryParameter("SlaveZoneId", slaveZoneId);
	}

	public String getaccess_key_id() {
		return this.access_key_id;
	}

	public void setaccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		putQueryParameter("access_key_id", access_key_id);
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		putQueryParameter("Tags", tags);
	}

	public String getEnableVpcVipFlow() {
		return this.enableVpcVipFlow;
	}

	public void setEnableVpcVipFlow(String enableVpcVipFlow) {
		this.enableVpcVipFlow = enableVpcVipFlow;
		putQueryParameter("EnableVpcVipFlow", enableVpcVipFlow);
	}

	@Override
	public Class<CreateLoadBalancerProResponse> getResponseClass() {
		return CreateLoadBalancerProResponse.class;
	}

}
