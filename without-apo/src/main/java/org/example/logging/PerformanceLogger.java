package org.example.logging;

public class PerformanceLogger {

    public  PerFormaceLoggerInfo start(String name){
        return new PerFormaceLoggerInfo(name,System.currentTimeMillis());
    }

    public void end (PerFormaceLoggerInfo info){
        long startTime = info.getTime();
        long endTime = System.currentTimeMillis();
        System.out.printf("%s take times %d miliseconds.",
                info.getName(),(endTime-startTime));
        System.out.println();
    }

    public static  class PerFormaceLoggerInfo{
        private String name;
        private Long time;

        public PerFormaceLoggerInfo(String name, Long time) {
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public Long getTime() {
            return time;
        }
    }


}
