package logTest;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class LoggingSample1 {
		public void initLogging() {
			//�ֿ� ������Ʈ ����
			Logger logger=Logger.getLogger(LoggingSample1.class);
			DailyRollingFileAppender appender = new DailyRollingFileAppender();
			PatternLayout layout = new PatternLayout();
			//Layout ��ü ����
			String layoutPattern="[%d{yyyy/mm/dd HH:mm:ss}] %5p %c %M : %m%n";
			layout.setConversionPattern(layoutPattern);
			//appender ��ü ����
			String filePath="C:/DEV/logTest.log";
			String datePatteren="'.'yyyy-mm-dd";
			appender.setName("TestAppender");
			appender.setFile(filePath);
			appender.setDatePattern(datePatteren);
			appender.setBufferSize(1024);
			appender.activateOptions();
			//logger ��ü ����
			logger.addAppender(appender);
			//�׽�Ʈ
			logger.debug("Log for debugging");
			logger.info("Log for information");
			logger.warn("Log for warning");
			logger.error("Log for error");
			logger.fatal("Log for fatal error");
		}
}
