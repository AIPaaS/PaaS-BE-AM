package com.ai.paas.cpaas.be.srv.service;

import com.ai.paas.cpaas.be.srv.manage.model.mesos.ServiceDO;

import java.util.List;

/**
 * shaozhanpeng
 * 2016/3/7
 * AIC
 */
public interface MesosService {

    /**
     * 获取版本信息
     */
    public String getVersion();
    /**
     * 获取配置信息
     */
    public String getConfig();
    /**
     * 获取host、ip
     */
    public String getHosts(String hostName);
    /**
     * 获取服务相关信息
     */
    public List<ServiceDO> getServices(String serviceName);

}
