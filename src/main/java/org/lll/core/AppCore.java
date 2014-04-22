package org.lll.core;

/**
 * @author tim
 */
public class AppCore extends DefaultAppCore {
    @Override
    protected void initLogger() {
        LoggerFactory.setLoggerFactory(
                new SimpleLoggerFactory(Logger.Level.DEBUG));
        super.initLogger();
    }
}
