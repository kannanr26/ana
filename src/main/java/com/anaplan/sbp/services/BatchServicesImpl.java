package com.anaplan.sbp.services;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Properties;


@Service("batchService")
@EnableScheduling
public class BatchServicesImpl implements BatchServices {

    @Resource(name = "myProperties")
    private Properties myProperties;

    @Override
    public void triggerBatch() {
        // TODO Auto-generated method stub
        final String filePath = myProperties.getProperty("filePath") + myProperties.getProperty("fileName");//"D:\\batch.bat";
        System.out.println("filePath" + filePath);

        try {

            final Process p = Runtime.getRuntime().exec(filePath);
            p.waitFor();

            //System.out.println("Response From Exe : " + p.isAlive());

        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    @Scheduled(fixedDelay = 50000)
    public void fixedDelaySchedule() {
        // TODO Auto-generated method stub
        final String filePath = myProperties.getProperty("filePath") + myProperties.getProperty("fileName");//"D:\\batch.bat";


        System.out.println("filePath" + filePath);

        try {

            final Process p = Runtime.getRuntime().exec(filePath);
            p.waitFor();

            // System.out.println("Response From Exe : " + p.isAlive());

        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * (non-Javadoc)
     * @see com.anaplan.sbp.services.BatchServices#cronschedule()
     * Fire at 10:15 AM every Monday, Tuesday, Wednesday, Thursday and Friday
     **/
    @Override
    //@Scheduled(cron="0 15 10 ? * MON-FRI")
    //@Scheduled(cron="0 0 10 * * ?")  // Every day 10

    @Scheduled(cron = "0 0 1 * * ?")// Every 30 Min
    public void cronschedule() {
        // TODO Auto-generated method stub
        final String filePath = myProperties.getProperty("filePath") + myProperties.getProperty("fileName");//"D:\\batch.bat";


        System.out.println("filePath" + filePath);

        try {

            final Process p = Runtime.getRuntime().exec(filePath);
            p.waitFor();

            //System.out.println("Response From Exe : " + p.isAlive());

        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

}
