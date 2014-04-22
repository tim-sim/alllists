package org.lll.core;

/**
 * @author tim
 */
public class AppWebApplication extends DefaultWebApplication  {
    @Override
    protected DefaultAppCore createAppCore() {
        return new AppCore();
    }
}
