package test.lombok;

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;

/**
 * Created by kruart on 17.03.2017.
 *
 * @CommonsLog - creates  private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(LogExample.class);
 * @Log - creates private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(LogExample.class.getName());
 * @Log4j - creates private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(LogExample.class);
 * @Log4j2 - creates private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(LogExample.class);
 * @Slf4j - creates private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogExample.class);
 * @XSlf4j - creates private static final org.slf4j.ext.XLogger log = org.slf4j.ext.XLoggerFactory.getXLogger(LogExample.class);
 */
@Slf4j
public class LogExample {}

@Log
class LogExample01 {}

@CommonsLog
class LogExample02 {}

@Log4j
class LogExample03 {}

@Log4j2
class LogExample04{}

@XSlf4j
class LogExample05{}
