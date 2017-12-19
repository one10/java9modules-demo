package org.one10.examples.two;

import org.one10.examples.util.TokenUtil;

public class BackendServiceTwo {
    public String getBackendServiceName() {
        // this fancy service needs to use the util module
        return String.format("BackendServiceTwo: %s", new TokenUtil().getToken());
    }
}
