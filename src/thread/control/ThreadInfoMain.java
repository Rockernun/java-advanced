package thread.control;

import thread.start.HelloRunnable;

import static util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId()=" + mainThread.threadId());
        log("mainThread.getName()=" + mainThread.getName());
        log("mainThread.getPriority()=" + mainThread.getPriority());
        log("mainThread.getThreadGroup()=" + mainThread.getThreadGroup());
        log("mainThread.getState()=" + mainThread.getState());

        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId()=" + myThread.threadId());
        log("myThread.getName()=" + myThread.getName());
        log("myThread.getPriority()=" + myThread.getPriority());
        log("myThread.getThreadGroup()=" + myThread.getThreadGroup());
        log("myThread.getState()=" + myThread.getState());
    }
}

/*
13:44:41.921 [     main] mainThread = Thread[#1,main,5,main]
13:44:41.925 [     main] mainThread.threadId()=1
13:44:41.925 [     main] mainThread.getName()=main
13:44:41.928 [     main] mainThread.getPriority()=5
13:44:41.928 [     main] mainThread.getThreadGroup()=java.lang.ThreadGroup[name=main,maxpri=10]
13:44:41.928 [     main] mainThread.getState()=RUNNABLE

13:44:41.929 [     main] myThread = Thread[#21,myThread,5,main]
13:44:41.929 [     main] myThread.threadId()=21
13:44:41.929 [     main] myThread.getName()=myThread
13:44:41.929 [     main] myThread.getPriority()=5
13:44:41.929 [     main] myThread.getThreadGroup()=java.lang.ThreadGroup[name=main,maxpri=10]
13:44:41.929 [     main] myThread.getState()=NEW
*/