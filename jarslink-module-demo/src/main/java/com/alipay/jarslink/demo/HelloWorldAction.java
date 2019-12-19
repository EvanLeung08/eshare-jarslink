package com.alipay.jarslink.demo;

import com.alipay.jarslink.api.Action;
import com.alipay.jarslink.api.ModuleConfig;
import org.springframework.stereotype.Component;

/**
 * 一个简单的Action实现
 */
@Component
public class HelloWorldAction implements Action<ModuleConfig, ModuleConfig> {
    @Override
    public ModuleConfig execute(ModuleConfig actionRequest) {
        ModuleConfig moduleConfig = new ModuleConfig();
        moduleConfig.setName(actionRequest.getName());
        moduleConfig.setEnabled(actionRequest.getEnabled());
        moduleConfig.setVersion(actionRequest.getVersion());
        moduleConfig.setModuleUrl(actionRequest.getModuleUrl());
        moduleConfig.setProperties(actionRequest.getProperties());
        moduleConfig.setOverridePackages(actionRequest.getOverridePackages());
        return moduleConfig;
    }


    @Override
    public String getActionName() {
        return "helloworld";
    }
}
