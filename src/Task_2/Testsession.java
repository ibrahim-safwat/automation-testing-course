package Task_2;

public class Testsession {
    // static variable
    public static int sessionCount;

    // instance variables
    public int sessionId;
    public String browser;
    public int startTime;

    public Testsession(String browser) {
        // increment session count
        sessionCount++;
        // store the incremented session count in the session id variable
        this.sessionId = sessionCount;
        this.browser = browser;
        // it only accepts int so i placed an (int) data type before it
        this.startTime = (int) System.currentTimeMillis();

    }

    public static int getsessionCount() {
        // returns sum of all sessions combined for the three objects in the main
        return sessionCount;
    }

    public static void setsessionCount(int sessionCount) {
        // store the incremented session count above in this new session count which will be used in the main
        Testsession.sessionCount = sessionCount;
    }

    public String getinfo() {
        // return browser name, start time and the session id of each browser in each object
        return "browser is: " + browser + ", startTime is: " + startTime + ", sessionId is: " + sessionId;
    }

}
