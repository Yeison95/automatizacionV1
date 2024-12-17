package com.enviopack.config;

import com.enviopack.enums.Browser;

public class BrowserConfig {

    private final ConfigAccessor configAccessor;

    public BrowserConfig(ConfigAccessor configAccessor) {
        this.configAccessor = configAccessor;
    }

    public Browser getBrowser() {
        String browser = configAccessor.getValor("browser").toUpperCase();
        return Browser.valueOf(browser);
    }
}
